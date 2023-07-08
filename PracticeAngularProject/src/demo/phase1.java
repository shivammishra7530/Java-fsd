package demo;
import java.util.Scanner;


public class phase1 {



	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Choose one of the following shape");
	        System.out.println("1. Rectangle");
	        System.out.println("2. Circle");
	        System.out.println("3. Triangle");
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	            
	                calculateRectangleArea(scanner);
	                break;
	            case 2:
	                calculateCircleArea(scanner);
	                break;
	            case 3:
	                calculateTriangleArea(scanner);
	                break;
	            default:
	                System.out.println("Invalid choice.");
	        }

	        scanner.close();
	    }

	    private static void calculateRectangleArea(Scanner scanner) {
	        System.out.print("Enter the length of rectangle ");
	        double L = scanner.nextDouble();
	        System.out.print("Enter the width of rectangle ");
	        double B = scanner.nextDouble();

	        double area = L*B;
	        System.out.println("Area of rectangle is " + area);
	    }

	    private static void calculateCircleArea(Scanner scanner) {
	        System.out.print("Enter the radius of circle ");
	        double R = scanner.nextDouble();

	        double area = 3.14 * R * R;
	        System.out.println("Area of circle is" + area);
	    }

	    private static void calculateTriangleArea(Scanner scanner) {
	        System.out.print("Enter the base length of triangle ");
	        double B = scanner.nextDouble();
	        System.out.print("Enter the height of triangle ");
	        double H = scanner.nextDouble();

	        double area = 0.5 * B * H;
	        System.out.println("The area of the triangle is" + area);
	    }
	}

	

	    
	

	


