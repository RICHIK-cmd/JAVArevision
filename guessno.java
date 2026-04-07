import java.util.Random;
import java.util.Scanner;

class Game {
    int number;
    int inputNumber;
    int noOfGuesses = 0;

    // Constructor → generates random number
    Game() {
        Random rand = new Random();
        number = rand.nextInt(100); // 0 to 99
    }

    // Take user input
    void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        inputNumber = sc.nextInt();
    }

    // Check if guess is correct
    boolean isCorrectNumber() {
        noOfGuesses++;

        if (inputNumber == number) {
            System.out.println("🎉 Correct! You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low... try again.");
        } else {
            System.out.println("Too high... try again.");
        }
        return false;
    }

    // Getter
    int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter
    void setNoOfGuesses(int n) {
        noOfGuesses = n;
    }
}

class guessgame {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;

        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

