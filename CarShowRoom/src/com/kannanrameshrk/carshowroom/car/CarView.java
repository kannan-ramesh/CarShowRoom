package com.kannanrameshrk.carshowroom.car;

import java.util.Map;
import java.util.Scanner;

import com.kannanrameshrk.Main;
import com.kannanrameshrk.carshowroom.dto.Customer;

public class CarView {
	private CarViewModel carviewmodel;
	
	public CarView(){
		carviewmodel=new CarViewModel(this);  
	}

	public void start() {
		System.out.println("\t\t------------");
		System.out.println("\t\tAdmin Page");
		System.out.println("\t\t------------");
		boolean loop=true;
		while(loop) {
			Scanner input =new Scanner(System.in);
			System.out.println(" 1.Customer Details\n 2.back");
			System.out.println("Enter your option:");
			System.out.println("-------------------");
			int choice=input.nextInt();
			
			switch(choice) {
			case 1:{
				System.out.println("Customer Details");
				System.out.println("-----------------");
				Map<String, Customer> data = carviewmodel.customerData();
				
				if(data.size()>0) {
					System.out.println("****************************************");
					for(Map.Entry<String, Customer> va:data.entrySet()) {
						Customer key=va.getValue();
						System.out.println("Customer Name     :"+key.getCustomerName());
						System.out.println("Car Name          :"+key.getCarName());
						System.out.println("Customer Age      :"+key.getAge());
						System.out.println("Customer Location :"+key.getPlace());
						System.out.println();
					}
					System.out.println("***********************************");
				}else {
					System.out.println("Not Sale in Car,,no customer data");
				}
				break;
			}
			case 2:{
				Main main=new Main();
				main.init();
				break;
			}
			default:{
				System.out.println("Invalid choice..");
				break;
			}
			}
		}
	}

	public void showErr(String errMessage) {
		System.out.println(errMessage);
	}
}
