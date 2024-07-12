package array;

import java.util.Arrays;

public class KthSmallestNumber {
	public static void main(String[] args) {

		int[] array = { 7, 10, 4, 3, 20, 15 };
		System.out.print("input array :"+Arrays.toString(array) + " ");
		System.out.println("");
		bubbleSorting(array);
		System.out.println("Ascending order :"+Arrays.toString(array)+" ");
		
		int n=array.length;
		System.out.println("size of an array :"+n);
		
		for(int i=0;i<n;i++) {
			if(array[i]<n) {
				int index=array[i];
				System.out.println(index+"th smallest Number is "+array[index-1]);
			}
		}
		
		
	}

	public static void bubbleSorting(int[] array) {
		
        for(int i=0;i<array.length;i++) {
        	for(int j=0;j<array.length-1;j++) {
        		if(array[j]>array[j+1]) {
        			int temp=array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        }
	}
}
