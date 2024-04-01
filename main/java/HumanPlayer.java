import java.io.PrintStream;
import java.util.Scanner;

public class HumanPlayer implements Player {

    private final PrintStream printStream;
    private final Scanner scanner;

    public HumanPlayer(PrintStream printStream, Scanner scanner) {
        this.printStream = printStream;
        this.scanner = scanner;
    }

    @Override
    public Move chooseMove() {
        printStream.println("Enter 1 for rock, 2 for paper, 3 for scissors");
        int index = scanner.nextInt() - 1;
        return Move.values()[index];
    }

    @Override
    public String toString() {
        return "Player";
    }


}
