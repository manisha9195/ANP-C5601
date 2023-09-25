package lab_assignment;
import java.util.*;
/*Write a program in Java to accept the name of an employee and his/her annual income.
 *  Pass the name and the annual income. Displays the name of the employee and the 
 *  income tax as per the given tariff:

Annual Income              Income Tax

Up to ₹2,50,000             No tax

₹2,50,001 to ₹5,00,000      10% of the income exceeding ₹2,50,000

₹5,00,001 to ₹10,00,000     ₹30,000 + 20% of the amount exceeding ₹5,00,000

₹10,00,001 and above        ₹50,000 + 30% of the amount exceeding ₹10,00,000

                    
*/
public class IncomeAndTax {
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

       		System.out.print("Enter the name of the employee: ");
        	String name = scanner.nextLine();

        	System.out.print("Enter the annual income: Rs. ");
        	double income = scanner.nextDouble();

        	double tax = calculateIncomeTax(income);

        	System.out.println("\nName: " + name);
        	System.out.println("Income Tax: Rs. " + tax);

        	scanner.close();
    	}	
	
    	public static double calculateIncomeTax(double income)
	{
        	if (income <= 250000) 
		{
            	return 0;
       		} 
		else if (income <= 500000) 
		{
            	return (income - 250000) * 0.1;
        	} 
		else if (income <= 1000000) 
		{
            	return 30000 + (income - 500000) * 0.2;
        	}
		else 
		{
            	return 50000 + (income - 1000000) * 0.3;
        	}
    	}

}
