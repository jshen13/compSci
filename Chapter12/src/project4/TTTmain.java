package project4;
import java.util.Scanner;
import java.util.Random;

public class TTTmain extends TicTacToe{
	public static void main (String[] args){
		  Scanner reader = new Scanner(System.in);
		  TicTacToe board = new TicTacToe();
		  
		  System.out.println(board);
		 
		  Random gen = new Random();
		  char player;
		  if (gen.nextInt(2) == 1)
			  player = 'O';
		  else
			  player = 'X';
		 
		  while (board.hasWinner() != true){
		   System.out.println(player + "'s turn");
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
		  }
		  char winner = board.getWinner();
		  if (winner != '-')
		   System.out.println(winner + "s win!");
		  else
		   System.out.println("It's a draw!");
		 
	 

	}
}
