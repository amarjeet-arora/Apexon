package mobileapp;

import java.util.Optional;

public class SmartPhone {
	
	private int id;
	private String brandName;
	private String name;
	private Optional<DisplayFeatures> displayFeatures;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Optional<DisplayFeatures> getDisplayFeatures() {
		return displayFeatures;
	}
	public void setDisplayFeatures(Optional<DisplayFeatures> displayFeatures) {
		this.displayFeatures = displayFeatures;
	}
	public SmartPhone(int id, String brandName, String name, Optional<DisplayFeatures> displayFeatures) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}
	public SmartPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SmartPhone [id=" + id + ", brandName=" + brandName + ", name=" + name + ", displayFeatures="
				+ displayFeatures + "]";
	}
	 

}
