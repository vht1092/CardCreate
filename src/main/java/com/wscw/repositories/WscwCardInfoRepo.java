package com.wscw.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wscw.entities.WscwCardInfo;


@Repository
public interface WscwCardInfoRepo extends JpaRepository<WscwCardInfo, String> {
	
//	@Query(value = "SELECT * FROM DSQT_UPDATE_FEE_DAILY\r\n" + 
//			"WHERE NGAY_HACH_TOAN=:ngayHachToan", nativeQuery = true)
//	List<WscwCardInfo> findAllByNgayHachToan(@Param("ngayHachToan") String ngayHachToan);
	
	public Page<WscwCardInfo> findAllByFileNameOrderByIdAsc(Pageable page,@Param("filename") String ngayHachToan);
	
	
	@Query(value = "WITH t AS (\r\n" + 
			"    SELECT DISTINCT FILE_NAME, MAX(CRE_TMS)\r\n" + 
			"    FROM WSCW_CARD_CREATE \r\n" + 
			"    GROUP BY FILE_NAME \r\n" + 
			"    ORDER BY MAX(CRE_TMS) DESC, FILE_NAME\r\n" + 
			") SELECT FILE_NAME FROM t", nativeQuery = true)
	List<String> getListFileImportOrderByCretmsDesc();
	
}
