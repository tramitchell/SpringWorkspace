package com.revature.mdarrays;

public class TwoDArray {

	public static void main(String[] args) {
//		int[][] twoD  = new int[4][5];
//		
//		int i,j,k = 0;
//		for(i = 0; i < 4; i++)
//		{
//			for(j = 0; j < 5; j++)
//			{
//				twoD[i][j] = k;
//				k++;
//			}
//		}
//		
//		for(i = 0; i < 4; i++)
//		{
//			for(j = 0; j < 5; j++)
//			{
//				System.out.print(twoD[i][j] + " ");
//			}
//			System.out.println();
//		}

		
		
		int[][] array = new int[3][6];	
		int data = 0;
		for(int a = 0; a < array.length; a++)
		{
			for(int b = 0; b < array[a].length; b++)
			{
				array[a][b] = data;
				System.out.print(array[a][b] + "\t");
				data++;
			}
			System.out.println();
		}
		
		
	}
}
