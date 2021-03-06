package com.revature.blueprint;


public class RocketShip {
	private String name;
	private int numOfRockets;
	private int fuelCapacity;
	private boolean isMiniFridge;
	
	public RocketShip(String name, int numOfRockets, int fuelCapacity, boolean isMiniFridge) {
		this.name = name;
		this.numOfRockets = numOfRockets;
		this.fuelCapacity = fuelCapacity;
		this.isMiniFridge = isMiniFridge;
	}
	
	public RocketShip() {}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumOfRockets() {
		return this.numOfRockets;
	}

	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}

	public int getFuelCapacity() {
		return this.fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public boolean getIsMiniFridge() {
		return this.isMiniFridge;
	}

	public void setIsMiniFridge(boolean isMiniFridge) {
		this.isMiniFridge = isMiniFridge;
	}

	@Override
	public String toString() {
		return "RocketShip [name=" + name + ", numOfRockets=" + numOfRockets + ", fuelCapacity=" + fuelCapacity
				+ ", isMiniFridge=" + isMiniFridge + "]";
	}

	
	
	
	
}
