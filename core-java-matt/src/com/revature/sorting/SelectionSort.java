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
		// border is an index that separates the sorted section 
		// of the array from the unsorted section
		
		for(int border = 0; border < arr.length - 1; border++)
		{
			// runner is an index that runs from the border index
			// up to the array's end in order to find the min value ( & its index)
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
