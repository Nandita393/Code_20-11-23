package code20;
import java.util.Scanner;
public class Compoundinterest {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
		    
	        System.out.print("Enter the principal amount here : ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the rate of interest in percentage: ");
	        double rateOfInterest = scanner.nextDouble();

	        System.out.print("Enter the years: ");
	        double years = scanner.nextDouble();

	        
	        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, years);
	        double compoundInterest = calculateCompoundInterest(principal, rateOfInterest, years);

	       
	        System.out.println("Simple Interest is : " + simpleInterest);
	        System.out.println("Compound Interest is : " + compoundInterest);

	        
	        scanner.close();
	    }

	    // Function to calculate simple interest
	    private static double calculateSimpleInterest(double principal, double rateOfInterest, double years)
	{
	        return (principal * rateOfInterest * years) / 100;
	    }

	    // Function to calculate compound interest
	    private static double calculateCompoundInterest(double principal, double rateOfInterest, double years)
	{
	        double compoundInterest = principal * Math.pow((1 + rateOfInterest / 100), years) - principal;
	        return compoundInterest;
	    }
	}

