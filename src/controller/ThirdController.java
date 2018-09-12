package controller;

import java.util.Scanner;

public class ThirdController 
{
	public void start ()
	{
	
		System.out.println("CS:GO");
		System.out.println("R6 is just better lol");
		
		questions();
		
		moreInput();
	}
	private void questions()
	{
		System.out.println("What is your favourite colour?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("Is you mom gey");
		answer = inputScanner.nextLine();
		
		System.out.println("What is ur fav hookay player?");
		answer = inputScanner.next();
		System.out.println(answer);		
		
//		inputScanner.close();
		// closed because I am still using the InputStream from the keyboard and don't want errors
	}
	
	private void moreInput()
	{
		Scanner textScanner; //this is a declaration of a scanner variable.
		
		textScanner = new Scanner(System.in); //initialization of the textScanner Variable.
		
		System.out.println("Type in your favorite number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite number is: " +  userNumber);
		
		System.out.println("Type in some more information about yourself");
		
		String answer = textScanner.nextLine();
		answer = textScanner.nextLine(); //Need to call .nextLine() to consume the enter press after the call to .next, .nextLine, or .nextDouble.
		System.out.println("You are " + answer);
		
		textScanner.close();
	}
	
	public boolean validInt(String sample)
	{
		//declares and initializes a boolean variable to false
		boolean isValid = false;
		
		try
		{
			//Tries to convert the text to an integer
			Integer.parseInt(sample);
			isValid = true;	
		}
		//catches error and tells user error
		catch(NumberFormatException error)
		{
			//tells user what to do
			System.out.println("You need to type in a number boi!");
		}
		
		return isValid;
	}
	
	public boolean validDouble(String example)
	{
		//Declares and initializes a boolean variable to false
		boolean isValid = false;
		
		try
		{
			//Tries to convert the number to a double
			Double.parseDouble(example);
			isValid = true;
		}
		//catches error and tells user oops
		catch(NumberFormatException oops)
		{
			//Tells user what to do to fix oops
			System.out.println("Only floating point values are accepted AKA a number with a . in it");
		}
		
		return true;
	}
	
	
	
}
