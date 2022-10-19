package com.interfacedemo;

public interface LifeInsurance {
	public void takeLPolicy();
	 
	public void claimLPolicy();
	
	
	public default void topupCoverage() {
		System.out.println("TOPUP taken in Life insurance");	
		}
	
}
