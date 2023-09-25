package lab_assignment;

public class Perimeter {

    public static double calculatePerimeter(double side) 
	{
        return 4 * side; 
    	}
    
    public static double calculatePerimeter(double length, double width)
	{
        return 2 * (length + width); 
    	}
    
    public static double calculatePerimeter1(double radius) 
	{
        return 2 * (22.0 / 7.0) * radius; 
    	}
    
    public static void main(String[] args) 
	{
        double side = 5;
        double length = 6;
        double width = 4;
        double radius = 3.5;
        
        double squarePerimeter = calculatePerimeter(side);
        double rectanglePerimeter = calculatePerimeter(length, width);
        double circlePerimeter = calculatePerimeter(radius);
        
        System.out.println("Perimeter of Square: " + squarePerimeter);
        System.out.println("Perimeter of Rectangle: " + rectanglePerimeter);
        System.out.println("Perimeter of Circle: " + circlePerimeter);
  	}
}
