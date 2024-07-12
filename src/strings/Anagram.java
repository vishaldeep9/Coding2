package strings;

import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Type any string as an input........ ");
	String string = sc.nextLine();
	 String temp=string;//storing original value of input string 
	String empty="";//for modifying/reversing input string
	for(int i=string.length()-1;i>=0;i--) {
		empty=empty+string.charAt(i);
	}
	System.out.println(empty);
	
	if(temp.equals(empty)) {
		System.out.println("This is anagram");
	}
	else {
		System.out.println("this is not anagram");
	}
}
}
