package L2;

import c306.GUIHelper;

public class FourInLineApp {

	private static final String[] menuItems = { "Start New Game", "Red Move", "Yellow Move" };

	private static final Runnable[] actions = { FourInLineApp::startNewGame, FourInLineApp::redMove,
			FourInLineApp::yellowMove };

	private static GameBoard board;

	public static void main(String[] args) {
		board = new GameBoard();
		GUIHelper.showMenu("Four In a Line", menuItems, actions);
	}

	private static void startNewGame() {
		board.newGame();
		board.displayBoard();
	}

	private static void redMove() {
		Integer column = GUIHelper.readInt("Enter column (0-6) for RED");
		board.placeMove(column, Move.RED);
		board.displayBoard();
		if (board.checkWin(Move.RED)) {
			GUIHelper.display("RED Wins");
			board.newGame();
			board.displayBoard();
		}
	}

	private static void yellowMove() {
		Integer column = GUIHelper.readInt("Enter column (0-6) for YELLOW");
		board.placeMove(column, Move.YELLOW);
		board.displayBoard();
		if (board.checkWin(Move.YELLOW)) {
			GUIHelper.display("YELLOW Wins");
			board.newGame();
			board.displayBoard();
		}

	}
}
