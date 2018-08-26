package project5;

import java.util.Random;
import java.util.Scanner;

import project4.TicTacToe;

public class TTTmainWComp extends TicTacToe{
	public static void main (String [] args){
	 Scanner reader = new Scanner(System.in);
	  TicTacToe board = new TicTacToe();
	  
	  System.out.println(board);
	 
	  Random gen = new Random();
	  char player;
	  if (gen.nextInt(2) == 1)
		  player = 'O';
	  else
		  player = 'X';
	  int turn = gen.nextInt(2);
	  String playing = "";
	  if (turn == 1)
		  playing = "Computer";
	  else 
		  playing = "Player";
		  
	 
	  while (board.hasWinner() != true){
	   System.out.println(playing + "'s turn as " + player );
	   if (playing.equals("Player")){
	   System.out.print("Enter the row and column[1-3, space, 1-3]: ");

	   int row = reader.nextInt();
	   int column = reader.nextInt();

	   boolean success = board.placeXorO(player, row, column);
	   if (! success)
	    System.out.println("Error: cell already occupied!");
	   else{
	    System.out.println(board);
	    if (player == 'X')
	     player = 'O';
	    else
	     player = 'X';
	   }
	   playing = "Computer";
	   }
	   else {
		   boolean taken = true;
		   while (taken){
		   int row = gen.nextInt(3) + 1;
		   int col = gen.nextInt(3) + 1;
		   if (board.placeXorO(player, row, col))
		   		taken = false;
		   else 
			   taken = true;
	   }
	 if (player == 'X')
			     player = 'O';
			    else
			     player = 'X';
	 playing = "Player";
	 System.out.println(board);
	  }
	  }
	  char winner = board.getWinner();
	  if (winner != '-')
	   System.out.println(winner + "s win!");
	  else
	   System.out.println("It's a draw!");
	 

	}
}
