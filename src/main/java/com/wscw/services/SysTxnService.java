package com.wscw.services;

import java.util.List;

import com.wscw.entities.WscwSysTxn;

public interface SysTxnService {
	List<Object[]> findAllByUserId(String id);
	List<Object[]> findAllByRoleId(int id);
	List<WscwSysTxn> findAll();
}
