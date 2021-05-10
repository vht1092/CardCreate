package com.wscw.components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.monitorjbl.xlsx.StreamingReader;
import com.vaadin.server.VaadinServlet;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
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
public class WsCardCreation extends CustomComponent implements ReloadComponent {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(WsCardCreation.class);
	public static final String CAPTION = "WS CARD CREATE";
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
	private final VerticalLayout mainLayout = new VerticalLayout();
	
	public WsCardCreation() {
		setCaption(CAPTION);
		SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
		configurationHelper = (SpringConfigurationValueHelper) helper.getBean("springConfigurationValueHelper");
		customerInfoService = (CustomerInfoService) helper.getBean("customerInfoService");
		wscwCardInfoService = (WscwCardInfoService) helper.getBean("wscwCardInfoService");
		this.sUserId = SecurityUtils.getUserId();
		
		final SimpleDateFormat simpledateformat_current = new SimpleDateFormat("dd/M/yyyy");

		Upload chooseFile = new Upload(null, new Upload.Receiver() {
			private static final long serialVersionUID = 1L;

			@Override
			public OutputStream receiveUpload(String filename, String mimeType) {
				OutputStream outputFile = null;
				try {
					// TODO Auto-generated method stub
					fileNameImport = StringUtils.substringBefore(filename, ".xlsx") + "_" + timeConverter.getCurrentTime() + ".xlsx";

					Window confirmDialog = new Window();
					final FormLayout content = new FormLayout();
					content.setMargin(true);

					Button bYes = new Button("OK");

					confirmDialog.setCaption("Chương trình sẽ tạo hàng loạt nhiều thẻ, bấm OK để tiếp tục");
					confirmDialog.setWidth(400.0f, Unit.PIXELS);
					try {
						if (!filename.isEmpty()) {
							fileImport = new File(configurationHelper.getPathFileRoot() + "/" + fileNameImport);
							if (!fileImport.exists()) {
								fileImport.createNewFile();
							}
							outputFile = new FileOutputStream(fileImport);

							bYes.addClickListener(event -> {
								try {
									InputStream is = null;
									is = new FileInputStream(fileImport);

									LOGGER.info("Reading file " + fileImport.getName());
									// XSSFWorkbook workbook = new XSSFWorkbook(is);
									Workbook workbook = StreamingReader.builder().rowCacheSize(100) // number of rows to keep in memory (defaults to 10)
											.bufferSize(4096) // buffer size to use when reading InputStream to file (defaults to 1024)
											.open(is);

									Sheet sheet = workbook.getSheetAt(0);

									LOGGER.info("Reading row in " + fileImport.getName());

									CardworksServiceLocator locator = new CardworksServiceLocator();
									locator.setMaintainSession(true);
									locator.setCardworksAddress(configurationHelper.getUrlWs());
									
									String intfAddr = locator.getCardworksAddress();
									System.out.println("intfAddr = " + intfAddr);
									cw_port = locator.getCardworks();

									for (Row row : sheet) {
										String cifNo = row.getCell(0) == null ? "" : row.getCell(0).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", "");
										if (row.getRowNum() > 1 && !StringUtils.isEmpty(cifNo)) {
											WscwCardInfo cardinfo = new WscwCardInfo();
											String creTms = timeConverter.getCurrentTime();
											cardinfo.setCreTms(new BigDecimal(creTms));
											cardinfo.setId(creTms + String.format("%05d", row.getRowNum()+1));
											cardinfo.setUserId(sUserId);
											cardinfo.setSeqNo(wscwCardInfoService.getSeqnoWsCreateCard());
											cardinfo.setCifNo(StringUtils.leftPad(cifNo,7,"0"));
											cardinfo.setAccTyp(isCellEmpty(row.getCell(1)) ? "" : row.getCell(1).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setCrdInd(isCellEmpty(row.getCell(2)) ? "" : row.getCell(2).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setPrinCrdNo(isCellEmpty(row.getCell(3)) ? "" : row.getCell(3).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setBrchCde(isCellEmpty(row.getCell(4)) ? "" : StringUtils.leftPad(row.getCell(4).getStringCellValue().replaceFirst("'", ""),3,"0"));
											cardinfo.setDirectId(isCellEmpty(row.getCell(5)) ? "" : StringUtils.leftPad(row.getCell(5).getStringCellValue().replaceFirst("'", ""),5,"0"));
											cardinfo.setSrcCde(isCellEmpty(row.getCell(6)) ? "" : row.getCell(6).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setPromoCde(isCellEmpty(row.getCell(7)) ? "" : row.getCell(7).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setIndirectId(isCellEmpty(row.getCell(8)) ? "" : StringUtils.leftPad(row.getCell(8).getStringCellValue().replaceFirst("'", ""),5,"0"));
											cardinfo.setImgId(isCellEmpty(row.getCell(9)) ? "" : row.getCell(9).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setCrdTyp(isCellEmpty(row.getCell(10)) ? "" : row.getCell(10).getStringCellValue().replaceFirst("'", "").replaceAll("[\\s|\\u00A0]+", ""));
											cardinfo.setAutoRenew(isCellEmpty(row.getCell(11)) ? "N" : row.getCell(11).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setReleaseForm(isCellEmpty(row.getCell(12)) ? "" : row.getCell(12).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setContractNo(isCellEmpty(row.getCell(13)) ? "" : row.getCell(13).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setInternetTxn(isCellEmpty(row.getCell(14)) ? "1" : row.getCell(14).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setContcLessInd(isCellEmpty(row.getCell(15)) ? "Y" : row.getCell(15).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setTitle(isCellEmpty(row.getCell(16)) ? "" : deAccent(row.getCell(16).getStringCellValue().replaceFirst("'", "").trim()));
//											String fullname = isCellEmpty(row.getCell(17)) ? "" : deAccent(row.getCell(17).getStringCellValue().replaceFirst("'", "")).trim().replaceAll("[\\s|\\u00A0]+", " ");
//											
//											LOGGER.info("Full Name = "+fullname);
//											int start = fullname.indexOf(' ');
//											int end = fullname.lastIndexOf(' ');
//											
//											String embName = "";
//											String middEmbleName = "";
//											String lastEmbName = "";
//											if (start >= 0) {
//												lastEmbName = fullname.substring(0, start).trim();
//												if (end > start)
//													middEmbleName = fullname.substring(start + 1, end).trim();
//												embName = fullname.substring(end + 1, fullname.length()).trim();
//											}     
//
//											LOGGER.info("Last Name = "+ lastEmbName);
//											LOGGER.info("Middle Name = "+ middEmbleName);
//											LOGGER.info("Emb Name Name = "+ embName);
											
//											cardinfo.setFullName(fullname);
//											cardinfo.setLastEmbName(lastEmbName);
//											cardinfo.setEmbName(embName);
//											cardinfo.setMidEmbName(middEmbleName);
											
											cardinfo.setLastEmbName(isCellEmpty(row.getCell(18)) ? "" : deAccent(row.getCell(18).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setEmbName(isCellEmpty(row.getCell(19)) ? "" : deAccent(row.getCell(19).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setMidEmbName(isCellEmpty(row.getCell(20)) ? "" : deAccent(row.getCell(20).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setCompEmbName(isCellEmpty(row.getCell(21)) ? "" : deAccent(row.getCell(21).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setEmbPhoto(isCellEmpty(row.getCell(22)) ? "" : row.getCell(22).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setGender(isCellEmpty(row.getCell(23)) ? "" : deAccent(row.getCell(23).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setNation(isCellEmpty(row.getCell(24)) ? "VN" : deAccent(row.getCell(24).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setMartialStat(isCellEmpty(row.getCell(25)) ? "" : deAccent(row.getCell(25).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setResidenTyp(isCellEmpty(row.getCell(26)) ? "" : deAccent(row.getCell(26).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setMthToStay(isCellEmpty(row.getCell(27)) ? "0" : row.getCell(27).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setPrStat(isCellEmpty(row.getCell(28)) ? "" : row.getCell(28).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setVsExpDate(isCellEmpty(row.getCell(29)) ? "000000" : StringUtils.leftPad(row.getCell(29).getStringCellValue().replaceFirst("'", ""),6,"0").trim());
											cardinfo.setEducation(isCellEmpty(row.getCell(30)) ? "" : StringUtils.leftPad(row.getCell(30).getStringCellValue().replaceFirst("'", ""),2,"0").trim());
											cardinfo.setCustCtgry(isCellEmpty(row.getCell(31)) ? "" : StringUtils.leftPad(row.getCell(31).getStringCellValue().replaceFirst("'", ""),2,"0").trim());
											cardinfo.setRelToPrin(isCellEmpty(row.getCell(32)) ? "" : row.getCell(32).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setMotherName(isCellEmpty(row.getCell(33)) ? "" : deAccent(row.getCell(33).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSecureQues(isCellEmpty(row.getCell(34)) ? "" : deAccent(row.getCell(34).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setBillOpt(isCellEmpty(row.getCell(35)) ? "" : row.getCell(35).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setStetDelivOpt(isCellEmpty(row.getCell(36)) ? "" : row.getCell(36).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setResAddr1(isCellEmpty(row.getCell(37)) ? "" : deAccent(row.getCell(37).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setResAddr2(isCellEmpty(row.getCell(38)) ? "" : deAccent(row.getCell(38).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setResAddr3(isCellEmpty(row.getCell(39)) ? "" : deAccent(row.getCell(39).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setResPostCde(isCellEmpty(row.getCell(40)) ? "" : row.getCell(40).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setResTown(isCellEmpty(row.getCell(41)) ? "" : deAccent(row.getCell(41).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setResState(isCellEmpty(row.getCell(42)) ? "" : deAccent(row.getCell(42).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setResCountry(isCellEmpty(row.getCell(43)) ? "" : deAccent(row.getCell(43).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setResPhoneNo(isCellEmpty(row.getCell(44)) ? "" : row.getCell(44).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setResTyp(isCellEmpty(row.getCell(45)) ? "" : deAccent(row.getCell(45).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setResSince(isCellEmpty(row.getCell(46)) ? "000000" : StringUtils.leftPad(row.getCell(46).getStringCellValue().replaceFirst("'", ""),6,"0").trim());
											cardinfo.setCorpsAddr1(isCellEmpty(row.getCell(47)) ? "" : deAccent(row.getCell(47).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setCorpsAddr2(isCellEmpty(row.getCell(48)) ? "" : deAccent(row.getCell(48).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setCorpsAddr3(isCellEmpty(row.getCell(49)) ? "" : deAccent(row.getCell(49).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setCorpsPostCde(isCellEmpty(row.getCell(50)) ? "" : row.getCell(50).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setCorpsTown(isCellEmpty(row.getCell(51)) ? "" : deAccent(row.getCell(51).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setCorpsState(isCellEmpty(row.getCell(52)) ? "" : deAccent(row.getCell(52).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setCorpsCountry(isCellEmpty(row.getCell(53)) ? "" : deAccent(row.getCell(53).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setCorpsPhoneNo(isCellEmpty(row.getCell(54)) ? "" : StringUtils.leftPad(row.getCell(54).getStringCellValue().replaceFirst("'", ""),10,"0").trim());
											cardinfo.setMobileNo(isCellEmpty(row.getCell(55)) ? "" : StringUtils.leftPad(row.getCell(55).getStringCellValue().replaceFirst("'", ""),10,"0").trim());
											cardinfo.setSmsInd(isCellEmpty(row.getCell(56)) ? "Y" : row.getCell(56).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setEmail(isCellEmpty(row.getCell(57)) ? "" : row.getCell(57).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setIndustryCde(isCellEmpty(row.getCell(58)) ? "" : StringUtils.leftPad(row.getCell(58).getStringCellValue().replaceFirst("'", ""),4,"0"));
											cardinfo.setEmpNature(isCellEmpty(row.getCell(59)) ? "" : StringUtils.leftPad(row.getCell(59).getStringCellValue().replaceFirst("'", ""),2,"0"));
											cardinfo.setCompSize(isCellEmpty(row.getCell(60)) ? "" : StringUtils.leftPad(row.getCell(60).getStringCellValue().replaceFirst("'", ""),2,"0"));
											cardinfo.setPostHeld(isCellEmpty(row.getCell(61)) ? "" : StringUtils.leftPad(row.getCell(61).getStringCellValue().replaceFirst("'", ""),4,"0"));
											cardinfo.setEmpSince(isCellEmpty(row.getCell(62)) ? "" : StringUtils.leftPad(row.getCell(62).getStringCellValue().replaceFirst("'", ""),6,"0").trim());
											cardinfo.setOffName(isCellEmpty(row.getCell(63)) ? "" : deAccent(row.getCell(63).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setOffAddr1(isCellEmpty(row.getCell(64)) ? "" : deAccent(row.getCell(64).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setOffAddr2(isCellEmpty(row.getCell(65)) ? "" : deAccent(row.getCell(65).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setOffAddr3(isCellEmpty(row.getCell(66)) ? "" : deAccent(row.getCell(66).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setOffPostCde(isCellEmpty(row.getCell(67)) ? "" : row.getCell(67).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOffTown(isCellEmpty(row.getCell(68)) ? "" : deAccent(row.getCell(68).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setOffState(isCellEmpty(row.getCell(69)) ? "" : deAccent(row.getCell(69).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setOffCountry(isCellEmpty(row.getCell(70)) ? "" : deAccent(row.getCell(70).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setOffPhoneNo1(isCellEmpty(row.getCell(71)) ? "" : row.getCell(71).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOffPhoneNo1Ext(isCellEmpty(row.getCell(72)) ? "" : row.getCell(72).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOffPhoneNo2(isCellEmpty(row.getCell(73)) ? "" : row.getCell(73).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOffPhoneNo2Ext(isCellEmpty(row.getCell(74)) ? "" : row.getCell(74).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOffFaxNo(isCellEmpty(row.getCell(75)) ? "" : row.getCell(75).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPrevEmpName(isCellEmpty(row.getCell(76)) ? "" : deAccent(row.getCell(76).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setPrevEmpAddr1(isCellEmpty(row.getCell(77)) ? "" : deAccent(row.getCell(77).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setPrevEmpAddr2(isCellEmpty(row.getCell(78)) ? "" : deAccent(row.getCell(78).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setPrevEmpAddr3(isCellEmpty(row.getCell(79)) ? "" : deAccent(row.getCell(79).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setPrevEmpPostCde(isCellEmpty(row.getCell(80)) ? "" : row.getCell(80).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPrevEmpTown(isCellEmpty(row.getCell(81)) ? "" : deAccent(row.getCell(81).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setPrevEmpState(isCellEmpty(row.getCell(82)) ? "" : deAccent(row.getCell(82).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setPrevEmpCountry(isCellEmpty(row.getCell(83)) ? "" : deAccent(row.getCell(83).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setPrevEmpPhone(isCellEmpty(row.getCell(84)) ? "" : row.getCell(84).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPrevEmpPhoneExt(isCellEmpty(row.getCell(85)) ? "" : row.getCell(85).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPrevEmpSince(isCellEmpty(row.getCell(86)) ? "000000" : StringUtils.leftPad(row.getCell(86).getStringCellValue().replaceFirst("'", ""),6,"0").trim());
											cardinfo.setPrevEmpDurOfServ(isCellEmpty(row.getCell(87)) ? "0" : row.getCell(87).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setOwnHouseLand(isCellEmpty(row.getCell(88)) ? "" : row.getCell(88).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setOwnCar(isCellEmpty(row.getCell(89)) ? "" : row.getCell(89).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setNoOfDepen(isCellEmpty(row.getCell(90)) ? "" : row.getCell(90).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setAvgSpendMth(isCellEmpty(row.getCell(91)) ? "" : row.getCell(91).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setBankPrd(isCellEmpty(row.getCell(92)) ? "" : row.getCell(92).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setBankOthrPrd(isCellEmpty(row.getCell(93)) ? "" : row.getCell(93).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOthrCCBank(isCellEmpty(row.getCell(94)) ? "" : row.getCell(94).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOthrCCLimit(isCellEmpty(row.getCell(95)) ? "" : row.getCell(95).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOthrLoanBankName(isCellEmpty(row.getCell(96)) ? "" : row.getCell(96).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setOthrLoanInstallMth(isCellEmpty(row.getCell(97)) ? "" : row.getCell(97).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setDelivByBrchId(isCellEmpty(row.getCell(98)) ? "" : row.getCell(98).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setDelivOpt(isCellEmpty(row.getCell(99)) ? "" : row.getCell(99).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setDelivAdd1(isCellEmpty(row.getCell(100)) ? "" : deAccent(row.getCell(100).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivAdd2(isCellEmpty(row.getCell(101)) ? "" : deAccent(row.getCell(101).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivAdd3(isCellEmpty(row.getCell(102)) ? "" : deAccent(row.getCell(102).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivPostCde(isCellEmpty(row.getCell(103)) ? "" : row.getCell(103).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setDelivTown(isCellEmpty(row.getCell(104)) ? "" : deAccent(row.getCell(104).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivState(isCellEmpty(row.getCell(105)) ? "" : deAccent(row.getCell(105).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivCountry(isCellEmpty(row.getCell(106)) ? "" : deAccent(row.getCell(106).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDelivBrchId(isCellEmpty(row.getCell(107)) ? "" : row.getCell(107).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcName(isCellEmpty(row.getCell(108)) ? "" : deAccent(row.getCell(108).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSpcIdInd(isCellEmpty(row.getCell(109)) ? "" : row.getCell(109).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcNewId(isCellEmpty(row.getCell(110)) ? "" : row.getCell(110).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcEmpName(isCellEmpty(row.getCell(111)) ? "" : deAccent(row.getCell(111).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSpcEmpAddr1(isCellEmpty(row.getCell(112)) ? "" : deAccent(row.getCell(112).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setSpcEmpAddr2(isCellEmpty(row.getCell(113)) ? "" : deAccent(row.getCell(113).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setSpcEmpAddr3(isCellEmpty(row.getCell(114)) ? "" : deAccent(row.getCell(114).getStringCellValue().replaceFirst("'", "").replaceAll("\"", "")));
											cardinfo.setSpcEmpPostCde(isCellEmpty(row.getCell(115)) ? "" : row.getCell(115).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcEmpTown(isCellEmpty(row.getCell(116)) ? "" : deAccent(row.getCell(116).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSpcEmpState(isCellEmpty(row.getCell(117)) ? "" : deAccent(row.getCell(117).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSpcEmpCountry(isCellEmpty(row.getCell(118)) ? "" : deAccent(row.getCell(118).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setSpcEmpPhone(isCellEmpty(row.getCell(119)) ? "" : row.getCell(119).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcEmpPhoneExt(isCellEmpty(row.getCell(120)) ? "" : row.getCell(120).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcEmpPosi(isCellEmpty(row.getCell(121)) ? "" : row.getCell(121).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setSpcEmpSince(isCellEmpty(row.getCell(122)) ? "" : StringUtils.leftPad(row.getCell(122).getStringCellValue().replaceFirst("'", ""),6,"0").trim());
											cardinfo.setSpcEmpWorkNat(isCellEmpty(row.getCell(123)) ? "" : deAccent(row.getCell(123).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setEmerContcPrsn(isCellEmpty(row.getCell(124)) ? "" : row.getCell(124).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setEmerGender(isCellEmpty(row.getCell(125)) ? "" : deAccent(row.getCell(125).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setEmerPhoneNo(isCellEmpty(row.getCell(126)) ? "" : StringUtils.leftPad(row.getCell(126).getStringCellValue().replaceFirst("'", ""),10,"0").trim());
											cardinfo.setEmerMobileNo(isCellEmpty(row.getCell(127)) ? "" : StringUtils.leftPad(row.getCell(127).getStringCellValue().replaceFirst("'", ""),10,"0").trim());
											cardinfo.setEmerRelt(isCellEmpty(row.getCell(128)) ? "" : deAccent(row.getCell(128).getStringCellValue().replaceFirst("'", "").trim()));
											cardinfo.setEmerMeth(isCellEmpty(row.getCell(129)) ? "" : row.getCell(129).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPayCASA(isCellEmpty(row.getCell(130)) ? "" : row.getCell(130).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setPayAmt(isCellEmpty(row.getCell(131)) ? "" : row.getCell(131).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setCasaAcctNo(isCellEmpty(row.getCell(132)) ? "" : row.getCell(132).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setCasaAcctTyp(isCellEmpty(row.getCell(133)) ? "" : row.getCell(133).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setCasaCurCde(isCellEmpty(row.getCell(134)) ? "" : row.getCell(134).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setRecomCrdNo(isCellEmpty(row.getCell(135)) ? "" : row.getCell(135).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setRecomName(isCellEmpty(row.getCell(136)) ? "" : deAccent(row.getCell(136).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setRemark(isCellEmpty(row.getCell(137)) ? "" : deAccent(row.getCell(137).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setApprvDeviation(isCellEmpty(row.getCell(138)) ? "" : row.getCell(138).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setAddData1(isCellEmpty(row.getCell(139)) ? "" : deAccent(row.getCell(139).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setAddData2(isCellEmpty(row.getCell(140)) ? "" : deAccent(row.getCell(140).getStringCellValue().replaceFirst("'", "")));
											cardinfo.setDocChecker(isCellEmpty(row.getCell(141)) ? "" : row.getCell(141).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setDocApprover(isCellEmpty(row.getCell(142)) ? "" : row.getCell(142).getStringCellValue().replaceFirst("'", "").trim());
											cardinfo.setSmsInfo(isCellEmpty(row.getCell(143)) ? "" : row.getCell(143).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setNarrative(isCellEmpty(row.getCell(144)) ? "" : deAccent(row.getCell(144).getStringCellValue().replaceFirst("'", "")));
//											cardinfo.setAttachment(isCellEmpty(row.getCell(145)) ? null : row.getCell(145).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setAttachment(null);
											cardinfo.setDecsnStat(isCellEmpty(row.getCell(146)) ? "" : row.getCell(146).getStringCellValue().replaceFirst("'", ""));
											cardinfo.setFileName(filename);
											
											custInfo =  customerInfoService.getCustomerInfo(cardinfo.getCifNo());
											cardinfo.setFullName(custInfo.getFullName());
											cardinfo.setIdInd("N");
											cardinfo.setNewId(custInfo.getNewId());
											cardinfo.setOldId(custInfo.getOldId());// ko bat buoc
											LOGGER.info(custInfo.getIssuePlace());
											if(custInfo.getIssuePlace().length()>35) {
												LOGGER.info(custInfo.getIssuePlace().substring(0, 35));
												cardinfo.setIssuePlace(custInfo.getIssuePlace().substring(0, 35));
											} else {
												cardinfo.setIssuePlace(custInfo.getIssuePlace());
											}
											
											cardinfo.setIssueDate(custInfo.getIssueDate());
											cardinfo.setDob(custInfo.getDob());
											
											CardCreationReqBean cardCreReq = new CardCreationReqBean();
											cardCreReq.setSequenceNo(cardinfo.getSeqNo());
											cardCreReq.setFi("970429"); // hardcode
											cardCreReq.setSrcSystm("WSPORTAL"); // hardcode
											cardCreReq.setCifNo(StringUtils.leftPad(cardinfo.getCifNo(),7,"0"));
											cardCreReq.setAccTyp(cardinfo.getAccTyp());
											cardCreReq.setCrdInd(cardinfo.getCrdInd()); // B: prin card, S: sup card
											cardCreReq.setPrinCrdNo(cardinfo.getPrinCrdNo());// neu CrdInd(cardinfo.getS) la the phu thi phai dien so the chinh(cardinfo.getLOC + 4 last digits)
											
											cardCreReq.setIdInd(cardinfo.getIdInd());
											cardCreReq.setNewId(cardinfo.getNewId());
											cardCreReq.setOldId(cardinfo.getOldId());// ko bat buoc
											cardCreReq.setIssuePlace(cardinfo.getIssuePlace());
											cardCreReq.setIssueDate(cardinfo.getIssueDate());
											cardCreReq.setDob(cardinfo.getDob());
											
//											cardCreReq.setIdInd(cardinfo.get"N");
//											cardCreReq.setNewId(cardinfo.get"025823422");
//											cardCreReq.setOldId(cardinfo.get"");// ko bat buoc
//											cardCreReq.setIssuePlace(cardinfo.get"HCM");
//											cardCreReq.setIssueDate(cardinfo.get"20140315");
//											cardCreReq.setDob(cardinfo.get"19820301");
											
											cardCreReq.setBrchCde(cardinfo.getBrchCde());
											cardCreReq.setDirectId(cardinfo.getDirectId());
											cardCreReq.setSrcCde(cardinfo.getSrcCde());
											cardCreReq.setPromoCde(cardinfo.getPromoCde());
											cardCreReq.setIndirectId(cardinfo.getIndirectId());
											cardCreReq.setImgId(cardinfo.getImgId());//ko bat buoc
											cardCreReq.setCrdTyp(cardinfo.getCrdTyp());
											cardCreReq.setAutoRenew(cardinfo.getAutoRenew()); // SCB default la No
											cardCreReq.setReleaseForm(cardinfo.getReleaseForm());// Q: phat hanh nhanh, N: phat hanh thuong
											cardCreReq.setDecsnStat(cardinfo.getDecsnStat());// A – Approved, AM – Approved with manual embossing, C – Cancel, D – Decline, P – Pending
											cardCreReq.setContractNo(cardinfo.getContractNo());// khong bat buoc cho the debit
											cardCreReq.setInternetTxn(cardinfo.getInternetTxn());
											cardCreReq.setContcLessInd(cardinfo.getContcLessInd());
											cardCreReq.setTitle(cardinfo.getTitle());
											cardCreReq.setName(cardinfo.getFullName());
											cardCreReq.setLastEmbName(cardinfo.getLastEmbName());
											cardCreReq.setEmbName(cardinfo.getEmbName());
											cardCreReq.setMidEmbName(cardinfo.getMidEmbName());// khong bat buoc
											cardCreReq.setCompEmbName(cardinfo.getCompEmbName());// khong bat buoc
											 cardCreReq.setEmbPhoto(cardinfo.getEmbPhoto());//khong bat buoc
											cardCreReq.setGender(cardinfo.getGender());
											cardCreReq.setNation(cardinfo.getNation());
											cardCreReq.setMartialStat(cardinfo.getMartialStat());
											cardCreReq.setResidenTyp(cardinfo.getResidenTyp());
											cardCreReq.setMthToStay(cardinfo.getMthToStay()); // default value is 0
											cardCreReq.setPrStat(cardinfo.getPrStat());
											cardCreReq.setVsExpDate(cardinfo.getVsExpDate()); // Please fill 000000 for it if for VN nationality
											cardCreReq.setEducation(cardinfo.getEducation());
											cardCreReq.setCustCtgry(cardinfo.getCustCtgry());
											cardCreReq.setRelToPrin(cardinfo.getRelToPrin());// ko bat buoc voi the chinh, bat buoc voi the phu
											cardCreReq.setMotherName(cardinfo.getMotherName());
											cardCreReq.setSecureQues(cardinfo.getSecureQues());
											cardCreReq.setBillOpt(cardinfo.getBillOpt());
											cardCreReq.setStetDelivOpt(cardinfo.getStetDelivOpt());
											cardCreReq.setResAddr1(cardinfo.getResAddr1());
											cardCreReq.setResAddr2(cardinfo.getResAddr2());// ko bat buoc
											cardCreReq.setResAddr3(cardinfo.getResAddr3());// ko bat buoc
											cardCreReq.setResPostCde(cardinfo.getResPostCde());
											cardCreReq.setResTown(cardinfo.getResTown());
											cardCreReq.setResState(cardinfo.getResState());
											cardCreReq.setResCountry(cardinfo.getResCountry());
											cardCreReq.setResPhoneNo(cardinfo.getResPhoneNo());
											cardCreReq.setResTyp(cardinfo.getResTyp());
											cardCreReq.setResSince(cardinfo.getResSince()); // if no info please fill it with 000000
											cardCreReq.setCorpsAddr1(cardinfo.getCorpsAddr1());
											cardCreReq.setCorpsAddr2(cardinfo.getCorpsAddr2());
											cardCreReq.setCorpsAddr3(cardinfo.getCorpsAddr3());//ko bat buoc
											cardCreReq.setCorpsPostCde(cardinfo.getCorpsPostCde());
											cardCreReq.setCorpsTown(cardinfo.getCorpsTown());
											cardCreReq.setCorpsState(cardinfo.getCorpsState());
											cardCreReq.setCorpsCountry(cardinfo.getCorpsCountry());
											cardCreReq.setCorpsPhoneNo(cardinfo.getCorpsPhoneNo());
											cardCreReq.setMobileNo(cardinfo.getMobileNo());
											cardCreReq.setSmsInd(cardinfo.getSmsInd());
											cardCreReq.setEmail(cardinfo.getEmail());
											cardCreReq.setIndustryCde(cardinfo.getIndustryCde());
											cardCreReq.setEmpNature(cardinfo.getEmpNature());
											cardCreReq.setCompSize(cardinfo.getCompSize());
											cardCreReq.setPostHeld(cardinfo.getPostHeld());
											cardCreReq.setEmpSince(cardinfo.getEmpSince());
											cardCreReq.setOffName(cardinfo.getOffName());
											cardCreReq.setOffAddr1(cardinfo.getOffAddr1());
											cardCreReq.setOffAddr2(cardinfo.getOffAddr2());// ko bat buoc
											cardCreReq.setOffAddr3(cardinfo.getOffAddr3());// ko bat buoc
											cardCreReq.setOffPostCde(cardinfo.getOffPostCde());
											cardCreReq.setOffTown(cardinfo.getOffTown());
											cardCreReq.setOffState(cardinfo.getOffState());
											cardCreReq.setOffCountry(cardinfo.getOffCountry());
											cardCreReq.setOffPhoneNo1(cardinfo.getOffPhoneNo1());//khong bat buoc
											cardCreReq.setOffPhoneNo1Ext(cardinfo.getOffPhoneNo1Ext());//khong bat buoc
											cardCreReq.setOffPhoneNo2(cardinfo.getOffPhoneNo2());//khong bat buoc
											cardCreReq.setOffPhoneNo2Ext(cardinfo.getOffPhoneNo2Ext());//khong bat buoc
											cardCreReq.setOffFaxNo(cardinfo.getOffFaxNo());//khong bat buoc

											cardCreReq.setPrevEmpName(cardinfo.getPrevEmpName());// khong bat buoc
											cardCreReq.setPrevEmpAddr1(cardinfo.getPrevEmpAddr1());// khong bat buoc
											cardCreReq.setPrevEmpAddr2(cardinfo.getPrevEmpAddr2());//khong bat buoc
											cardCreReq.setPrevEmpAddr3(cardinfo.getPrevEmpAddr3());//khong bat buoc
											cardCreReq.setPrevEmpPostCde(cardinfo.getPrevEmpPostCde());// khong bat buoc
											cardCreReq.setPrevEmpTown(cardinfo.getPrevEmpTown());// khong bat buoc
											cardCreReq.setPrevEmpState(cardinfo.getPrevEmpState());// khong bat buoc
											cardCreReq.setPrevEmpCountry(cardinfo.getPrevEmpCountry());// khong bat buoc
											cardCreReq.setPrevEmpPhone(cardinfo.getPrevEmpPhone());// khong bat buoc
											cardCreReq.setPrevEmpPhoneExt(cardinfo.getPrevEmpPhoneExt());// khong bat buoc
											cardCreReq.setPrevEmpSince(cardinfo.getPrevEmpSince());// if no info please fill it with 000000
											cardCreReq.setPrevEmpDurOfServ(cardinfo.getPrevEmpDurOfServ());// default value is 0

											cardCreReq.setOwnHouseLand(cardinfo.getOwnHouseLand());
											cardCreReq.setOwnCar(cardinfo.getOwnCar());
											cardCreReq.setNoOfDepen(cardinfo.getNoOfDepen());// default is 0
											cardCreReq.setAvgSpendMth(cardinfo.getAvgSpendMth());// default is 0
											cardCreReq.setBankPrd(cardinfo.getBankPrd());//khong bat buoc
											cardCreReq.setBankOthrPrd(cardinfo.getBankOthrPrd());//khong bat buoc
											cardCreReq.setOthrCCBankName(cardinfo.getOthrCCBank());//khong bat buoc
											cardCreReq.setOthrCCLimit(cardinfo.getOthrCCLimit());//khong bat buoc
											cardCreReq.setOthrLoanBankName(cardinfo.getOthrLoanBankName());// khong bat buoc
											cardCreReq.setOthrLoanInstallMth(cardinfo.getOthrLoanInstallMth());// khong bat buoc

											cardCreReq.setDelivByBrchInd(cardinfo.getDelivByBrchId());
											cardCreReq.setDelivOpt(cardinfo.getDelivOpt());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivAddr1(cardinfo.getDelivAdd1());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivAddr2(cardinfo.getDelivAdd2());//neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivAddr3(cardinfo.getDelivAdd3());//neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivPostCde(cardinfo.getDelivPostCde());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivTown(cardinfo.getDelivTown());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivState(cardinfo.getDelivState());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivCountry(cardinfo.getDelivCountry());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua
											cardCreReq.setDelivBrchId(cardinfo.getDelivBrchId());// neu DelivByBrchInd = N thi phai Input, DelivByBrchInd = N thi bo qua

											cardCreReq.setSpcName(cardinfo.getSpcName());// khong bat buoc
											cardCreReq.setSpcIdInd(cardinfo.getSpcIdInd());// khong bat buoc
											cardCreReq.setSpcNewId(cardinfo.getSpcNewId());// khong bat buoc
											cardCreReq.setSpcEmpName(cardinfo.getSpcEmpName());// khong bat buoc
											cardCreReq.setSpcEmpAddr1(cardinfo.getSpcEmpAddr1());// khong bat buoc
											cardCreReq.setSpcEmpAddr2(cardinfo.getSpcEmpAddr2());// khong bat buoc
											cardCreReq.setSpcEmpAddr3(cardinfo.getSpcEmpAddr3());// khong bat buoc
											cardCreReq.setSpcEmpPostCde(cardinfo.getSpcEmpPostCde());// khong bat buoc
											cardCreReq.setSpcEmpTown(cardinfo.getSpcEmpTown());// khong bat buoc
											cardCreReq.setSpcEmpState(cardinfo.getSpcEmpState());// khong bat buoc
											cardCreReq.setSpcEmpCountry(cardinfo.getSpcEmpCountry());// khong bat buoc
											cardCreReq.setSpcEmpPhone(cardinfo.getSpcEmpPhone());// khong bat buoc
											cardCreReq.setSpcEmpPhoneExt(cardinfo.getSpcEmpPhoneExt());// khong bat buoc
											cardCreReq.setSpcEmpPosi(cardinfo.getSpcEmpPosi());// khong bat buoc
											cardCreReq.setSpcEmpSince(cardinfo.getSpcEmpSince());// if no info please fill it with 000000
											cardCreReq.setSpcEmpWorkNat(cardinfo.getSpcEmpWorkNat());

											cardCreReq.setEmerContcPrsn(cardinfo.getEmerContcPrsn());
											cardCreReq.setEmerGender(cardinfo.getEmerGender());
											cardCreReq.setEmerPhoneNo(cardinfo.getEmerPhoneNo());
											cardCreReq.setEmerMobileNo(cardinfo.getEmerMobileNo());
											cardCreReq.setEmerRelt(cardinfo.getEmerRelt());
											cardCreReq.setPayMeth(cardinfo.getEmerMeth());
											
											cardCreReq.setPayCASA(cardinfo.getPayCASA());
											cardCreReq.setPayAmt(cardinfo.getPayAmt());
											cardCreReq.setCasaAcctNo(cardinfo.getCasaAcctNo());
											cardCreReq.setCasaAcctTyp(cardinfo.getCasaAcctTyp());
											cardCreReq.setCasaCurCde(cardinfo.getCasaCurCde());
											cardCreReq.setRecomCrdNo(cardinfo.getRecomCrdNo());
											cardCreReq.setRecomName(cardinfo.getRecomName());
											cardCreReq.setRemark(cardinfo.getRemark());
											cardCreReq.setApprvDeviation(cardinfo.getApprvDeviation());
											cardCreReq.setAddData1(cardinfo.getAddData1());
											cardCreReq.setAddData2(cardinfo.getAddData2());
											cardCreReq.setDocChecker(cardinfo.getDocChecker());
											cardCreReq.setDocApprover(cardinfo.getDocApprover());
											cardCreReq.setSmsInfo(cardinfo.getSmsInfo()); // bat buoc phai dien khi tao the phu
											cardCreReq.setNarrative(cardinfo.getNarrative());
											cardCreReq.setAttachment(cardinfo.getAttachment());

											try {
												CardCreationRespBean resp = cw_port.cardCreation(cardCreReq);
												cardinfo.setRespStat(resp.getResponseCode() + " - " + resp.getResponseDescription());
												LOGGER.info("----------LOG INFO: USER = " + sUserId + ", Rownum = " + (row.getRowNum()+1) + ", SequenceNo = " + resp.getSequenceNo() + ", CreTms = " + creTms + "----------");
											} catch (Exception e) {
												// TODO: handle exception
												LOGGER.error(e.getMessage());
												e.printStackTrace();
											}
											
											LOGGER.info("RESPONSE WS: " + cardinfo.getRespStat());
											
											for (Field field : cardinfo.getClass().getDeclaredFields()) {
											    field.setAccessible(true);
											    String name = field.getName();
											    Object value = field.get(cardinfo);
											    LOGGER.info(name + ": " + value);
											}
											
											wscwCardInfoService.save(cardinfo);
											
										}
									}
									confirmDialog.close();
									
								} catch (Exception e) {
									// TODO: handle exception
									e.printStackTrace();
									LOGGER.error(e.getMessage());
								}

							});

							// -----------------
							VerticalLayout layoutBtn = new VerticalLayout();
							layoutBtn.addComponents(bYes);
							layoutBtn.setComponentAlignment(bYes, Alignment.BOTTOM_CENTER);
							content.addComponent(layoutBtn);

							confirmDialog.setContent(content);

							getUI().addWindow(confirmDialog);

							// Center it in the browser window
							confirmDialog.center();
							confirmDialog.setResizable(false);
						} else
							outputFile = null;

					} catch (IOException e) {
						e.printStackTrace();
						LOGGER.error("Error: " + e.getMessage());
					}

				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					LOGGER.error(e.toString());
				}
				return outputFile;

			}

		});
		chooseFile.setButtonCaption("Create");
		chooseFile.addStyleName("myCustomUpload");

		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		mainLayout.addComponent(chooseFile);
		
		setCompositionRoot(mainLayout);
	}


	private static int getRandomSeq(int min, int max) {
		// It has a minimum value of -2,147,483,648 and a maximum value of 2,147,483,647 (inclusive)
		return min + (int) (Math.random() * ((max - min) + 1));
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
	 

	@Override
	public void eventReload() {
		
	}
}
