import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {

    @Test
    void chooseMovePrintMessage(){
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        HumanPlayer player = new HumanPlayer(printStream, new Scanner("1"));

        // Action
        player.chooseMove();
        // Assert
        assertEquals("Enter 1 for rock, 2 for paper, 3 for scissors" + System.lineSeparator(), outputStream.toString());
    }

    @Test
    void chooseMoveReturnPaperWhenTwoEntered(){
        // Arrange
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        HumanPlayer player = new HumanPlayer(printStream, new Scanner("2"));
        // Action
        Move move = player.chooseMove();
        // Assert
        assertEquals(Move.PAPER, move);
    }

}