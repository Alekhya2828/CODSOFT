import java.util.Random; // Importing Random class for generating random numbers
import java.util.Scanner; // Importing Scanner class for user input

public class NumberGame {
    public static void main(String[] args) {
        // Initialize Scanner for user input and Random for number generation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Game variables
        int maxAttempts = 5;   // Maximum attempts allowed per round
        boolean playAgain;     // To control if the player wants to play multiple rounds
        int totalRounds = 0;   // Track total rounds played
        int totalWins = 0;     // Track total rounds won
        int attemptsTaken; // Track the number of attempts in the current round

        // Start the game loop for multiple rounds
        do {
            totalRounds++; // Increment total rounds played
            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            boolean guessedCorrectly = false; // Flag to track if the user guessed correctly
            attemptsTaken = 0; // Reset attempts for the new round

            // Display round information to the user
            System.out.println("\n--- Round " + totalRounds + " ---");
            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            // Loop for guessing the number
            while (attemptsTaken < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: "); // Prompt user for their guess
                int userGuess = scanner.nextInt(); // Read user's guess
                attemptsTaken++; // Increment the number of attempts taken

                // Compare user's guess with the generated number
                if (userGuess == numberToGuess) {
                    guessedCorrectly = true; // User guessed correctly
                    System.out.println("Congratulations! You've guessed the number correctly in " + attemptsTaken + " attempts.");
                    totalWins++; // Increase the win counter if they guessed correctly
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Attempts left: " + (maxAttempts - attemptsTaken)); // Feedback for a low guess
                } else {
                    System.out.println("Too high! Attempts left: " + (maxAttempts - attemptsTaken)); // Feedback for a high guess
                }
            }

            // If the player failed to guess correctly after max attempts
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
            }

            // Ask if the player wants to play another round
            System.out.print("Do you want to play another round? (yes/no): "); // Prompt for replay
            String response = scanner.next().toLowerCase(); // Read the user's response
            playAgain = response.equals("yes"); // Update the playAgain flag based on user response

        } while (playAgain); // Continue the loop if the player wants to play again

        // Display the final score and rounds summary
        System.out.println("\nGame Over!"); // Indicate the end of the game
        System.out.println("Total Rounds Played: " + totalRounds); // Show total rounds played
        System.out.println("Total Rounds Won: " + totalWins); // Show total rounds won
        System.out.println("Thanks for playing!"); // Thank the player for participating

        // Close the scanner to release resources
        scanner.close(); // Close the scanner
    }
}