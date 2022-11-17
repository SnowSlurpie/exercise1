package com.perscholas.java_basics;

public class IndexClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addInteger();
		addDouble();
		addIntDouble();
		divideInt();
		doubleTrouble();
		intVariables();
		namedConst();
		coffeeTime();
		
		
	}

	public static void addInteger() {

		int num1 = 1;
		int num2 = 2;

		int total = num1 + num2;

		System.out.println("The sum is " + total);
	}

	public static void addDouble() {

		double num3 = 11d;
		double num4 = 33d;

		double total1 = num3 + num4;

		System.out.println("Sum of the doubles is: " + total1);
	}

	public static void addIntDouble() {

		int num5 = 9;
		double num6 = 45d;

		double total2 = (double) num5 + num6;

		System.out.println("Sum of the doubles is: " + total2);
	}

	public static void divideInt() {

		int num7 = 6;
		double num8 = 9.3749d;

		double total3 = (double)num8 / num7;

		System.out.println("The results of the division are: " + total3);
	}
	public static void doubleTrouble() {

		double num9 = 11d;
		double num10 = 33d;

		double total4 = (int) num10 / num9;
		double total5 = (int) total4;
		

		System.out.println("The result of the division is: " + total4);
		System.out.println("The result cast to the int is: " + total5);
	}
	public static void intVariables() {

		int x = 5;
		int y = 6;
		
		double q = (y/x); 
		
		System.out.println("The results of the division are: " + q);
		
		q = (double)y;
		System.out.println("The results of the division with double q is: " + q);
		
	}
	
	public static void namedConst ( ) {
	
	final double PI = 3.145;
	final int Q = 32;
	final double RADIUS = Q*Q*PI;
	
	System.out.println("SURVEY SAYS:" + RADIUS);
	
	}
	
	public static void coffeeTime() {
		
		double mocha = 6.99d;
		double americano = 3.98d;
		double reindeer = 5.97d;
		
		double subtotal = mocha*3 + americano*4 + reindeer*2;
		final double SALES_TAX = .06*subtotal;
		double totalSale = SALES_TAX + subtotal;
		
		System.out.println(String.format("Your total from our coffee shop is $%.2f. Thank you for visiting and have a great day!" , totalSale));
		
		
	}
}
