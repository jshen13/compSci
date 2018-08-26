package project5;

public class TicTacToe {
	private char[][] board;
	public TicTacToe(){
		board = new char[3][3];
		reset();
	}
	public void reset(){
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				board[row][col] = '-';
	}
	public String toString(){
		String result = "\n";
		for (int row = 0; row < 3; row++){
			for  (int col = 0; col < 3; col++)
				result += board[row][col] + " ";
			result += "\n";
		}
		return result;
	}
	public boolean placeXorO (char player, int row, int col){
		if (board[row - 1][col - 1] == '-'){
			board[row-1][col - 1] = player;
			return true;
		}
		else {
			return false;
		}
	}
	private boolean checkRow(int row, char player){//row as index
		String Srow = "";
		for (int col = 0; col < 3; col++)
			Srow += board[row][col];
		if (player == 'X'){
			if (Srow.equals("XXX"))
				return true;
			else
				return false;
		}
		else if (player == 'O'){
			if (Srow.equals("OOO"))
				return true;
			else
				return false;
		}
		else {
			return false;
		}
	}
	private boolean checkCol(int col, char player){//col as indec
		String Scol = "";
		for (int row = 0; row < 3; row++)
			Scol += board[row][col];
		if (player == 'X'){
			if (Scol.equals("XXX"))
				return true;
			else
				return false;
		}
		else if (player == 'O'){
			if (Scol.equals("OOO"))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	private boolean checkDiagonals(char player){
		String sCross1 = "";
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (row == col)
					sCross1 += board[row][col];
		boolean c1 = false;
		//test X first way
		if (player == 'X'){
			if (sCross1.equals("XXX"))
				c1 = true;
		}
		else if (player == 'O'){
			if (sCross1.equals("OOO"))
				c1 = true;
		}
		else {
			return false;
		}
		String sCross2 = "";
		sCross2 += board[2][0];
		sCross2 += board[1][1];
		sCross2 += board[0][2]; 
		// test X,0 second way
		boolean c2 = false;
		if (player == 'X'){
			if (sCross2.equals("XXX"))
				c2 = true;
		}
		else if (player == 'O'){
			if (sCross2.equals("OOO"))
				c2 = true;
		}
		else {
			return false;
		}
		// final test for return
		if (c2 || c1)
			return true;
		else 
			return false;
	}
	public boolean hasWinner(){
		if ( checkRow(0, 'X') || checkRow(1, 'X') || checkRow(2, 'X') ||
			 checkCol(0, 'X') || checkCol(1, 'X') || checkCol(2, 'X') ||
			 checkDiagonals('X') ||
			 checkRow(0, 'O') || checkRow(1, 'O') || checkRow(2, 'O') ||
			 checkCol(0, 'O') || checkCol(1, 'O') || checkCol(2, 'O') ||
			 checkDiagonals('O'))
			return true;
		else 
			return false;
	}
	public char getWinner(){
		if (checkRow(0, 'X') || checkRow(1, 'X') || checkRow(2, 'X') ||
			checkCol(0, 'X') || checkCol(1, 'X') || checkCol(2, 'X') ||
			checkDiagonals('X'))
			return 'X';
		else if (checkRow(0, 'O') || checkRow(1, 'O') || checkRow(2, 'O') ||
				 checkCol(0, 'O') || checkCol(1, 'O') || checkCol(2, 'O') ||
				 checkDiagonals('O'))
			return 'O';
		else 
			return '-';
	}
}
