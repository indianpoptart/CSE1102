package com.nikhilparanjape.week6;

import java.util.Scanner;

public class mn {
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		int sum = 0;
		for(int i = 0; i < number; i++){
			sum = sum + scan.nextInt();
		}
		
		System.out.println("sum= " + sum);
	}
}
