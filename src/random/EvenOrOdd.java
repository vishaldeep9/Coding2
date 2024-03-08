package random;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("type number");
		int n = sc.nextInt();
		String number=n%2==0?"Even":"Odd";
		System.out.println(number);
		sc.close();
	}

}
