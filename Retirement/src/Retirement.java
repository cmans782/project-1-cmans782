//**************************************************************//
//		Author:				Corey Manship						//
//		Major:				Information Technology				//
//		Creation Date:		9/10/2018							//
//		Due Date:			9/18/2018							//
//		Course:				CSC 243 Java Programming			//
//		Professor Name:		Professor Demarco					//
//		Assignment:			Project 1 Save for Retirement		//
//		Filename:			Retirement.java						//
//		Purpose:			To create a program that asks for	//
//							the number of years someone has		//
//							left for their career and calculate //
//							the retirement savings they should	//
//							have								//
//**************************************************************//

import java.text.DecimalFormat;
import java.util.Scanner;

public class Retirement {

	public static void main(String[] args) {
		// Making the user input variable
		Scanner userInput = new Scanner(System.in);

		double yearsUntilRetire;
		double moneySavedAnnually;

		System.out.print("Please enter the number of years until you retire!: ");
		yearsUntilRetire = userInput.nextDouble();
		System.out.print("Please enter the amount of money you can save each year: $");
		moneySavedAnnually = userInput.nextDouble();
		
		// looping to determine if input is valid
		while ((yearsUntilRetire <=0 || yearsUntilRetire > 120) || moneySavedAnnually <=0)
		{
			System.out.println("Enter a value that is less than 120 for years and greater than 0 for both!");
			System.out.println("");
			System.out.print("Please enter the number of years until you retire!: ");
			yearsUntilRetire = userInput.nextDouble();
			System.out.print("Please enter the amount of money you can save each year: $");
			moneySavedAnnually = userInput.nextDouble();
		}

		// if input is correct, run this code to calculate math and output
		DecimalFormat df = new DecimalFormat("#.00");
		final double INTEREST_RATE = .05;
		double interest = (moneySavedAnnually * INTEREST_RATE) * yearsUntilRetire;
		System.out.println("You will be charged $" + df.format(interest) + " for your retirement savings due to interest.");
		double totalSaved = (yearsUntilRetire * moneySavedAnnually) - interest;
		System.out.println("You will save: " + df.format(totalSaved) + " before you retire!");

	}
}
