package project7;

public class GolfScoreCardMain extends GolfScoreCard {
	public static void main (String [] args){
		GolfScoreCard myScore = new GolfScoreCard();
		System.out.println(myScore);
		System.out.println(myScore.bestWorstHoles());
		System.out.println(myScore.highLowDays());
		System.out.println("Handicap: " + myScore.getHandicap(72));
		
		
	}
}