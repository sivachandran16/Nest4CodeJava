package siva;

public class Day1_Assignment {
	public static void main(String[] args) {
	// Assignment Day1 - Restaurant Bills
		
		// Declaring Variables
        double Final_Amount = 0, Total = 0;
        double Idly = 25.5, Pongal = 25.25, Dosa = 50.5, Coffee = 40.75;
        double Tax = 18;
        
        // Header
        System.out.println("Java Fundamentals - Day1 Assignment\n");
        System.out.println("Serial"+"\t ITEM"+"\t\tPrice");
        
        //Idly
        System.out.print("1."+"\t Idly"+"\t\t");
        System.out.println(Idly);
        
        //Pongal
        System.out.print("2."+"\t Pongal"+"\t\t");
        System.out.println(Pongal);
        
        //Dosa
        System.out.print("3."+"\t Dosa"+"\t\t");
        System.out.println(Dosa);
        
        //Coffee
        System.out.print("4."+"\t Coffee"+"\t\t");
        System.out.println(Coffee);
        
        //Calculations
        Total = Idly+Pongal+Dosa+Coffee;
        Tax = (Tax/100)*Total;
        Final_Amount = Total + Tax;
        
        System.out.print("\t18% Tax\t\t");
        System.out.println(Tax);
        
        System.out.print("\tNet Payable\t");
        System.out.println(Math.round(Final_Amount));  // Taken Round off   
       
        
	}

}
