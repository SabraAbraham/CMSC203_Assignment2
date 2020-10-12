import java.util.Scanner;

public class RandomNumberGuesser {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
	
		
		int lowGuess = 0;
		int highGuess = 100;
		int nextGuess;
		
		
		

			System.out.print("Enter your first guess ");
			nextGuess = input.nextInt();
			
			int randNum = RNG.rand();
			
		
			
			String choice = "no";
			
			
			do {
				
			
			
				do
				{	
					boolean temp = true;
				
					do
					{ 
						
						temp = RNG.inputValidation(nextGuess, lowGuess, highGuess);
					
						if (temp == false)
						{
							System.out.print("Enter your next guess ");
							nextGuess = input.nextInt();
						}
					
					}while( temp != true );
					
			
					if (nextGuess > randNum)
					{
						System.out.println("Your guess is too high");
						highGuess = nextGuess;
					}
					else if (nextGuess < randNum)
					{
						System.out.println("Your guess is too low");
						lowGuess = nextGuess;
					}
					else
					{
						System.out.println("Congratulations. You guessed the number");
						
					}
		
				}while(nextGuess != randNum);
			
				System.out.println("Do you want to play again?" );
				choice = input.nextLine();
				choice = input.nextLine();
				
			}while(choice == "yes");
			// user input for decision
			
			System.out.println("Thanks for playing..."); // output when user does not want to play again
			
	
	}
}
