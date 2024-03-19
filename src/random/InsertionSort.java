package random;

public class InsertionSort {
	public static void printInsertion(int[] ar) {
		
		for(int i=0;i<ar.length;i++) {
			
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int [] ar= {7,8,3,1,2};
		
		for(int i=1;i<ar.length;i++) {
			
			int current=ar[i];
			
			int j=i-1;
			
			while(j>=0 && current<ar[j]) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=current;
		}
		printInsertion(ar);
	}

}
