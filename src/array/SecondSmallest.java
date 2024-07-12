package array;

import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write the length 0f an array");
		int sizeOfArray = sc.nextInt();
		int[] array = new int[sizeOfArray];
        
		for (int i = 0; i < array.length; i++) {
			System.out.print("write array for index "+i+"\n");
			array[i] = sc.nextInt();
		}
   StringBuilder builder= new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			//System.out.print(array[i]+ " ");
			builder.append(array[i]).append(" ");
            
		}
		     String string = builder.toString();
		     System.out.println("[ "+string+"]");
	}
}
