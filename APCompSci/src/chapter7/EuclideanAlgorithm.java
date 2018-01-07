package chapter7;
import java.util.Scanner;

//Project 7-5
public class EuclideanAlgorithm {
	public static void main (String []args){
		Scanner scan = new Scanner(System.in);
		int bigger, remainder;
		System.out.print("Input your first number: ");
		int num1 = scan.nextInt();
		System.out.print("Input your second number: ");
		int num2 = scan.nextInt();
		if (num2 > num1){
			bigger = num2;
			num2=num1;
			num1=bigger;
		}
		while (num2 != 0){
		remainder = num1%num2;
		num1=num2;
		num2=remainder;
		}
		System.out.println("The GCD of the numbers is: " + num1);
	}
}
