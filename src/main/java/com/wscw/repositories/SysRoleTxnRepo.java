package com.wscw.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wscw.entities.WscwSysRoletxn;

@Repository
public interface SysRoleTxnRepo extends CrudRepository<WscwSysRoletxn, Long> {
	List<WscwSysRoletxn> findAllByIdrole(int roleid);	
}
