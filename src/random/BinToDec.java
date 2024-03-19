package random;

import java.util.Scanner;

public class BinToDec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write binary....!");
		int bin = sc.nextInt();
		
		int dec=0; int p=1;
		do {
			
			 int a=bin%10;
			dec=dec+a*p;
			p=p*2;
			bin=bin/10;
		}
		while(bin!=0);
		System.out.println("decimal is -->"+ dec);
		sc.close();
	}

}
