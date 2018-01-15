package semester1Project;
import java.util.*;
public class ChatBotMain {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		String reply = "Hi, my name is Chatbot";
		String user = "";
		while (user.equalsIgnoreCase("goodbye") || user.equalsIgnoreCase("bye")  ){
			ChatBot myChatBot = new ChatBot();
			System.out.println(reply);
			user = scan.nextLine();
			reply = myChatBot.findReply(user);
		}
		System.out.println("Bye!");
	}
}
