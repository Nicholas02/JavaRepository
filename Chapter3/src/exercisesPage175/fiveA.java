	package exercisesPage175;

import java.util.Scanner;
	
	public class fiveA {
	
	public static void main(String[] args) 
	{
		
		double num1 = 2.0;
		double num2 = 5.0;

	Scanner inputDevice = new Scanner(System.in);
	System.out.println("enter a percentage >>>> ");
	num1 = inputDevice.nextDouble();
	inputDevice.nextLine();
	
	System.out.println("enter a percentage >>>> ");
	num2= inputDevice.nextDouble();
	inputDevice.nextLine();
	
	
	computePercent(num1, num2);
	}
	public static void computePercent(double num1, double num2)
	{
		System.out.println(num1 + " is the percent of " + num2 + " = " + (num1 / num2)*100);
		
		
		
		
		
	}
	
	}
