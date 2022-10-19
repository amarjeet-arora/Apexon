package com.interfacedemo;

public class Customer implements HealthInsurance,LifeInsurance{

	@Override
	public void takeLPolicy() {
		System.out.println("taken life policy");
		
	}

	@Override
	public void claimLPolicy() {
		 
		
	}

	@Override
	public void takeHPolicy() {
		System.out.println("taken health policy");
	}

	@Override
	public void claimHPolicy() {
		 
		
	}

	@Override
	public void topupCoverage() {
		 
		HealthInsurance.super.topupCoverage();
	}

}
