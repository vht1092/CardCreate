package com.wscw.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FDS_SYS_USERROLE database table.
 * 
 */
@Entity
@Table(name="WSCW_SYS_USERROLE")
@NamedQuery(name="WscwSysUserrole.findAll", query="SELECT f FROM WscwSysUserrole f")
public class WscwSysUserrole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private WscwSysUserrolePK id;

	public WscwSysUserrole() {
	}
	

	public WscwSysUserrole(WscwSysUserrolePK id) {
		super();
		this.id = id;
	}



	public WscwSysUserrolePK getId() {
		return this.id;
	}

	public void setId(WscwSysUserrolePK id) {
		this.id = id;
	}

}