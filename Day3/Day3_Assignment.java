import java.util.Scanner;
public class Day3_Assignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter 1st String: ");
		String Input1 = scan.next();
		System.out.print(" Enter 2nd String: ");
		String Input2 = scan.next();
		
		//System.out.println(" 1st String Entered: "+Input1);
		//System.out.println(" 2nd String Entered: "+Input2);
		
		String Sample1 = swap1(Input1, Input2);
		System.out.println(" After Swapping String1: "+Sample1);
		
		String Sample2 = swap2(Input1, Input2);
		System.out.println(" After Swapping String2: "+Sample2);
	}
	
	static public String swap1(String str1, String str2) {
	    
		int len1=str1.length();
		int len2=str2.length();
		
	    String mid1 = str1.substring(2, str1.length()-2);
	    String mid2 = str2.substring(2, str2.length()-2);
	    String first1 = str1.substring(0, 2);
	    String first2 = str2.substring(0, 2);
	    String last1 = str1.substring(len1-2, len1);
	    String last2 = str2.substring(len2-2, len2);
	   

	    return last2+mid1+first2;
	}
	
	static public String swap2(String str1, String str2) {
	   
		int len1=str1.length();
		int len2=str2.length();
		
	    String mid1 = str1.substring(2, str1.length()-2);
	    String mid2 = str2.substring(2, str2.length()-2);
	    String first1 = str1.substring(0, 2);
	    String first2 = str2.substring(0, 2);
	    String last1 = str1.substring(len1-2, len1);
	    String last2 = str2.substring(len2-2, len2);
	   

	    return last1+mid2+first1;
	}
	
}
