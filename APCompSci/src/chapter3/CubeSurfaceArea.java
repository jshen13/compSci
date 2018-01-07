package chapter3;
import java.util.Scanner;

public class CubeSurfaceArea {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int edge;
		System.out.println("Surface Area of a Cube");
		System.out.print("Input length of edge of cube: ");
		edge = scan.nextInt();
		int surfaceArea = edge*edge*6;
		System.out.println("The surface area of the cube is: " + surfaceArea);
	}
}
