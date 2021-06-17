package L2.ex;

public class TicTatToe {

    // Define the enum Mark here
    public enum Mark {
        EMPTY, CROSS, NOUGHT
    }

    public static void main(String[] args) {
        // Create a 2D array "game" for the tic-tat-toe

        Mark[][] game = {{Mark.NOUGHT, Mark.EMPTY, Mark.EMPTY}, {Mark.EMPTY, Mark.CROSS, Mark.EMPTY},
                {Mark.EMPTY, Mark.EMPTY, Mark.NOUGHT}};

        for (Mark[] row : game) {
            for (var cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}
