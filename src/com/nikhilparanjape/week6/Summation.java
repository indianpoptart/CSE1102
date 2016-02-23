package com.nikhilparanjape.week6;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me n");
		int n = 1;
		
		while(n*n < 12000){
			n++;
		}
		System.out.println(n-1);
	}

}
