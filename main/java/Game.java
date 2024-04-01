import java.util.Random;
import java.util.Scanner;

public class Game {

    public interface EventHandler {
        void playerChoseMove(Player player, Move move);
        void gameWon(Player winner);
        void gameDrawn();

    }
    private final Player player1;
    private final Player player2;
    private final EventHandler eventHandler;
    private Player winner;

    public Game(Player player1, Player player2, EventHandler eventHandler) {
        this.player1 = player1;
        this.player2 = player2;
        this.eventHandler = eventHandler;
    }

    public void play() {
        Player winner = null;
        while(winner == null) {
            Move player1Move = player1.chooseMove();
            Move player2Move = player2.chooseMove();
            eventHandler.playerChoseMove(player1,player1Move);
            eventHandler.playerChoseMove(player2,player2Move);
            if(player1Move.beats(player2Move)){
                winner = player1;
            } else if (player2Move.beats(player1Move)) {
                winner = player2;
            } else {
                eventHandler.gameDrawn();
            }
        }
        eventHandler.gameWon(winner);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HumanPlayer humanPlayer = new HumanPlayer(System.out, scanner);
        Random random = new Random();
        ComputerPlayer computerPlayer = new ComputerPlayer(random);
        PrintStreamEventHandler eventHandler = new PrintStreamEventHandler(System.out);
        Game game = new Game(humanPlayer, computerPlayer, eventHandler);

        game.play();
    }


}



