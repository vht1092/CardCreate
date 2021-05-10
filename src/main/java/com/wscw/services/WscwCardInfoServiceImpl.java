package com.wscw.services;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.wscw.entities.CustomerInfo;
import com.wscw.entities.WscwCardInfo;
import com.wscw.repositories.WscwCardInfoRepo;

@Service("wscwCardInfoService")
@Transactional
public class WscwCardInfoServiceImpl implements WscwCardInfoService {

	@Value("${spring.jpa.properties.hibernate.default_schema}")
	private String sSchema;
	@Autowired
	private WscwCardInfoRepo wscwCardInfoRepo;
	
	@Autowired
	private DataSource dataSource;


	@Override
	public void save(WscwCardInfo cardInfo) {
		// TODO Auto-generated method stub
		wscwCardInfoRepo.save(cardInfo);
	}

	public Page<WscwCardInfo> findAllByFileNameOrderByIdAsc(Pageable page,String filename) {
		// TODO Auto-generated method stub
		return wscwCardInfoRepo.findAllByFileNameOrderByIdAsc(page,filename);
	}

	@Override
	public String getSeqnoWsCreateCard() throws SQLException {
		
		StringBuilder sqlString = new StringBuilder();
		sqlString 	.append("select SEQNO_WS_CREATE_CARD.nextval SEQ  from dual");

		Connection connect = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		String seqNo = "";
		
		try {
			connect = dataSource.getConnection();
			preStmt = connect.prepareStatement(sqlString.toString());
			rs = preStmt.executeQuery();
			
			while(rs.next()) {
				seqNo = rs.getString("SEQ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			try {
				connect.close();
				rs.close();
				preStmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return seqNo;
	}

	@Override
	public List<String> getListFileImportOrderByCretmsDesc() {
		// TODO Auto-generated method stub
		return wscwCardInfoRepo.getListFileImportOrderByCretmsDesc();
	}
}
