package random;

import java.util.Scanner;


public class Decimal2Binary {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write decimal....! ");
		int dec = sc.nextInt();
		System.out.println("binary is --->"+ decToBin(dec));
		
		sc.close();
	}
	
	static  String decToBin(int dec) {
		String bin ="";
		do {
			int b =dec%2;
			bin=b+bin;
			 dec =dec/2;
		}
		while(dec!=0);
		return bin;
	}
}
