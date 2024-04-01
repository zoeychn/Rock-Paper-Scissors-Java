import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;

public class GameTests {

    private Player playsRock;
    private Player playsScissors;
    private Player playsPaper;
    private final Game.EventHandler eventHandler = mock(Game.EventHandler.class);

    private Player playsRockScissors;

    @BeforeEach

    public void setUp(){
        playsRock = mock(Player.class);
        playsScissors = mock(Player.class);
        playsPaper = mock(Player.class);
        when(playsRock.chooseMove()).thenReturn(Move.ROCK);
        when(playsScissors.chooseMove()).thenReturn(Move.SCISSORS);
        when(playsPaper.chooseMove()).thenReturn(Move.PAPER);

        playsRockScissors = mock(Player.class);
        when(playsRockScissors.chooseMove()).thenReturn(Move.ROCK, Move.SCISSORS);
    }

    @Test
    void player1MoveShouldBeReported () {
        Game game = new Game(playsRock,playsScissors,eventHandler);
        game.play();
        verify(eventHandler).playerChoseMove(playsRock, Move.ROCK);
    }
    @Test
    void player2MoveShouldBeReported () {
        Game game = new Game(playsRock,playsScissors,eventHandler);
        game.play();
        verify(eventHandler).playerChoseMove(playsScissors, Move.SCISSORS);
    }

    @Test
    void player1Win(){
        Game game = new Game(playsRock, playsScissors, eventHandler);
        game.play();
        verify(eventHandler).gameWon(playsRock);

    }
    @Test
    void player2Win(){
        Game game = new Game(playsScissors, playsRock, eventHandler);
        game.play();
        verify(eventHandler).gameWon(playsRock);
    }
    @Test
    void playersDraw(){
        /*Player playsRockScissors = mock(Player.class);
        when(playsRockScissors.chooseMove())
                .thenReturn(Move.ROCK)
                .thenReturn(Move.SCISSORS);*/

        Game game = new Game(playsRock, playsRockScissors, eventHandler);
        game.play();
        verify(eventHandler).gameDrawn();

    }

}
