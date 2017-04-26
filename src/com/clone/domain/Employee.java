package com.clone.domain;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 员工信息类
 * @author john
 *
 */
public class Employee implements Serializable {
	
	
	/**
	 * 序列化id
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name; //员工姓名
	private int age; //员工年龄
	private Dept dept; //员工部门
	private Date date; //入职时间
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, Dept dept, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * java 序列化实现深克隆
	 */
	@Override
	public Employee clone(){
		Employee emp=null;
		//对象序列化
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		
		try {
			ObjectOutputStream outStream=new ObjectOutputStream(out);
			outStream.writeObject(this);
			
			//反序列化
			ByteArrayInputStream inp=new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream inputStream=new ObjectInputStream(inp);
			emp=(Employee)inputStream.readObject();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return emp;
	}
}
