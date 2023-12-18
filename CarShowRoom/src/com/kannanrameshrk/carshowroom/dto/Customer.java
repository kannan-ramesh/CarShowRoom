package com.kannanrameshrk.carshowroom.dto;
import java.util.*;
public class Customer {
	private int c_id;
	private String customerName;
	private int age;
	private String place;
	private String carName;
	
	
	public Customer(int carID,String c_name,int age,String place,String carName) {
		this.c_id=carID;
		this.customerName=c_name;
		this.age=age;
		this.place=place;
		this.carName=carName;	
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void PurchaseCar(ArrayList<Car> cars, List<Customer> customers) {
		
		int item=0;
		
		for(Car cus:cars ) {
			if(cus.carID==c_id || cus.getCarName()==carName) {
				customers.add(new Customer( c_id, carName, age, carName, carName));
				item++;
				if(item<=cus.getItems()) {
					System.out.println("Car available..");
					System.out.println("Sucessfully purchased Car..");
				}else {
					System.out.println("Car not available in show room...");
				}
				
				if(item<=cus.getItems()) {
					cus.setItems(cus.getItems()-1);
				}else {
					return;
				}
				
			}	
		}
		
	}
	

}
