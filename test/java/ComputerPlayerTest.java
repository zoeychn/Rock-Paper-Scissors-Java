import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ComputerPlayerTest {

    @Test
    void computerTestMove0EnteredReturnRock(){
        doChooseMoveTest(0, Move.ROCK);
    }
    @Test
    void computerTestMove1EnteredReturnPaper(){
        doChooseMoveTest(1, Move.PAPER);
    }
    @Test
    void computerTestMove2EnteredReturnScissors(){
        doChooseMoveTest(2, Move.SCISSORS);
    }

    private static void doChooseMoveTest(int randomInt, Move expected) {

        Random random = mock(Random.class);
        ComputerPlayer computerPlayer = new ComputerPlayer(random);
        when(random.nextInt(3)).thenReturn(randomInt);

        Move move = computerPlayer.chooseMove();

        assertEquals(expected, move);
    }
}
