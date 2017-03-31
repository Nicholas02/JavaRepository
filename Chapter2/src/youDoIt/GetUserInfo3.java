package youDoIt;
import java.util.Scanner;
public class GetUserInfo3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		int age;

		Scanner imputdevice = new Scanner(System.in);
		System.out.println("Please enter your age>>");
		age = inputdevice.nextInt();
		inputdevice.nextLine();
		System.out.println("Please endter your name>>");
		name = inputdevice.nextLine();

		System.out.println("your name is " + name + " and you are " + age + " years old.");



	}

}
