package gameZone;

import java.util.Scanner;

public class MadLibs
{

	private static Scanner inputDevice;


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String color;
		
		String wordEST;
		
		String bodyPartPlural;
		
		String animal;
		
		String noun;
		
		String pluralNoun;
		
		int a;
		
		int b;
		
		int c;
		
		inputDevice = new Scanner(System.in);
		
		System.out.println("Welcome to my MadLibs game");
		
		System.out.println("Enter a color>> ");
		color = inputDevice.nextLine();

		System.out.println("Enter a word ending in EST>> ");
		wordEST = inputDevice.nextLine();

		System.out.println("Enter a body part plural>> ");
		bodyPartPlural = inputDevice.nextLine();

		System.out.println("Enter an animal>> ");
		animal = inputDevice.nextLine();
		
		System.out.println("Enter a Noun>> ");
		noun = inputDevice.nextLine();
		
		System.out.println("Enter a Plural Noun>> ");
		pluralNoun = inputDevice.nextLine();
	
		System.out.println("Enter a number>> ");
		a = inputDevice.nextInt();
		inputDevice.nextLine();
		
		System.out.println("Enter another number less than the previous>> ");
		b = inputDevice.nextInt();
		inputDevice.nextLine();
		c = a -b;
	
		System.out.println("The " + color + " Dragon is the " + wordEST + " Dragon of all. It has " + c + " " +
		bodyPartPlural + ", and a "+ animal + " shaped like a " + noun + ". It loves to eat " + pluralNoun + 
		", although it will feast on nearly anything.");
	}

}
