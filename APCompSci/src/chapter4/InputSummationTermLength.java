package chapter4;
import java.util.Scanner;

//4-000
public class InputSummationTermLength {
	public static void main(String[] args){
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number you want the summation (2i^2+1) to start at:");
		int start = scan.nextInt();
		System.out.print("Input the term you want the summation to stop at: ");
		int end = scan.nextInt();
		if (start>end){
			System.out.println("The ending term must be greater than the starting term");
		} else {
			while (start <= end){
				sum += 2*start*start+1;
				start++;
			}
		System.out.println("The summation for this function is: " + sum);
		}
		
	}
}
