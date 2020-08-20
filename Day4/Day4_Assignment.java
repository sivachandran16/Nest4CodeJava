import java.util.Scanner;

public class Day4_Assignment {
	
	public static void main(String[] args) {
		// Day 4 Assignment
		Scanner scan = new Scanner(System.in);
		System.out.print(" Enter a number: ");
		long number = scan.nextLong();
		int digit,digit1=0;
		int odd_count = 0, even_count=0;
		while (number !=0) 
		{
			digit= (int)Math.abs(number % 10); // taking absolute to remove negative sign
		    System.out.println(digit);
		    number = number / 10;
		    if(digit%2==0) {
		    	even_count+=1;
		    }
		    else
		    {
		    	odd_count+=1;
		    }
		    		   
		}
		 System.out.println(" No of odd number's in a given number is : "+odd_count);
		 System.out.println(" No of even number's in a given number is : "+even_count);
	}

}
