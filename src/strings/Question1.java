package strings;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write string");
		java.lang.String input = sc.nextLine();
		
	  //s3t1z5
	  //ssstzzzzz
		
		java.lang.String string="";
		
		for( int i =0;i<input.length()-1;i=i+2) {
			
			char number = input.charAt(i+1);	

		//	int parseInt = Integer.parseInt(number);//this is for string
			int numericValue = Character.getNumericValue(number);//this is for character
		//	System.out.print(numericValue+"");
			
			char charAt = input.charAt(i);
			string=string+String.valueOf(charAt).repeat(numericValue);
			//string=string+input.charAt(i);
		}
		System.out.print("\n"+string);
		}
	}

