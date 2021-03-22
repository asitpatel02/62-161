package Assignment_4;

import java.util.Scanner;

public class AreaClass {

	static final double pi = Math.PI;                   // Constant Variable

	static double area(double radius){                  // area with method with radius as a parameter
		return pi*radius*radius;
	}

	static double area(double length, double width){     // area method with length and width as a parameters
		return length*width;
	}

	static double area(double radius, float height){    // area method with radius and height as a parameters
		return pi*radius*radius*height;
	}

	public static void main(String[] args) {            // main method

		Scanner keyboard  = new Scanner(System.in);     // create object for the scanner class

		System.out.print("Enter radius of the circle: ");
		double circleRadius = keyboard.nextDouble();    // read the user input as radius of the circle

		System.out.print("Enter length of the rectangle: ");
		double rectangleLength = keyboard.nextDouble(); // read the user input as radius of the rectangle
		System.out.print("Enter width of the rectangle: ");
		double rectangleWidth = keyboard.nextDouble();  // read the user input as width of the rectangle

		System.out.print("Enter Radius of the cylinder: ");
		double cylinderRadius = keyboard.nextDouble();  // read the user input as radius of teh rectangle
		System.out.print("Enter Height of the cylinder: ");
		float cylinderHeight = keyboard.nextFloat();    // read the user input as height of teh rectangle

		/* call the following AreaClass methods */
		System.out.println("The area of the circle is: " + AreaClass.area(circleRadius));

		System.out.println("The area of the rectangle is: " + AreaClass.area(rectangleLength, rectangleWidth));

		System.out.println("The area of the cylinder is: " + area(cylinderRadius, cylinderHeight));
	}
}