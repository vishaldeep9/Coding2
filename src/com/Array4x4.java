package com;

import java.util.Scanner;

public class Array4x4 {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] array=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	
		int rightdiagonal=0;
	for(int i=0;i<size;i++) {
		rightdiagonal+=array[i][i];
	}
	int leftdiagonal=0;
	for(int i=0;i<size;i++) {
		leftdiagonal+=array[i][size-i-1];
	}
	
	System.out.println(rightdiagonal);
	System.out.println(leftdiagonal);
	sc.close();
	}
}
