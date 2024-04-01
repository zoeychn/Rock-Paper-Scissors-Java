# Rock-Paper-Scissors-Java

This is a simple game of Rock-Paper-Scissors implemented in Java. It uses OOP and interfaces to create a structure for the game. The game is as follows:

- Player Interface: This interface is implemented by any class that can play the game. It has one method, `chooseMove()`, which is used to determine the player's choice of Rock, Paper, or Scissors.
- ComputerPlayer Class: This class represents a computer player. It uses a random number generator to choose its move.
- HumanPlayer Class: This class represents a human player. It prompts the user to enter their move and reads the input from the console.
- Game Class: This is the main class that controls the game. It accepts two players and an EventHandler as inputs. The `play()` method runs the game until there's a winner, announcing each move and the game's outcome via the EventHandler.
- Move Class: This class defines the possible moves (Rock, Paper, Scissors) and includes a method to determine which move beats the other.
- PrintStreamEventHandler Class: This class implements the EventHandler interface used by the Game class to announce the progress of the game. It outputs the game's progress to the console.
- Test Classes: These are unit tests for each of the classes, ensuring they work as expected.

The game is played in rounds. Each round, both players choose a move. If one player's move beats the other's, that player wins the round. If both players choose the same move, it's a draw. The game continues until there's a winner.
