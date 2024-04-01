import java.util.Random;

public class ComputerPlayer implements Player {


    private final Random random;

    public ComputerPlayer(Random random) {
        this.random = random;
    }

    @Override
    public Move chooseMove() {
        int index = random.nextInt(3);
        return Move.values()[index];
    }

    @Override
    public String toString() {
        return "Computer";
    }

}
