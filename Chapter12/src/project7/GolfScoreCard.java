package project7;
import java.util.Scanner;
import java.io.*;

public class GolfScoreCard {
	private int[] dates;
	private int[][] scores;
	public GolfScoreCard() {
		Scanner scan = new Scanner(System.in);
	
		int numDays = scan.nextInt();
		
		dates = new int[numDays];
		scores = new int[numDays][18];
		
		for (int i = 0; i < numDays; i++){
			dates[i] = scan.nextInt() ;
			for (int j = 0; j < 18; j++)
				scores[i][j] = scan.nextInt();
		}
	}
	public String toString(){
		String str = "";
		for (int i = 0; i < dates.length; i++){
			str += "Date: " + dates[i] + " Scores:";
			for (int j = 0; j < 18; j++)
				str += " " + scores[i][j];
			str += "\n";
		}
		return str;
	}

	
	public String highLowDays(){
		
		int indexLow = 0;
		int indexHigh = 0;
		int lowTotal = dayTotal(0);
		int highTotal = dayTotal(0);
		
		for (int i = 1; i < dates.length; i++){
			int todayTotal = dayTotal(i);
			if (todayTotal < lowTotal){
				indexLow = i;
				lowTotal = todayTotal;
			}else if (todayTotal > highTotal){
				indexHigh = i;
				highTotal = todayTotal;
			}
		}

		String str = "";
		str += "The best day: " + dates[indexLow] +
				" score: " + lowTotal + "\n";
		str += "The worst day: " + dates[indexHigh] +
				" score: " + highTotal + "\n";
		return str;
	}
	public String bestWorstHoles(){

		int indexLow = 0;
		int indexHigh = 0;
		double lowAvg = 100;
		double highAvg = 0;
		int holeTotal = 0;

		for (int hole = 0; hole < 18; hole++){
			holeTotal = 0;
			for (int round = 0; round < dates.length; round++){
				holeTotal += scores[round][hole];
			}
			
			double currentAvg = (double)holeTotal/dates.length;
			if (hole == 0)
				lowAvg = currentAvg;
			if (currentAvg < lowAvg){
				lowAvg = currentAvg;
				indexLow = hole;
			}
			if (currentAvg > highAvg){
				highAvg = currentAvg;
				indexHigh = hole;
			}
		}

		String str = "";
		str += "The best hole: " + (indexLow + 1) +
				" average: " + lowAvg + "\n";
		str += "The worst hole: " + (indexHigh + 1) +
				" average: " + highAvg + "\n";
		return str;
	}

	private int dayTotal (int i){
		int total = 0;
		for (int j = 0 ; j < 18; j++)
			total += scores[i][j];
		return total;
	}
	public int getHandicap(int par){
		int hc = 0;
		int totalScores = 0;
		for (int round = 0; round < dates.length; round++){
			totalScores += dayTotal(round);
		}
		hc = (totalScores - (par * dates.length)) / dates.length;
		return hc;
	}
}

