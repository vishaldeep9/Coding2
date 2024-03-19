package random;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write string");
		String input = sc.nextLine();
		
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse+=input.charAt(i);
		}
		System.out.println(reverse);
		sc.close();
	}

}
