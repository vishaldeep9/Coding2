package array;

public class MaximumMinimum {
	public static void main(String[] args) {
		int[] array = {9, 2,3,4,5,6};
		
		//printing existing array
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		//assume 
		int max= array[0];
		int min=array[0];
		System.out.println("");
		
		//finding max value in array
		for (int i=1;i<array.length;i++) {	
			if(array[i]>max) {
				max=array[i];
			}	
		}
		System.out.println("max in this array is "+max);
		
		//finding min value in array
				for (int i=1;i<array.length;i++) {	
					if(array[i]<min) {
						min=array[i];
					}	
				}
				System.out.println("min in this array is "+min);
		
		
		
	}

}
