package basicprogramms;
import java.util.*;
public class BasicProgramme {
	public static void main(String[] args) {
		Q1();
		Q2();
		Q3();
		Q4();
		Q5();
		Q6();
	}
	
//	1.      WAP to swap two integer values using third variable.
	private static void Q1() {
		// TODO Auto-generated method stub
		int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        
        // Swapping using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
		
	}
	
//	2.      WAP to swap two integer values without using third variable.
	private static void Q2() {
		// TODO Auto-generated method stub
		int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        
        // Swapping without using a third variable
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    
	}

//	3.      WAP to convert temperature degree centigrade to degree Fahrenheit.
	private static void Q3() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in degrees Fahrenheit: " + fahrenheit);

        scanner.close();
	}
	
	
//	4.      WAP to calculate area and perimeter of circle, square, and rectangle.
	private static void Q4() {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Circle
	        System.out.print("Enter the radius of the circle: ");
	        double radius = scanner.nextDouble();
	        double circleArea = Math.PI * radius * radius;
	        double circlePerimeter = 2 * Math.PI * radius;
	        System.out.println("Circle Area: " + circleArea);
	        System.out.println("Circle Perimeter: " + circlePerimeter);

	        // Square
	        System.out.print("Enter the side length of the square: ");
	        double sideLength = scanner.nextDouble();
	        double squareArea = sideLength * sideLength;
	        double squarePerimeter = 4 * sideLength;
	        System.out.println("Square Area: " + squareArea);
	        System.out.println("Square Perimeter: " + squarePerimeter);
	        
	        // Rectangle
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the width of the rectangle: ");
	        double width = scanner.nextDouble();
	        double rectangleArea = length * width;
	        double rectanglePerimeter = 2 * (length + width);
	        System.out.println("Rectangle Area: " + rectangleArea);
	        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

	        scanner.close();
	}

//	5.      WAP to check the entered year is “Leap year” or “not Leap year”.
	private static void Q5() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // Check if the year is divisible by 100 and not divisible by 400
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
	}

//    6.      WAP to calculate the total salary of an employee, where the basic salary
//    		of employee is 10,000 and TA is 10%,DA is 20% and HRA is 30% of basic salary.
    private static void Q6() {
		// TODO Auto-generated method stub
		double basicSalary = 10000;
        double taPercentage = 0.10; // 10%
        double daPercentage = 0.20; // 20%
        double hraPercentage = 0.30; // 30%

        double ta = basicSalary * taPercentage;
        double da = basicSalary * daPercentage;
        double hra = basicSalary * hraPercentage;

        double totalSalary = basicSalary + ta + da + hra;

        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Travel Allowance (TA): " + ta);
        System.out.println("Dearness Allowance (DA): " + da);
        System.out.println("House Rent Allowance (HRA): " + hra);
        System.out.println("Total Salary: " + totalSalary);
		
	}
}
