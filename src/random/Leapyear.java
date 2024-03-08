package random;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("write year");
		int a = sc.nextInt();
		
		if( a%4==0 && a%100!=0 || a%400==0) 
			System.out.println(a+ " is leap year");
		else System.out.println(a+" is not leap year");
		sc.close();
	}
}
