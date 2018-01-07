package chapter3;
import java.util.Scanner;

public class SphereDiameterCircumferenceVolumeSA {
	public static void main (String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("Diameter, Circumference, Surface Area, and Volume of a Sphere");
		System.out.print("Input the radius of the sphere: ");
		double radius = scan.nextDouble();
		double diameter = radius*2;
		double circumference = diameter*Math.PI;
		double surfaceArea = 4*Math.PI*radius*radius;
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
		System.out.println("The diameter of the sphere is: " + diameter);
		System.out.println("The circumference of the sphere is: " + circumference);
		System.out.println("The surface area of the sphere is: " + surfaceArea);
		System.out.println("The volume of the sphere is: " + volume);
	}
}
