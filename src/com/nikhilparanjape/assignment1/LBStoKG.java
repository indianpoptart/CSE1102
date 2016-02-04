package com.nikhilparanjape.assignment1;
/**
 * A simple pounds to kilograms converter
 * 
 * Assignment 2.4
 *
 * @author Nikhil Paranjape
 * 
 */

import java.util.Scanner;

public class LBStoKG
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    double poundToKg = 0.454;
    
    System.out.println("Enter a number in pounds:");
    double lbs = scan.nextDouble();
    double kg = lbs*poundToKg;
    System.out.println(lbs + " pounds is " + kg + " kilograms");
  }
}