package com.wscw;

import com.vaadin.ui.Component;
import com.wscw.components.*;

/**
 * Danh sach cac component duoc them vao tabsheet
 * Khi them moi cap nhat vao table sms_sys_txn de load vao menu, sms_sys_txn.DESCRIPTION can co noi dung nhu caption cua class
 * @see com.wscw.views.MainView
 * */

public enum WsTabType {

	WSCARDCREATIONRESPONSE(CardcreationResponse.class,CardcreationResponse.CAPTION);
	
	private final String caption;
	private final Class<? extends Component> classComponent;

	private WsTabType(Class<? extends Component> classComponent,String caption) {
		this.caption = caption;
		this.classComponent = classComponent;
	}

	public String getCaption() {
		return caption;
	}

	public Class<? extends Component> getClassComponent() {
		return classComponent;
	}	
	
	public static WsTabType getTabType(final String caption){
		WsTabType result=null;
		for (WsTabType tabType:values()){
			if(tabType.getCaption().equals(caption)){
				result=tabType;
				break;
			}
		}
		return result;
	}
	

}
