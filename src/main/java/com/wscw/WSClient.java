package com.wscw;

import my.com.webservices.*;

public class WSClient {
	private Cardworks_PortType cw_port = null;
	
    private final static String FI = "970429";
    private final static String ACT_IND = "3";
    
    public PINSelectionRespBean peformChangePin(String addressWS, String seqNo,
    		String loc, String lastFourDigits, String pinEnc, String phone) {
    	
    	PINSelectionRespBean resp = null;
        try {
        	CardworksServiceLocator locator = new CardworksServiceLocator();
            locator.setMaintainSession(true);
            locator.setCardworksEndpointAddress(addressWS);//--set url WS
            cw_port = locator.getCardworks();
                        
            PINSelectionReqBean pinSelectionReq = new PINSelectionReqBean();
        	pinSelectionReq.setSequenceNo(seqNo);
        	pinSelectionReq.setFi(FI);
        	
        	pinSelectionReq.setPan(loc + lastFourDigits);
        	pinSelectionReq.setActInd(ACT_IND);
        	pinSelectionReq.setMobileNo(phone);
        	pinSelectionReq.setNewPIN(pinEnc); 
        	
        	resp = cw_port.PINSelection(pinSelectionReq); 
        	
        } catch (Exception e) {
            e.printStackTrace();
			//LOGGER.error("Hold amount error: " + e);
			return resp;
        }
        
        return resp;
    }
    
}
