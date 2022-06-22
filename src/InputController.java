import java.util.Objects;
import java.util.Scanner;

/**
 * Handles all input from the user
 *
 * @author Cole Glass
 */
public class InputController {
    Scanner input = new Scanner(System.in);

    /**
     * Gets the user input for which number they want to guess next
     *
     * @return choice : int
     */
    public int getUserChoice() {
        boolean Valid = false;
        String choice = "";
        while (!Valid) {
            System.out.println("Take a guess.");
            choice = input.nextLine();
            if (choice.matches("[0-9]*")) {
                Valid = true;
            }
        }
        return Integer.parseInt(choice);
    }

    /**
     * Gets the user input for a yes or no question
     *
     * @return boolean
     */
    public boolean getYesOrNo() {
        boolean Valid = false;
        String choice = "";
        while (!Valid) {
            System.out.println("Would you like to play again? (y or n)");
            choice = input.nextLine();
            if (Objects.equals(choice, "y") || Objects.equals(choice, "n")) {
                Valid = true;
            }
        }
        return choice.equals("y");
    }

    /**
     * Gets the user input for the username
     *
     * @return input.nextline() : String
     */
    public String getUserName() {
        return input.nextLine();
    }
}
