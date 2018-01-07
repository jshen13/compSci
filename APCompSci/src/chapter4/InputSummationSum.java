package chapter4;
import java.util.Scanner;

//4-0000
public class InputSummationSum {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		int counter = 1;
		int sum = 0;
		System.out.print("What sum do you want the summation function(2i^2+1) to stop at: ");
		int userSum = scan.nextInt();
		if (userSum > 0 ) {
			while (userSum > sum){
				sum += 2*counter*counter+1;
				counter++;
			}
			System.out.println("The term that has a sum greater or equal to your inputed sum is " + (counter- 1));
		}else {
			System.out.println("Input a sum that is greater than 0");
		}
	}
}
