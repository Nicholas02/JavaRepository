package exercises;

import java.util.Scanner;

public class NauticalMiles {

	public static void main(String[] args) 
	{
		double InputMiles;
		double kilometersToMiles = 1.150779;
		double nauticalMiletoMile = 1.852;
		double convertedKilo, convertedNM;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of Miles >> ");
		InputMiles = input.nextDouble();
				
		convertedKilo = InputMiles * kilometersToMiles;
		convertedNM = nauticalMiletoMile * InputMiles;
		
		System.out.print("There are " + convertedNM + " Nautical miles and " + convertedKilo + " kilometers in " + InputMiles + " miles.");
		
		
		
	}

}
