package com.bridgelabz.junit_Testing;

import java.util.Scanner;

public class VendingnMachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amount to Withdraw: ");
        int amount = scanner.nextInt();
        minimumNotes(amount);
        scanner.close();
	}
	//logic
	private static int thousandCount = 0, fiveHundredCount = 0, hundredCount = 0, fiftyCount = 0, tenCount = 0, fiveCount = 0, twoCount = 0, oneCount = 0;
	private static int minimumNotes(int amount) {
		if (amount > 0) {
			if (amount >= 1000) {
                amount = amount - 1000;
                thousandCount++;
	            } else if (amount >= 500) {
	                amount = amount - 500;
	                fiveHundredCount++;
	            } else if (amount >= 100) {
	                amount = amount - 100;
	                hundredCount++;
	            } else if (amount >= 50) {
	                amount = amount - 50;
	                fiftyCount++;
	            } else if (amount >= 10) {
	                amount = amount - 10;
	                tenCount++;
	            } else if (amount >= 5) {
	                amount = amount - 5;
	                fiveCount++;
	            } else if (amount >= 2) {
	                amount = amount - 2;
	                twoCount++;
	            } else {
	                amount = amount - 1;
	                oneCount++;
	            }
	            return minimumNotes(amount);
	        } else {
	            int minNumberOfNotes = thousandCount + fiveHundredCount + hundredCount + fiftyCount + tenCount + fiveCount + twoCount + oneCount;
	            System.out.println("Minimum number of notes: " + minNumberOfNotes);
	            System.out.println("1000 Notes " + ": " + thousandCount);
	            System.out.println("500 Notes " + ": " + fiveHundredCount);
	            System.out.println("100 Notes " + ": " + hundredCount);
	            System.out.println("50 Notes " + ": " + fiftyCount);
	            System.out.println("10 Notes " + ": " + tenCount);
	            System.out.println("5 Notes " + ": " + fiveCount);
	            System.out.println("2 Notes " + ": " + twoCount);
	            System.out.println("1 Notes " + ": " + oneCount);
	           
	            return 0;
        }

	}

}
