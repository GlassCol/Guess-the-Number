import java.util.Random;

/**
 * Main engine which pushes the game through its various stages
 *
 * @author Cole Glass
 */
public class Engine {
    Random rng = new Random();
    private final InputController input = new InputController();
    //must add 1 so that we get between 1 & 20
    final int correctAnswer = rng.nextInt(20) + 1;

    /**
     * Method which runs the game
     */
    public void run() {
        int userChoice = -1;
        boolean playAgain = true;
        System.out.println("Hello! What is your name?");
        String userName = input.getUserName();
        System.out.println("Well " + userName + " I'm thinking of a number between 1 and 20");
        int guesses = 1;
        while (guesses <= 6 && userChoice != correctAnswer) {
            userChoice = input.getUserChoice();
            if (userChoice == correctAnswer) {
                System.out.println("Good Job, " + userName + " You guesses my number in " + guesses + " guesses");
                playAgain = input.getYesOrNo();
            } else System.out.println(highOrLow(userChoice));
            guesses++;
        }
        if (guesses == 7) {
            System.out.println("Sorry " + userName + "! That's 6 guesses!");
            playAgain = input.getYesOrNo();
        }
        if (playAgain) {
            run();
        }
    }

    /**
     * Determines whether the guess is too high or low
     *
     * @return String
     */
    public String highOrLow(int guess) {
        if (guess > correctAnswer) {
           return("Your guess is too high.");
        } else {
            return("Your guess is too low.");
        }
    }
}
