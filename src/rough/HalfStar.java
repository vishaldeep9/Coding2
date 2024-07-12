package rough;

import java.util.Scanner;

public class HalfStar {

	public static void main(String[] args) {
		System.out.println("write the size of pattern");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
		sc.close();
	}
}
