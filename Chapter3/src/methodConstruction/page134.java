package methodConstruction;
import javax.swing.JOptionPane;
public class page134 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char vType = 's';
		int value;
		double commRate;
		String stringValue;
		stringValue = JOptionPane.showInputDialog(null, "Please enter value of the vehicle");
		value = Integer.parseInt(stringValue);
		stringValue = JOptionPane.showInputDialog(null, "Please enter the comm rate");
		commRate = Integer.parseInt(stringValue);
		
		computeCommission(value, commRate, vType);
		computeCommission(40000, 0.10, 'L');
		
		
	}
	public static void computeCommission(int value, double rate, char vehicle)
	{
		double commission;
	commission = value * rate;
		System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
		System.out.println("With " + (rate * 100) + "% commision rate, the commission is $" + commission);
		
		
	}



}
