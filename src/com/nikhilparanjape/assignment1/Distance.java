package com.nikhilparanjape.assignment1
/**
 * A simple distance of two points program
 * 
 * Assignment 2.15
 *
 * @author Nikhil Paranjape
 * 
 */

import java.util.Scanner;
import java.lang.Math

public class Distance
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
	System.out.println("Enter x1 and y1:");
	double x1 = scan.nextDouble();
	double y1 = scan.nextDouble();
	
	System.out.println("Enter x2 and y2:");
	double x2 = scan.nextDouble();
	double y2 = scan.nextDouble();
	
	double a = Math.pow((x2 - x1),2);
	double b = Math.pow((y2 - y1),2);
	
	double dist = Math.pow((a+b),0.5);
	
	System.out.println("The distance between the two points is " + dist);
  }
}