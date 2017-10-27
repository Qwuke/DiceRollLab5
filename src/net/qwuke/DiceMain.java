/*
 * @author Tristan Mortimer
 * 
 * Simple dice rolling calculator demonstrating both Math.Random and util.Random for Lab 5 at GC
 * 
 */

package net.qwuke;

import java.util.Random;
import java.util.Scanner;

public class DiceMain {

	public static int rollMathSides(int sides) {
		int roll = (int) ((Math.random() * sides) + 1);
		return roll;
	}

	public static int rollRandomSides(int sides) {
		Random r = new Random();
		int roll = (int) ((r.nextDouble() * sides) + 1);
		return roll;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String valid = "y"; // String for validating whether or not to continue based on y or n
		int rollCount = 1;
		System.out.println("Welcome to the Grand Circus Casino");

		while (valid.equalsIgnoreCase("y")) {

			int sides = Validator.getInt(sc, "How many sides should each die have: ");
			System.out.println("Roll " + rollCount + ":");
			System.out.println(rollMathSides(sides));
			System.out.println(rollRandomSides(sides));

			System.out.println("Continue? Type y to continue or n to end the program");
			valid = sc.nextLine();
			while (!(valid.equalsIgnoreCase("y") || valid.equalsIgnoreCase("n"))) {
				System.out.println("That wasn't a valid input! Type y to continue or n to stop");
				valid = sc.nextLine();
			}
			rollCount++;
		} // If y, rerun the program
		sc.close();
	}

}
