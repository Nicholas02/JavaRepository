package gameZone;
import javax.swing.JOptionPane;
public class pay 
{

	public static void main(String[] args) 
	{
		skill();
	}
	public static void skill()
	{
		// TODO Auto-generated method stub
		//what skill level the worker is
		//options for insurance
		String skillLevelString;
		int skillLevelInt;
		String insuranceLevelString;
		int insuranceLevelInt;
		String hoursWorkedString;
		double hoursWorkedDouble;
		double totalGrossPay;
		double totalNetPay;
		double deduction;
		int skillAnswer = 0;
		
		
		skillLevelString = JOptionPane.showInputDialog(null, "What skill level are you 1, 2, or 3?");
		skillLevelInt = Integer.parseInt(skillLevelString);
		if(skillLevelInt == 1)
		{
			String insuranceLevelString1 = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString1);
			if(skillLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
				
			}
			if(skillLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20.00;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
			if(skillLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 17 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10.00;
				String retirementString = JOptionPane.showInputDialog(null, "3% retirment Option Yes or No?");
				if(retirementString.equals("Yes"));
				{
					
				}
				if(retirementString.equals("No"));
				{
					
				}
			}
		}
		if(skillLevelInt == 2)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(skillLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
			if(skillLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20.00;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
			if(skillLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 20 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10.00;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
		}
		if(skillLevelInt == 3)
		{
			insuranceLevelString = JOptionPane.showInputDialog(null, "What insurance do you have 1, 2, or 3?");
			insuranceLevelInt = Integer.parseInt(insuranceLevelString);
			if(skillLevelInt == 1)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 32.50;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
			if(skillLevelInt == 2)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 20.00;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
			if(skillLevelInt == 3)
			{
				hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours during the week did you work?");
				hoursWorkedDouble = Integer.parseInt(hoursWorkedString);
				totalGrossPay = 22 * hoursWorkedDouble;
				totalNetPay = totalGrossPay - 10.00;
				JOptionPane.showMessageDialog(null, "You worked " + hoursWorkedDouble + " hours. Your grosspay is " + totalGrossPay + " subtracting insurance for level 1 " + 
				"making your total net pay equal " + totalNetPay);
			}
		}
		
		
	}

}
