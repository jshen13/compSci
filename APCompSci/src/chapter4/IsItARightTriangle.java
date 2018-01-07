package chapter4;
import java.util.Scanner;

public class IsItARightTriangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first side of triangle: ");
		int side1 = scan.nextInt();
		System.out.print("Input second side of triangle: ");
		int side2 = scan.nextInt();
		System.out.print("Input third side of triangle: ");
		int side3 = scan.nextInt();
		if (side3 == Math.max(Math.max(side1, side2), side3)) {
			double sides = (Math.pow(side1,2)+ Math.pow(side2,2));
			double hypo = Math.pow(side3, 2);
			if (sides == hypo) {
				System.out.println("It is a right triangle");
			} else {
				System.out.println("It is not a right triangle");
			}
		} else if ( side2 == Math.max(Math.max(side2, side3), side1)) {
			double sides = (Math.pow(side1,2)+ Math.pow(side3,2));
			double hypo = Math.pow(side2, 2);
			if (sides == hypo) {
				System.out.println("It is a right triangle");
			} else {
				System.out.println("It is not a right triangle");
			}
		} else {
			double sides = (Math.pow(side2,2)+ Math.pow(side3,2));
			double hypo = Math.pow(side1, 2);
			if (sides == hypo) {
				System.out.println("It is a right triangle");
			} else {
				System.out.println("It is not a right triangle");
			}
		}
		
	}
}
