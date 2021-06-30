package com.bridgelabz.junit_Testing;

import java.util.Scanner;

public class ToBinary {

		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a Decimal Number : ");
		        int decimalNum = scanner.nextInt();
		        scanner.close();
		        getBinary(decimalNum);
		    }

		    private static void getBinary(int n) {
		        int[] binaryNum = new int[20];
		        int i = 0;
		        while (n > 0)
		        {
		            binaryNum[i] = n % 2;
		            n = n / 2;
		            i++;
		        }
		        System.out.print("Number in Binary: ");
		        for (int j = i - 1; j >= 0; j--)
		            System.out.print(binaryNum[j]);
		   

	}

}
