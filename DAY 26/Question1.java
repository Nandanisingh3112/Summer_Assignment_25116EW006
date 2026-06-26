import java.util.Scanner;
import java.util.Random;
public class Question1 {
//program to create number guessing game
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int minRange = 1;
    int maxRange = 100;
    int maxAttempts = 5;
    int targetNumber = random.nextInt((maxRange-minRange)+1)+minRange;
    int attemptsCount = 0;
    boolean hasGuessedCorrectly = false;
    System.out.println("Welcome to number guessing game! ");
    System.out.println("I have choosen a number between "+ minRange+ " and "+ maxRange+ ".");
    System.out.println("You have "+ maxAttempts+" attempts to guess it.");
    System.out.println("---------------------------------------------");
    while(attemptsCount<maxAttempts){
        System.out.println("Enter your guess (Attempt "+ (attemptsCount + 1)+ "/"+ maxAttempts + ") :");
        if(!sc.hasNextInt()){
            System.out.println("Error : Please enter a valid whole number.");
            sc.next();
            continue;
        }
        int currentGuess = sc.nextInt();
        attemptsCount++;
        if(currentGuess==targetNumber){
            hasGuessedCorrectly = true;
            break;
        }else if(currentGuess<targetNumber){
            System.out.println("Too low! Try a higher number.");
        }else{
            System.out.println("Too high! Try a lower number.");
        }
        System.out.println();
    }
    System.out.println("--------------------------------------");
    if(hasGuessedCorrectly){
        System.out.println("Congratulations! You won the game!");
        System.out.println("You guessed the correct number "+ targetNumber+ " in "+ attemptsCount + " attempts." );
    }else{
        System.out.println("Game over! You have run out of attempts.");
        System.out.println("The secret number was :"+ targetNumber);
    }
}
}
    

