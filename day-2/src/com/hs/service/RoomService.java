package com.hs.service;

import com.hs.restaurant.Restaurant;

public class RoomService {
	
	private Restaurant restaurant;

	public RoomService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public String placeOrder(String dishName) {
		return restaurant.prepareOrder(dishName);
	}
	

}
