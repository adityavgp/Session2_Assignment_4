package com.a2.classes;

import java.util.Scanner;

public class A2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int numberOne = scan.nextInt();
		System.out.println("Enter the Second Number: ");
		int numberTwo = scan.nextInt();
		System.out.println("Enter the Third Number: ");
		int numberThree = scan.nextInt();
		if (numberOne > numberTwo && numberOne > numberThree )
		{
			System.out.println("Number One is Greater ");	
		}
		else if ( numberTwo > numberThree )
		{
			System.out.println("Number Two is Greater");
		}
		else
			System.out.println("Number Three is Greater");
			
		
	}

}
