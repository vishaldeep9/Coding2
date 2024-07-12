package rough;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		System.out.println("write the size of square");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int x=1;
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size; j++) {
				System.out.print(x+" ");
				x++;
				if(x==10) {
					x=1;
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
