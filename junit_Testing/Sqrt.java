package com.bridgelabz.junit_Testing;

import java.util.Scanner;

public class Sqrt {

	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Number To Find The Square Root : ");
	        int inputNumber = scanner.nextInt();
	        scanner.close();
	        final double epsilon = 1E-15;
	        float t = inputNumber;

	        while (Math.abs(t-inputNumber/t) > epsilon * t) {
	            double lastT = t;                         // storing last value of 't'
	            t = (float) ((inputNumber/t + t)/2.0);    // new value of 't'
	            if ( lastT == t) {                        // number gives a same square root repeatedly
	                break;                                // break 'while' loop if a number gives a same square root repeatedly
	            }
	        }
	        System.out.println("Square Root of " + inputNumber + " : " + t);

	}

}
