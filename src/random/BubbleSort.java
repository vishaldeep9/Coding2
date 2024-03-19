package random;

import java.util.Scanner;

public class BubbleSort {

	public static void printBubble(int[] ar ) {
		for(int i=0;i<ar.length;i++) {
			
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int[] ar=new int[5];
		System.out.println("write " + ar.length +" array");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();	
		}
		
//		int[] ar= {7,8,1,2,3};
//		int[] ar= {7,8,9,1,2};
		
		//for outer loop
		for(int i=0;i<ar.length-1;i++) {
			
			for(int j=0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		
		printBubble(ar);
		
	}
}
