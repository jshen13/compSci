package chapter2;

import java.util.Scanner;


public class KmToNmi {
	public static void main(String [] args) {
		double kilometer;
		double nm;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input number of kilometers: ");
		kilometer = scan.nextDouble();
		nm = (5400.0/10000.0)*kilometer;
		System.out.println("The equivalent in nautical miles is " + nm);
		
		
		
	}
}
