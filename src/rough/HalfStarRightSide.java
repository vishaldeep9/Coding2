package rough;

import java.util.Scanner;

public class HalfStarRightSide {

	public static void main(String[] args) {
		System.out.println("write the size of pattern");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");	
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		sc.close();
	}

}
