package strings;

import java.util.Scanner;

public class OccuranceOfChar {
	public static void main(String[] args) {
		System.out.println("Type word ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		//removing all non alphanumeric character
	    string = string.replaceAll("[^a-zA-Z]","");
	    
		System.out.println(string);
	
		//ASCII, here index value= ASCII value
		int[] count=new int[256];
		
		//When you use str.charAt(i) as an index in the count array, the character is implicitly converted to its ASCII value. 
		//For example, if str.charAt(i) is 'a', it is converted to the ASCII value 97.
	    //For i = 0, str.charAt(0) is 'h'. The ASCII value of 'h' is 104.count[104]++ increments count[104] by 1.
	                                                              
		for(int i=0;i<string.length();i++) {
			//Increasing the value of that index
			count[string.charAt(i)]++;
			}
			
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println("occurance of "+(char)i+" : "+count[i]);
			}
		}
		
		sc.close();
	}

}
