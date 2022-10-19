package com.interfacedemo;

public interface Banking {
	
	// no instance var allwed
	// no cons allowed
	// all methods re default public
	//only you can use constants
	//only abstract methods are allowed
	public static final int BALANCE=100;
	 void checkBalance();
	 void withdraw();
	 void deposit();
	

}
