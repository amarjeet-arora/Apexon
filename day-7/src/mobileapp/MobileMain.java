package mobileapp;

import java.util.Optional;

public class MobileMain {

	public static void main(String[] args) {
		 
		ScreenResolution resolution= new ScreenResolution(650,1334);
		
		DisplayFeatures displayFeatures= new DisplayFeatures("5.0", Optional.of(resolution));
		
		SmartPhone phone= new SmartPhone(66756, "Samsung", "S-22",  Optional.of(displayFeatures));
		
		Mobileservice mobileservice= new Mobileservice();
		
		int mWidth= mobileservice.getMobileWidth( Optional.of(phone));
		System.out.println("Mobile Width  "+ mWidth);
	}

}
