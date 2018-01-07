package chapter2;

public class MinInYear {
	public static void main (String [] args) {
		int year = 1;
		int day = 365;
		int hoursInDay = 24;
		int minPerHour = 60;
		
		int mins = year*day*hoursInDay*minPerHour;
		System.out.println("There are " + mins + " minutes in a year.");
		
	}
}
