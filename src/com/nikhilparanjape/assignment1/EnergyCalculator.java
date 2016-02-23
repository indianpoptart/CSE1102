package com.nikhilparanjape.assignment1;
/**
 * A simple energy calculator
 * 
 * Assignment 2.10
 *
 * @author Nikhil Paranjape
 * 
 */

import java.util.Scanner;

public class EnergyCalculator
{
  static double spHeat = 4184; //Sets constant for specific heat
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
	
    System.out.println("Enter the amount of water in kilograms:");
	double mass = scan.nextDouble();
	
	System.out.println("Enter the initial temperature (C):");
	double initTemp = scan.nextDouble();
	
	System.out.println("Enter the final temperature (C):");
	double finalTemp = scan.nextDouble();
	double diffTemp = (finalTemp - initTemp);
	double energy = mass*diffTemp*spHeat;
	
	System.out.println("The engery needed is " + energy + " joules");
	
	String t=null;
	
	
	try{
		System.out.println(t);
		System.out.println(t.length());
	} catch(NullPointerException e){
		System.out.println("Why?");
	}
	
  }
}