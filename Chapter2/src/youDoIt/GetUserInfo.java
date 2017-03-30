package youDoIt;
import java.util.Scanner;
public class GetUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name;
int age;

Scanner blahblah = new Scanner(System.in);		
		System.out.print("Please enter youre name>> ");
		name = blahblah.nextLine();
		System.out.println("Enter your age >>");
		age = blahblah.nextInt();
		System.out.print("your name is " + name + " and you are " + age + " years old.");
		
		
	}

}
