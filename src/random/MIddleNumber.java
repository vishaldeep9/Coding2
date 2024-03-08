package random;

import java.util.Scanner;

public class MIddleNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write 3 number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		 int middle=b>a&&b<c?b:a>b&&a<c?a:c;
		 System.out.println(middle+" is the middle number out of 3 number");
		 sc.close();
	}
	
}
