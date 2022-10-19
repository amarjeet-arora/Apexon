package com.interfacedemo;

public interface HealthInsurance {
	
	public void takeHPolicy();
	 
	public void claimHPolicy();
	
    public default void topupCoverage() {
	System.out.println("TOPUP taken in health insurance");	
	}

}
