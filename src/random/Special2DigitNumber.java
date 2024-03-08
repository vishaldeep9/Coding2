package random;

import java.util.Scanner;

public class Special2DigitNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write 2digit number");
		int n = sc.nextInt();
		int a = n % 10;
		int b = n / 10;

		int sum = a + b + (a * b);
		if (sum == n)
			System.out.println(n + " is special digit number");
		else
			System.out.println(n + " is not special digit number ");
		sc.close();
	}
}
