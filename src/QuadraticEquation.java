
 /*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * The user inputs values of a, b, and c and the program gives how many roots and the roots.
 */

import acm.program.*;

public class QuadraticEquation extends ConsoleProgram {
	public void run() {
		/*
		 * Asks the user to input a, b, and c
		 */
		println("CS 106A Quadratic Solver!");
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int c = readInt("Enter c: ");
		/*
		 * Does calculations for the discriminant to find how many roots there are and plugs the given values to get the roots.
		 */
		double Discriminant = b*b - 4*a*c;
		double sqrtDiscriminant = Math.sqrt(b*b - 4*a*c);
		double totalPositive = ((-1*b) + sqrtDiscriminant) /(2*a);
		double totalNegative = ((-1*b) - sqrtDiscriminant) /(2*a);
		if(Discriminant > 0) {
			println("Two roots: " + totalPositive + " and " + totalNegative);
		}
		if(Discriminant < 0) {
			println("No real roots");
		}
		if(Discriminant == 0) {
			println("One root: " + totalPositive);
		}
	}
}
