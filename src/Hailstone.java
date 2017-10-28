
/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Takes a user inputted number and the program modifies it with calculations based off of if
 * the number is even or odd until it reaches 1.
 */
import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		println("This program computes Halistone sequences.");
		
		hailstone();
		runAgain();
	}
		
	/*
	 * Checks to see if the user inputted number is odd and performs and prints subsequent calculations based off of the tests.
	 * In addition to this, it keeps track of and prints the iterations the while loop is performed.
	 */
	private void hailstone() {
		int iteration = 0;
		println("");
		int number = readInt("Enter a number : ");
		while(number != 1) {
			if(number % 2 == 0 ) {
				int half = number/2;
				println(number + " is even, so I take half: " + half);
				number = half;
			} else {
				int oddCalculations = 3*number+1;
				println(number + " is odd, so I make 3n + 1: " + oddCalculations);
				number = oddCalculations;
			}
			iteration = iteration+1;	
		}
		println("It took " + iteration + " steps to reach 1.");
	}
	
	/*
	 * Asks the user with a true or false question whether or not they want to run the program again. 
	 * If yes is answered, the method hailstone is executed followed by another question of wanting to try again.
	 * After a false response is inputted, a goodbye message is printed.
	 */
	private void runAgain() {
		boolean runAgain = readBoolean("Run againt? ","y","n");
		while(runAgain == true) {
			hailstone();
			runAgain = readBoolean("Run again? ","y","n");
		}
		println("Thanks for using Hailstone.");
	}	
}
