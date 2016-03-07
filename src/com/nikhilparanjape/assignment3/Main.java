package com.nikhilparanjape.assignment3;

public class Main {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(); //Initialize Rectangle A
		Rectangle b = new Rectangle(); // Initialize Rectangle B
		
		a.width = 4;
		a.height= 40;
		
		b.width = 2.5;
		b.height = 35.9;
		
		System.out.println("Rectangle A: Width: " + a.width + "; Height: " + a.height + "; Area: " + a.getArea() + "; Perimeter: " + a.getPerimeter() + ".");
		
		System.out.println("Rectangle B: Width: " + b.width + "; Height: " + b.height + "; Area: " + b.getArea() + "; Perimeter: " + b.getPerimeter() + ".");
	}

}
