package L2;

import c306.GUIHelper;

public class GameBoard {

	private static final int ROWS = 6;
	private static final int COLS = 7;
	private final Move[][] board = new Move[ROWS][COLS];

	public GameBoard() {
		newGame();
	}

	public void newGame() {
		// TODO L02 Task 1 - Use nested For loops to initialize the board to all EMPTY
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				board[i][j] = Move.EMPTY;
			}
		}

	}

	// TODO L02 Task 2 - Place a disc in a specified column
	public void placeMove(int column, Move player) {
		for (int r = 5; r >= 0; r--) {
			if (board[r][column] == Move.EMPTY) {

				board[r][column] = player;
				break;
			}
		}
	}

	public boolean checkWin(Move player) {
		// Check Vertical
		// TODO L02 Task 3a - Check Winning Condition for 4 discs vertically

		for (int r = 0; r < ROWS - 3; r++) {
			for (int c = 0; c < COLS; c++) {

				if ((board[r][c] == player) && (board[r + 1][c] == player) && (board[r + 2][c] == player)
						&& (board[r + 3][c] == player)) {

					return true;
				}
			}
		}

		// Check Horizontal
		// TODO L02 Task 3b - Check Winning Condition for 4 discs horizontally

		for (int r = 0; r < ROWS; r++) {
			for (int c = 0; c < COLS - 3; c++) {

				if ((board[r][c] == player) && (board[r][c + 1] == player) && (board[r][c + 2] == player)
						&& (board[r][c + 3] == player)) {

					return true;
				}
			}
		}

		// Check Backward Diagonal
		// TODO L02 Task 4a - Check Winning Condition for 4 discs backward diagonally
		for (int r = 0; r < ROWS - 3; r++) {
			for (int c = 0; c < COLS - 3; c++) {

				if ((board[r][c] == player) && (board[r + 1][c + 1] == player) && (board[r + 2][c + 2] == player)
						&& (board[r + 3][c + 3] == player)) {

					return true;
				}
			}
		}

		// Check Forward Diagonal
		// TODO L02 Task 4b - Check Winning Condition for 4 discs forward diagonally
		for (int r = 0; r < ROWS - 3; r++) {
			for (int c = 0; c < COLS - 3; c--) {

				if ((board[r][c - 1] == player) && (board[r + 1][c - 2] == player) && (board[r + 2][c - 3] == player)
						&& (board[r + 3][c - 4] == player)) {

					return true;
				}
			}
		}
		return false;
	}

	public void displayBoard() {
		//GUIHelper.clear();
		GUIHelper.output("FOUR IN A LINE");
		for (int r = 0; r < ROWS; r++) {
			StringBuilder line = new StringBuilder();
			for (int c = 0; c < COLS; c++) {
				if (board[r][c] == Move.RED) {
					line.append("R ");
				} else if (board[r][c] == Move.YELLOW) {
					line.append("Y ");
				} else {
					line.append(". ");
				}
			}
			GUIHelper.output(line.toString());
		}
		GUIHelper.output("0 1 2 3 4 5 6");
	}
}
