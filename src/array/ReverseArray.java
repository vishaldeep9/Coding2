package array;

public class ReverseArray {
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,};
		
		//printing existing array
				for(int i=0;i<array.length;i++) {
					System.out.print(array[i]+" ");
				}
				
				System.out.println("");
			
				//Reverse array
				for(int i=array.length-1;i>=0;i--) {
					
					System.out.print(array[i]+" ");
				}
				
	}

}
