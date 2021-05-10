package com.wscw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wscw.entities.WscwSysUserrole;
import com.wscw.entities.WscwSysUserrolePK;
import com.wscw.repositories.SysUserroleRepo;

@Service("sysUserroleService")
public class SysUserroleServiceImpl implements SysUserroleService {

	@Autowired
	private SysUserroleRepo sysUserroleRepo;

	@Override
	public void save(String iduser, int idrole) {
		WscwSysUserrole fdsSysUserrole = new WscwSysUserrole();
		fdsSysUserrole.setId(new WscwSysUserrolePK(iduser, idrole));
		sysUserroleRepo.save(fdsSysUserrole);
	}

	@Override
	public List<WscwSysUserrole> findAllByUserId(String iduser) {
		return sysUserroleRepo.findAllByIdUser(iduser);
	}

	@Override
	public void deleteByIduser(String iduser) {
		List<WscwSysUserrole> fdsSysUserrole = sysUserroleRepo.findAllByIdUser(iduser);
		if (fdsSysUserrole != null) {
			sysUserroleRepo.delete(fdsSysUserrole);
		}
	}
	
	@Override
	public String findByRoleId(String userid) {
		return sysUserroleRepo.findByRoleID(userid);
	};

}
