import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {

    int numberToGuess = (int) (Math.random() * 100) + 1;
    int attempts = 0;
    boolean guessed = false;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Guessing Game! I'm thinking of a number between 1 and 100. Can you guess what it is?");

    while (!guessed) {
      System.out.print("Enter your guess: ");
      int guess = scanner.nextInt();
      attempts++;

      if (guess == numberToGuess) {
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
        guessed = true;
      } else if (guess < numberToGuess) {
        System.out.println("Too low. Try again.");
      } else {
        System.out.println("Too high. Try again.");
      }
    }

    scanner.close();
  }
}
