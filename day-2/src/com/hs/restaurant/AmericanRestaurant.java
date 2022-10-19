package com.hs.restaurant;

public class AmericanRestaurant implements Restaurant{

	@Override
	public String prepareOrder(String food) {
		 
		return "preparing American food " + food + " with butter and cheese";
	}

}
