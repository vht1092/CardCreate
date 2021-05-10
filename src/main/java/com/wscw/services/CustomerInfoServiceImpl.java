package com.wscw.services;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wscw.entities.CustomerInfo;

import oracle.jdbc.OracleTypes;

@Service("customerInfoService")
@Transactional
public class CustomerInfoServiceImpl implements CustomerInfoService {

	@Value("${spring.jpa.properties.hibernate.default_schema}")
	private String sSchema;
	
	@Autowired
	private DataSource dataSource;


	public CustomerInfo getCustomerInfo(String cif) throws SQLException {
		
		StringBuilder sqlString = new StringBuilder();
		sqlString 	.append("select substr(trim(a.CUSTOMER_NAME1),1,120) AS FULLNAME, \r\n" + 
				"a.UNIQUE_ID_VALUE AS IDNUMBER, \r\n" + 
				"FN_CONVERT_TO_VN(c.ISSUED_PLACE) AS IDIssuePlace, \r\n" + 
				"to_char(c.ISSUED_DATE, 'YYYYMMDD') AS IDIssuedDate, \r\n" + 
				"CASE WHEN a.CUSTOMER_TYPE='C' THEN to_char(c.ISSUED_DATE, 'YYYYMMDD') ELSE to_char(b.DATE_OF_BIRTH, 'YYYYMMDD') END AS BIRTHDATE \r\n" + 
				"FROM fcusr01.sttm_customer@exadata.world  a, \r\n" + 
				"fcusr01.sttm_cust_personal@exadata.world b, \r\n" + 
				"fcusr01.sttm_customer_custom@exadata.world c \r\n" + 
				"WHERE a.CUSTOMER_NO = b.CUSTOMER_NO and a.CUSTOMER_NO=c.CUSTOMER_NO \r\n" + 
				"AND b.CUSTOMER_NO = lpad(?,7,0)");

		Connection connect = null;
		PreparedStatement preStmt = null;
		ResultSet rs = null;
		
		CustomerInfo cust = new CustomerInfo();
		
		try {
			connect = dataSource.getConnection();
			preStmt = connect.prepareStatement(sqlString.toString());
			preStmt.setString(1, cif);
			rs = preStmt.executeQuery();
			
			while(rs.next()) {
				cust.setFullName(rs.getString("FULLNAME"));
				cust.setNewId(rs.getString("IDNUMBER"));
				cust.setOldId("");
				cust.setIssuePlace(rs.getString("IDISSUEPLACE"));
				cust.setIssueDate(rs.getString("IDISSUEDDATE"));
				cust.setDob(rs.getString("BIRTHDATE"));
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
		
		return cust;
	}
	
}
