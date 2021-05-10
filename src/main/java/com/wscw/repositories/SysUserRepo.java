package com.wscw.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wscw.entities.WscwSysUser;

@Repository
public interface SysUserRepo extends JpaRepository<WscwSysUser, String> {
	WscwSysUser findByEmail(String email);

	List<WscwSysUser> findAllUserByActiveflagIsTrue();
}
