package exception.handling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("Please enter your divisor number: ");
		Scanner sc = new Scanner(System.in);
		int divisor = sc.nextInt();
		int number = 10;
		try {
			
		    int result = number/divisor;
		    System.out.println("Result is: " +result);
		    
		}catch(Exception ex) {
			System.out.println("You can not divide a number by zero.");
		}
		System.out.println("We came up to this point");
		sc.close();

	}

}
