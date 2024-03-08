package random;

import java.util.Scanner;

public class ValidateDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type dd");
		int dd = sc.nextInt();
		System.out.println("type mm");
		int mm = sc.nextInt();
		System.out.println("type yyyy");
		int yyyy = sc.nextInt();

		if (dd > 31 || dd < 1 || mm < 1 || mm > 12 || yyyy < 1) {
			System.out.println("Invalid");
		} else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 29) {
			System.out.println("Invalid");
		} else if (mm == 2 && dd > 29) {
			System.out.println("Invalid");
		} else if ((yyyy % 4 == 0 && yyyy % 100 != 0 || yyyy % 400 == 0) && dd > 28 &&mm==2) {
			System.out.println("Invalid");
		} else {
			System.out.println("........Enter Date is Valid.......");
		}
		sc.close();
	}
}
