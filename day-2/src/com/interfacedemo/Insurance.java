package com.interfacedemo;

public interface Insurance {
	public void takePolicy();
	 
	public void claimPolicy();
	
	public default void topupCoverage() {
		
	}

}
