package com.itp.model;

public class Gear {
	private int gearLever;
	private String gearType;
	private String gearMfgName;
	
	public Gear() {}
	public Gear(int gearLever, String gearType, String gearMfgName) {
		this.gearLever = gearLever;
		this.gearType = gearType;
		this.gearMfgName = gearMfgName;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getGearMfgName() {
		return gearMfgName;
	}
	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
	@Override
	public String toString() {
		return "Gear [gearLever=" + gearLever + ", gearType=" + gearType + ", gearMfgName=" + gearMfgName + "]";
	}
	
	
}
