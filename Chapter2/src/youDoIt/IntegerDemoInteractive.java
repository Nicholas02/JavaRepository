package youDoIt;
import java.util.Scanner;
public class IntegerDemoInteractive {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int anInt = 1234;
		byte aByte = 12;
		short aShort = 12345;
		long aLong = 1234567890987654321L;

	
Scanner input = new Scanner(System.in);
System.out.print("Please enter a interger >> ");
anInt = input.nextInt();
		System.out.print("Please enter a byte interger >> ");
		aByte = input.nextByte();
		System.out.print("Please enter a short integer >> ");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer >> ");
		aLong = input.nextLong();
		
		
		
		System.out.println("The int is " + anInt);
		
		System.out.println("The byte is " + aByte);
		
		System.out.println("The short is " + aShort);
		
		System.out.println("The long is " + aLong);
	
		
		
		
		
		
		
	}

}
