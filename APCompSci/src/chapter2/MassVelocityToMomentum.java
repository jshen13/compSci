package chapter2;
import java.util.Scanner;

public class MassVelocityToMomentum {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the object's mass (in kilograms): ");
		double mass = scan.nextDouble();
		System.out.print("Input the object's velocity (in meters per second): ");
		double velocity = scan.nextDouble();
		double momentum = mass*velocity;
		System.out.println("The object's momentum is " + momentum);
		
	}
}
