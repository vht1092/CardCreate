package com.wscw.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wscw.entities.WscwSysUserrole;

@Repository
public interface SysUserroleRepo extends CrudRepository<WscwSysUserrole, String> {

	@Query(value = "select f from WscwSysUserrole f where f.id.iduser=:iduser")
	List<WscwSysUserrole> findAllByIdUser(@Param("iduser") String iduser);

	@Query(value = "delete from {h-schema}wscw_sys_userrole t where t.iduser=:iduser", nativeQuery = true)
	List<WscwSysUserrole> deleteByIduser(@Param("iduser") String iduser);
	
	@Query(value = "select IDROLE from wscw_sys_userrole where IDUSER = :userid and rownum <= 1", nativeQuery = true)
	String findByRoleID(@Param(value = "userid") String userid);
}
