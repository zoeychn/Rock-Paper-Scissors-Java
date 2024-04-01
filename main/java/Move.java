public enum Move {
    ROCK("Rock") {
        @Override
        public boolean beats(Move other) {
            return other == SCISSORS;
        }
    }, PAPER("Paper") {
        @Override
        public boolean beats(Move other) {
            return other == ROCK;
        }
    }, SCISSORS("Scissors") {
        @Override
        public boolean beats(Move other) {
            return other == PAPER;
        }
    };

    private final String name;
    /*private int value;*/


    /*public int getValue() {
        return value;
    }*/

    Move(String name) {
        this.name = name;
    }

    /*public boolean beats(NewMove other) {
        if (this == NewMove.ROCK){
            return other == NewMove.SCISSORS;
        }
        if (this == NewMove.PAPER){
            return other == NewMove.ROCK;
        }
        if (this == NewMove.SCISSORS){
            return other == NewMove.PAPER;
        }
        return false;
    }*/

    @Override
    public String toString() {
        return name;
    }

    public abstract boolean beats(Move other);

}