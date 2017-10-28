/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * Using for loops and println's, I created the Mona Lisa
 */

import acm.program.*;

public class AsciiArt extends ConsoleProgram {
	public void run() {
		/*
		 * Prints out the text including my name and description
		 */
		println("CS 106A ASCII ART by Justin Peng");
		println("The Mona Lisa");
		print(" ");
		/*
		 * Makes the top half of the picture frame
		 */
		for(int j = 0; j < 29; j++) {
			print("-");
		}
		for(int i=0; i < 5; i++) {
			println();
			print("|");
			for(int j=0; j < 29; j++) {
				print(" ");
			}
			print("|");
		}
		println();
		println("|        |         |          |");
		println("|        |         |          |");
		println("|     \\               /       |");
		println("|      \\             /        |");
		println("|        ___________         |");
		/*
		 * Makes the bottom half of the picture frame
		 */
		for(int i=0; i < 5; i++) {
			println();
			print("|");
			for(int j=0; j < 29; j++) {
				print(" ");
			}
			print("|");
		}
		println();
		print(" ");
		for(int j = 0; j < 29; j++) {
			print("-");
		}
	}
}
