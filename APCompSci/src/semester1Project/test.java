package semester1Project;
import java.util.*;

public class test {
	public static void main (String [] args){
		//Scanner scan = new Scanner (System.in);
		int words = 0; 
		//System.out.println("What is your string?");
		//String test = scan.nextLine();
		String test = "Hello my name";
		Scanner scanstring = new Scanner(test);
		String [] test122 = new String [10];
		while (scanstring.hasNext()){
			test122 [1] += scanstring.next();
			words++;
			System.out.println("hi");
		}
		System.out.println(words);
	}
}
