package com.wscw.components;


import java.math.BigDecimal;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;

import com.vaadin.data.Item;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.grid.HeightMode;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import com.wscw.SpringConfigurationValueHelper;
import com.wscw.SpringContextHelper;
import com.wscw.TimeConverter;
import com.wscw.entities.WscwCardInfo;


@SpringComponent
@Scope("prototype")
public class DataGridCreateCard extends VerticalLayout {

	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(DataGridCreateCard.class);
	private final transient TimeConverter timeConverter = new TimeConverter();
	public transient Grid grid;
	public final transient Label lbNoDataFound;
	private transient IndexedContainer container;
	
	private SpringConfigurationValueHelper configurationHelper;
	protected DataSource localDataSource;
	
	public Page<WscwCardInfo> dataSource;

	public DataGridCreateCard() {

		setSizeFull();

		// init SpringContextHelper de truy cap service bean
		final SpringContextHelper helper = new SpringContextHelper(VaadinServlet.getCurrent().getServletContext());
		configurationHelper = (SpringConfigurationValueHelper) helper.getBean("springConfigurationValueHelper");
		localDataSource = (DataSource) helper.getBean("dataSource");
		
		// init label
		lbNoDataFound = new Label("Không tìm thấy dữ liệu");
		lbNoDataFound.setVisible(false);
		lbNoDataFound.addStyleName(ValoTheme.LABEL_FAILURE);
		lbNoDataFound.addStyleName(ValoTheme.LABEL_NO_MARGIN);
		lbNoDataFound.setSizeUndefined();

		// init grid
		grid = new Grid();
		grid.setVisible(false);
		grid.setSizeFull();
		grid.setHeightByRows(20);
		grid.setHeightMode(HeightMode.ROW);
		
		container = new IndexedContainer();
		container.addContainerProperty("id", String.class, "");
		container.addContainerProperty("responseStatus", String.class, "");
		container.addContainerProperty("cifNo", String.class, "");
		container.addContainerProperty("accTyp", String.class, "");
		container.addContainerProperty("crdInd", String.class, "");
		container.addContainerProperty("prinCrdNo", String.class, "");
		container.addContainerProperty("idInd", String.class, "");
		container.addContainerProperty("newId", String.class, "");
		container.addContainerProperty("oldId", String.class, "");
		container.addContainerProperty("issuePlace", String.class, "");
		container.addContainerProperty("dob", String.class, "");
		container.addContainerProperty("brchCde", String.class, "");
		container.addContainerProperty("directId", String.class, "");
		container.addContainerProperty("srcCde", String.class, "");
		container.addContainerProperty("promoCde", String.class, "");
		container.addContainerProperty("indirectId", String.class, "");
		container.addContainerProperty("imgId", String.class, "");
		container.addContainerProperty("crdTyp", String.class, "");
		container.addContainerProperty("autoRenew", String.class, "");
		container.addContainerProperty("releaseForm", String.class, "");
		container.addContainerProperty("contractNo", String.class, "");
		container.addContainerProperty("internetTxn", String.class, "");
		container.addContainerProperty("contcLessInd", String.class, "");
		container.addContainerProperty("title", String.class, "");
		container.addContainerProperty("fullName", String.class, "");
		container.addContainerProperty("lastEmbName", String.class, "");
		container.addContainerProperty("embName", String.class, "");
		container.addContainerProperty("midEmbName", String.class, "");
		container.addContainerProperty("compEmbName", String.class, "");
		container.addContainerProperty("embPhoto", String.class, "");
		container.addContainerProperty("gender", String.class, "");
		container.addContainerProperty("nation", String.class, "");
		container.addContainerProperty("martialStat", String.class, "");
		container.addContainerProperty("residenTyp", String.class, "");
		container.addContainerProperty("mthToStay", String.class, "");
		container.addContainerProperty("prStat", String.class, "");
		container.addContainerProperty("vsExpDate", String.class, "");
		container.addContainerProperty("education", String.class, "");
		container.addContainerProperty("custCtgry", String.class, "");
		container.addContainerProperty("relToPrin", String.class, "");
		container.addContainerProperty("motherName", String.class, "");
		container.addContainerProperty("secureQues", String.class, "");
		container.addContainerProperty("billOpt", String.class, "");
		container.addContainerProperty("stetDelivOpt", String.class, "");
		container.addContainerProperty("resAddr1", String.class, "");
		container.addContainerProperty("resAddr2", String.class, "");
		container.addContainerProperty("resAddr3", String.class, "");
		container.addContainerProperty("resPostCde", String.class, "");
		container.addContainerProperty("resTown", String.class, "");
		container.addContainerProperty("resState", String.class, "");
		container.addContainerProperty("resCountry", String.class, "");
		container.addContainerProperty("resPhoneNo", String.class, "");
		container.addContainerProperty("resTyp", String.class, "");
		container.addContainerProperty("resSince", String.class, "");
		container.addContainerProperty("corpsAddr1", String.class, "");
		container.addContainerProperty("corpsAddr2", String.class, "");
		container.addContainerProperty("corpsAddr3", String.class, "");
		container.addContainerProperty("corpsPostCde", String.class, "");
		container.addContainerProperty("corpsTown", String.class, "");
		container.addContainerProperty("corpsState", String.class, "");
		container.addContainerProperty("corpsCountry", String.class, "");
		container.addContainerProperty("corpsPhoneNo", String.class, "");
		container.addContainerProperty("mobileNo", String.class, "");
		container.addContainerProperty("smsInd", String.class, "");
		container.addContainerProperty("email", String.class, "");
		container.addContainerProperty("industryCde", String.class, "");
		container.addContainerProperty("empNature", String.class, "");
		container.addContainerProperty("compSize", String.class, "");
		container.addContainerProperty("postHeld", String.class, "");
		container.addContainerProperty("empSince", String.class, "");
		container.addContainerProperty("offName", String.class, "");
		container.addContainerProperty("offAddr1", String.class, "");
		container.addContainerProperty("offAddr2", String.class, "");
		container.addContainerProperty("offAddr3", String.class, "");
		container.addContainerProperty("offPostCde", String.class, "");
		container.addContainerProperty("offTown", String.class, "");
		container.addContainerProperty("offState", String.class, "");
		container.addContainerProperty("offCountry", String.class, "");
		container.addContainerProperty("offPhoneNo1", String.class, "");
		container.addContainerProperty("offPhoneNo1Ext", String.class, "");
		container.addContainerProperty("offPhoneNo2", String.class, "");
		container.addContainerProperty("offPhoneNo2Ext", String.class, "");
		container.addContainerProperty("offFaxNo", String.class, "");
		container.addContainerProperty("prevEmpName", String.class, "");
		container.addContainerProperty("prevEmpAddr1", String.class, "");
		container.addContainerProperty("prevEmpAddr2", String.class, "");
		container.addContainerProperty("prevEmpAddr3", String.class, "");
		container.addContainerProperty("prevEmpPostCde", String.class, "");
		container.addContainerProperty("prevEmpTown", String.class, "");
		container.addContainerProperty("prevEmpState", String.class, "");
		container.addContainerProperty("prevEmpCountry", String.class, "");
		container.addContainerProperty("prevEmpPhone", String.class, "");
		container.addContainerProperty("prevEmpPhoneExt", String.class, "");
		container.addContainerProperty("prevEmpSince", String.class, "");
		container.addContainerProperty("prevEmpDurOfServ", String.class, "");
		container.addContainerProperty("ownHouseLand", String.class, "");
		container.addContainerProperty("ownCar", String.class, "");
		container.addContainerProperty("noOfDepen", String.class, "");
		container.addContainerProperty("avgSpendMth", String.class, "");
		container.addContainerProperty("bankPrd", String.class, "");
		container.addContainerProperty("bankOthrPrd", String.class, "");
		container.addContainerProperty("othrCCBank", String.class, "");
		container.addContainerProperty("othrCCLimit", String.class, "");
		container.addContainerProperty("othrLoanBankName", String.class, "");
		container.addContainerProperty("othrLoanInstallMth", String.class, "");
		container.addContainerProperty("delivByBrchId", String.class, "");
		container.addContainerProperty("delivOpt", String.class, "");
		container.addContainerProperty("delivAdd1", String.class, "");
		container.addContainerProperty("delivAdd2", String.class, "");
		container.addContainerProperty("delivAdd3", String.class, "");
		container.addContainerProperty("delivPostCde", String.class, "");
		container.addContainerProperty("delivTown", String.class, "");
		container.addContainerProperty("delivState", String.class, "");
		container.addContainerProperty("delivCountry", String.class, "");
		container.addContainerProperty("delivBrchId", String.class, "");
		container.addContainerProperty("spcName", String.class, "");
		container.addContainerProperty("spcIdInd", String.class, "");
		container.addContainerProperty("spcNewId", String.class, "");
		container.addContainerProperty("spcEmpName", String.class, "");
		container.addContainerProperty("spcEmpAddr1", String.class, "");
		container.addContainerProperty("spcEmpAddr2", String.class, "");
		container.addContainerProperty("spcEmpAddr3", String.class, "");
		container.addContainerProperty("spcEmpPostCde", String.class, "");
		container.addContainerProperty("spcEmpTown", String.class, "");
		container.addContainerProperty("spcEmpState", String.class, "");
		container.addContainerProperty("spcEmpCountry", String.class, "");
		container.addContainerProperty("spcEmpPhone", String.class, "");
		container.addContainerProperty("spcEmpPhoneExt", String.class, "");
		container.addContainerProperty("spcEmpPosi", String.class, "");
		container.addContainerProperty("spcEmpSince", String.class, "");
		container.addContainerProperty("spcEmpWorkNat", String.class, "");
		container.addContainerProperty("emerContcPrsn", String.class, "");
		container.addContainerProperty("emerGender", String.class, "");
		container.addContainerProperty("emerPhoneNo", String.class, "");
		container.addContainerProperty("emerMobileNo", String.class, "");
		container.addContainerProperty("emerRelt", String.class, "");
		container.addContainerProperty("emerMeth", String.class, "");
		container.addContainerProperty("payCASA", String.class, "");
		container.addContainerProperty("payAmt", String.class, "");
		container.addContainerProperty("casaAcctNo", String.class, "");
		container.addContainerProperty("casaAcctTyp", String.class, "");
		container.addContainerProperty("casaCurCde", String.class, "");
		container.addContainerProperty("recomCrdNo", String.class, "");
		container.addContainerProperty("recomName", String.class, "");
		container.addContainerProperty("remark", String.class, "");
		container.addContainerProperty("apprvDeviation", String.class, "");
		container.addContainerProperty("addData1", String.class, "");
		container.addContainerProperty("addData2", String.class, "");
		container.addContainerProperty("docChecker", String.class, "");
		container.addContainerProperty("docApprover", String.class, "");
		container.addContainerProperty("smsInfo", String.class, "");
		container.addContainerProperty("narrative", String.class, "");
		container.addContainerProperty("attachment", String.class, "");
		container.addContainerProperty("decsnStat", String.class, "");
		container.addContainerProperty("creTms", String.class, "");
		container.addContainerProperty("userId", String.class, "");
		
		grid.setContainerDataSource(container);

		grid.getColumn("id").setHeaderCaption("ID");
		grid.getColumn("responseStatus").setHeaderCaption("Status");
		grid.getColumn("responseStatus").setWidth(320);
		grid.getColumn("cifNo").setHeaderCaption("CIF");
		grid.getColumn("cifNo").setWidth(90);
		grid.getColumn("accTyp").setHeaderCaption("Account Type");
		grid.getColumn("crdInd").setHeaderCaption("Card Index");
		grid.getColumn("prinCrdNo").setHeaderCaption("Prin Card No");
		grid.getColumn("idInd").setHeaderCaption("ID Ind");
		grid.getColumn("newId").setHeaderCaption("New ID");
		grid.getColumn("oldId").setHeaderCaption("Old ID");
		grid.getColumn("issuePlace").setHeaderCaption("Issue Place");
		grid.getColumn("dob").setHeaderCaption("DOB");
		grid.getColumn("brchCde").setHeaderCaption("Branch Code");
		grid.getColumn("directId").setHeaderCaption("Direct ID");
		grid.getColumn("srcCde").setHeaderCaption("Source Code");
		grid.getColumn("promoCde").setHeaderCaption("Promotion Code");
		grid.getColumn("indirectId").setHeaderCaption("In Direct Id");
		grid.getColumn("imgId").setHeaderCaption("Img Id");
		grid.getColumn("crdTyp").setHeaderCaption("Card Type");
		grid.getColumn("autoRenew").setHeaderCaption("Support Auto Renewal");
		grid.getColumn("releaseForm").setHeaderCaption("Release Form");
		grid.getColumn("contractNo").setHeaderCaption("Contract No");
		grid.getColumn("internetTxn").setHeaderCaption("Internet Transaction Blocking");
		grid.getColumn("contcLessInd").setHeaderCaption("Contactless Transaction Indicator");
		grid.getColumn("title").setHeaderCaption("Title");
		grid.getColumn("fullName").setHeaderCaption("Full Name");
		grid.getColumn("lastEmbName").setHeaderCaption("Last Emb Name ");
		grid.getColumn("embName").setHeaderCaption("Emb Name");
		grid.getColumn("midEmbName").setHeaderCaption("Mid Emb Name");
		grid.getColumn("compEmbName").setHeaderCaption("Company Emb Name ");
		grid.getColumn("embPhoto").setHeaderCaption("Emboss Photo");
		grid.getColumn("gender").setHeaderCaption("Gender");
		grid.getColumn("nation").setHeaderCaption("Nation");
		grid.getColumn("martialStat").setHeaderCaption("Martial Status");
		grid.getColumn("residenTyp").setHeaderCaption("Residen Type");
		grid.getColumn("mthToStay").setHeaderCaption("Length of time planning to stay in VN ");
		grid.getColumn("prStat").setHeaderCaption("PR status");
		grid.getColumn("vsExpDate").setHeaderCaption("Immigration VS Expiry Date");
		grid.getColumn("education").setHeaderCaption("Education Level");
		grid.getColumn("custCtgry").setHeaderCaption("Cust. Category");
		grid.getColumn("relToPrin").setHeaderCaption("Relation To Principal");
		grid.getColumn("motherName").setHeaderCaption("Mother's Maiden Name");
		grid.getColumn("secureQues").setHeaderCaption("Security Question");
		grid.getColumn("billOpt").setHeaderCaption("Billing Option");
		grid.getColumn("stetDelivOpt").setHeaderCaption("Statement Delivery Option");
		grid.getColumn("resAddr1").setHeaderCaption("Residence Address 1");
		grid.getColumn("resAddr2").setHeaderCaption("Residence Address 2");
		grid.getColumn("resAddr3").setHeaderCaption("Residence Address 3");
		grid.getColumn("resPostCde").setHeaderCaption("Residence Post Code");
		grid.getColumn("resTown").setHeaderCaption("Residence Town");
		grid.getColumn("resState").setHeaderCaption("Residence State");
		grid.getColumn("resCountry").setHeaderCaption("Residence Country");
		grid.getColumn("resPhoneNo").setHeaderCaption("Residence Fixed Line No.");
		grid.getColumn("resTyp").setHeaderCaption("Residence Type");
		grid.getColumn("resSince").setHeaderCaption("Ressidence Since");
		grid.getColumn("corpsAddr1").setHeaderCaption("Correspondence Address 1");
		grid.getColumn("corpsAddr2").setHeaderCaption("Correspondence Address 2");
		grid.getColumn("corpsAddr3").setHeaderCaption("Correspondence Address 3");
		grid.getColumn("corpsPostCde").setHeaderCaption("Correspondence Post Code");
		grid.getColumn("corpsTown").setHeaderCaption("Correspondence Town");
		grid.getColumn("corpsState").setHeaderCaption("Correspondence State");
		grid.getColumn("corpsCountry").setHeaderCaption("Correspondence Country");
		grid.getColumn("corpsPhoneNo").setHeaderCaption("Correspondence Fixed Line No.");
		grid.getColumn("mobileNo").setHeaderCaption("Mobile No");
		grid.getColumn("smsInd").setHeaderCaption("Statement Due SMS Reminder");
		grid.getColumn("email").setHeaderCaption("E-mail Address");
		grid.getColumn("industryCde").setHeaderCaption("Industry Code");
		grid.getColumn("empNature").setHeaderCaption("Nature Of Employer");
		grid.getColumn("compSize").setHeaderCaption("Company Size");
		grid.getColumn("postHeld").setHeaderCaption("Position Held");
		grid.getColumn("empSince").setHeaderCaption("Employee Since");
		grid.getColumn("offName").setHeaderCaption("Company Name");
		grid.getColumn("offAddr1").setHeaderCaption("Company Address 1");
		grid.getColumn("offAddr2").setHeaderCaption("Company Address 2");
		grid.getColumn("offAddr3").setHeaderCaption("Company Address 3");
		grid.getColumn("offPostCde").setHeaderCaption("Company Post Code");
		grid.getColumn("offTown").setHeaderCaption("Company Town");
		grid.getColumn("offState").setHeaderCaption("Company State");
		grid.getColumn("offCountry").setHeaderCaption("Company Country");
		grid.getColumn("offPhoneNo1").setHeaderCaption("Company Phone Number 1");
		grid.getColumn("offPhoneNo1Ext").setHeaderCaption("Company Phone Number 1 Ext");
		grid.getColumn("offPhoneNo2").setHeaderCaption("Company Phone Number 2");
		grid.getColumn("offPhoneNo2Ext").setHeaderCaption("Company Phone Number 2 Ext");
		grid.getColumn("offFaxNo").setHeaderCaption("Company Fax Number");
//		grid.getColumn("prevEmpName").setHeaderCaption("");
//		grid.getColumn("prevEmpAddr1").setHeaderCaption("");
//		grid.getColumn("prevEmpAddr2").setHeaderCaption("");
//		grid.getColumn("prevEmpAddr3").setHeaderCaption("");
//		grid.getColumn("prevEmpPostCde").setHeaderCaption("");
//		grid.getColumn("prevEmpTown").setHeaderCaption("");
//		grid.getColumn("prevEmpState").setHeaderCaption("");
//		grid.getColumn("prevEmpCountry").setHeaderCaption("");
//		grid.getColumn("prevEmpPhone").setHeaderCaption("");
//		grid.getColumn("prevEmpPhoneExt").setHeaderCaption("");
//		grid.getColumn("prevEmpSince").setHeaderCaption("");
//		grid.getColumn("prevEmpDurOfServ").setHeaderCaption("");
//		grid.getColumn("ownHouseLand").setHeaderCaption("");
//		grid.getColumn("ownCar").setHeaderCaption("");
//		grid.getColumn("noOfDepen").setHeaderCaption("");
//		grid.getColumn("avgSpendMth").setHeaderCaption("");
//		grid.getColumn("bankPrd").setHeaderCaption("");
//		grid.getColumn("bankOthrPrd").setHeaderCaption("");
//		grid.getColumn("othrCCBank").setHeaderCaption("");
//		grid.getColumn("othrCCLimit").setHeaderCaption("");
//		grid.getColumn("othrLoanBankName").setHeaderCaption("");
//		grid.getColumn("othrLoanInstallMth").setHeaderCaption("");
//		grid.getColumn("delivByBrchId").setHeaderCaption("");
//		grid.getColumn("delivOpt").setHeaderCaption("");
//		grid.getColumn("delivAdd1").setHeaderCaption("");
//		grid.getColumn("delivAdd2").setHeaderCaption("");
//		grid.getColumn("delivAdd3").setHeaderCaption("");
//		grid.getColumn("delivPostCde").setHeaderCaption("");
//		grid.getColumn("delivTown").setHeaderCaption("");
//		grid.getColumn("delivState").setHeaderCaption("");
//		grid.getColumn("delivCountry").setHeaderCaption("");
//		grid.getColumn("delivBrchId").setHeaderCaption("");
//		grid.getColumn("spcName").setHeaderCaption("");
//		grid.getColumn("spcIdInd").setHeaderCaption("");
//		grid.getColumn("spcNewId").setHeaderCaption("");
//		grid.getColumn("spcEmpName").setHeaderCaption("");
//		grid.getColumn("spcEmpAddr1").setHeaderCaption("");
//		grid.getColumn("spcEmpAddr2").setHeaderCaption("");
//		grid.getColumn("spcEmpAddr3").setHeaderCaption("");
//		grid.getColumn("spcEmpPostCde").setHeaderCaption("");
//		grid.getColumn("spcEmpTown").setHeaderCaption("");
//		grid.getColumn("spcEmpState").setHeaderCaption("");
//		grid.getColumn("spcEmpCountry").setHeaderCaption("");
//		grid.getColumn("spcEmpPhone").setHeaderCaption("");
//		grid.getColumn("spcEmpPhoneExt").setHeaderCaption("");
//		grid.getColumn("spcEmpPosi").setHeaderCaption("");
//		grid.getColumn("spcEmpSince").setHeaderCaption("");
//		grid.getColumn("spcEmpWorkNat").setHeaderCaption("");
//		grid.getColumn("emerContcPrsn").setHeaderCaption("");
//		grid.getColumn("emerGender").setHeaderCaption("");
//		grid.getColumn("emerPhoneNo").setHeaderCaption("");
//		grid.getColumn("emerMobileNo").setHeaderCaption("");
		grid.getColumn("emerRelt").setHeaderCaption("Relation to Contact Person");
		grid.getColumn("emerMeth").setHeaderCaption("Pay Method");
		grid.getColumn("payCASA").setHeaderCaption("Pay CASA");
		grid.getColumn("payAmt").setHeaderCaption("Pay Amt");
		grid.getColumn("casaAcctNo").setHeaderCaption("Casa Acct No");
		grid.getColumn("casaAcctTyp").setHeaderCaption("Casa Account Type");
		grid.getColumn("casaCurCde").setHeaderCaption("Casa Currency Code");
		grid.getColumn("recomCrdNo").setHeaderCaption("Recommender Card No");
		grid.getColumn("recomName").setHeaderCaption("Recommender Name");
		grid.getColumn("remark").setHeaderCaption("Remark");
		grid.getColumn("apprvDeviation").setHeaderCaption("Approved Deviation");
		grid.getColumn("addData1").setHeaderCaption("Additional Data 1");
		grid.getColumn("addData2").setHeaderCaption("Additional Data 2");
		grid.getColumn("docChecker").setHeaderCaption("Document Checker");
		grid.getColumn("docApprover").setHeaderCaption("Document Approver");
		grid.getColumn("smsInfo").setHeaderCaption("SMS Info");
		grid.getColumn("narrative").setHeaderCaption("Narrative");
		grid.getColumn("attachment").setHeaderCaption("Attachment");
		grid.getColumn("decsnStat").setHeaderCaption("Decsn Status");
		grid.getColumn("creTms").setHeaderCaption("Create time");
		grid.getColumn("userId").setHeaderCaption("User ID");
		
		grid.setCellStyleGenerator(cell -> {
			String responseStatus;
			
			if (cell.getPropertyId().equals("responseStatus")) {
				responseStatus = cell.getItem().getItemProperty("responseStatus").getValue().toString();
				if(responseStatus.startsWith("000")) {
					return "v-align-left-success";
				}
				else {
					return "v-align-left-failure";
				}
			}
			return "";
				
		});
		
		addComponentAsFirst(lbNoDataFound);
		addComponentAsFirst(grid);
		
	}

	public void initGrid(Page<WscwCardInfo> _datasource) {
		this.dataSource = _datasource;
		
		if (createDataForContainer(this.dataSource) == false) {
			if (!lbNoDataFound.isVisible() && dataSource != null) {
				lbNoDataFound.setVisible(true);
				grid.setVisible(false);
			}
		} else {
			if (!grid.isVisible()) {
				grid.setVisible(true);
				lbNoDataFound.setVisible(false);
			}
		}
		
		
		
        
	}
	
	public void refreshData(Page<WscwCardInfo> dataSource) {
		getUI().access(() -> {
			if (createDataForContainer(dataSource) == false) {
				if (!lbNoDataFound.isVisible()) {
					lbNoDataFound.setVisible(true);
				}
				if (grid.isVisible()) {
					grid.setVisible(false);
				}
			} else {
				if (lbNoDataFound.isVisible()) {
					lbNoDataFound.setVisible(false);
				}
				if (!grid.isVisible()) {
					grid.setVisible(true);
				}
			}
		});
	}
	@SuppressWarnings("unchecked")
	private boolean createDataForContainer(final Page<WscwCardInfo> listCaseDetail) {
		boolean flag = false;
		
		if (dataSource != null && dataSource.getTotalElements()>0) {
			container.removeAllItems();
			dataSource.forEach(s -> {
				Item item = container.getItem(container.addItem());
				
				item.getItemProperty("id").setValue(s.getId());
				item.getItemProperty("responseStatus").setValue(s.getRespStat());
				item.getItemProperty("cifNo").setValue(s.getCifNo());
				item.getItemProperty("accTyp").setValue(s.getAccTyp());
				item.getItemProperty("crdInd").setValue(s.getCrdInd());
				item.getItemProperty("prinCrdNo").setValue(s.getPrinCrdNo());
				item.getItemProperty("idInd").setValue(s.getIdInd());
				item.getItemProperty("newId").setValue(s.getNewId());
				item.getItemProperty("oldId").setValue(s.getOldId());
				item.getItemProperty("issuePlace").setValue(s.getIssuePlace());
				item.getItemProperty("dob").setValue(s.getDob());
				item.getItemProperty("brchCde").setValue(s.getBrchCde());
				item.getItemProperty("directId").setValue(s.getDirectId());
				item.getItemProperty("srcCde").setValue(s.getSrcCde());
				item.getItemProperty("promoCde").setValue(s.getPromoCde());
				item.getItemProperty("indirectId").setValue(s.getIndirectId());
				item.getItemProperty("imgId").setValue(s.getImgId());
				item.getItemProperty("crdTyp").setValue(s.getCrdTyp());
				item.getItemProperty("autoRenew").setValue(s.getAutoRenew());
				item.getItemProperty("releaseForm").setValue(s.getReleaseForm());
				item.getItemProperty("contractNo").setValue(s.getContractNo());
				item.getItemProperty("internetTxn").setValue(s.getInternetTxn());
				item.getItemProperty("contcLessInd").setValue(s.getContcLessInd());
				item.getItemProperty("title").setValue(s.getTitle());
				item.getItemProperty("fullName").setValue(s.getFullName());
				item.getItemProperty("lastEmbName").setValue(s.getLastEmbName());
				item.getItemProperty("embName").setValue(s.getEmbName());
				item.getItemProperty("midEmbName").setValue(s.getMidEmbName());
				item.getItemProperty("compEmbName").setValue(s.getCompEmbName());
				item.getItemProperty("embPhoto").setValue(s.getEmbPhoto());
				item.getItemProperty("gender").setValue(s.getGender());
				item.getItemProperty("nation").setValue(s.getNation());
				item.getItemProperty("martialStat").setValue(s.getMartialStat());
				item.getItemProperty("residenTyp").setValue(s.getResidenTyp());
				item.getItemProperty("mthToStay").setValue(s.getMthToStay());
				item.getItemProperty("prStat").setValue(s.getPrStat());
				item.getItemProperty("vsExpDate").setValue(s.getVsExpDate());
				item.getItemProperty("education").setValue(s.getEducation());
				item.getItemProperty("custCtgry").setValue(s.getCustCtgry());
				item.getItemProperty("relToPrin").setValue(s.getRelToPrin());
				item.getItemProperty("motherName").setValue(s.getMotherName());
				item.getItemProperty("secureQues").setValue(s.getSecureQues());
				item.getItemProperty("billOpt").setValue(s.getBillOpt());
				item.getItemProperty("stetDelivOpt").setValue(s.getStetDelivOpt());
				item.getItemProperty("resAddr1").setValue(s.getResAddr1());
				item.getItemProperty("resAddr2").setValue(s.getResAddr2());
				item.getItemProperty("resAddr3").setValue(s.getResAddr3());
				item.getItemProperty("resPostCde").setValue(s.getResPostCde());
				item.getItemProperty("resTown").setValue(s.getResTown());
				item.getItemProperty("resState").setValue(s.getResState());
				item.getItemProperty("resCountry").setValue(s.getResCountry());
				item.getItemProperty("resPhoneNo").setValue(s.getResPhoneNo());
				item.getItemProperty("resTyp").setValue(s.getResTyp());
				item.getItemProperty("resSince").setValue(s.getResSince());
				item.getItemProperty("corpsAddr1").setValue(s.getCorpsAddr1());
				item.getItemProperty("corpsAddr2").setValue(s.getCorpsAddr2());
				item.getItemProperty("corpsAddr3").setValue(s.getCorpsAddr3());
				item.getItemProperty("corpsPostCde").setValue(s.getCorpsPostCde());
				item.getItemProperty("corpsTown").setValue(s.getCorpsTown());
				item.getItemProperty("corpsState").setValue(s.getCorpsState());
				item.getItemProperty("corpsCountry").setValue(s.getCorpsCountry());
				item.getItemProperty("corpsPhoneNo").setValue(s.getCorpsPhoneNo());
				item.getItemProperty("mobileNo").setValue(s.getMobileNo());
				item.getItemProperty("smsInd").setValue(s.getSmsInd());
				item.getItemProperty("email").setValue(s.getEmail());
				item.getItemProperty("industryCde").setValue(s.getIndustryCde());
				item.getItemProperty("empNature").setValue(s.getEmpNature());
				item.getItemProperty("compSize").setValue(s.getCompSize());
				item.getItemProperty("postHeld").setValue(s.getPostHeld());
				item.getItemProperty("empSince").setValue(s.getEmpSince());
				item.getItemProperty("offName").setValue(s.getOffName());
				item.getItemProperty("offAddr1").setValue(s.getOffAddr1());
				item.getItemProperty("offAddr2").setValue(s.getOffAddr2());
				item.getItemProperty("offAddr3").setValue(s.getOffAddr3());
				item.getItemProperty("offPostCde").setValue(s.getOffPostCde());
				item.getItemProperty("offTown").setValue(s.getOffTown());
				item.getItemProperty("offState").setValue(s.getOffState());
				item.getItemProperty("offCountry").setValue(s.getOffCountry());
				item.getItemProperty("offPhoneNo1").setValue(s.getOffPhoneNo1());
				item.getItemProperty("offPhoneNo1Ext").setValue(s.getOffPhoneNo1Ext());
				item.getItemProperty("offPhoneNo2").setValue(s.getOffPhoneNo2());
				item.getItemProperty("offPhoneNo2Ext").setValue(s.getOffPhoneNo2Ext());
				item.getItemProperty("offFaxNo").setValue(s.getOffFaxNo());
				item.getItemProperty("prevEmpName").setValue(s.getPrevEmpName());
				item.getItemProperty("prevEmpAddr1").setValue(s.getPrevEmpAddr1());
				item.getItemProperty("prevEmpAddr2").setValue(s.getPrevEmpAddr2());
				item.getItemProperty("prevEmpAddr3").setValue(s.getPrevEmpAddr3());
				item.getItemProperty("prevEmpPostCde").setValue(s.getPrevEmpPostCde());
				item.getItemProperty("prevEmpTown").setValue(s.getPrevEmpTown());
				item.getItemProperty("prevEmpState").setValue(s.getPrevEmpState());
				item.getItemProperty("prevEmpCountry").setValue(s.getPrevEmpCountry());
				item.getItemProperty("prevEmpPhone").setValue(s.getPrevEmpPhone());
				item.getItemProperty("prevEmpPhoneExt").setValue(s.getPrevEmpPhoneExt());
				item.getItemProperty("prevEmpSince").setValue(s.getPrevEmpSince());
				item.getItemProperty("prevEmpDurOfServ").setValue(s.getPrevEmpDurOfServ());
				item.getItemProperty("ownHouseLand").setValue(s.getOwnHouseLand());
				item.getItemProperty("ownCar").setValue(s.getOwnCar());
				item.getItemProperty("noOfDepen").setValue(s.getNoOfDepen());
				item.getItemProperty("avgSpendMth").setValue(s.getAvgSpendMth());
				item.getItemProperty("bankPrd").setValue(s.getBankPrd());
				item.getItemProperty("bankOthrPrd").setValue(s.getBankOthrPrd());
				item.getItemProperty("othrCCBank").setValue(s.getOthrCCBank());
				item.getItemProperty("othrCCLimit").setValue(s.getOthrCCLimit());
				item.getItemProperty("othrLoanBankName").setValue(s.getOthrLoanBankName());
				item.getItemProperty("othrLoanInstallMth").setValue(s.getOthrLoanInstallMth());
				item.getItemProperty("delivByBrchId").setValue(s.getDelivBrchId());
				item.getItemProperty("delivOpt").setValue(s.getDelivOpt());
				item.getItemProperty("delivAdd1").setValue(s.getDelivAdd1());
				item.getItemProperty("delivAdd2").setValue(s.getDelivAdd2());
				item.getItemProperty("delivAdd3").setValue(s.getDelivAdd3());
				item.getItemProperty("delivPostCde").setValue(s.getDelivPostCde());
				item.getItemProperty("delivTown").setValue(s.getDelivTown());
				item.getItemProperty("delivState").setValue(s.getDelivState());
				item.getItemProperty("delivCountry").setValue(s.getDelivCountry());
				item.getItemProperty("delivBrchId").setValue(s.getDelivBrchId());
				item.getItemProperty("spcName").setValue(s.getSpcName());
				item.getItemProperty("spcIdInd").setValue(s.getSpcIdInd());
				item.getItemProperty("spcNewId").setValue(s.getSpcNewId());
				item.getItemProperty("spcEmpName").setValue(s.getSpcEmpName());
				item.getItemProperty("spcEmpAddr1").setValue(s.getSpcEmpAddr1());
				item.getItemProperty("spcEmpAddr2").setValue(s.getSpcEmpAddr2());
				item.getItemProperty("spcEmpAddr3").setValue(s.getSpcEmpAddr3());
				item.getItemProperty("spcEmpPostCde").setValue(s.getSpcEmpPostCde());
				item.getItemProperty("spcEmpTown").setValue(s.getSpcEmpTown());
				item.getItemProperty("spcEmpState").setValue(s.getSpcEmpState());
				item.getItemProperty("spcEmpCountry").setValue(s.getSpcEmpCountry());
				item.getItemProperty("spcEmpPhone").setValue(s.getSpcEmpPhone());
				item.getItemProperty("spcEmpPhoneExt").setValue(s.getSpcEmpPhoneExt());
				item.getItemProperty("spcEmpPosi").setValue(s.getSpcEmpPosi());
				item.getItemProperty("spcEmpSince").setValue(s.getSpcEmpSince());
				item.getItemProperty("spcEmpWorkNat").setValue(s.getSpcEmpWorkNat());
				item.getItemProperty("emerContcPrsn").setValue(s.getEmerContcPrsn());
				item.getItemProperty("emerGender").setValue(s.getEmerGender());
				item.getItemProperty("emerPhoneNo").setValue(s.getEmerPhoneNo());
				item.getItemProperty("emerMobileNo").setValue(s.getEmerMobileNo());
				item.getItemProperty("emerRelt").setValue(s.getEmerRelt());
				item.getItemProperty("emerMeth").setValue(s.getEmerMeth());
				item.getItemProperty("payCASA").setValue(s.getPayCASA());
				item.getItemProperty("payAmt").setValue(s.getPayAmt());
				item.getItemProperty("casaAcctNo").setValue(s.getCasaAcctNo());
				item.getItemProperty("casaAcctTyp").setValue(s.getCasaAcctTyp());
				item.getItemProperty("casaCurCde").setValue(s.getCasaCurCde());
				item.getItemProperty("recomCrdNo").setValue(s.getRecomCrdNo());
				item.getItemProperty("recomName").setValue(s.getRecomName());
				item.getItemProperty("remark").setValue(s.getRemark());
				item.getItemProperty("apprvDeviation").setValue(s.getApprvDeviation());
				item.getItemProperty("addData1").setValue(s.getAddData1());
				item.getItemProperty("addData2").setValue(s.getAddData2());
				item.getItemProperty("docChecker").setValue(s.getDocChecker());
				item.getItemProperty("docApprover").setValue(s.getDocApprover());
				item.getItemProperty("smsInfo").setValue(s.getSmsInfo());
				item.getItemProperty("narrative").setValue(s.getNarrative());
				item.getItemProperty("attachment").setValue(s.getAttachment());
				item.getItemProperty("decsnStat").setValue(s.getDecsnStat());
				item.getItemProperty("creTms").setValue(String.valueOf(s.getCreTms()));
				item.getItemProperty("userId").setValue(s.getUserId());
				
			});
			
			flag = true;
		} 
		
		if(flag == true)
			return true;
		else 
			return false;
	}
	
	private String formatNumberColor(BigDecimal number) {
		if (number.compareTo(BigDecimal.ZERO) < 0) {
			return "<span style=\"padding:7px 0px; background-color: #FFFF00\">" + number + "</span>";

		} else
			return String.valueOf(number);
	}
	
	

}
