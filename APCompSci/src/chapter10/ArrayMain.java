package chapter10;
import java.util.Scanner;

//Project 10-3, 10-4, 10-5
public class ArrayMain {
	public static void main (String[] args){
		Array array1 = new Array();		
		Scanner scan = new Scanner(System.in);
		double [] theArray = new double [10];
		for (int i = 0; i < 10; i++){
			System.out.print("Input your number (" + (i+1)  + "): ");
			double number = scan.nextDouble();
			theArray[i] = number;
		}
		System.out.println("\nMode: " + array1.findMode(theArray));
		double median = array1.findMedian(theArray);
		System.out.println("Median: " + median);
		array1.displayTable(theArray);
		
		
	}
}
