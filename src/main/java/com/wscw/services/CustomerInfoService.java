package com.wscw.services;

import java.sql.SQLException;

import com.wscw.entities.CustomerInfo;

public interface CustomerInfoService {

	
	public CustomerInfo getCustomerInfo(String cif) throws SQLException; 
	
}
