package semester1Project;
import java.util.*;

public class ChatBot {
	public String findReply (String userInput){
		int words = 0;
		Random generator = new Random();
		String reply = "";
		//run switch
		 
		Scanner scannerString = new Scanner(userInput);
		//count words
		while (scannerString.hasNext()){
			scannerString.next();
			words++;
		}
		Scanner scannerString2 = new Scanner(userInput);

		String [] wordsArray = new String[words];
		for (int i = 0; i < words; i++){
			wordsArray[i] = scannerString2.next();
			wordsArray[i] = wordsArray[i].toLowerCase();
		}
		//for each word check if it matches a keyword
		//I like zeek = why do you like Zeek
		//I want food = Would you really be happy if you had food
		//sister, brother, mother, father = Tell me more about your family
		//cat dog = tell me more about your pets 
		//no, I'm, , because ,yes, happy, sad, mad, thank you, how old are you
		
		int elementNum = 0;
		boolean cont = false;
		int randomizedNum = 0;
		for (String element: wordsArray){
			switch (element){
// greetings
			case "hi" : 
			case "hello":
			case "hey":
				randomizedNum = generator.nextInt(3);
				String[] greetingResponses = {"How are you?", "What's up?", "How's it going?"};
				reply = greetingResponses[randomizedNum];
				cont = true;
				break;
			case "the":
				if (elementNum == words - 1 ){
					reply = "Finish your thought.";
					cont = true;
				} else if(wordsArray[elementNum+1].equals("sky")){
					reply = "Wow you're basic";
					cont = true;
				} else if(wordsArray[elementNum+1].equals("roof")){
					reply = "Wow you're basic";
					cont = true;
				}
				break;
			case "thanks":
			case "thank":
				reply = "You're welcome";
				cont = true;
				break;
//family
			case "father?":
			case "father":
			case "dad":
			case "dad?":
			case "mother?":
			case "mother":
			case "mom":
			case "mom?":
			case "brother":
			case "brother?":
			case "sister":
			case "sister?":
				reply =  "Tell me more about your family";
				cont = true;
				break;
//pet
			case "cat":
			case "dog":
			case "fish":
				reply = "Tell me more about your pets";
				cont = true;
				break;
//I, you, you're
			case "i":
				if (elementNum == words - 1){
					reply = "You what";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("want")){
					if (elementNum +1 == words - 1){
						reply = "what do you want";
						cont = true;
					} else if (wordsArray[elementNum+2].equals("you")){
						reply = "Wow, just hating me for no reason. Why do you hate me?";
						cont = true;
					} else {
					reply = "Would you really be happy if you had " + wordsArray[elementNum +2] ;
					if (!(elementNum +2 == words - 1)){
						reply += " " + wordsArray[elementNum +3];
					}
					cont = true;
					}
				} else if (wordsArray[elementNum+1].equals("like")){
					if (elementNum +1 == words - 1){
						reply = "What do you like?";
						cont = true;
					} else {
					reply = "Why do you like "  + wordsArray[elementNum + 2] ;
					if (!(elementNum +2 == words - 1)){
						reply += " " + wordsArray[elementNum +3];
					}
					cont = true;
					}
				} else if (wordsArray[elementNum+1].equals("hate")){
					if (elementNum+1 == words - 1){
						reply = "What do you hate?";
						cont = true;
					}
					else if (wordsArray[elementNum+2].equals("you")){
						reply = "Wow, just hating me for no reason. Why do you hate me?";
						cont = true;
					} else {
						reply = "Why do you hate that?";
						cont = true;
					}
				}
				break;
			case "you":
				if (elementNum == words - 1){
					reply = "I'm what";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("suck")){
					reply = "You suck more.";
					cont = true;
				} 
				break;
			case "you're":
				if (elementNum == words - 1){
					reply = "I'm what...";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("useless")){
					reply = "You're a waste of oxygen";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("bad")){
					reply = "You're even worse";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("stupid") || wordsArray[elementNum +1].equals("retarded")){
					reply = "What a waste of time, insulting a chatbot.";
					cont = true;
				}
				break;
//responses: ok, good, bad, yes, no,
			case "good" :
			case "great":
				reply = "That's great";
				cont = true;
				break;
			case "bad" :
			case "terrible":
				reply = "Aw that sucks. Why?";
				cont = true;
				break;
			case "ok":
				reply = "Alrighty then";
				cont = true;
				break;
			case "yes":
				reply = "Mhmm";
				cont = true;
				break;
			case "yeah":
				reply = "Wow you're so fun to talk to...";
				cont = true;
				break;
			case "no":
				reply = "Maybe you should answer more elaborately";
				cont = true;
				break;
			case "hate"://
				reply = "Why ";
				cont = true;
// questions how, what, why
			case "happened":
				reply = "What happened";
				cont = true;
				break;
			case "how":
				if (elementNum == words - 1){
					reply = "You tell me how";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("are")){
					if (elementNum+1 == words - 1){
						reply = "How are what?";
						cont = true;
					}else if (wordsArray[elementNum+2].equals("you") || wordsArray[elementNum+2].equals("you?") ){
						reply = "I'm doing alright for a program incapable of feelings";
						cont = true;
					} 
				} 
				break;
			case "what?":
			case "what":// finish
				if (elementNum == words - 1){
					reply = "Did I stutter?";
					cont = true;
				} else if (wordsArray[elementNum+1].equals("are")){
					if (elementNum +1 == words - 1){
						reply = "Finish your sentence";
						cont = true;
					} else if (wordsArray[elementNum + 2].equals("you")|| wordsArray[elementNum+2].equals("you?")){
						reply = "I'm ChatBot, a chatbot program made by Jeffrey";
						cont = true;
					} else {
					reply = "I'm not sure";
					cont = true;
					}
				} else {
					reply = "I don't know";
					cont = true;
				}
				break;
			case "why": //finish
			case "why?":
				reply = "Just cause";
				cont = true;
			
			default:
				randomizedNum = generator.nextInt(3);
				String [] defaultResponses = {"I don't understand", "That's cool",  "Cool story bro"};
				reply = defaultResponses[randomizedNum];
			}
			elementNum++;
			if (cont)
				break;
			
		}
		return reply;
	}
	
}
