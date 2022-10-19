package com.hs.guest;

import com.hs.restaurant.AmericanRestaurant;
import com.hs.restaurant.ItalianRestaurant;
import com.hs.service.RoomService;

public class RoomGuest {

	public static void main(String[] args) {
	 
		RoomService roomService= new RoomService(new AmericanRestaurant());
		
		System.out.println(roomService.placeOrder("burger"));
	}

}
