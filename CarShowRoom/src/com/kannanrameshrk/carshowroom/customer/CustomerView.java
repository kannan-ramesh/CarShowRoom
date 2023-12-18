package com.kannanrameshrk.carshowroom.customer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kannanrameshrk.Main;
import com.kannanrameshrk.carshowroom.dto.Car;
import com.kannanrameshrk.carshowroom.dto.Customer;

public class CustomerView {
	CustomerViewModel customerviewmodel;
	Scanner s=new Scanner(System.in);
	
	public CustomerView() {
		customerviewmodel=new CustomerViewModel(this);
	}
	
		public void start() {
			boolean loop=true;
			while(loop) {
				System.out.println(" 1.Purchase Car \n 2.Car Details \n 3.Back");
				System.out.println("Enter your option:");
				System.out.println("-------------------");
				int chioce=s.nextInt();
					switch(chioce)
					{
						case 1:
						{
							try {
								System.out.println("purchase car..");
								System.out.println("Enter your Name:");
								String customerName=s.next();
								System.out.println("Enter car ID number:");
								int c_id=s.nextInt();
								System.out.println("Enter your age:");
								int age=s.nextInt();
								System.out.println("Enter your Village Name:");
								String place=s.next();
								System.out.println("Enter Car Name:");
								String carName=s.next();
						
								Customer customer=new Customer(c_id,customerName,age,place,carName);
								customerviewmodel.validate(customer);
								}catch(InputMismatchException e) {
									System.out.println("Enter correct details....");
									break;
								}
							break;
						}
						case 2:
						{
							System.out.println("car details..");
							System.out.println("------------------------------------------------");
							System.out.println("Id  Car    Model    Color    Rate      Car_Count");
							System.out.println("------------------------------------------------");
							ArrayList<Car> data = customerviewmodel.getCarData();
							
							for(Car c:data) {
								c.displayCar();
							}
							System.out.println("------------------------------------------------");
							break;
						}
						case 3:
						{
							Main main=new Main();
							main.init();
							loop=false;
							break;
						}
						default:
							System.out.println("Invalid option...");
							break;
					}
			}
	}

		public void onSucess(String successMessage) {
			System.out.println(successMessage);
		}

		public void showErr(String errMessage) {
			System.out.println(errMessage);
		}

		
}
