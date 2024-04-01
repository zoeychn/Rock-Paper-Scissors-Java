import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PrintStreamEventHandlerTests {

     PrintStream printStream = mock(PrintStream.class);
     PrintStreamEventHandler printStreamEventHandler = new PrintStreamEventHandler(printStream);
     Player player = new HumanPlayer(null,null);

    @Test
    public void playerChoseMove() {
        printStreamEventHandler.playerChoseMove(player, Move.ROCK);
        verify(printStream).println("Player chose Rock");
    }

    @Test
    public void gameWon() {
        printStreamEventHandler.gameWon(player);
        verify(printStream).println("Player won the game!");
    }

    @Test
    public void gameDrawn() {
        printStreamEventHandler.gameDrawn();
        verify(printStream).println("It's a draw!");
    }

    /*@Test
    public void isThereDrawMessage() {
        printStreamEventHandler.gameDrawn();
        verify(printStream).println("It's a draw!");
    }*/


    @Test
    void toStringHumanWorks() {
        Player player = new HumanPlayer(null,null);
        assertEquals("Player", player.toString());
    }

    @Test
    void toStringWorks() {
        Player computerPlayer = new ComputerPlayer(null);
        assertEquals("Computer", computerPlayer.toString());
    }

}
