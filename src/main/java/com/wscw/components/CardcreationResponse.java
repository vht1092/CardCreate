package com.wscw.components;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.vaadin.simplefiledownloader.SimpleFileDownloader;

import com.monitorjbl.xlsx.StreamingReader;
import com.vaadin.server.VaadinServlet;
import com.vaadin.data.validator.NullValidator;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.StreamResource;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;
import com.vaadin.ui.Upload;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.themes.ValoTheme;
import com.wscw.ReloadComponent;
import com.wscw.SecurityUtils;
import com.wscw.SpringConfigurationValueHelper;
import com.wscw.SpringContextHelper;
import com.wscw.TimeConverter;
import com.wscw.entities.CustomerInfo;
import com.wscw.entities.WscwCardInfo;
import com.wscw.services.CustomerInfoService;
import com.wscw.services.SysUserroleService;
import com.wscw.services.WscwCardInfoService;

import my.com.webservices.*;

/**
 * Man hinh thong ke chung
 */
@SpringComponent
@ViewScope
public class CardcreationResponse extends CustomComponent implements ReloadComponent {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(CardcreationResponse.class);
	public static final String CAPTION = "CARD CREATION RESPONSE";
	private static final String INPUT_FIELD = "Vui lòng chọn giá trị";
	private final Label lbLatestLogin = new Label();
	private final Label lbTotalAssignedCases = new Label();
	private String sUserId = "";
	private String CheckUserId = "1";
	private String roleDescription = "";
	private String note = "";
	private String fileNameImport;
	final TimeConverter timeConverter = new TimeConverter();
	private SpringConfigurationValueHelper configurationHelper;
	private final transient CustomerInfoService customerInfoService;
	private final transient WscwCardInfoService wscwCardInfoService;
	private File fileImport = null;
	private Cardworks_PortType cw_port = null;
	private CustomerInfo custInfo;
	private DataGridCreateCard grid;
	private transient Page<WscwCardInfo> result;
	private final VerticalLayout mainLayout = new VerticalLayout();
	private final HorizontalLayout lineLayout = new HorizontalLayout();
	private transient HorizontalLayout pagingLayout;
	private final ComboBox cbbFilename;
	private transient List<String> listFileRequest;
	final Button btExport = new Button("EXPORT");
	
	private int rowNumExport = 0;
	private String fileNameOutput = null;
	private Path pathExport = null;
	
	// Paging
	private static final int SIZE_OF_PAGE = 50;
	private static final int FIRST_OF_PAGE = 0;
	
	public CardcreationResponse() {
		setCaption(CAPTION);
		SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
		configurationHelper = (SpringConfigurationValueHelper) helper.getBean("springConfigurationValueHelper");
		customerInfoService = (CustomerInfoService) helper.getBean("customerInfoService");
		wscwCardInfoService = (WscwCardInfoService) helper.getBean("wscwCardInfoService");
		this.sUserId = SecurityUtils.getUserId();
		
		final SimpleDateFormat simpledateformat_current = new SimpleDateFormat("dd/M/yyyy");

		final Label lbFilename = new Label("FILE NAME");
		cbbFilename = new ComboBox();
		cbbFilename.setNullSelectionAllowed(false);
		cbbFilename.addValidator(new NullValidator(INPUT_FIELD, false));
		cbbFilename.setValidationVisible(false);
		listFileRequest = wscwCardInfoService.getListFileImportOrderByCretmsDesc();
		for(String item : listFileRequest) {
			cbbFilename.addItem(item);
		}
		cbbFilename.setValue(cbbFilename.getItemIds().iterator().next());
		cbbFilename.addValueChangeListener(event -> {
			grid.initGrid(getData(new PageRequest(FIRST_OF_PAGE, SIZE_OF_PAGE, Sort.Direction.DESC, "creTms")));
			grid.refreshData(result);
			refreshPaging();
		});
		
		btExport.setStyleName(ValoTheme.BUTTON_FRIENDLY);
		btExport.setIcon(FontAwesome.FILE_EXCEL_O);
		btExport.addClickListener(event -> {
			String filename = cbbFilename.getValue().toString();
			exportDataCardcreationToExcel(result.getContent(), filename.substring(0, filename.length()-5).replaceAll("[\\s|\\u00A0]+", "_") + "_" + timeConverter.getCurrentTime());
		});
		
		lineLayout.setSpacing(true);
		lineLayout.setMargin(true);
		lineLayout.addComponent(lbFilename);
		lineLayout.addComponent(cbbFilename);
		lineLayout.addComponent(btExport);
		
		mainLayout.setSpacing(true);
		mainLayout.addComponent(lineLayout);
		grid = new DataGridCreateCard();
		grid.initGrid(getData(new PageRequest(FIRST_OF_PAGE, SIZE_OF_PAGE, Sort.Direction.DESC, "creTms")));
//		grid.refreshData(result);
		mainLayout.addComponent(grid);

		pagingLayout = generatePagingLayout();
		pagingLayout.setSpacing(true);
		mainLayout.addComponent(pagingLayout);
		mainLayout.setComponentAlignment(pagingLayout, Alignment.BOTTOM_RIGHT);

		setCompositionRoot(mainLayout);
	}


	private static int getRandomSeq(int min, int max) {
		// It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	private Page<WscwCardInfo> getData(Pageable page) {
		result = wscwCardInfoService.findAllByFileNameOrderByIdAsc(page,cbbFilename.getValue().toString());
		return result;
	}

	public static boolean isCellEmpty(final Cell cell) {
	    if (cell == null) { // use row.getCell(x, Row.CREATE_NULL_AS_BLANK) to avoid null cells
	        return true;
	    }

	    if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
	        return true;
	    }

	    if (cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue().trim().isEmpty()) {
	        return true;
	    }

	    return false;
	}
	
	 public static String deAccent(String str) {
         String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
         Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
         return pattern.matcher(nfdNormalizedString).replaceAll("").replace("đ", "d").replaceAll("Đ", "D");
     }
	 
	private HorizontalLayout generatePagingLayout() {
		Button btLabelPaging = new Button();
		btLabelPaging.setCaption(reloadLabelPaging());
		btLabelPaging.setEnabled(false);

		final Button btPreviousPage = new Button("Trang trước");
		btPreviousPage.setIcon(FontAwesome.ANGLE_LEFT);
		btPreviousPage.setEnabled(result.hasPrevious());

		final Button btNextPage = new Button("Trang sau");
		btNextPage.setStyleName(ValoTheme.BUTTON_ICON_ALIGN_RIGHT);
		btNextPage.setIcon(FontAwesome.ANGLE_RIGHT);
		btNextPage.setEnabled(result.hasNext());

		btNextPage.addClickListener(evt -> {
			grid.refreshData(getData(result.nextPageable()));
			btNextPage.setEnabled(result.hasNext());
			btPreviousPage.setEnabled(result.hasPrevious());
			UI.getCurrent().access(new Runnable() {
				@Override
				public void run() {
					btLabelPaging.setCaption(reloadLabelPaging());
				}
			});

		});

		btPreviousPage.addClickListener(evt -> {
			grid.refreshData(getData(result.previousPageable()));
			btNextPage.setEnabled(result.hasNext());
			btPreviousPage.setEnabled(result.hasPrevious());
			UI.getCurrent().access(new Runnable() {
				@Override
				public void run() {
					btLabelPaging.setCaption(reloadLabelPaging());
				}
			});
		});

		final HorizontalLayout pageLayout = new HorizontalLayout();
		pageLayout.setSizeUndefined();
		pageLayout.setSpacing(true);
		pageLayout.addComponent(btLabelPaging);
		pageLayout.addComponent(btPreviousPage);
		pageLayout.addComponent(btNextPage);
		pageLayout.setDefaultComponentAlignment(Alignment.BOTTOM_RIGHT);

		return pageLayout;
	}

	private String reloadLabelPaging() {
		final StringBuilder sNumberOfElements = new StringBuilder();
		if (result.getSize() * (result.getNumber() + 1) >= result.getTotalElements()) {
			sNumberOfElements.append(result.getTotalElements());
		} else {
			sNumberOfElements.append(result.getSize() * (result.getNumber() + 1));
		}
		final String sTotalElements = Long.toString(result.getTotalElements());

		return sNumberOfElements.toString() + "/" + sTotalElements;

	}

	@Override
	public void eventReload() {
//			grid.refreshData(getData(new PageRequest(result.getNumber(), SIZE_OF_PAGE, Sort.Direction.DESC, "creTms")));

	// Refresh paging button
		refreshPaging();
	}
	
	private void refreshPaging() {
		mainLayout.removeComponent(pagingLayout);
		pagingLayout = generatePagingLayout();
		pagingLayout.setSpacing(true);
		mainLayout.addComponent(pagingLayout);
		mainLayout.setComponentAlignment(pagingLayout, Alignment.BOTTOM_RIGHT);
	}
	
	
	private void messageExportXLSX(String caption, String text) {
		Window confirmDialog = new Window();
		FormLayout content = new FormLayout();
        content.setMargin(true);
		Button bOK = new Button("OK");
		Label lbText = new Label(text);
		confirmDialog.setCaption(caption);
		confirmDialog.setWidth(300.0f, Unit.PIXELS);
		
		 bOK.addClickListener(event -> {
			SimpleFileDownloader downloader = new SimpleFileDownloader();
			addExtension(downloader);
			StreamResource resource = getStream(new File(pathExport + "\\" + fileNameOutput));
			downloader.setFileDownloadResource(resource);
			downloader.download();
         	confirmDialog.close();
         });
		
		VerticalLayout layoutBtn = new VerticalLayout();
		layoutBtn.setSpacing(true);
		layoutBtn.addComponent(lbText);
        layoutBtn.addComponents(bOK);
        layoutBtn.setComponentAlignment(bOK, Alignment.BOTTOM_CENTER);
        content.addComponent(layoutBtn);
        
        confirmDialog.setContent(content);

        getUI().addWindow(confirmDialog);
        // Center it in the browser window
        confirmDialog.center();
        confirmDialog.setResizable(false);
	}
	
	private StreamResource getStream(File inputfile) {
	    
	    StreamResource.StreamSource source = new StreamResource.StreamSource() {

	        public InputStream getStream() {
	           
	            InputStream input=null;
	            try
	            {
	                input = new  FileInputStream(inputfile);
	            } 
	            catch (FileNotFoundException e)
	            {
	                LOGGER.error(e.getMessage());
	            }
	              return input;

	        }
	    };
	    StreamResource resource = new StreamResource ( source, inputfile.getName());
	    return resource;
	}
	
	private void createNewSheet(XSSFWorkbook workbookExport, List<WscwCardInfo> cardcreateList,String sheetname) {
		XSSFSheet sheet = workbookExport.createSheet(sheetname);
	        
        DataFormat format = workbookExport.createDataFormat();
        CellStyle styleNumber;
        styleNumber = workbookExport.createCellStyle();
        styleNumber.setDataFormat(format.getFormat("0.0"));
	        
        rowNumExport = 0;
        LOGGER.info("Creating excel");

        if(rowNumExport == 0) {
        	Object[] rowHeader = {"CIF \n(Số CIF)", "Account Type \n(Loại tài khoản)", "Card Index \n(Loại thẻ chính Phụ)", "Prin Card No \n(Thông tin thẻ chính)",
        			"Branch Card \n(Mã đơn vị mở thẻ)","Direct ID","Source Code","Promotion Code \n(Mã chương trình khuyến mãi)","In Direct Id","Img Id",
        			"Card Type \n(Chương trình thẻ)", "Support Auto Renewal \n(Hỗ trợ gia hạn thẻ)","Release Form \n(Hình thức mở thẻ)","Contract No",
        			"Internet Transaction Blocking","Contactless Transaction Indicator","Title \n(Quý danh)", "Full Name \n(Họ tên)", "Last Emb Name \n(Họ dập trên thẻ)", 
        			"Emb Name \n(Tên dập trên thẻ)", "Mid Emb Name \n(Tên lót dập trên thẻ)", "Company Emb Name \n(Tên công ty dập trên thẻ)", "Emboss Photo \n(Hình để dập thẻ)", 
        			"Gender \n(Giới tính)", "Nation \n(Quốc tịch)", "Martial Status \n(Tình trạng hôn nhân)", "Residen Type \n(Hình thức cư trú)", 
        			"Length of time planning to stay in Vietnam \n(Thời gian còn lại ở VN)", "Do you have PR status? \n(Đăng ký định cư hay chưa ?)", 
        			"Immigration Visa Expiry Date (DD/MM/YYYY) \n(Ngày hết hạn VISA)","Education Level \n(Học vấn)","Cust. Category \n(Nhóm KH)",
        			"Relation To Principal \n(Quan hệ với thẻ chính)","Mother's Maiden Name\n(Tên mẹ)","Security Question - My Best Friend \n(Câu hỏi bảo mật - Bạn thân)",
        			"Billing Option \n(Nơi nhân thanh toán hóa  đơn)","Statement Delivery Option \n(Tùy gửi)","resAddr1 \n(Địa chỉ cư trú)","resAddr2 \n(Địa chỉ cư trú)",
        			"resAddr3 \n(Địa chỉ cư trú)","resPostCde \n(Mã bưu điện)","resTown \n(Quận/ Huyện)","resState \n(Tỉnh/ Thành Phố)","resCountry \n(Quốc gia)",
        			"resPhoneNo \n(Số điện thoại cố định)","resTyp \n(Loại hình cư trú)","resSince \n(Thời gian bắt đầu cư trú)","corpsAddr1 \n(Địa chỉ liên hệ)",
        			"corpsAddr2 \n( Địa chỉ liên hệ)","corpsAddr3 \n(Địa chỉ liên hệ)","corpsPostCde \n(Mã bưu điện)","corpsTown \n(Quận/ Huyện)","corpsState \n(Tỉnh / Thành Phố)",
        			"corpsCountry \n(Quốc gia)","corpsPhoneNo \n(Số điện thoại cố định)","mobileNo \n(Số điện thoại)","smsInd \n(Sao kê gửi qua SMS)",
        			"email","industryCde \n(Loại hình kinh doanh)","empNature","compSize \n(Qui mô công ty)","postHeld \n(Chức vụ)","empSince \n(Thời gian bắt đầu công tác)",
        			"offName \n(Tên Công ty)","offAddr1 \n(Địa chỉ)","offAddr2 \n(Địa chỉ)","offAddr3 \n(Địa chỉ)","offPostCde \n(Mã bưu điện)","offTown \n(Quận/ Huyện)",
        			"offState \n(Tỉnh/ Thành phố)","offCountry \n(Quốc gia)","offPhoneNo1 \n(Số điện thoại 1)","offPhoneNo1Ext \n(Số nội bộ 1)","offPhoneNo2 \n(Số điện thoại 2)",
        			"offPhoneNo2Ext \n(Số nội bộ 2)","offFaxNo \n(Số Fax)","prevEmpName \n(Tên Công Ty)","prevEmpAddr1 \n(Địa chỉ công ty 1)","prevEmpAddr2 \n(Địa chỉ công ty 2)",
        			"prevEmpAddr3 \n(Địa chỉ công ty 3)","prevEmpPostCde \n(Mã thành phố)","prevEmpTown \n(Quận/ Huyện)","prevEmpState \n(Tỉnh/ Thành phố)","prevEmpCountry \n(Quốc gia)",
        			"prevEmpPhone \n(Số điện thoại Công ty)","prevEmpPhoneExt \n(Số điện thoại nội bộ)","prevEmpSince \n(Thời gian bắt đầu công tác)","prevEmpDurOfServ \n(Thời gian làm việc)",
        			"ownHouseLand \n(Có Nhà/ Đất)","ownCar \n(Có xe Ô tô)","noOfDepen \n(Số người phụ thuộc)","avgSpendMth \n(Chi tiêu trung bình hàng tháng)","bankPrd",
        			"bankOthrPrd","othrCCBankName","othrCCLimit","othrLoanBankName","othrLoanInstallMth","delivByBrchInd \n(Gửi theo Chi nhánh)","delivOpt \n(Tùy chọn gửi)",
        			"delivAddr1 \n(Địa chỉ gửi 1)","delivAddr2 \n(Địa chỉ gửi 2)","delivAddr3 \n(Địa chỉ gửi 3)","delivPostCde \n(Mã thành phố)","delivTown \n(Quận / Huyện)",
        			"delivState \n(Tỉnh/ Thành phố)","delivCountry \n(Quốc gia)","delivBrchId \n(Mã Chi nhánh gửi)","spcName \n(Họ và tên)","spcIdInd (ID)","spcNewId",
        			"spcEmpName \n(Tên Công  Ty)","spcEmpAddr1 \n(Địa chỉ công ty 1)","spcEmpAddr2 \n(Địa chỉ công ty 2)","spcEmpAddr3 \n(Địa chỉ công ty 3)","spcEmpPostCde \n(Mã Thành phố)",
        			"spcEmpTown \n(Quận / Huyện)","spcEmpState \n(Tỉnh/ Thành phố)","spcEmpCountry \n(Quốc gia)","spcEmpPhone \n(Số điện thoại Công ty)","spcEmpPhoneExt \n(Số điện thoại nội bộ)",
        			"spcEmpPosi \n(Chức vụ)","spcEmpSince \n(Thời gian bắt đầu công tác)","spcEmpWorkNat \n(Loại hình thu nhập)","emerContcPrsn \n(Tên người liên hệ)",
        			"emerGender \n(Giới tính)","emerPhoneNo \n(Số điện thoại cố định)","emer_Mobile No. \n(Số điện thoại di động)","Relation to Contact Person \n(Mối quan hệ với người liên hệ)",
        			"Pay Method","Pay CASA","Pay Amt","Casa Acct No","Casa Account Type","Casa Currency Code","Recommender Card No \n(Số thẻ người giới thiệu)", "Recommender Name \n(Tên người giới thiệu)", 
        			"Remark \n(Thông tin ghi chú)","Approved Deviation","Additional Data 1","Additional Data 2","Document Checker \n(Người kiểm tra)", "Document Approver \n(Người phê duyệt)",
        			"sms Info",	"Narrative \n(Diễn giải)","Attachment","decsn Status (Trạng thái duyệt)"		
        	};
        	
        	Object[] rowHeaderNote = {"Bắt buộc nhập","Bắt buộc nhập","Default là B","neu Card Index(S) la the phu thi phai dien so the chinh(LOC + 4 last digits)","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập",
        			"Bắt buộc nhập","Bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","default= N","Q: phat hanh nhanh, \nN: phat hanh thuong","Không bắt buộc nhập","default = N","default = Y",
        			"Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","M:Male, \nF:Female","VN","Bắt buộc nhập \n(Giá trị cho phép: S,M,D,W,U)",
        			"L:Local, \nF:Foreigner","default= 0","Y:Yes, N:No","default = 000000","Not Null \nTừ '01' đến '07'","Bắt buộc nhập","ko bat buoc voi the chinh, \nbat buoc voi the phu",
        			"Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập \n(Giá trị cho phép: M,P,B)","Bắt buộc nhập \n(<=40 kí tự)","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Nếu không có thông tin, default=000000","Bắt buộc nhập \n(<=40 kí tự)",
        			"Bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Default = Y","Bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Nếu ko có thông tin, default = 000000","default= 0","Debit default = N","Debit default = N","Debit default = 0","Debit default = 0","Không bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua",
        			"neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua","neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua",
        			"neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua","neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua",
        			"neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua","neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua",
        			"neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua","neu DelivByBrchInd = N thi phai Input, \nDelivByBrchInd = Y thi bo qua",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập",
        			"Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Nếu ko có thông tin, \ndefault = 000000","",
        			"Bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","Debit default = 0","Debit default = 0","Debit default = 0","Bắt buộc nhập","default = 20",
        			"704","Không bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","Không bắt buộc nhập","Không bắt buộc nhập","Bắt buộc nhập","Bắt buộc nhập","bat buoc phai dien\nkhi tao the phu(= 1)","Bắt buộc nhập","Bắt buộc nhập","AM (Approved with manual embossing)"
        	};
    	
        	XSSFColor bgyellow = new XSSFColor(Color.YELLOW);
        	XSSFCellStyle csMandatory = workbookExport.createCellStyle();
        	csMandatory.setWrapText(true);   //Wrapping text
        	csMandatory.setVerticalAlignment(VerticalAlignment.TOP);
        	csMandatory.setAlignment(HorizontalAlignment.LEFT);
        	csMandatory.setFillForegroundColor(bgyellow);
        	csMandatory.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        	csMandatory.setFillBackgroundColor(bgyellow);
        	csMandatory.setBorderRight(BorderStyle.THIN);
        	csMandatory.setBorderBottom(BorderStyle.THIN);
        	
        	XSSFCellStyle cs = workbookExport.createCellStyle();
        	cs.setWrapText(true);   //Wrapping text
        	cs.setVerticalAlignment(VerticalAlignment.TOP);
        	cs.setAlignment(HorizontalAlignment.LEFT);
        	cs.setBorderRight(BorderStyle.THIN);
        	cs.setBorderBottom(BorderStyle.THIN);
        	
        	XSSFCellStyle csOptional = workbookExport.createCellStyle();
        	csOptional.setWrapText(true);   //Wrapping text
        	csOptional.setVerticalAlignment(VerticalAlignment.TOP);
        	csOptional.setAlignment(HorizontalAlignment.LEFT);
        	csOptional.setBorderRight(BorderStyle.THIN);
        	csOptional.setBorderBottom(BorderStyle.THIN);
//        	csOptional.getFont().setBold(true);
        	
        	int colNum = 0;	 
        	XSSFRow row = sheet.createRow(rowNumExport++);         	
        	for (Object field : rowHeader) {
        		Cell cell = row.createCell(colNum++, CellType.STRING);
        		cell.setCellValue((String)field);
        		if(String.valueOf(colNum).matches("(1|2|3|5|6|7|8|9|11|12|13|15|16|17|18|19|20|24|25|26|27|28|29|30|31|32|34|35|36|37|38|41|42|43|44|45|46|47|48|49|51|52|53|54|55|56|57|58|87|88|89|90|91|92|99|123|124|125|126|127|129|130|131|132|133|134|135|139|142|143|145|147)")) {
            		cell.setCellStyle(csMandatory);
        		} else {
        			cell.setCellStyle(csOptional);
        		}
        		
        	}     
        	colNum = 0;
        	row = sheet.createRow(rowNumExport++);         	
        	for (Object field : rowHeaderNote) {
        		Cell cell = row.createCell(colNum++, CellType.STRING);
        		cell.setCellValue((String)field);
        		cell.setCellStyle(cs);
        	}      
        	LOGGER.info("Created row " + rowNumExport + " for header sheet in excel.");
        }
        
        try {
	        for(WscwCardInfo item : cardcreateList) {
				XSSFRow row = sheet.createRow(rowNumExport++);
				
				row.createCell(0).setCellValue(item.getCifNo());
				row.createCell(1).setCellValue(item.getAccTyp());
				row.createCell(2).setCellValue(item.getCrdInd());
				row.createCell(3).setCellValue(item.getPrinCrdNo());
				row.createCell(4).setCellValue(item.getBrchCde());
				row.createCell(5).setCellValue(item.getDirectId());
				row.createCell(6).setCellValue(item.getSrcCde());
				row.createCell(7).setCellValue(item.getPromoCde());
				row.createCell(8).setCellValue(item.getIndirectId());
				row.createCell(9).setCellValue(item.getImgId());
				row.createCell(10).setCellValue(item.getCrdTyp());
				row.createCell(11).setCellValue(item.getAutoRenew());
				row.createCell(12).setCellValue(item.getReleaseForm());
				row.createCell(13).setCellValue(item.getContractNo());
				row.createCell(14).setCellValue(item.getInternetTxn());
				row.createCell(15).setCellValue(item.getContcLessInd());
				row.createCell(16).setCellValue(item.getTitle());
				row.createCell(17).setCellValue(item.getFullName());
				row.createCell(18).setCellValue(item.getLastEmbName());
				row.createCell(19).setCellValue(item.getEmbName());
				row.createCell(20).setCellValue(item.getMidEmbName());
				row.createCell(21).setCellValue(item.getCompEmbName());
				row.createCell(22).setCellValue(item.getEmbPhoto());
				row.createCell(23).setCellValue(item.getGender());
				row.createCell(24).setCellValue(item.getNation());
				row.createCell(25).setCellValue(item.getMartialStat());
				row.createCell(26).setCellValue(item.getResidenTyp());
				row.createCell(27).setCellValue(item.getMthToStay());
				row.createCell(28).setCellValue(item.getPrStat());
				row.createCell(29).setCellValue(item.getVsExpDate());
				row.createCell(30).setCellValue(item.getEducation());
				row.createCell(31).setCellValue(item.getCustCtgry());
				row.createCell(32).setCellValue(item.getRelToPrin());
				row.createCell(33).setCellValue(item.getMotherName());
				row.createCell(34).setCellValue(item.getSecureQues());
				row.createCell(35).setCellValue(item.getBillOpt());
				row.createCell(36).setCellValue(item.getStetDelivOpt());
				row.createCell(37).setCellValue(item.getResAddr1());
				row.createCell(38).setCellValue(item.getResAddr2());
				row.createCell(39).setCellValue(item.getResAddr3());
				row.createCell(40).setCellValue(item.getResPostCde());
				row.createCell(41).setCellValue(item.getResTown());
				row.createCell(42).setCellValue(item.getResState());
				row.createCell(43).setCellValue(item.getResCountry());
				row.createCell(44).setCellValue(item.getResPhoneNo());
				row.createCell(45).setCellValue(item.getResTyp());
				row.createCell(46).setCellValue(item.getResSince());
				row.createCell(47).setCellValue(item.getCorpsAddr1());
				row.createCell(48).setCellValue(item.getCorpsAddr2());
				row.createCell(49).setCellValue(item.getCorpsAddr3());
				row.createCell(50).setCellValue(item.getCorpsPostCde());
				row.createCell(51).setCellValue(item.getCorpsTown());
				row.createCell(52).setCellValue(item.getCorpsState());
				row.createCell(53).setCellValue(item.getCorpsCountry());
				row.createCell(54).setCellValue(item.getCorpsPhoneNo());
				row.createCell(55).setCellValue(item.getMobileNo());
				row.createCell(56).setCellValue(item.getSmsInd());
				row.createCell(57).setCellValue(item.getEmail());
				row.createCell(58).setCellValue(item.getIndustryCde());
				row.createCell(59).setCellValue(item.getEmpNature());
				row.createCell(60).setCellValue(item.getCompSize());
				row.createCell(61).setCellValue(item.getPostHeld());
				row.createCell(62).setCellValue(item.getEmpSince());
				row.createCell(63).setCellValue(item.getOffName());
				row.createCell(64).setCellValue(item.getOffAddr1());
				row.createCell(65).setCellValue(item.getOffAddr2());
				row.createCell(66).setCellValue(item.getOffAddr3());
				row.createCell(67).setCellValue(item.getOffPostCde());
				row.createCell(68).setCellValue(item.getOffTown());
				row.createCell(69).setCellValue(item.getOffState());
				row.createCell(70).setCellValue(item.getOffCountry());
				row.createCell(71).setCellValue(item.getOffPhoneNo1());
				row.createCell(72).setCellValue(item.getOffPhoneNo1Ext());
				row.createCell(73).setCellValue(item.getOffPhoneNo2());
				row.createCell(74).setCellValue(item.getOffPhoneNo2Ext());
				row.createCell(75).setCellValue(item.getOffFaxNo());
				row.createCell(76).setCellValue(item.getPrevEmpName());
				row.createCell(77).setCellValue(item.getPrevEmpAddr1());
				row.createCell(78).setCellValue(item.getPrevEmpAddr2());
				row.createCell(79).setCellValue(item.getPrevEmpAddr3());
				row.createCell(80).setCellValue(item.getPrevEmpPostCde());
				row.createCell(81).setCellValue(item.getPrevEmpTown());
				row.createCell(82).setCellValue(item.getPrevEmpState());
				row.createCell(83).setCellValue(item.getPrevEmpCountry());
				row.createCell(84).setCellValue(item.getPrevEmpPhone());
				row.createCell(85).setCellValue(item.getPrevEmpPhoneExt());
				row.createCell(86).setCellValue(item.getPrevEmpSince());
				row.createCell(87).setCellValue(item.getPrevEmpDurOfServ());
				row.createCell(88).setCellValue(item.getOwnHouseLand());
				row.createCell(89).setCellValue(item.getOwnCar());
				row.createCell(90).setCellValue(item.getNoOfDepen());
				row.createCell(91).setCellValue(item.getAvgSpendMth());
				row.createCell(92).setCellValue(item.getBankPrd());
				row.createCell(93).setCellValue(item.getBankOthrPrd());
				row.createCell(94).setCellValue(item.getOthrCCBank());
				row.createCell(95).setCellValue(item.getOthrCCLimit());
				row.createCell(96).setCellValue(item.getOthrLoanBankName());
				row.createCell(97).setCellValue(item.getOthrLoanInstallMth());
				row.createCell(98).setCellValue(item.getDelivBrchId());
				row.createCell(99).setCellValue(item.getDelivOpt());
				row.createCell(100).setCellValue(item.getDelivAdd1());
				row.createCell(101).setCellValue(item.getDelivAdd2());
				row.createCell(102).setCellValue(item.getDelivAdd3());
				row.createCell(103).setCellValue(item.getDelivPostCde());
				row.createCell(104).setCellValue(item.getDelivTown());
				row.createCell(105).setCellValue(item.getDelivState());
				row.createCell(106).setCellValue(item.getDelivCountry());
				row.createCell(107).setCellValue(item.getDelivBrchId());
				row.createCell(108).setCellValue(item.getSpcName());
				row.createCell(109).setCellValue(item.getSpcIdInd());
				row.createCell(110).setCellValue(item.getSpcNewId());
				row.createCell(111).setCellValue(item.getSpcEmpName());
				row.createCell(112).setCellValue(item.getSpcEmpAddr1());
				row.createCell(113).setCellValue(item.getSpcEmpAddr2());
				row.createCell(114).setCellValue(item.getSpcEmpAddr3());
				row.createCell(115).setCellValue(item.getSpcEmpPostCde());
				row.createCell(116).setCellValue(item.getSpcEmpTown());
				row.createCell(117).setCellValue(item.getSpcEmpState());
				row.createCell(118).setCellValue(item.getSpcEmpCountry());
				row.createCell(119).setCellValue(item.getSpcEmpPhone());
				row.createCell(120).setCellValue(item.getSpcEmpPhoneExt());
				row.createCell(121).setCellValue(item.getSpcEmpPosi());
				row.createCell(122).setCellValue(item.getSpcEmpSince());
				row.createCell(123).setCellValue(item.getSpcEmpWorkNat());
				row.createCell(124).setCellValue(item.getEmerContcPrsn());
				row.createCell(125).setCellValue(item.getEmerGender());
				row.createCell(126).setCellValue(item.getEmerPhoneNo());
				row.createCell(127).setCellValue(item.getEmerMobileNo());
				row.createCell(128).setCellValue(item.getEmerRelt());
				row.createCell(129).setCellValue(item.getEmerMeth());
				row.createCell(130).setCellValue(item.getPayCASA());
				row.createCell(131).setCellValue(item.getPayAmt());
				row.createCell(132).setCellValue(item.getCasaAcctNo());
				row.createCell(133).setCellValue(item.getCasaAcctTyp());
				row.createCell(134).setCellValue(item.getCasaCurCde());
				row.createCell(135).setCellValue(item.getRecomCrdNo());
				row.createCell(136).setCellValue(item.getRecomName());
				row.createCell(137).setCellValue(item.getRemark());
				row.createCell(138).setCellValue(item.getApprvDeviation());
				row.createCell(139).setCellValue(item.getAddData1());
				row.createCell(140).setCellValue(item.getAddData2());
				row.createCell(141).setCellValue(item.getDocChecker());
				row.createCell(142).setCellValue(item.getDocApprover());
				row.createCell(143).setCellValue(item.getSmsInfo());
				row.createCell(144).setCellValue(item.getNarrative());
				row.createCell(145).setCellValue(item.getAttachment());
				row.createCell(146).setCellValue(item.getDecsnStat());
				
	        }
        
	        sheet.createFreezePane(0, 1);
        } catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	private void exportDataCardcreationToExcel(List<WscwCardInfo> cardcreateList,String filename) {
		//EXPORT LIST TO EXCEL FILE
       XSSFWorkbook workbookExport = new XSSFWorkbook();
       List<WscwCardInfo> listCardcreateFailure = cardcreateList.stream().filter(i -> !i.getRespStat().startsWith("000")).collect(Collectors.toList());
       List<WscwCardInfo> listCardcreateSuccess = cardcreateList.stream().filter(i -> i.getRespStat().startsWith("000")).collect(Collectors.toList());
       createNewSheet(workbookExport,listCardcreateFailure,"FAILURE");
       createNewSheet(workbookExport,listCardcreateSuccess,"SUCCESS");
       try {
        
        	fileNameOutput = filename + ".xlsx";
        	pathExport = Paths.get(configurationHelper.getPathFileRoot() + "\\Export");
        	if(Files.notExists(pathExport)) {
        		Files.createDirectories(pathExport);
            }
        	FileOutputStream outputStream = new FileOutputStream(pathExport + "\\" + fileNameOutput);
            LOGGER.info("Created file excel output " + fileNameOutput);
            workbookExport.write(outputStream);
            LOGGER.info("Write data to " + fileNameOutput + " completed");
            workbookExport.close();
            outputStream.close();
	        LOGGER.info("Export excel file " + fileNameOutput);
	        messageExportXLSX("Info","Export compeleted.");
        } catch (FileNotFoundException e) {
            LOGGER.error(e.getMessage());
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
	}
}
