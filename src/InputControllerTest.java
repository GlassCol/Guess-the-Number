import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Objects;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputControllerTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getGoodUserChoice() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        Scanner input = new Scanner(in);

        boolean Valid = false;
        String choice = "";
        while (!Valid) {
            System.out.println("Take a guess.");
            choice = input.nextLine();
            if (choice.matches("[0-9]*")) {
                Valid = true;
            }
        }
        assertEquals(1, Integer.valueOf(choice));
    }
    @Test
    void getLetterUserChoice() {
        ByteArrayInputStream in = new ByteArrayInputStream("A".getBytes());
        Scanner input = new Scanner(in);

        boolean Valid = false;
        String choice;
        while (!Valid) {
            System.out.println("Take a guess.");
            choice = input.nextLine();
            if (choice.matches("[0-9]*")) {
                Valid = true;
            }
            else{
                break;
            }
        }
    }

    @Test
    void getYes() {
        ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
        Scanner input = new Scanner(in);
        boolean Valid = false;
        String choice;
        while (!Valid) {
            System.out.println("Would you like to play again? (y or n)");
            choice = input.nextLine();
            if (Objects.equals(choice, "y") || Objects.equals(choice, "n")) {
                Valid = true;
            }
        }
    }
    @Test
    void getNo() {
        ByteArrayInputStream in = new ByteArrayInputStream("n".getBytes());
        Scanner input = new Scanner(in);
        boolean Valid = false;
        String choice;
        while (!Valid) {
            System.out.println("Would you like to play again? (y or n)");
            choice = input.nextLine();
            if (Objects.equals(choice, "y") || Objects.equals(choice, "n")) {
                Valid = true;
            }
        }
    }
}