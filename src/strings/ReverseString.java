package strings;

public class ReverseString {
	public static void main(String[] args) {
		String string ="welcome to java programing";
		System.out.print(string+"\n");
		
		String[] s= string.split(" ");
		String finalReverse="";
		
		//output: gnimargorp avaj ot emoclew =====> without split
//		for(int i=string.length()-1;i>=0;i--) {
//	      System.out.print(string.charAt(i)+"");		
//		}
		
		
//		//output: programing java to welcome =======> with split
//		for(int i=s.length-1;i>=0;i--) {
//	      System.out.print(s[i]+" ");		
//		}
		
		for(int i=s.length-1;i>=0;i--) {
			String reverseWord=s[i];
			finalReverse+=reverseWord+" ";
		}
		
		//output: emoclew ot avaj gnimargorp =========> with split
		finalReverse = finalReverse.trim();
		for(int i=finalReverse.length()-1;i>=0;i--) {
			System.out.print(finalReverse.charAt(i));
		}
		
	}

}
