package com.revature.pillars;

import com.revature.blueprint.RocketShip;


/*
 * Members of a class- vars and methods
 * Static and instance forms
 * instance vars- property of one specific obj.
 * static vars- belong to all UltraRocketShips
 * instance methods- behavior related to a specific obj ex. getName();
 * static methods- behavior related to the entire class/ all objs of that type
 * final- keyword in java. meaning depends on context
 * 		final variable- cannot be changed ex. final double PI_THE_NUMBER;
 * 		final method- cannot be overridden
 * 		final class- cannot be extended
 */
public class UltraRocketShip extends RocketShip {
	private boolean hasBar;
	private String warpDriveModel;
	static private String manufacturer = "Ford";
	
	
	//default constructor
	public UltraRocketShip() {
		super();
		this.setIsMiniFridge(true);
	}

	public static String getManufacturer() {
		return UltraRocketShip.manufacturer;
	}
	
	//constructor with parameters
	public UltraRocketShip(String name, int numOfRockets, int fuelCapacity, boolean hasBar, String warpDriveModel) {
		super(name, numOfRockets, fuelCapacity, true);
		this.hasBar = hasBar;
		this.warpDriveModel = warpDriveModel;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return    "UltraRocketShip [name=" + super.getName() + 
				", numOfRockets=" + super.getNumOfRockets() + 
				", fuelCapacity=" + super.getFuelCapacity() + 
				", hasBar=" + hasBar + 
				", warpDriveModel=" + warpDriveModel + 
				"]";
	}


	@Override
	public boolean getIsMiniFridge() {
		System.out.println("duh of course it has a mini fridge");
		return super.getIsMiniFridge();
	}
	
	
	
	

	public boolean getHasBar() {
		return hasBar;
	}
	public void setHasBar(boolean hasBar) {
		this.hasBar = hasBar;
	}


	public String getWarpDriveModel() {
		return warpDriveModel;
	}
	public void setWarpDriveModel(String warpDriveModel) {
		this.warpDriveModel = warpDriveModel;
	}		
}
