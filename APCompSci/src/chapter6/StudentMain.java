package chapter6;
import java.util.Scanner;
//6-02
public class StudentMain {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		String name = "";
		int test;
		System.out.print("What is the Student's name? ");
		name = scan.nextLine();
		s1.setName(name);
		System.out.print("What is the first test score: ");
		test = scan.nextInt();
		s1.setScore(1, test);
		System.out.print("What is the second test score: ");
		test = scan.nextInt();
		s1.setScore(2, test);
		System.out.print("What is the third test score: ");
		test = scan.nextInt();
		s1.setScore(3, test);
		System.out.println("Student Stats \n" + s1);
	}
}
