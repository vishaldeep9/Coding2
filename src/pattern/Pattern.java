package pattern;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write last digit");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
		sc.close();
	}

}
