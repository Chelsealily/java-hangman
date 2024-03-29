package org.example;

import static org.example.Commands.word;

public class Messages {
    public void welcomeMessage() {
        System.out.println();
        System.out.println("* - . Welcome to Hangman! :D . - *");
        System.out.println("- The aim of the game is to guess all of the letters in a word or... you'll be HANGED Muahahaha ");
        System.out.println("- You have 10 lives... Good luck !");
        System.out.println(" ");
        System.out.println("> START ");
        }

        public void hangmanImage() {

            Commands commands = new Commands();

            if (Commands.lives == 9) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println();
                System.out.println("___|___");
                System.out.println();
            }
            if (Commands.lives == 8) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (Commands.lives == 7) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |/");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
            }
            if (Commands.lives == 6) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |         ");
                System.out.println("   |         ");
                System.out.println("   |         ");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (Commands.lives == 5) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |         ");
                System.out.println("   |         ");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (Commands.lives == 4) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |           | ");
                System.out.println("   |           | ");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (Commands.lives == 3) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |          /| ");
                System.out.println("   |           | ");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (Commands.lives == 2) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |          /| ");
                System.out.println("   |           | ");
                System.out.println("   |          / ");
                System.out.println("___|___");
            }
            if (Commands.lives == 1) {
                System.out.println("// Wrong guess, ["+ Commands.lives +"] lives left, try again!");
                System.out.println();
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |          /|\\");
                System.out.println("   |           | ");
                System.out.println("   |          / ");
                System.out.println("___|___");
            }
            if (Commands.lives == 0) {
                System.out.println("GAME OVER!");
                System.out.println("   ____________");
                System.out.println("   |           |");
                System.out.println("   |          ( )");
                System.out.println("   |          /|\\");
                System.out.println("   |           | ");
                System.out.println("   |          / \\");
                System.out.println("___|___");
                System.out.println("GAME OVER! Bad Luck! The word was [ " + word + " ]" );
                System.out.println();
                commands.playAgain();

            }
        }

        public void playAgainMessage() {
            System.out.print(" > Play again? (Y) or (Any Key) to Exit");
        }



}
