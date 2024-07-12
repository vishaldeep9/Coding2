package array;

import java.util.Scanner;

public class HIghestNeighbourArray {
	public static void main(String[] args) {

		System.out.println("type the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];

		// inilitize array
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();	
		}

		// print array
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println(" ");

		// traverse the index from second to second last element
		for (int i = 1; i < size - 1; i++) {

			if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
				System.out.print(array[i] + " ");

			}
		}

		if (array[0] > array[1]) {
			System.out.print(array[0]);
		}
		if (array[size - 1] > array[size - 2]) {
			System.out.print(array[size - 1]);
		}
sc.close();
	}
}
