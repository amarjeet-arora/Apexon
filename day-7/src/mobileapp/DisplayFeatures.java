package mobileapp;

import java.util.Optional;

public class DisplayFeatures {
	private String size; 
	private Optional<ScreenResolution> resolution;
	@Override
	public String toString() {
		return "DisplayFeatures [size=" + size + ", resolution=" + resolution + "]";
	}
	public DisplayFeatures() {
		super();
	 
	}
	public DisplayFeatures(String size, Optional<ScreenResolution> resolution) {
		super();
		this.size = size;
		this.resolution = resolution;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}
	public void setResolution(Optional<ScreenResolution> resolution) {
		this.resolution = resolution;
	}
	 
}
