package random;

import java.util.Scanner;

public class LargestOf3Digit {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

	System.out.println("write 1st Digit");

	int a=sc.nextInt();

	System.out.println("write 2nd Digit");

	int b=sc.nextInt();

	System.out.println("write 3rd Digit");

	int c=sc.nextInt();

	 

	int largest=a>b&&a>c?a:b>c?b:c;

	System.out.println("Largest of These 3 Digit is "+ largest);

	sc.close();
}
}
