package org.example;
import java.util.Scanner;
import static org.example.Words.generateWord;

public class Commands {

    protected static String word = generateWord();
    // creates a new dashed array equal to the generated word length
    // array is made using default values (which are "\0" (null) characters )
    private static String dash = new String(new char[word.length()]).replace("\0", "_");
    protected static int lives = 10;
    private final Messages messages = new Messages();
    public Scanner scanner = new Scanner(System.in);
    private boolean playAgain = false;

    public void initiate() {
        messages.welcomeMessage();

        while (lives >= 1 && dash.contains("_")) {
            System.out.println("> Guess a letter!");
            System.out.println(dash);
            String guess = scanner.next().toUpperCase();

            if (guess.length() != 1||!Character.isLetter(guess.charAt(0))) {
                System.out.println("Please enter a valid single letter.");
                continue;
            }

            char guessedLetter = guess.charAt(0);

            if (dash.contains(String.valueOf(guessedLetter))) {
                System.out.println("You already guessed that letter. Try again.");
                continue;
            }

            logic(guess);
        }

    }

    private void logic(String guess) {
        String newDash = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.toUpperCase().charAt(i) == guess.charAt(0)) {
                newDash += guess.charAt(0);
            } else if (dash.charAt(i) != '_') {
                newDash += word.charAt(i);
            } else {
                newDash += "_";
            }
        }

        if (dash.equals(newDash)) {
            lives--;
            messages.hangmanImage();
        } else {
            dash = newDash;
            System.out.println("* Good guess! Try another! *");
            System.out.println(" ");
        }
        if (dash.equals(word)) {
            System.out.println(".' Congrats! You win! The word was '. [ " + word + " ]");
            playAgain = true;
            playAgain();
        }
    }

    public void playAgain() {

        messages.playAgainMessage();
        String input = scanner.next().toUpperCase();

        if (input.contains("Y")) {
            initiate();
            word = generateWord();
            lives = 10;
            playAgain = false;
            dash = new String(new char[word.length()]).replace("\0", "_");
        } else {
            System.out.println("!! See you later !!");
            return;
        }

    }
}
