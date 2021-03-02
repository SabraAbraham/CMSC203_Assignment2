/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: The Random Number Guesser class contains everything that will be displayed on the screen
 * for the user to interact with the console and play a guessing game. The RNG class is what produces 
 * the random number (a.k.a. the number to be guessed). The RNG class is like the behind the scenes of the game. 
 * Input validation happens there and also keeps count of how many guesses the user has gone through to get to the correct guess.
 * Due: 03/01/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Sabra Abraham
*/

import java.util.Scanner;

public class RandomNumberGuesser {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// range for the guesses
		int lowGuess = 0;
		int highGuess = 100;
		
		//user input for guess to be stored here
		int nextGuess;
		
			System.out.print("Enter your first guess ");
			nextGuess = input.nextInt();

		int randNum = RNG.rand(); //random number called from RNG class and assigned a variable 
			
		String choice = "yes";
			
			
			do
			{

				do
				{	
					boolean temp = true; // temporarlily true
					temp = RNG.inputValidation(nextGuess, lowGuess, highGuess); 
				
				if(temp == false)
				{
					System.out.print("Enter next guess ");
					nextGuess = input.nextInt();
				}
					
					if(nextGuess != randNum)
					{
						System.out.println("Guess number " + RNG.getCount()); //calls counter to display number of times guessed

					}
					
				if (nextGuess > randNum) //if user input is greater than random number
					{

						System.out.println("Your guess is too high");
						highGuess = nextGuess;
					}					
					else if (nextGuess < randNum) // if user input is less than random number
					{

						System.out.println("Your guess is too low");
						lowGuess = nextGuess;
					}
					
					// repeat again while input validation is not true
					 // if user input is the random number
			
				}while(nextGuess != randNum); // repeat do-while loop while the random number has not been guessed
			
				System.out.println("Congratulations. You guessed the number");
				System.out.print("Do you want to play again? (yes or no)" ); // ask user to play again if random number is guessed correctly
				choice = input.nextLine();
				choice = input.nextLine(); // extra so line is not skipped
				
				if(choice == "yes")
				{
					System.out.print("Enter first guess ");
					nextGuess = input.nextInt();
				}
				
			}while("yes".equals(choice)); //repeat do-while loop if user input is "yes"
			
			System.out.println("Thanks for playing..."); // display when user does not want to play again
		
	}
}


