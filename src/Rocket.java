/*
 * Name: Justin Peng
 * Section Leader: Katherine Erdman
 * This program creates a rocket drawing out of symbols that can be scaled in size 
 * depending on the SIZE constant set by the programmer
 */

import acm.program.*;

public class Rocket extends ConsoleProgram {
	private static final int SIZE = 5;
	public void run() {
		cap();
		line();
		body();
		line();
		cap();
	}
	/*
	 * This creates the top pyramidal shaped sections of the rocket
	 */
	private void cap() {
		for(int i = SIZE; i > 0; i--) {
			println();
			for(int j = i; j > 0; j--) {
				print(' ');
			}
			for(int h=i; h<= SIZE; h++) {
				print('/');
			}
			for(int r=i; r<= SIZE; r++) {
				print('\\');
			}
		}
	}
	/*
	 * Creates both lines between the body and cap
	 */
	private void line() {
		int lineSize = SIZE*2;
		println();
		print("+");
		for(int i=0; i < lineSize; i++){
			print("=");
		}
		print("+");
	}
	/*
	 * Creates the body of the rocket which lies in between the two lines
	 */
	private void body() {
		for(int i = SIZE; i > 0; i--) {
			println();
			print("|");
			for(int j = i-1; j > 0; j-- ) {
				print(".");
			}
			for(int h = i; h<= SIZE; h++) {
				print("/\\");
			}
			for(int j = i-1; j > 0; j-- ) {
				print(".");
			}	
			print("|");
		}
		for(int i = SIZE; i > 0; i--) {
			println();
			print("|");
			for(int j = i+1; j<= SIZE; j++ ) {
				print(".");
			}
			for(int h = i; h > 0; h--) {
				print("\\/");
			}
			for(int j = i+1; j<=SIZE; j++ ) {
				print(".");
			}	
			print("|");
		}
	}
}
