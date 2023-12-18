package com.kannanrameshrk.carshowroom.repository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.kannanrameshrk.carshowroom.dto.Car;
import com.kannanrameshrk.carshowroom.dto.Customer;

public class CarRepository {
	ArrayList<Car> cars=new ArrayList<Car>();
	Map<String,Customer> customerData=new LinkedHashMap<>();
	Car car;
	private static CarRepository repository;
	
	private CarRepository() {
		cars.add(new Car(1,"volvo",2022,"Black",22000,4));
		cars.add(new Car(2,"volvo",2022,"Red",22000,2));
	}
	
	public static CarRepository getInstance() {
		if(repository == null) {
			repository = new CarRepository();
		}
		return repository;
	}

	public void insertCustomerData(Customer customer) {
		 
		 int item=0;
			
			for(Car cus:cars ) {
				if(customer.getC_id()== cus.carID|| customer.getCarName()== cus.getCarName()) {
					customerData.put(customer.getCarName(), customer);
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

	public ArrayList<Car> getCarData() {
		return cars;
	}

	public Map<String, Customer> getCustomerData() {
		return customerData;
	}
}
