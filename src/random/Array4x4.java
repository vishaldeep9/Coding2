package random;

import java.util.Scanner;

public class Array4x4 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16 integers to fill the 4x4 array");

		// initializing the array
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		// printing the array
		System.out.println("the 4x4 array is: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		int rightDiagonal = 0;
		int leftDiagonal = 0;
		// from right to left
		for (int i = 0; i < 4; i++) {
				rightDiagonal += array[i][3 - i];
				leftDiagonal += array[i][i];	
		}
		System.out.println("rightDiagonal "+rightDiagonal);
		System.out.println("leftDiagonal "+leftDiagonal);

		sc.close();
	}
}
