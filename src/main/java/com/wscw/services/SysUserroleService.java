package com.wscw.services;

import java.util.List;

import com.wscw.entities.WscwSysUserrole;

public interface SysUserroleService {
	void save(String iduser, int idrole);
	void deleteByIduser(String iduser);
	List<WscwSysUserrole> findAllByUserId(String iduser);	
	String findByRoleId(String userid);
}
