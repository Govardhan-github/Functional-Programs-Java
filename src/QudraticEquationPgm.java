//Importing Java util Scanner Package
import java.util.Scanner;
public class QudraticEquationPgm {
	/*
	 * Ask User To Find The Roots Of Equation
	 */
	public static void main(String[] args) {
		 double delta,r1,r2;
		 //Welcome Message Added
		 System.out.println("Welcome To The Roots Equation Program ");  
		 //Ask User To Enter The Values
		 Scanner input = new Scanner(System.in);  
		 System.out.print("Enter the value of a: ");  
		 double a = input.nextDouble();  
		 System.out.print("Enter the value of b: ");  
		 double b = input.nextDouble();  
		 System.out.print("Enter the value of c: ");  
		 double c = input.nextDouble(); 
		 //Calculating The Delta Equation
		 delta =  b * b - 4.0 * a * c;   
		 System.out.println("Enter : " +delta);  
		 //Calculating The Roots Of Equation 
		 r1 = (-b + Math.sqrt((delta)) / (2 * a));  
		 r2 = (-b - Math.sqrt(delta)) / (2.0 * a);  
		 System.out.println("The roots are " + r1 + " and " + r2);  
	}  
}
