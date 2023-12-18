package com.kannanrameshrk.carshowroom.dto;

public class Car {
	public int carID;
	private String carName;
	private int year;
	private String color;
	private double amount;
	private int items;
	
	public Car(int carId,String carName,int year,String color,double amount,int items){
		this.carID=carId;
		this.carName=carName;
		this.year=year;
		this.color=color;
		this.amount=amount;
		this.items=items;
		
	}
	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	
	public void displayCar() {
		System.out.println(carID+"   "+carName+"   "+year+"     " +color+"   "+"Rs."+amount+"    "+ items);	
	}
	
	
}
