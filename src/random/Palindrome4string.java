package random;

import java.util.Scanner;

public class Palindrome4string {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a string: ");
//		String inputString = scanner.nextLine();
//
//		int[] charCount = new int[26];
//
//		for (int i = 0; i < inputString.length(); i++) {
//			charCount[inputString.charAt(i) - 'a']++;
//			// The method `charAt(i)` is used to return the character at the specified index `i` in a string.
//			// This subtraction gives an integer value that represents the index of the
//			// character in the range of 0 to 25, where 'a' corresponds to 0, 'b' corresponds to 1, and so on.	
//		}
//
//		int oddCount = 0;
//		char oddChar = ' ';
//		for (int i = 0; i < 26; i++) {
//			if (charCount[i] % 2 != 0) {
//				oddCount++;
//				oddChar = (char) ('a' + i);
//			}
//		}
//
//		if (oddCount > 1) {
//			System.out.println("Palindrome not possible.");
//		} else {
//			String palindrome = "";
//			for (int i = 0; i < 26; i++) {
//				for (int j = 0; j < charCount[i] / 2; j++) {
//					palindrome += (char) ('a' + i);
//				}
//			}
//			String reversePalindrome = new StringBuilder(palindrome).reverse().toString();
//			if (oddCount == 1) {
//				palindrome += oddChar;
//			}
//			palindrome += reversePalindrome;
//			System.out.println("Palindrome possible: " + palindrome);
//	}
//		scanner.close();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("write string");
		String input = sc.nextLine();
		
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse+=input.charAt(i);
		}
		if(input.equals(reverse)==true) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("this is not palindrome");
		}
		sc.close();

	}
}
