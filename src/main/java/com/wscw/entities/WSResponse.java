package com.wscw.entities;

public class WSResponse {
	private String respCode;
	private String respDesc;
	
	public WSResponse() {
		
	}

	public WSResponse(String respCode, String respDesc) {
		super();
		this.respCode = respCode;
		this.respDesc = respDesc;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}
	
	
	
}
