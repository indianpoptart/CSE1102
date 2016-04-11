package com.nikhilparanjape.wednesday;



import java.util.Scanner;

/**
 * Chapter 10 Exercise 5:
 *
 *      (Displaying the prime factors)
 *      Write a program that prompts the user to enter a positive integer
 *      and displays all its smallest factors in decreasing order.
 *      For example, if the integer is 120, the smallest factors are
 *      displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to store
 *      the factors (e.g., 2, 2, 2, 3, 5)
 *      and retrieve and display them in reverse order.
 *
 * Created by Nikhil Paranjape on 04/06/2016.
 */
public class Exercise_05 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        int factor = 2;
        while (factor <= num) {
            if (num % factor == 0) {
                stack.push(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}