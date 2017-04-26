package com.clone.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门类
 * @author john
 *
 */
public class Dept implements Serializable {
	
	/**
	 * 序列化标识
	 */
	private static final long serialVersionUID = 1L;
	
	private String id; //部门id
	private String deptName; //部门名称
	private Date date; //部门创建时间
	
	
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(String id, String deptName, Date date) {
		super();
		this.id = id;
		this.deptName = deptName;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
}
