package mobileapp;

import java.util.Optional;

public class Mobileservice {
	
	/*
	 * public int getMobileWidth(SmartPhone phone) { if(phone != null) {
	 * DisplayFeatures displayFeatures=phone.getDisplayFeatures();
	 * if(displayFeatures != null) { ScreenResolution resolution=
	 * displayFeatures.getResolution(); if(resolution != null) { return
	 * resolution.getWidth(); } } } return 0; }
	 */
	
	public int getMobileWidth(Optional<SmartPhone> phone) {
		return phone.flatMap(SmartPhone :: getDisplayFeatures)
				.flatMap(DisplayFeatures :: getResolution)
				.map(ScreenResolution :: getWidth)
				.orElse(0);

}
}
