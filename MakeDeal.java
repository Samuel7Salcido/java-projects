import java.util.Random;
import java.util.Scanner;
public class MakeDeal{
	public static void main(String[] args){
		double switchWins = 0;
		double stayWins = 0;
		int totalPlays;
		
		
		Random gen = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		//Prompts the user to enter how ever many times they want to play
		System.out.println("Please enter the number of times you want to play: ");
		totalPlays = keyboard.nextInt();
		
		System.out.println("Prize\tGuess   View   New Guess");
		for(int plays = 0;plays < totalPlays;plays++ ){
			
			int winningDoor = gen.nextInt(3);
			int[] doors = {0,0,0};
			doors[winningDoor] = 1;	//put a winner in a random door
			int choice = gen.nextInt(3); 	//pick a door, any door
			int shown; //the shown door
			
			
			do{
				shown = gen.nextInt(3);
			//don't show the winner or the choice
			}
			while(doors[shown] == 1 || shown == choice);
 
			//Keeps track of wins when one stays
			stayWins += doors[choice];
 
			//Keeps track of wins when one switches
			switchWins += doors[3 - choice - shown];
			
			
			System.out.println(winningDoor+1 + "\t  " + (choice+1) + "\t  " + (shown+1) + "      " + ((3-choice-shown)+1));
			
		}
		System.out.printf("Probability of winning if you switch = %.2f\n", switchWins/totalPlays);
		System.out.printf("Probability of winning if you do not switch = %.2f", stayWins/totalPlays);
	}
}