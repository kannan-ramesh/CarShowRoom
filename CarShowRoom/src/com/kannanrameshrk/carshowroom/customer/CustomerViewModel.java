package com.kannanrameshrk.carshowroom.customer;

import java.util.ArrayList;
import java.util.List;

import com.kannanrameshrk.carshowroom.dto.Car;
import com.kannanrameshrk.carshowroom.dto.Customer;
import com.kannanrameshrk.carshowroom.repository.CarRepository;

class CustomerViewModel {
	CustomerView customerview;
	
	public CustomerViewModel(CustomerView customerview) {
		this.customerview=customerview;
	}

	public void validate(Customer customer) {
		boolean name=nameIsvalid(customer.getCustomerName());
		boolean id=idIsValid(customer.getC_id());
		boolean age=ageIsValid(customer.getAge());
		boolean place=placeIsValid(customer.getPlace());
		boolean carName=carNameIsValid(customer.getCarName());
		
		if(name && id && age && place && carName) {
			CarRepository.getInstance().insertCustomerData(customer);
			customerview.onSucess("Inserted Sucess");
		}
	}

	private boolean carNameIsValid(String carName) {
		if(carName.length()>=3 && carName.length()<10 && !carName.matches("d")) {
			return true;
		}
		return false;
	}

	private boolean placeIsValid(String place) {
		if(place.length()>=3 && place.length()<15) {
			return true;
		}
		return false;
	}

	private boolean ageIsValid(int age) {
		if(age>=18 && age<60) {
			return true;
		}
		return false;
	}

	private boolean idIsValid(int c_id) {
		if(c_id!=0) {
			return true;
		}
		return false;
	}

	private boolean nameIsvalid(String customerName) {
		if(customerName.length()>=3 && customerName.length()<45) {
			return true;
		}
		return false;
	}

	public ArrayList<Car> getCarData() {
		ArrayList<Car> carData=CarRepository.getInstance().getCarData();
		if(carData.isEmpty()) {
			customerview.showErr("No data available ");
		}
		return carData;
	}
}
