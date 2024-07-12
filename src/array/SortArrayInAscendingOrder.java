package array;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
public static void main(String[] args) {
	int[] array = {9, 2,3,4,8,6};
	
//	//printing existing array
//	for(int i=0;i<array.length;i++) {
//		System.out.print(array[i]+" ");
//	}
	
	//printing array
	System.out.print(Arrays.toString(array)+" ");	
	
	//sorting
	bubbleSort(array);
	System.out.println(" ");
	//printing in sorting order
	System.out.println(Arrays.toString(array)+" ");
}

public static void bubbleSort(int[] array) {
	
	for(int i=0;i<array.length;i++) {
		for(int j=0;j<array.length-1;j++) {
			if(array[j]>array[j+1]) {
				int temp =array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
}
}
