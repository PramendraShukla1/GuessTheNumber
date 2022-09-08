package GuessingGame;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);          
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game \nYou have K trials");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("OOhhOO!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("The gussed number is Lower then the actual number.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("The gussed number is higher then the actual number.");
                if(attempt == 3) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);

	}

}
