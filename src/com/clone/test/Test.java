package com.clone.test;

import java.util.Date;
import java.util.GregorianCalendar;

import com.clone.domain.Car;
import com.clone.domain.Dept;
import com.clone.domain.Employee;

public class Test {
	public static void main(String[] args) {
		test4();
	}
	
	
	/**
	 *  Java 序列化实现深克隆 
	 */
	private static void test4() {
		Dept dept=new Dept("001", "营销部", new Date());
		
		Employee emp=new Employee("张三", 20, dept, new Date());
		
		Employee cloneEmp=emp.clone();
		
		System.out.println("克隆后内容---------------------------------");
		System.out.println(emp.getName()+"=="+emp.getAge()+"=="+emp.getDate()
				+"=="+emp.getDept().getId()+"=="+emp.getDept().getDeptName()+"=="+emp.getDept().getDate());
		System.out.println(cloneEmp.getName()+"=="+cloneEmp.getAge()+"=="+cloneEmp.getDate()
				+"=="+cloneEmp.getDept().getId()+"=="+cloneEmp.getDept().getDeptName()+"=="+cloneEmp.getDept().getDate());
		
		//修改克隆对象内容
		cloneEmp.setAge(30);
		cloneEmp.setName("李四");
		cloneEmp.getDate().setTime(new GregorianCalendar(2016,8,9).getTimeInMillis());
		cloneEmp.getDept().setDeptName("开发部");
		cloneEmp.getDept().getDate().setTime(new GregorianCalendar(2015,8,9).getTimeInMillis());
		
		System.out.println("修改后内容---------------------------------");
		System.out.println(emp.getName()+"=="+emp.getAge()+"=="+emp.getDate()
				+"=="+emp.getDept().getId()+"=="+emp.getDept().getDeptName()+"=="+emp.getDept().getDate());
		System.out.println(cloneEmp.getName()+"=="+cloneEmp.getAge()+"=="+cloneEmp.getDate()
				+"=="+cloneEmp.getDept().getId()+"=="+cloneEmp.getDept().getDeptName()+"=="+cloneEmp.getDept().getDate());
		
	}



	/**
	 * 深克隆 -- Date 
	 */
	private static void test3() {
		Car car =new Car("奔驰", 3.16, "黑色",45.6,new Date());
		
		try {
			Car cloneCar=car.clone(); //通过clone实现克隆
			
			System.out.println("克隆后内容--------------------------------");
			System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
					  +car.getColor()+"=="+car.getPrice()+"=="+car.getDate());
			System.out.println(cloneCar.getBrand()+"=="+cloneCar.getCarLength()+"=="
					  +cloneCar.getColor()+"=="+cloneCar.getPrice()+"=="+car.getDate());
			
			
			//修改克隆数据内容
			cloneCar.setBrand("奔驰c200");
			GregorianCalendar date=new GregorianCalendar(2016,8,9);
			cloneCar.getDate().setTime(date.getTimeInMillis());
			
			System.out.println("修改后结果---------------------------------");
			System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
					  +car.getColor()+"=="+car.getPrice()+"=="+car.getDate());
			System.out.println(cloneCar.getBrand()+"=="+cloneCar.getCarLength()+"=="
					  +cloneCar.getColor()+"=="+cloneCar.getPrice()+"=="+cloneCar.getDate());
			
		} catch (CloneNotSupportedException e) {
			System.out.print("对象克隆出现异常，异常信息：");
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 浅克隆
	 */
	private static void test2() {
		Car car =new Car("奔驰", 3.16, "黑色",45.6);
		
		try {
			Car cloneCar=car.clone(); //通过clone实现克隆
			
			System.out.println("克隆后内容--------------------------------");
			System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
					  +car.getColor()+"=="+car.getPrice());
			System.out.println(cloneCar.getBrand()+"=="+cloneCar.getCarLength()+"=="
					  +cloneCar.getColor()+"=="+cloneCar.getPrice());
			
			//修改克隆数据内容
			cloneCar.setBrand("奔驰c200");
			cloneCar.setCarLength(2.89);
			
			System.out.println("修改后结果---------------------------------");
			System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
					  +car.getColor()+"=="+car.getPrice());
			System.out.println(cloneCar.getBrand()+"=="+cloneCar.getCarLength()+"=="
					  +cloneCar.getColor()+"=="+cloneCar.getPrice());
			
		} catch (CloneNotSupportedException e) {
			System.out.print("对象克隆出现异常，异常信息：");
			e.printStackTrace();
		}
		
	}

	/**
	 * 对象拷贝
	 */
	private static void test1() {
		
		Car car =new Car("奔驰", 3.16, "黑色",45.6);
		Car copyCar=car; //简单的对象复制
		System.out.println("复制完成后内容----------------------------------");
		System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
						  +car.getColor()+"=="+car.getPrice());
		System.out.println(copyCar.getBrand()+"=="+copyCar.getCarLength()+"=="
						  +copyCar.getColor()+"=="+copyCar.getPrice());
		//改变复制对象的内容
		copyCar.setBrand("奔驰c200");
		copyCar.setPrice(30.5);
		
		System.out.println("修改后内容--------------------------------------");
		System.out.println(car.getBrand()+"=="+car.getCarLength()+"=="
						  +car.getColor()+"=="+car.getPrice());
		System.out.println(copyCar.getBrand()+"=="+copyCar.getCarLength()+"=="
						  +copyCar.getColor()+"=="+copyCar.getPrice());
	}
}
