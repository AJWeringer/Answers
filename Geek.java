/*-------------------------------------------------------------------------
// AUTHOR: Anthony Weringer
// FILENAME: Geek
// SPECIFICATION: Class file creating geek objects
// FOR: CSE 110- Assignment5
// TIME SPENT: 1 hour
// DATE: 9/16/17
//-----------------------------------------------------------*/


public class Geek 
{
	/*Instance variables*/
	private String geekName;
	private int geekQuestions;
	
	/*Constructor*/
	public Geek(String name, int numQuestions)
	{
		geekName = name;
		geekQuestions = numQuestions;
	}
	
	/*Methods*/
	/*Return geek name*/
	public String getName()
	{
		return geekName;
	}
	
	/*Track number of questions asked*/
	public int getNumberOfQuestions()
	{
		return geekQuestions;
	}
	
	/*Determine if sum of user entered variables is even or odd*/
	public boolean isEven(int num1, int num2)
	{
		geekQuestions++;
		int sum = num1 + num2;
		boolean result = sum % 2 == 0;
		return result;
	}
	
	/*Find sum of a range of numbers between user entered integers*/
	public int sum(int num1, int num2)
	{
		geekQuestions++;
		int largest;
		int smallest;
		if(num1<num2)smallest = num1;
		else smallest = num2;
		if(num2>num1)largest = num2;
		else largest = num1;
		int sum2 = smallest;
		while(smallest<largest)
		{
			smallest++;
			sum2+=smallest;
		}
		if(num1==num2)sum2 = num1;
		return sum2;
	}
	
	/*Determine whether user entered a leap year*/
	public boolean leapYear(int year)
	{
		geekQuestions++;
		boolean result = false;
		if(year > 1582)
			if(year % 4 == 0 && year % 100 !=0)result = true;
			if(year % 400 == 0)result = true;
		if(year <= 1582)
			if(year % 4 == 0)result = true;
		return result;
	}

} /*Geek class*/
