package com.clone.domain;

import java.util.Date;

/**
 * 汽车类
 * @author john
 *
 */
public class Car implements Cloneable{
	
	private String brand; //汽车品牌
	private double carLength; //汽车车长
	private String color; //汽车颜色
	private double price; //汽车价格
	
	private Date date; //出厂日期
	
	/**
	 * 无参构造
	 */
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 汽车类有参构造
	 * @param brand 品牌
	 * @param carLength 车长
	 * @param color 颜色
	 * @param price 价格
	 */
	public Car(String brand, double carLength, String color, double price) {
		super();
		this.brand = brand;
		this.carLength = carLength;
		this.color = color;
		this.price = price;
	}
	
	
	/**
	 * 汽车类有参构造
	 * @param brand 品牌
	 * @param carLength 车长
	 * @param color 颜色
	 * @param price 价格
	 * @param date 出厂日期
	 */
	public Car(String brand, double carLength, String color, double price,
			Date date) {
		super();
		this.brand = brand;
		this.carLength = carLength;
		this.color = color;
		this.price = price;
		this.date = date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCarLength() {
		return carLength;
	}
	public void setCarLength(double carLength) {
		this.carLength = carLength;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	/**
	 * 重写Object类的克隆方法，实现浅克隆
	 */
	@Override
	public Car clone() throws CloneNotSupportedException {
		
		Car car = (Car)super.clone();
		
		//增加Date 类型的深克隆
		
		car.date =(Date)this.date.clone();  //Date 类中默认重写了clone方法
		
		return car;
	}
	
}
