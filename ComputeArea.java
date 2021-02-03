/*
 * This code computes the area of a circle
 * Excercise 1 
 * 
 * Meg Rocha
 * August 26, 2020
 */


package week2;

public class ComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1: Read in radius
		double radius, area;
		
		radius = 20;
		
		//Step 2: Compute Area
		
		area = 3.14159 * radius * radius;
		
		//Step 3: Display the area
		
		System.out.println("The area of the circle of the radius " + radius + " is " + area );
	}

}
