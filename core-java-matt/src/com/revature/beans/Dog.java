package com.revature.beans;


public class Dog {
	
	private int numberOfLegs;
	private String name;
	private boolean sex;
	private double weight;
	
	public Dog() {
	}
	
	public Dog(int numberOfLegs, String name, boolean sex, double weight) {
		this.numberOfLegs = numberOfLegs;
		this.name = name;
		this.sex = sex;
		this.weight = weight;
	}
	
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}	
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String toString() {
		return 	"Dog" +
				"\nnumberOfLegs: " + numberOfLegs + 
				"\nname: " + name + 
				"\nsex: " + sex + 
				"\nweight: " + weight;
	}
			
			
			
			
			
}
