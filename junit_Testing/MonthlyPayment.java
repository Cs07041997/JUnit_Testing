package com.bridgelabz.junit_Testing;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Principle Loan Amount: ");
	        float principleAmt = scanner.nextFloat();
	        System.out.print("Enter Years To Return The Loan: ");
	        int year = scanner.nextInt();
	        System.out.print("Enter a Rate Of Interest: ");
	        float roi = scanner.nextFloat();
	        scanner.close();

	        getMonthlyPayment(principleAmt, year, roi);
	    }

	    private static void getMonthlyPayment(float P, int Y, float R) {
	        int n = Y * 12;     // number of months for 'y' years
	        float r = R / (12*100);
	        float payment = (P*r) / (float)(1-(Math.pow(1+r, -n)));
	        System.out.printf("Monthly Payment: %.2f", payment);

	}

}
