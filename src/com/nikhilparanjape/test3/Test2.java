package com.nikhilparanjape.test3;

import java.util.Scanner;


public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int z = n-1;
		for(int i = 1; i <= n; i ++){
			for(int j = (i*n)-z; j <= i*n; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
