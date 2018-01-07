package chapter3;
import java.util.Scanner;

public class WeeklyPay {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		double hourlyWage;
		double workHours;
		double overtimeHours;
		System.out.println("Weekly Pay Calculator");
		System.out.print("Input the hourly Wage: ");
		hourlyWage = scan.nextDouble();
		System.out.print("Input the regular hours worked: ");
		workHours = scan.nextDouble();
		System.out.print("Input the total overtime hours worked: ");
		overtimeHours = scan.nextDouble();
		double weeklyPay = (hourlyWage*workHours) + (hourlyWage*1.5*overtimeHours);
		System.out.println("Your weekly pay is $" + weeklyPay);
		
	}
}
