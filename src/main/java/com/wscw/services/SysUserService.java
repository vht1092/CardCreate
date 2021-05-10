package com.wscw.services;

import java.util.List;

import com.wscw.entities.WscwSysUser;

public interface SysUserService {
	public WscwSysUser findAllByEmail(String email);

	public List<WscwSysUser> findAllUser();
	
	public List<WscwSysUser> findAllUserByActiveflagIsTrue();

	public String createNew(String userid, String email, String fullname);

	public void updateLastLogin(String userid);

	public void updateUserByUserId(String userid, String fullname, String usertype, Boolean active);

	public WscwSysUser findByUserid(String userid);
}
