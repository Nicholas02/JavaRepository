package execrises;
import java.util.Scanner;
/**
 * 
 * @author NA112006
 *
 */
public class StudentSwitch 
{
 /**
  * 
  * @param args
  */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int user, choice;
		Scanner input = new Scanner(System.in);
		do{
			
		
				System.out.print("how old are you? >>>> ");
				user = input.nextInt();
				switch(user)
				{
				case 138992:
					System.out.println("This is Dustys student id.");
					break;
				case 131193:
					System.out.println("This is Evanss student id.");
					break;
				case 122190:
					System.out.println("This is Brandons student id.");
					break;
				case 308508:
					System.out.println("This is AshLynns student id.");
					break;
				case 304275:
					System.out.println("This is Gairrens student id.");
					break;
				case 112006:
					System.out.println("This is Nicks student id.");
					break;
				case 138076:
					System.out.println("This is Alexs student id.");
					break;
				default:
				}
				System.out.println("Would you like to scan another? 1 for yes 2 for no");
				choice = input.nextInt();
		}while(choice == 1);
	}

}
