package rightTriangle;

import java.util.Scanner;

public class rightTriangle
{

	private static Scanner input;
	public static void main(String[] args) 
	{
		String choice;
		input = new Scanner(System.in);
		System.out.print("Which side are you trying to solve A, B, or C >>>>> ");
		choice = input.nextLine();
		if("C".equals(choice))
		{
		displayCSide();
		}
		if("B".equals(choice))
		{
		displayBSide();
		}
		if("A".equals(choice))
		{
		displayASide();
		}
		
		
	}
	public static void displayCSide()
	{
		double userEntryA, userEntryB, answerC;
		input = new Scanner(System.in);
		System.out.print("Enter your number for A side>>>>> ");
		userEntryA = input.nextInt();
		
		System.out.print("Enter your number for B side>>>>> ");
		userEntryB = input.nextInt();
		answerC = Math.sqrt(userEntryA * userEntryA + userEntryB * userEntryB);
		System.out.print(answerC);
	}
	public static void displayBSide()
	{
		double userEntryA, userEntryC, answerB;
		input = new Scanner(System.in);
		System.out.print("Enter your number for A side>>>>> ");
		userEntryA = input.nextInt();
		
		System.out.print("Enter your number for C side>>>>> ");
		userEntryC = input.nextInt();
		answerB = Math.sqrt(userEntryA * userEntryA + userEntryC * userEntryC);
		System.out.print(answerB);
	}
	public static void displayASide()
	{
		double userEntryB, userEntryC, answerA;
		input = new Scanner(System.in);
		System.out.print("Enter your number for B side>>>>> ");
		userEntryB = input.nextInt();
		
		System.out.print("Enter your number for C side>>>>> ");
		userEntryC = input.nextInt();
		answerA = Math.sqrt(userEntryB * userEntryB + userEntryC * userEntryC);
		System.out.print(answerA);
	}
	public static void trianglePicture()
	{
		System.out.println("t");
		System.out.println("tt");
		System.out.println("ttt");
		System.out.println("tttt");
		System.out.println("ttttt");
		System.out.println("tttttt");
		System.out.println("ttttttt");
		System.out.println("tttttttt");
		System.out.println("ttttttttt");
		System.out.println("tttttttttt");
		System.out.println("ttttttttttt");
	}
}
