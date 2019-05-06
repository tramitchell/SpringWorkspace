package com.revature.example;

public class Buzzzzzzzzzz
{
	// Make an Array
	// Check through the list of numbers to see
	// which ones are divisible by 3 or 5
	// which ones are divisible by both 3 and 5
	// if 3 print "Fizz"
	// if 5 print "Buzz"
	// if 3 and 5 print "Fizz Buzz"
	// if not divisible by either print the actual number

	public static void main(String[] args)
	{

		int[] fizzArray = new int[100];
		for (int i = 0; i < 100; i++)
		{
			fizzArray[i] = i + 1;
		}

		for (int i = 0; i < 100; i++)
		{
			if ((fizzArray[i] % 3 == 0) && (fizzArray[i] % 5 == 0))
			{
				System.out.println("Fizz Buzz");

			} else if (fizzArray[i] % 3 == 0)
			{
				System.out.println("Fizz");

			} else if (fizzArray[i] % 5 == 0)
			{
				System.out.println("Buzz");

			} else
			{
				System.out.println(fizzArray[i]);
			}

		}

	}

}
