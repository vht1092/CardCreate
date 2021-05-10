package com.wscw.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.wscw.entities.WscwCardInfo;

public interface WscwCardInfoService {

	public void save(WscwCardInfo cardInfo);
	
	public Page<WscwCardInfo> findAllByFileNameOrderByIdAsc(Pageable page,String filename);
	
	public String getSeqnoWsCreateCard() throws SQLException;
	
	public List<String> getListFileImportOrderByCretmsDesc();
	
}
