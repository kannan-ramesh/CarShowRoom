package com.kannanrameshrk.carshowroom.car;

import java.util.Map;

import com.kannanrameshrk.carshowroom.dto.Customer;
import com.kannanrameshrk.carshowroom.repository.CarRepository;

class CarViewModel {
	CarView  carview;
	
	public CarViewModel(CarView carview) {
		carview=this.carview;
	}

	public Map<String, Customer> customerData() {
		Map<String, Customer> data = CarRepository.getInstance().getCustomerData();
		return data;
	}
}
