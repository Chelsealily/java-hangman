<h1> ♨️ Java Hangman Game</h1>
This was a _nology project where I built a Hangman game in Java which can be played in the command line.

<h2>✍️Functionality:</h2>
<ul>😵 You have 10 lives before you are hanged </ul>
<ul>😵 You can only guess a single letter (errors thrown when symbols or more than 1 character is input) </ul>
<ul>😵 If you have already guessed a letter - error thrown </ul>
<ul>😵 Once you finish the game, you can play again by typing "Y" or exit using ANY KEY</ul>

<h2>🧩 Components</h2>
<br>The project is structured with the following Classes:
<br><br>
<uL><b>Main:</b>The root component that initializes the game</uL>
<uL><b>Words:</b> The container for the random word generator</uL>
<uL><b>Messages:</b> The container for the display messages</uL>
<uL><b>Commands:</b> The container for the game logic and displaying the results of the guess </uL>

<h2>Code Snippet</h2>

```
   if (guess.length() != 1||!Character.isLetter(guess.charAt(0))) {
                System.out.println("Please enter a valid single letter.");
                continue;
            }
```

The above code is what I used to throw the error for the player when they input a guess that is more than 1 character long and is NOT a letter. 
<br>

<h2>Project Preview</h2>

<b>Start of Game ></b>
<br>
![Screenshot 2024-01-30 at 14 34 44](https://github.com/Chelsealily/java-hangman/assets/148104000/68c92a26-aa0d-4523-bf6b-48433fe44fbc)
<br>
<b>Mid Game ></b>
<br>
![Screenshot 2024-01-30 at 14 36 53](https://github.com/Chelsealily/java-hangman/assets/148104000/b6bb0321-cb50-4da3-ae1b-7a94372a67f5)
<br>
<b>End of Game ></b>
<br>
![Screenshot 2024-01-30 at 14 38 41](https://github.com/Chelsealily/java-hangman/assets/148104000/0bac861c-0bd0-447b-9477-81d40d8929f0)




