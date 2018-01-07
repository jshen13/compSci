package chapter4;
import java.util.Random;

public class RandomRadiusSphere {
	public static void main(String [] arg) {
		Random generator = new Random();
		int radius = generator.nextInt(20)+1;
		System.out.println("The random radius is: " + radius);
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
		System.out.println("The volume of the sphere is: " + volume);
	
	}
}
