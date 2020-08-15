package siva;

public class Day2_Assignment {
	
	public static void main(String[] args) {
		
		// Day2 Assignments
		float height_result,weight_result;
		
		//Sample1
		System.out.println("*****Sample Output 1*****");
		height_result=heightconverter(5,11);
		System.out.println("Height in centimeters "+height_result);
		
		weight_result=weightconverter(60);
		System.out.println("Weight in pounds "+(int)weight_result);// type cast to 'int' as per your sample output
		
		//Sample2
		System.out.println("\n*****Sample Output 2*****");
		height_result=heightconverter(5,0);
		System.out.println("Height in centimeters "+height_result);
		
		weight_result=weightconverter(101);
		System.out.println("Weight in pounds "+weight_result);
		
		//Sample3
		System.out.println("\n*****Sample Output 3*****");
		height_result=heightconverter(6,15);
		System.out.println("Height in centimeters "+height_result);
		
		weight_result=weightconverter(125);
		System.out.println("Weight in pounds "+weight_result);
		
		
	}
	// Height converter from Feet/Inch to Centimeters
	static float heightconverter(int heightFeet, int heightInch) {
	float height = (float)(((heightFeet*12)+heightInch)*2.54); // Convert height into centimeter unit
	return(height);
			
	}
	
	// Weight Conversion from Kilograms to Pounds
	static float weightconverter(int weight) {
	float weightP = (float)(weight*2.2); // Convert weight into pounds unit
	return(weightP);
	
	}
}
