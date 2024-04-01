import java.io.PrintStream;

public class PrintStreamEventHandler implements Game.EventHandler {
    private final PrintStream printStream;
    final String[] moves = {"Rock", "Paper", "Scissors"};

    public PrintStreamEventHandler(PrintStream printStream) {
        this.printStream = printStream;
    }


    /*@Override
    public void playerChoseMove(Player player, int move) {
        printStream.println(player + " chose " + move);
    }*/
    @Override
    public void playerChoseMove(Player player, Move move) {
        /*String moveStr = convertMoveToString(move);*/
        printStream.println(player.toString() + " chose " + move.toString());
    }

    @Override
    public void gameWon(Player winner) {
        printStream.println(winner + " won the game!");
    }

    @Override
    public void gameDrawn() {
        printStream.println("It's a draw!");
    }
}
