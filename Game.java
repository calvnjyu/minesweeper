

public class Game {
	private boolean gameOver;
	private int numRows;
	private int numColumns;
	private int numMines;
	private String [][] board;
	
	public Game() {
		gameOver = false;
		numRows = 12;
		numColumns = 12;
		numMines = 20;
		board = new String[12][12];
	}
	
	public Game(int rows, int cols, int mines) {
		gameOver = false;
		numRows = rows;
		numColumns = cols;
		numMines = mines;
		board = new String[rows][cols];
		
		for(int r = 0; r < numRows; r++) {
			for(int c = 0; c < numColumns; c++) {
				board[r][c] = ".";
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
