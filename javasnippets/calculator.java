package demo;

import java.util.*;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String operator = " ";
		int num1 = 0, num2 = 0;
		//Where the program will ask for the two numbers and the operator
	while (true) {
			System.out.println( "Number");
				num1 = keyboard.nextInt();
				System.out.println( "(+,-,* or /). ");
				operator = keyboard.next();
				System.out.println(" Number ");
				num2 = keyboard.nextInt();

				System.out.println(" The result of " + num1 + " " + operator + " " + num2 );
				// Starting the switch statement

		switch (operator) {
			case "*":
					System.out.println(" is " + (num1 * num2));
					break;
			case "/":
				System.out.println(" is " + (num1 / num2));
				break;
			case " -":
				System.out.println(" is " + (num1 - num2));
				break;
			case "+":
				System.out.println(" is " + (num1 + num2));
			default:
				System.err.println(" Error ");
				break;
			}
		}
	}

}
