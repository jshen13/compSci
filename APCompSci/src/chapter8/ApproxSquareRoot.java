package chapter8;
import java.util.Scanner;

//Project 8-1
public class ApproxSquareRoot {
	public static void main (String [] args){
		double number, guess = 1, iterations;
		Scanner scan = new Scanner(System.in);
		String again = "yes";
		System.out.println("Approximating Square Root Program");
		while (again.equalsIgnoreCase("yes")){
			System.out.print("What number do you want to approximate the square root of: ");
			number = scan.nextDouble();
			System.out.print("How many approximations to compute square root: ");
			iterations = scan.nextDouble();
			for (int i = 1; i<= iterations; i++){
				guess = (guess + (number / guess))/2;
			}
			System.out.println("The approximation of the square root is: " + guess);
			System.out.println("Do you want to run the program again?(yes/no)");
			again = scan.next();
		}
		System.out.println("Program Terminated");
		
	}
}
