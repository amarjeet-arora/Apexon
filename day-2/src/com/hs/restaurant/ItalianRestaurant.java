package com.hs.restaurant;

public class ItalianRestaurant implements Restaurant{

	@Override
	public String prepareOrder(String food) {
		 
		return "preparing italian food " + food + " with olive oil and italian herbs";
	}

}
