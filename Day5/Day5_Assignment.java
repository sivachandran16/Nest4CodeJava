import java.util.Scanner;
public class Day5_Assignment {
	public static void main(String[] args) {
		// Day 5 Assignment
		Scanner userin = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inp_num = userin.nextInt();
		int i=0, j=0;
	for ( i = 0; i < inp_num; i++) {

            for ( j = 0; j <= i ; j++) {
                String star = "*";
                System.out.print(star );
            }
            System.out.print("\n");

        }
		
	for (  i = 0; i <inp_num; i++) {

            for ( j = i; j <inp_num-1 ; j++) {
                String star = "*";
                System.out.print(star );
            }
            System.out.print("\n");

        }
		
    }
	

}
