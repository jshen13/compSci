package chapter4;
import java.util.Scanner;

//Project 4-5
public class ApproxPi {
	public static void main (String[]args){
		Scanner scan = new Scanner(System.in);
		double pi=0;
		System.out.print("Input how many iterations you want the approximation to do: ");
		int terms = scan.nextInt();
		if (terms <= 0) {
			System.out.println("Please input a positive term number");
		} else {
		for (int i =1; i <= terms; i++) {
			pi +=(Math.pow(-1, i+1)*(1.0/(2*i-1)));
		}
		pi *= 4;
		System.out.println("The approximation is: " + pi);
		}
		
	}
}
