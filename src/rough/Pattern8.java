package rough;

import java.util.Scanner;

public class Pattern8 {
	
	public static void main(String[] args) {
		System.out.println("write the size of square");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i=size;i>=0;i--) {
			
			for(int j=0;j<size;j++) {
				System.out.print((char)(i+65)+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
