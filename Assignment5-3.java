/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Assignment5
// SPECIFICATION: Test driver for class geek
// FOR: CSE 110- Assignment5
// TIME SPENT: 2 hour
// DATE: 9/16/17
//-----------------------------------------------------------*/

import java.util.Scanner;
import java.util.*;

public class Assignment5 
{
	public static void main (String[] args) {

		Scanner console = new Scanner (System.in);

		String choice;
		char command;


		// p[rint the menu
		printMenu();
		
		// create new geek object
		Geek myGeek = new Geek("Geek", 0);

		do
		{
			/*Ask user to choose command*/
			System.out.println("\nPlease enter a command or type ?");
			choice = console.next().toLowerCase();
			command = choice.charAt(0);

			switch (command)
			{
				case 'a':
					System.out.println("Name: " + myGeek.getName());
					break;
					
				case 'b': 
					System.out.println("Number of questions: " + 
					myGeek.getNumberOfQuestions());
					break;
					
				case 'c':
					System.out.println("Enter a number: ");
					int num1 = console.nextInt();
					System.out.println("Enter the second number: ");
					int num2 = console.nextInt();
					
					if (myGeek.isEven(num1,num2))
						System.out.println("The sum of the two numbers is even");
					else
						System.out.println("The sum of the two numbers is odd");
					break;
					
				case 'd': 
					System.out.println("Enter a number: ");
					int num3 = console.nextInt();
					System.out.println("Enter a second number: ");
					int num4 = console.nextInt();
					
					System.out.println("The sum between " + num3 + " and " + num4 + " is " + myGeek.sum(num3,num4));
					break;
					
				case 'e': 
					System.out.println("Enter a year: ");
					int year = console.nextInt();
					if (myGeek.leapYear(year))
						System.out.println("" + year + " is a leap year.");
					else
						System.out.println("" + year + " is not a leap year.");
					break;
					
				case '?':
					printMenu();
					break;
					
				case 'q':
					break;

				default:
					System.out.println("Invalid input");

			}

		} while (command != 'q');

	}  ///end of the main method


	public static void printMenu()
	{
		System.out.print("\nCommand Options\n"
			+ "-----------------------------------\n"
			+ "a: get name\n"
			+ "b: number of questions asked\n"
			+ "c: sum is even\n"
			+ "d: sum between two integers\n"
			+ "e: leap year\n"
			+ "?: display the menu again\n"
			+ "q: quit this program\n\n");

	} // end of the printMenu method

}  // end Assignment5 class