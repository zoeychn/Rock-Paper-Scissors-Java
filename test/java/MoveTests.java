import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveTests {

    @Test
    void rockBeatsScissors() {
        assertTrue(Move.ROCK.beats(Move.SCISSORS));
    }

    @Test
    void ScissorsNotBeatRock() {
        assertFalse(Move.SCISSORS.beats(Move.ROCK));
    }

    @Test
    void paperBeatsRock(){
        assertTrue(Move.PAPER.beats(Move.ROCK));
    }


}
