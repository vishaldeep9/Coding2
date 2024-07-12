package array;

import java.util.Scanner;

public class Arrray4x4 {
public static void main(String[] args) {
	System.out.println("write the size of an array");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[][] array=new int[size][size];
	
	//creating 4*4 array
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			array[i][j]=sc.nextInt();
		}
	}
	
	//print array
	for(int i=0;i<size;i++) {
		for(int j=0;j<size;j++) {
			System.out.print(array[i][j]+ " ");
		}
		System.out.println(" ");
	}
	
	//printing left Diagonal sum 
	int leftSum=0;
	for(int i=0;i<size ;i++) {
		leftSum+=array[i][i];
	}
	System.out.println("left diagonal Sum = "+leftSum);
	
	//printing right Diagonal Sum
	int rightSum=0;
	for(int i=0;i<size ;i++) {
		rightSum+=array[i][size-1-i];
	}
	System.out.println("right diagonal Sum = "+rightSum);
	
	sc.close();
}
}
