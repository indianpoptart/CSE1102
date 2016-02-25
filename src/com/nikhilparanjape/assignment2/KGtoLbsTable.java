package com.nikhilparanjape.assignment2;

/**
 * A simple kilograms to pounds table
 * 
 * Assignment 5.3
 *
 * @author Nikhil Paranjape
 * 
 */

public class KGtoLbsTable {

	public static void main(String[] args) {
		double sum = 0;
		System.out.println("Kilograms        Pounds");
		for(int i = 1; i < 199; i++){
			sum = i*2.2;
			System.out.println(i + "                   " + sum);
		}

	}

}
