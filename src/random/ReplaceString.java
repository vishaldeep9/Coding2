package random;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("write username");
		String userName = sc.nextLine();
		if (userName.length() < 3) {
			System.out.println("userName should be more that 3 character");
		} else {

			String template = "Hello <<UserName>>, How are you?";
			String replace = template.replace("<<UserName>>", userName);
			System.out.println(replace);
		}
		sc.close();
	}

}
