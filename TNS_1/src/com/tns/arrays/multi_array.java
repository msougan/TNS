package com.tns.arrays;

public class multi_array {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][4];
		
		for(int i=0;i<4;i++)  // for row
		{
			for(int j=0;j<4;j++) // for column
			{
				arr[i][j] = (int)(Math.random()*10);
			}
		}
		
		for(int i=0;i<4;i++) 
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println(); 
		}

	}

}
