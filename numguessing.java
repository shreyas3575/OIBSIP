import java.util.*;
public class numguessing{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int randomNo = (int)(Math.random()*50);
		System.out.println("___________________________NUMBER GUESSING GAME_________________________");
		System.out.println("Enter any number between 1 to 50. Remember that you have only 3 Rounds");
		int round = 1;

		do{			//it gives 3 round , each round has 3 attempts
			System.out.println("\nRound "+ round + " begins >> ");
			for(int i=0;i<3;i++){                   
				
				System.out.println("Enter your Guess Number >> ");
				int guessNo = sc.nextInt();

				if(guessNo == randomNo){
					System.out.println("Congrats ,Well played.Random Number was >> "+randomNo);
					if(round == 1){
						System.out.println("Your Score is >> 100 "); 
						System.exit(0);
					}
					else if(round == 2){
						System.out.println("Your Score is >> 50 ");
						System.exit(0);
					}
					else {
						System.out.println("Your Score is >> 10 ");
						System.exit(0);
					}
				}
				else if(guessNo < randomNo){	
					System.out.println("Random Number is greater than your gueesed number");
				}
				else if(guessNo > randomNo)
				{
					System.out.println("Random Number is less than your gueesed number");
				}
			}

			round = round + 1;
		}while(round < 4 );
	}
}