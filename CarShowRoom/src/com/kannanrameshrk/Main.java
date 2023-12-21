package com.kannanrameshrk;

import java.util.Scanner;

import com.kannanrameshrk.carshowroom.car.CarView;
import com.kannanrameshrk.carshowroom.customer.CustomerView;

public class Main {
	public static void main(String[] args) {
		Main main=new Main();
		main.init();
	}
	public void init() {
		Scanner s=new Scanner(System.in);
		System.out.println("\t\t----------------");
		System.out.println("\t\t RK CAR AGENCY");
		System.out.println("\t\t----------------");
		
		boolean loop=true;
		while(loop)
		{
			System.out.println(" 1.Admin\n 2.User \n 3.Exit");
			System.out.println("Enter your Option:");
			System.out.println("-------------------");
			int chioce= s.nextInt();
				switch(chioce)
				{
					case 1:
					{
						CarView carview =new CarView(); 
						carview.start(s);
						break;
					}
					case 2:
					{
						CustomerView customerview = new CustomerView();
						customerview.start();
						break;
					}
					case 3:
					{
						loop=false;
						break;
					}
					default:
						System.out.println("Invalid Option...");
						break;
				}
			}
	}
}
