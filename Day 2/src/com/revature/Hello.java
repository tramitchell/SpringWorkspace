package com.revature;

import com.revature.blueprint.RocketShip;

public class Hello {
		
	public static void main(String[] args) {
		System.out.println("Goodbye, Earth");
		RocketShip rs1 = new RocketShip("Steve",3000,7,true);
		System.out.println(rs1.getName());
		rs1.setName("StillSteve");
		System.out.println(rs1.toString());
		
		//Date d1 = new Date(1L); //uses java.sql.date
		//java.util.Date d2 = new Date(2L); //uses java.util.date
	}
	
	
	
	
}
