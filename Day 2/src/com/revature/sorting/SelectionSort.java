package com.revature.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {3, 2, 1, 4, 1};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	
	public static void sort(int[] arr)
	{
		for(int border = 0; border < arr.length - 1; border++)
		{
			// find min value of unsorted section
			int indexOfMin = border;
			int min = arr[border];
			
			
			for(int runner = border; runner < arr.length; runner++)
				if(arr[runner] < min)
				{
					indexOfMin = runner;
					min = arr[indexOfMin];			
				}
			
			
			// swap current minimum and the border element
			int temp = arr[border];
			arr[border] = arr[indexOfMin];
			arr[indexOfMin] = temp;
		}
	}
}
