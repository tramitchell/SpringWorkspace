package com.revature.flow;

public class LoopExample {

	public static void loopy(int num) {
		int result = 0;
		if(num > 0) 
		{
			for(int i = 0; i < num; i++)
			{
				int j = 0;
				while(j < num)
				{
					int k = 0;
					do
					{
						result++;
						k++;
					}
					while(k < num);
					j++;
				}
			}
		}
		switch(result % 2) {
		case 0:
			System.out.println(result + " is even");
			break;
		case 1: 
			System.out.println(result + " is odd");
			break;
		default:
			System.out.println('?');
			break;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		//if switch for while do while
		loopy(3);
		
		
		
		
	
		
		
		
		
	}	
}
