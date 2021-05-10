package com.wscw.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "WSCW_CARD_CREATE")
@NamedQuery(name = "WscwCardInfo.findAll", query = "SELECT f FROM WscwCardInfo f")
public class WscwCardInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false, length = 22)
	private String id;
	
	@Column(name = "CRE_TMS", nullable = false, precision = 17)
	private BigDecimal creTms;
	
	@Column(name = "USR_ID", nullable = false, length = 12)
	private String userId;
	
	@Column(name = "RESP_STAT", nullable = false, length = 300) 	
	private String respStat;
	
	@Column(name = "CIF", nullable = false, length = 7)
	private String cifNo;
	
	@Column(name = "ACC_TYP", nullable = false, length = 200)
	private String accTyp;
	
	@Column(name = "CRD_IND", nullable = false, length = 200)
	private String crdInd;
	
	@Column(name = "PRIN_CRD_NO", nullable = false, length = 200)
	private String prinCrdNo;
	
	@Column(name = "ID_IND", nullable = false, length = 200)
	private String idInd;
	
	@Column(name = "NEW_ID", nullable = false, length = 200)
	private String newId;
	
	@Column(name = "OLD_ID", nullable = false, length = 200)
	private String oldId;
	
	@Column(name = "ISSUE_PLACE", nullable = false, length = 300)
	private String issuePlace;
	
	@Column(name = "ISSUE_DATE", nullable = false, length = 200)
	private String issueDate;
	
	@Column(name = "DOB", nullable = false, length = 200)
	private String dob;
	
	@Column(name = "BRCH_CDE", nullable = false, length = 200)
	private String brchCde;
	
	@Column(name = "DIRECT_ID", nullable = false, length = 200)
	private String directId;
	
	@Column(name = "SRC_CDE", nullable = false, length = 200)
	private String srcCde;
	
	@Column(name = "PROMO_CDE", nullable = false, length = 200)
	private String promoCde;
	
	@Column(name = "IN_DIRECT_ID", nullable = false, length = 200)
	private String indirectId;
	
	@Column(name = "IMG_ID", nullable = false, length = 200)
	private String imgId;
	
	@Column(name = "CRD_TYP", nullable = false, length = 200)
	private String crdTyp;
	
	@Column(name = "AUTO_RENEW", nullable = false, length = 200)
	private String autoRenew;
	
	@Column(name = "RELEASE_FORM", nullable = false, length = 200)
	private String releaseForm;
	
	@Column(name = "CONTRACT_NO", nullable = false, length = 200)
	private String contractNo;
	
	@Column(name = "INTERNET_TXN", nullable = false, length = 200)
	private String internetTxn;
	
	@Column(name = "CONTCLESS_IND", nullable = false, length = 200)
	private String contcLessInd;
	
	@Column(name = "TITLE", nullable = false, length = 200)
	private String title;
	
	@Column(name = "FULLNAME", nullable = false, length = 200)
	private String fullName;
	
	@Column(name = "LAST_EMB_NAME", nullable = false, length = 200)
	private String lastEmbName;
	
	@Column(name = "EMB_NAME", nullable = false, length = 300)
	private String embName;
	
	@Column(name = "MID_EMB_NAME", nullable = false, length = 200)
	private String midEmbName;
	
	@Column(name = "COMP_EMB_NAME", nullable = false, length = 300)
	private String compEmbName;
	
	@Column(name = "EMB_PHOTO", nullable = false, length = 200)
	private String embPhoto;
	
	@Column(name = "GENDER", nullable = false, length = 200)
	private String gender;
	
	@Column(name = "NATION", nullable = false, length = 200)
	private String nation;
	
	@Column(name = "MARTIAL_STAT", nullable = false, length = 200)
	private String martialStat;
	
	@Column(name = "RESIDEN_TYP", nullable = false, length = 200)
	private String residenTyp;
	
	@Column(name = "MTH_TO_STAY", nullable = false, length = 200)
	private String mthToStay;
	
	@Column(name = "PR_STAT", nullable = false, length = 200)
	private String prStat;
	
	@Column(name = "VS_EXP_DATE", nullable = false, length = 200)
	private String vsExpDate;
	
	@Column(name = "EDUCATION", nullable = false, length = 200)
	private String education;
	
	@Column(name = "CUST_CTGRY", nullable = false, length = 200)
	private String custCtgry;
	
	@Column(name = "REL_TO_PRIN", nullable = false, length = 200)
	private String relToPrin;
	
	@Column(name = "MOTHER_NAME", nullable = false, length = 200)
	private String motherName;
	
	@Column(name = "SECURE_QUES", nullable = false, length = 200)
	private String secureQues;
	
	@Column(name = "BILL_OPT", nullable = false, length = 200)
	private String billOpt;
	
	@Column(name = "STET_DELIV_OPT", nullable = false, length = 200)
	private String stetDelivOpt;
	
	@Column(name = "RES_ADDR1", nullable = false, length = 300)
	private String resAddr1;
	
	@Column(name = "RES_ADDR2", nullable = false, length = 300)
	private String resAddr2;
	
	@Column(name = "RES_ADDR3", nullable = false, length = 300)
	private String resAddr3;
	
	@Column(name = "RES_POST_CDE", nullable = false, length = 200)
	private String resPostCde;
	
	@Column(name = "RES_TOWN", nullable = false, length = 200)
	private String resTown;
	
	@Column(name = "RES_STATE", nullable = false, length = 200)
	private String resState;
	
	@Column(name = "RES_COUNTRY", nullable = false, length = 200)
	private String resCountry;
	
	@Column(name = "RES_PHONE_NO", nullable = false, length = 200)
	private String resPhoneNo;
	
	@Column(name = "RES_TYP", nullable = false, length = 200)
	private String resTyp;
	
	@Column(name = "RES_SINCE", nullable = false, length = 200)
	private String resSince;
	
	@Column(name = "CORPS_ADDR1", nullable = false, length = 300)
	private String corpsAddr1;
	
	@Column(name = "CORPS_ADDR2", nullable = false, length = 300)
	private String corpsAddr2;
	
	@Column(name = "CORPS_ADDR3", nullable = false, length = 300)
	private String corpsAddr3;
	
	@Column(name = "CORPS_POST_CDE", nullable = false, length = 200)
	private String corpsPostCde;
	
	@Column(name = "CORPS_TOWN", nullable = false, length = 200)
	private String corpsTown;
	
	@Column(name = "CORPS_STATE", nullable = false, length = 200)
	private String corpsState;
	
	@Column(name = "CORPS_COUNTRY", nullable = false, length = 200)
	private String corpsCountry;
	
	@Column(name = "CORPS_PHONENO", nullable = false, length = 200)
	private String corpsPhoneNo;
	
	@Column(name = "MOBILE_NO", nullable = false, length = 200)
	private String mobileNo;
	
	@Column(name = "SMS_IND", nullable = false, length = 200)
	private String smsInd;
	
	@Column(name = "EMAIL", nullable = false, length = 200)
	private String email;
	
	@Column(name = "INDUSTRY_CDE", nullable = false, length = 200)
	private String industryCde;
	
	@Column(name = "EMP_NATURE", nullable = false, length = 200)
	private String empNature;
	
	@Column(name = "COMP_SIZE", nullable = false, length = 200)
	private String compSize;
	
	@Column(name = "POST_HELD", nullable = false, length = 200)
	private String postHeld;
	
	@Column(name = "EMP_SINCE", nullable = false, length = 200)
	private String empSince;
	
	@Column(name = "OFF_NAME", nullable = false, length = 200)
	private String offName;
	
	@Column(name = "OFF_ADDR1", nullable = false, length = 300)
	private String offAddr1;
	
	@Column(name = "OFF_ADDR2", nullable = false, length = 300)
	private String offAddr2;
	
	@Column(name = "OFF_ADDR3", nullable = false, length = 300)
	private String offAddr3;
	
	@Column(name = "OFF_POST_CDE", nullable = false, length = 200)
	private String offPostCde;
	
	@Column(name = "OFF_TOWN", nullable = false, length = 200)
	private String offTown;
	
	@Column(name = "OFF_STATE", nullable = false, length = 200)
	private String offState;
	
	@Column(name = "OFF_COUNTRY", nullable = false, length = 200)
	private String offCountry;
	
	@Column(name = "OFF_PHONE_NO1", nullable = false, length = 200)
	private String offPhoneNo1;
	
	@Column(name = "OFF_PHONE_NO1_EXT", nullable = false, length = 200)
	private String offPhoneNo1Ext;
	
	@Column(name = "OFF_PHONE_NO2", nullable = false, length = 200)
	private String offPhoneNo2;
	
	@Column(name = "OFF_PHONE_NO2_EXT", nullable = false, length = 200)
	private String offPhoneNo2Ext;
	
	@Column(name = "OFF_FAX_NO", nullable = false, length = 200)
	private String offFaxNo;
	
	@Column(name = "PREV_EMP_NAME", nullable = false, length = 200)
	private String prevEmpName;
	
	@Column(name = "PREV_EMP_ADDR1", nullable = false, length = 300)
	private String prevEmpAddr1;
	
	@Column(name = "PREV_EMP_ADDR2", nullable = false, length = 300)
	private String prevEmpAddr2;
	
	@Column(name = "PREV_EMP_ADDR3", nullable = false, length = 300)
	private String prevEmpAddr3;
	
	@Column(name = "PREV_EMP_POST_CDE", nullable = false, length = 200)
	private String prevEmpPostCde;
	
	@Column(name = "PREV_EMP_TOWN", nullable = false, length = 200)
	private String prevEmpTown;
	
	@Column(name = "PREV_EMP_STATE", nullable = false, length = 200)
	private String prevEmpState;
	
	@Column(name = "PREV_EMP_COUNTRY", nullable = false, length = 200)
	private String prevEmpCountry;
	
	@Column(name = "PREV_EMP_PHONE", nullable = false, length = 200)
	private String prevEmpPhone;
	
	@Column(name = "PREV_EMP_PHONE_EXT", nullable = false, length = 200)
	private String prevEmpPhoneExt;
	
	@Column(name = "PREV_EMP_SINCE", nullable = false, length = 200)
	private String prevEmpSince;
	
	@Column(name = "PREV_EMP_DUR_OF_SERV", nullable = false, length = 200)
	private String prevEmpDurOfServ;
	
	@Column(name = "OWN_HOUSE_LAND", nullable = false, length = 200)
	private String ownHouseLand;
	
	@Column(name = "OWN_CAR", nullable = false, length = 200)
	private String ownCar;
	
	@Column(name = "NO_OF_DEPEN", nullable = false, length = 200)
	private String noOfDepen;
	
	@Column(name = "AVG_SPEND_MTH", nullable = false, length = 200)
	private String avgSpendMth;
	
	@Column(name = "BANK_PRD", nullable = false, length = 200)
	private String bankPrd;
	
	@Column(name = "BANK_OTHR_PRD", nullable = false, length = 200)
	private String bankOthrPrd;
	
	@Column(name = "OTHR_CC_BANK", nullable = false, length = 200)
	private String othrCCBank;
	
	@Column(name = "OTHR_CC_LIMIT", nullable = false, length = 200)
	private String othrCCLimit;
	
	@Column(name = "OTHR_LOAN_BANK_NAME", nullable = false, length = 200)
	private String othrLoanBankName;
	
	@Column(name = "OTHR_LOAN_INSTALLMTH", nullable = false, length = 200)
	private String othrLoanInstallMth;
	
	@Column(name = "DELIV_BY_BRCHID", nullable = false, length = 200)
	private String delivByBrchId;
	
	@Column(name = "DELIV_OPT", nullable = false, length = 200)
	private String delivOpt;
	
	@Column(name = "DELIV_ADD1", nullable = false, length = 200)
	private String delivAdd1;
	
	@Column(name = "DELIV_ADD2", nullable = false, length = 200)
	private String delivAdd2;
	
	@Column(name = "DELIV_ADD3", nullable = false, length = 200)
	private String delivAdd3;
	
	@Column(name = "DELIV_POST_CDE", nullable = false, length = 200)
	private String delivPostCde;
	
	@Column(name = "DELIV_TOWN", nullable = false, length = 200)
	private String delivTown;
	
	@Column(name = "DELIV_STATE", nullable = false, length = 200)
	private String delivState;
	
	@Column(name = "DELIV_COUNTRY", nullable = false, length = 200)
	private String delivCountry;
	
	@Column(name = "DELIV_BRCHID", nullable = false, length = 200)
	private String delivBrchId;
	
	@Column(name = "SPC_NAME", nullable = false, length = 200)
	private String spcName;
	
	@Column(name = "SPC_ID_IND", nullable = false, length = 200)
	private String spcIdInd;
	
	@Column(name = "SPC_NEW_ID", nullable = false, length = 200)
	private String spcNewId;
	
	@Column(name = "SPC_EMP_NAME", nullable = false, length = 200)
	private String spcEmpName;
	
	@Column(name = "SPC_EMP_ADDR1", nullable = false, length = 300)
	private String spcEmpAddr1;
	
	@Column(name = "SPC_EMP_ADDR2", nullable = false, length = 300)
	private String spcEmpAddr2;
	
	@Column(name = "SPC_EMP_ADDR3", nullable = false, length = 300)
	private String spcEmpAddr3;
	
	@Column(name = "SPC_EMP_POST_CDE", nullable = false, length = 200)
	private String spcEmpPostCde;
	
	@Column(name = "SPC_EMP_TOWN", nullable = false, length = 200)
	private String spcEmpTown;
	
	@Column(name = "SPC_EMP_STATE", nullable = false, length = 200)
	private String spcEmpState;
	
	@Column(name = "SPC_EMP_COUNTRY", nullable = false, length = 200)
	private String spcEmpCountry;
	
	@Column(name = "SPC_EMP_PHONE", nullable = false, length = 200)
	private String spcEmpPhone;
	
	@Column(name = "SPC_EMP_PHONE_EXT", nullable = false, length = 200)
	private String spcEmpPhoneExt;
	
	@Column(name = "SPC_EMP_POSI", nullable = false, length = 200)
	private String spcEmpPosi;
	
	@Column(name = "SPC_EMP_SINCE", nullable = false, length = 200)
	private String spcEmpSince;
	
	@Column(name = "SPC_EMP_WORK_NAT", nullable = false, length = 200)
	private String spcEmpWorkNat;
	
	@Column(name = "EMER_CONTC_PRSN", nullable = false, length = 200)
	private String emerContcPrsn;
	
	@Column(name = "EMER_GENDER", nullable = false, length = 200)
	private String emerGender;
	
	@Column(name = "EMER_PHONE_NO", nullable = false, length = 200)
	private String emerPhoneNo;
	
	@Column(name = "EMER_MOBILE_NO", nullable = false, length = 200)
	private String emerMobileNo;
	
	@Column(name = "EMER_RELT", nullable = false, length = 200)
	private String emerRelt;
	
	@Column(name = "EMER_METH", nullable = false, length = 200)
	private String emerMeth;
	
	@Column(name = "PAY_CASA", nullable = false, length = 200)
	private String payCASA;
	
	@Column(name = "PAY_AMT", nullable = false, length = 200)
	private String payAmt;
	
	@Column(name = "CASA_ACCT_NO", nullable = false, length = 200)
	private String casaAcctNo;
	
	@Column(name = "CASA_ACCT_TYP", nullable = false, length = 200)
	private String casaAcctTyp;
	
	@Column(name = "CASA_CUR_CDE", nullable = false, length = 200)
	private String casaCurCde;
	
	@Column(name = "RECOM_CRD_NO", nullable = false, length = 200)
	private String recomCrdNo;
	
	@Column(name = "RECOM_NAME", nullable = false, length = 300)
	private String recomName;
	
	@Column(name = "REMARK", nullable = false, length = 200)
	private String remark;
	
	@Column(name = "APPRV_DEVIATION", nullable = false, length = 200)
	private String apprvDeviation;
	
	@Column(name = "ADD_DATA1", nullable = false, length = 200)
	private String addData1;
	
	@Column(name = "ADD_DATA2", nullable = false, length = 200)
	private String addData2;
	
	@Column(name = "DOC_CHECKER", nullable = false, length = 200)
	private String docChecker;
	
	@Column(name = "DOC_APPROVER", nullable = false, length = 200)
	private String docApprover;
	
	@Column(name = "SMS_INFO", nullable = false, length = 200)
	private String smsInfo;
	
	@Column(name = "NARRATIVE", nullable = false, length = 200)
	private String narrative;
	
	@Column(name = "ATTACHMENT", nullable = false, length = 200)
	private String attachment;
	
	@Column(name = "DECSN_STAT", nullable = false, length = 200)
	private String decsnStat;
	
	@Column(name = "SEQ_NO", nullable = false, length = 200)
	private String seqNo;
	
	@Column(name = "FILE_NAME", nullable = false, length = 300)
	private String fileName;
	
	public BigDecimal getCreTms() {
		return creTms;
	}
	public void setCreTms(BigDecimal creTms) {
		this.creTms = creTms;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRespStat() {
		return respStat;
	}
	public void setRespStat(String respStat) {
		this.respStat = respStat;
	}
	public String getCifNo() {
		return cifNo;
	}
	public void setCifNo(String cifNo) {
		this.cifNo = cifNo;
	}
	public String getAccTyp() {
		return accTyp;
	}
	public void setAccTyp(String accTyp) {
		this.accTyp = accTyp;
	}
	public String getCrdInd() {
		return crdInd;
	}
	public void setCrdInd(String crdInd) {
		this.crdInd = crdInd;
	}
	public String getPrinCrdNo() {
		return prinCrdNo;
	}
	public void setPrinCrdNo(String prinCrdNo) {
		this.prinCrdNo = prinCrdNo;
	}
	public String getIdInd() {
		return idInd;
	}
	public void setIdInd(String idInd) {
		this.idInd = idInd;
	}
	public String getNewId() {
		return newId;
	}
	public void setNewId(String newId) {
		this.newId = newId;
	}
	public String getOldId() {
		return oldId;
	}
	public void setOldId(String oldId) {
		this.oldId = oldId;
	}
	public String getIssuePlace() {
		return issuePlace;
	}
	public void setIssuePlace(String issuePlace) {
		this.issuePlace = issuePlace;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getBrchCde() {
		return brchCde;
	}
	public void setBrchCde(String brchCde) {
		this.brchCde = brchCde;
	}
	public String getDirectId() {
		return directId;
	}
	public void setDirectId(String directId) {
		this.directId = directId;
	}
	public String getSrcCde() {
		return srcCde;
	}
	public void setSrcCde(String srcCde) {
		this.srcCde = srcCde;
	}
	public String getPromoCde() {
		return promoCde;
	}
	public void setPromoCde(String promoCde) {
		this.promoCde = promoCde;
	}
	public String getIndirectId() {
		return indirectId;
	}
	public void setIndirectId(String indirectId) {
		this.indirectId = indirectId;
	}
	public String getImgId() {
		return imgId;
	}
	public void setImgId(String imgId) {
		this.imgId = imgId;
	}
	public String getCrdTyp() {
		return crdTyp;
	}
	public void setCrdTyp(String crdTyp) {
		this.crdTyp = crdTyp;
	}
	public String getAutoRenew() {
		return autoRenew;
	}
	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
	}
	public String getReleaseForm() {
		return releaseForm;
	}
	public void setReleaseForm(String releaseForm) {
		this.releaseForm = releaseForm;
	}
	public String getContractNo() {
		return contractNo;
	}
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}
	public String getInternetTxn() {
		return internetTxn;
	}
	public void setInternetTxn(String internetTxn) {
		this.internetTxn = internetTxn;
	}
	public String getContcLessInd() {
		return contcLessInd;
	}
	public void setContcLessInd(String contcLessInd) {
		this.contcLessInd = contcLessInd;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLastEmbName() {
		return lastEmbName;
	}
	public void setLastEmbName(String lastEmbName) {
		this.lastEmbName = lastEmbName;
	}
	public String getEmbName() {
		return embName;
	}
	public void setEmbName(String embName) {
		this.embName = embName;
	}
	public String getMidEmbName() {
		return midEmbName;
	}
	public void setMidEmbName(String midEmbName) {
		this.midEmbName = midEmbName;
	}
	public String getCompEmbName() {
		return compEmbName;
	}
	public void setCompEmbName(String compEmbName) {
		this.compEmbName = compEmbName;
	}
	public String getEmbPhoto() {
		return embPhoto;
	}
	public void setEmbPhoto(String embPhoto) {
		this.embPhoto = embPhoto;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMartialStat() {
		return martialStat;
	}
	public void setMartialStat(String martialStat) {
		this.martialStat = martialStat;
	}
	public String getResidenTyp() {
		return residenTyp;
	}
	public void setResidenTyp(String residenTyp) {
		this.residenTyp = residenTyp;
	}
	public String getMthToStay() {
		return mthToStay;
	}
	public void setMthToStay(String mthToStay) {
		this.mthToStay = mthToStay;
	}
	public String getPrStat() {
		return prStat;
	}
	public void setPrStat(String prStat) {
		this.prStat = prStat;
	}
	public String getVsExpDate() {
		return vsExpDate;
	}
	public void setVsExpDate(String vsExpDate) {
		this.vsExpDate = vsExpDate;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCustCtgry() {
		return custCtgry;
	}
	public void setCustCtgry(String custCtgry) {
		this.custCtgry = custCtgry;
	}
	public String getRelToPrin() {
		return relToPrin;
	}
	public void setRelToPrin(String relToPrin) {
		this.relToPrin = relToPrin;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getSecureQues() {
		return secureQues;
	}
	public void setSecureQues(String secureQues) {
		this.secureQues = secureQues;
	}
	public String getBillOpt() {
		return billOpt;
	}
	public void setBillOpt(String billOpt) {
		this.billOpt = billOpt;
	}
	public String getStetDelivOpt() {
		return stetDelivOpt;
	}
	public void setStetDelivOpt(String stetDelivOpt) {
		this.stetDelivOpt = stetDelivOpt;
	}
	public String getResAddr1() {
		return resAddr1;
	}
	public void setResAddr1(String resAddr1) {
		this.resAddr1 = resAddr1;
	}
	public String getResAddr2() {
		return resAddr2;
	}
	public void setResAddr2(String resAddr2) {
		this.resAddr2 = resAddr2;
	}
	public String getResAddr3() {
		return resAddr3;
	}
	public void setResAddr3(String resAddr3) {
		this.resAddr3 = resAddr3;
	}
	public String getResPostCde() {
		return resPostCde;
	}
	public void setResPostCde(String resPostCde) {
		this.resPostCde = resPostCde;
	}
	public String getResTown() {
		return resTown;
	}
	public void setResTown(String resTown) {
		this.resTown = resTown;
	}
	public String getResState() {
		return resState;
	}
	public void setResState(String resState) {
		this.resState = resState;
	}
	public String getResCountry() {
		return resCountry;
	}
	public void setResCountry(String resCountry) {
		this.resCountry = resCountry;
	}
	public String getResPhoneNo() {
		return resPhoneNo;
	}
	public void setResPhoneNo(String resPhoneNo) {
		this.resPhoneNo = resPhoneNo;
	}
	public String getResTyp() {
		return resTyp;
	}
	public void setResTyp(String resTyp) {
		this.resTyp = resTyp;
	}
	public String getResSince() {
		return resSince;
	}
	public void setResSince(String resSince) {
		this.resSince = resSince;
	}
	public String getCorpsAddr1() {
		return corpsAddr1;
	}
	public void setCorpsAddr1(String corpsAddr1) {
		this.corpsAddr1 = corpsAddr1;
	}
	public String getCorpsAddr2() {
		return corpsAddr2;
	}
	public void setCorpsAddr2(String corpsAddr2) {
		this.corpsAddr2 = corpsAddr2;
	}
	public String getCorpsAddr3() {
		return corpsAddr3;
	}
	public void setCorpsAddr3(String corpsAddr3) {
		this.corpsAddr3 = corpsAddr3;
	}
	public String getCorpsPostCde() {
		return corpsPostCde;
	}
	public void setCorpsPostCde(String corpsPostCde) {
		this.corpsPostCde = corpsPostCde;
	}
	public String getCorpsTown() {
		return corpsTown;
	}
	public void setCorpsTown(String corpsTown) {
		this.corpsTown = corpsTown;
	}
	public String getCorpsState() {
		return corpsState;
	}
	public void setCorpsState(String corpsState) {
		this.corpsState = corpsState;
	}
	public String getCorpsCountry() {
		return corpsCountry;
	}
	public void setCorpsCountry(String corpsCountry) {
		this.corpsCountry = corpsCountry;
	}
	public String getCorpsPhoneNo() {
		return corpsPhoneNo;
	}
	public void setCorpsPhoneNo(String corpsPhoneNo) {
		this.corpsPhoneNo = corpsPhoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getSmsInd() {
		return smsInd;
	}
	public void setSmsInd(String smsInd) {
		this.smsInd = smsInd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIndustryCde() {
		return industryCde;
	}
	public void setIndustryCde(String industryCde) {
		this.industryCde = industryCde;
	}
	public String getEmpNature() {
		return empNature;
	}
	public void setEmpNature(String empNature) {
		this.empNature = empNature;
	}
	public String getCompSize() {
		return compSize;
	}
	public void setCompSize(String compSize) {
		this.compSize = compSize;
	}
	public String getPostHeld() {
		return postHeld;
	}
	public void setPostHeld(String postHeld) {
		this.postHeld = postHeld;
	}
	public String getEmpSince() {
		return empSince;
	}
	public void setEmpSince(String empSince) {
		this.empSince = empSince;
	}
	public String getOffName() {
		return offName;
	}
	public void setOffName(String offName) {
		this.offName = offName;
	}
	public String getOffAddr1() {
		return offAddr1;
	}
	public void setOffAddr1(String offAddr1) {
		this.offAddr1 = offAddr1;
	}
	public String getOffAddr2() {
		return offAddr2;
	}
	public void setOffAddr2(String offAddr2) {
		this.offAddr2 = offAddr2;
	}
	public String getOffAddr3() {
		return offAddr3;
	}
	public void setOffAddr3(String offAddr3) {
		this.offAddr3 = offAddr3;
	}
	public String getOffPostCde() {
		return offPostCde;
	}
	public void setOffPostCde(String offPostCde) {
		this.offPostCde = offPostCde;
	}
	public String getOffTown() {
		return offTown;
	}
	public void setOffTown(String offTown) {
		this.offTown = offTown;
	}
	public String getOffState() {
		return offState;
	}
	public void setOffState(String offState) {
		this.offState = offState;
	}
	public String getOffCountry() {
		return offCountry;
	}
	public void setOffCountry(String offCountry) {
		this.offCountry = offCountry;
	}
	public String getOffPhoneNo1() {
		return offPhoneNo1;
	}
	public void setOffPhoneNo1(String offPhoneNo1) {
		this.offPhoneNo1 = offPhoneNo1;
	}
	public String getOffPhoneNo1Ext() {
		return offPhoneNo1Ext;
	}
	public void setOffPhoneNo1Ext(String offPhoneNo1Ext) {
		this.offPhoneNo1Ext = offPhoneNo1Ext;
	}
	public String getOffPhoneNo2() {
		return offPhoneNo2;
	}
	public void setOffPhoneNo2(String offPhoneNo2) {
		this.offPhoneNo2 = offPhoneNo2;
	}
	public String getOffPhoneNo2Ext() {
		return offPhoneNo2Ext;
	}
	public void setOffPhoneNo2Ext(String offPhoneNo2Ext) {
		this.offPhoneNo2Ext = offPhoneNo2Ext;
	}
	public String getOffFaxNo() {
		return offFaxNo;
	}
	public void setOffFaxNo(String offFaxNo) {
		this.offFaxNo = offFaxNo;
	}
	public String getPrevEmpName() {
		return prevEmpName;
	}
	public void setPrevEmpName(String prevEmpName) {
		this.prevEmpName = prevEmpName;
	}
	public String getPrevEmpAddr1() {
		return prevEmpAddr1;
	}
	public void setPrevEmpAddr1(String prevEmpAddr1) {
		this.prevEmpAddr1 = prevEmpAddr1;
	}
	public String getPrevEmpAddr2() {
		return prevEmpAddr2;
	}
	public void setPrevEmpAddr2(String prevEmpAddr2) {
		this.prevEmpAddr2 = prevEmpAddr2;
	}
	public String getPrevEmpAddr3() {
		return prevEmpAddr3;
	}
	public void setPrevEmpAddr3(String prevEmpAddr3) {
		this.prevEmpAddr3 = prevEmpAddr3;
	}
	public String getPrevEmpPostCde() {
		return prevEmpPostCde;
	}
	public void setPrevEmpPostCde(String prevEmpPostCde) {
		this.prevEmpPostCde = prevEmpPostCde;
	}
	public String getPrevEmpTown() {
		return prevEmpTown;
	}
	public void setPrevEmpTown(String prevEmpTown) {
		this.prevEmpTown = prevEmpTown;
	}
	public String getPrevEmpState() {
		return prevEmpState;
	}
	public void setPrevEmpState(String prevEmpState) {
		this.prevEmpState = prevEmpState;
	}
	public String getPrevEmpCountry() {
		return prevEmpCountry;
	}
	public void setPrevEmpCountry(String prevEmpCountry) {
		this.prevEmpCountry = prevEmpCountry;
	}
	public String getPrevEmpPhone() {
		return prevEmpPhone;
	}
	public void setPrevEmpPhone(String prevEmpPhone) {
		this.prevEmpPhone = prevEmpPhone;
	}
	public String getPrevEmpPhoneExt() {
		return prevEmpPhoneExt;
	}
	public void setPrevEmpPhoneExt(String prevEmpPhoneExt) {
		this.prevEmpPhoneExt = prevEmpPhoneExt;
	}
	public String getPrevEmpSince() {
		return prevEmpSince;
	}
	public void setPrevEmpSince(String prevEmpSince) {
		this.prevEmpSince = prevEmpSince;
	}
	public String getPrevEmpDurOfServ() {
		return prevEmpDurOfServ;
	}
	public void setPrevEmpDurOfServ(String prevEmpDurOfServ) {
		this.prevEmpDurOfServ = prevEmpDurOfServ;
	}
	public String getOwnHouseLand() {
		return ownHouseLand;
	}
	public void setOwnHouseLand(String ownHouseLand) {
		this.ownHouseLand = ownHouseLand;
	}
	public String getOwnCar() {
		return ownCar;
	}
	public void setOwnCar(String ownCar) {
		this.ownCar = ownCar;
	}
	public String getNoOfDepen() {
		return noOfDepen;
	}
	public void setNoOfDepen(String noOfDepen) {
		this.noOfDepen = noOfDepen;
	}
	public String getAvgSpendMth() {
		return avgSpendMth;
	}
	public void setAvgSpendMth(String avgSpendMth) {
		this.avgSpendMth = avgSpendMth;
	}
	public String getBankPrd() {
		return bankPrd;
	}
	public void setBankPrd(String bankPrd) {
		this.bankPrd = bankPrd;
	}
	public String getBankOthrPrd() {
		return bankOthrPrd;
	}
	public void setBankOthrPrd(String bankOthrPrd) {
		this.bankOthrPrd = bankOthrPrd;
	}
	public String getOthrCCBank() {
		return othrCCBank;
	}
	public void setOthrCCBank(String othrCCBank) {
		this.othrCCBank = othrCCBank;
	}
	public String getOthrCCLimit() {
		return othrCCLimit;
	}
	public void setOthrCCLimit(String othrCCLimit) {
		this.othrCCLimit = othrCCLimit;
	}
	public String getOthrLoanBankName() {
		return othrLoanBankName;
	}
	public void setOthrLoanBankName(String othrLoanBankName) {
		this.othrLoanBankName = othrLoanBankName;
	}
	public String getOthrLoanInstallMth() {
		return othrLoanInstallMth;
	}
	public void setOthrLoanInstallMth(String othrLoanInstallMth) {
		this.othrLoanInstallMth = othrLoanInstallMth;
	}
	public String getDelivByBrchId() {
		return delivByBrchId;
	}
	public void setDelivByBrchId(String delivByBrchId) {
		this.delivByBrchId = delivByBrchId;
	}
	public String getDelivOpt() {
		return delivOpt;
	}
	public void setDelivOpt(String delivOpt) {
		this.delivOpt = delivOpt;
	}
	public String getDelivAdd1() {
		return delivAdd1;
	}
	public void setDelivAdd1(String delivAdd1) {
		this.delivAdd1 = delivAdd1;
	}
	public String getDelivAdd2() {
		return delivAdd2;
	}
	public void setDelivAdd2(String delivAdd2) {
		this.delivAdd2 = delivAdd2;
	}
	public String getDelivAdd3() {
		return delivAdd3;
	}
	public void setDelivAdd3(String delivAdd3) {
		this.delivAdd3 = delivAdd3;
	}
	public String getDelivPostCde() {
		return delivPostCde;
	}
	public void setDelivPostCde(String delivPostCde) {
		this.delivPostCde = delivPostCde;
	}
	public String getDelivTown() {
		return delivTown;
	}
	public void setDelivTown(String delivTown) {
		this.delivTown = delivTown;
	}
	public String getDelivState() {
		return delivState;
	}
	public void setDelivState(String delivState) {
		this.delivState = delivState;
	}
	public String getDelivCountry() {
		return delivCountry;
	}
	public void setDelivCountry(String delivCountry) {
		this.delivCountry = delivCountry;
	}
	public String getDelivBrchId() {
		return delivBrchId;
	}
	public void setDelivBrchId(String delivBrchId) {
		this.delivBrchId = delivBrchId;
	}
	public String getSpcName() {
		return spcName;
	}
	public void setSpcName(String spcName) {
		this.spcName = spcName;
	}
	public String getSpcIdInd() {
		return spcIdInd;
	}
	public void setSpcIdInd(String spcIdInd) {
		this.spcIdInd = spcIdInd;
	}
	public String getSpcNewId() {
		return spcNewId;
	}
	public void setSpcNewId(String spcNewId) {
		this.spcNewId = spcNewId;
	}
	public String getSpcEmpName() {
		return spcEmpName;
	}
	public void setSpcEmpName(String spcEmpName) {
		this.spcEmpName = spcEmpName;
	}
	public String getSpcEmpAddr1() {
		return spcEmpAddr1;
	}
	public void setSpcEmpAddr1(String spcEmpAddr1) {
		this.spcEmpAddr1 = spcEmpAddr1;
	}
	public String getSpcEmpAddr2() {
		return spcEmpAddr2;
	}
	public void setSpcEmpAddr2(String spcEmpAddr2) {
		this.spcEmpAddr2 = spcEmpAddr2;
	}
	public String getSpcEmpAddr3() {
		return spcEmpAddr3;
	}
	public void setSpcEmpAddr3(String spcEmpAddr3) {
		this.spcEmpAddr3 = spcEmpAddr3;
	}
	public String getSpcEmpPostCde() {
		return spcEmpPostCde;
	}
	public void setSpcEmpPostCde(String spcEmpPostCde) {
		this.spcEmpPostCde = spcEmpPostCde;
	}
	public String getSpcEmpTown() {
		return spcEmpTown;
	}
	public void setSpcEmpTown(String spcEmpTown) {
		this.spcEmpTown = spcEmpTown;
	}
	public String getSpcEmpState() {
		return spcEmpState;
	}
	public void setSpcEmpState(String spcEmpState) {
		this.spcEmpState = spcEmpState;
	}
	public String getSpcEmpCountry() {
		return spcEmpCountry;
	}
	public void setSpcEmpCountry(String spcEmpCountry) {
		this.spcEmpCountry = spcEmpCountry;
	}
	public String getSpcEmpPhone() {
		return spcEmpPhone;
	}
	public void setSpcEmpPhone(String spcEmpPhone) {
		this.spcEmpPhone = spcEmpPhone;
	}
	public String getSpcEmpPhoneExt() {
		return spcEmpPhoneExt;
	}
	public void setSpcEmpPhoneExt(String spcEmpPhoneExt) {
		this.spcEmpPhoneExt = spcEmpPhoneExt;
	}
	public String getSpcEmpPosi() {
		return spcEmpPosi;
	}
	public void setSpcEmpPosi(String spcEmpPosi) {
		this.spcEmpPosi = spcEmpPosi;
	}
	public String getSpcEmpSince() {
		return spcEmpSince;
	}
	public void setSpcEmpSince(String spcEmpSince) {
		this.spcEmpSince = spcEmpSince;
	}
	public String getSpcEmpWorkNat() {
		return spcEmpWorkNat;
	}
	public void setSpcEmpWorkNat(String spcEmpWorkNat) {
		this.spcEmpWorkNat = spcEmpWorkNat;
	}
	public String getEmerContcPrsn() {
		return emerContcPrsn;
	}
	public void setEmerContcPrsn(String emerContcPrsn) {
		this.emerContcPrsn = emerContcPrsn;
	}
	public String getEmerGender() {
		return emerGender;
	}
	public void setEmerGender(String emerGender) {
		this.emerGender = emerGender;
	}
	public String getEmerPhoneNo() {
		return emerPhoneNo;
	}
	public void setEmerPhoneNo(String emerPhoneNo) {
		this.emerPhoneNo = emerPhoneNo;
	}
	public String getEmerMobileNo() {
		return emerMobileNo;
	}
	public void setEmerMobileNo(String emerMobileNo) {
		this.emerMobileNo = emerMobileNo;
	}
	public String getEmerRelt() {
		return emerRelt;
	}
	public void setEmerRelt(String emerRelt) {
		this.emerRelt = emerRelt;
	}
	public String getEmerMeth() {
		return emerMeth;
	}
	public void setEmerMeth(String emerMeth) {
		this.emerMeth = emerMeth;
	}
	public String getPayCASA() {
		return payCASA;
	}
	public void setPayCASA(String payCASA) {
		this.payCASA = payCASA;
	}
	public String getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}
	public String getCasaAcctNo() {
		return casaAcctNo;
	}
	public void setCasaAcctNo(String casaAcctNo) {
		this.casaAcctNo = casaAcctNo;
	}
	public String getCasaAcctTyp() {
		return casaAcctTyp;
	}
	public void setCasaAcctTyp(String casaAcctTyp) {
		this.casaAcctTyp = casaAcctTyp;
	}
	public String getCasaCurCde() {
		return casaCurCde;
	}
	public void setCasaCurCde(String casaCurCde) {
		this.casaCurCde = casaCurCde;
	}
	public String getRecomCrdNo() {
		return recomCrdNo;
	}
	public void setRecomCrdNo(String recomCrdNo) {
		this.recomCrdNo = recomCrdNo;
	}
	public String getRecomName() {
		return recomName;
	}
	public void setRecomName(String recomName) {
		this.recomName = recomName;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getApprvDeviation() {
		return apprvDeviation;
	}
	public void setApprvDeviation(String apprvDeviation) {
		this.apprvDeviation = apprvDeviation;
	}
	public String getAddData1() {
		return addData1;
	}
	public void setAddData1(String addData1) {
		this.addData1 = addData1;
	}
	public String getAddData2() {
		return addData2;
	}
	public void setAddData2(String addData2) {
		this.addData2 = addData2;
	}
	public String getDocChecker() {
		return docChecker;
	}
	public void setDocChecker(String docChecker) {
		this.docChecker = docChecker;
	}
	public String getDocApprover() {
		return docApprover;
	}
	public void setDocApprover(String docApprover) {
		this.docApprover = docApprover;
	}
	public String getSmsInfo() {
		return smsInfo;
	}
	public void setSmsInfo(String smsInfo) {
		this.smsInfo = smsInfo;
	}
	public String getNarrative() {
		return narrative;
	}
	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getDecsnStat() {
		return decsnStat;
	}
	public void setDecsnStat(String decsnStat) {
		this.decsnStat = decsnStat;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}