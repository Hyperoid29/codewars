/*
Let's play! You have to return which player won! In case of a draw return Draw!.

Examples(Input1, Input2 --> Output):

"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
*/

//My Solution

public class Kata {
    public static String rps(String p1, String p2) {

        if (p1 == "scissors" && p2 == "paper") {
            return "Player 1 won!";
        } else if (p1 == "scissors" && p2 == "rock") {
            return "Player 2 won!";
        } else if (p2 == "scissors" && p1 == "rock") {
            return "Player 1 won!";
        } else if (p2 == "scissors" && p1 == "paper") {
            return "Player 2 won!";
        } else if (p1 == "paper" && p2 == "rock") {
            return "Player 1 won!";
        } else if (p1 == "rock" && p2 == "paper") {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }
}
