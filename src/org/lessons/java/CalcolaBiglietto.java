package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type how many kilometers you want to travel: ");
		int km = sc.nextInt();
		System.out.print("How old are you? ");
		byte age = sc.nextByte();
		
		sc.close();
		
		double fullPrice = 0.21 * km;
		double discountedPrice = fullPrice;
		
		if(age < 18) {
			discountedPrice *= 0.8;
		} else if(age >= 65) {
			discountedPrice *= 0.6;
		}
		
		System.out.println("You have " + age + " years and want to travel for " + km + " kilometers. The final price is: " + (String.format("%.02f", discountedPrice)) + "€");
	}
}
