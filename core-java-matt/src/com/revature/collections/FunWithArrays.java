package com.revature.collections;

import com.revature.blueprint.RocketShip;

public class FunWithArrays {
	
	public static final String STARS = "****************************************************************************************************";
	
	public static void main(String[] args) {
		/*
		 * java arrays are fixed length/type
		 * 
		 */
		
		// int array with 5 elements
		int[] myArray = new int[5];
		myArray[3] = 3;
		System.out.println("myArray[1] is " + myArray[1]);
		System.out.println(myArray);
		
		System.out.println("myArray contents:\n");
		for(int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);
		System.out.println(STARS);
		
		//Array literal
		int[] myArray2 = {1,3,4,5,2,5,7,6,8,9,2004}; //11 elements
		
		// take each element and multiply by 15 and then print
		for(int i = 0; i < myArray2.length; i++)
		{
			System.out.println(myArray2[i] * 15);
		}
		
		System.out.println(STARS);
		stringModifier();
		
		System.out.println(STARS);
		RocketShip[] rocketShipArray = new RocketShip[27];
		RocketShip rs1 = new RocketShip("Fred", 20_001, 9_001, false);
		RocketShip rs2 = new RocketShip("Stuart", 17, 7, true);
		RocketShip rs3 = new RocketShip("Kelly", 2, 10, false);
		RocketShip rs4 = new RocketShip("Ian", 1, 100, true);
		RocketShip rs5 = new RocketShip("Nick", 3, 2, false);
		RocketShip rs6 = new RocketShip("Janie", 5, 15, false);
		RocketShip rs7 = new RocketShip("Daniel", 9, 200, true);
		rocketShipArray[0] = rs1;
		rocketShipArray[1] = rs2;
		rocketShipArray[3] = rs3;
		rocketShipArray[10] = rs4;
		rocketShipArray[11] = rs5;
		rocketShipArray[20] = rs6;
		rocketShipArray[26] = rs7;
		System.out.println("The fuel capacity for rs3 is: " + rocketShipArray[3].getFuelCapacity());

		// print off a RocketShip if it does not have a minifridge, 
		// or the number of rockets is greater than 5
		System.out.println(STARS);
		
		
		for	(int i = 0;	i < rocketShipArray.length; i++)
			if	(
					rocketShipArray[i] != null && 
					(!rocketShipArray[i].getIsMiniFridge() || rocketShipArray[i].getNumOfRockets() > 5)
				)
					System.out.println(rocketShipArray[i]);
		
	
	
	}
	
	//make a string array and then add something to those elements
	// and then print them off backwards
	public static void stringModifier() {
		String[] stringArr = {"joel.richardson","tucker.mitchell","richelle.ross"};
		
		for(int i = stringArr.length - 1; i >= 0; i--)
		{
			stringArr[i] = stringArr[i] + "@revature.com";
			System.out.println(stringArr[i]);
		}
	}
}
