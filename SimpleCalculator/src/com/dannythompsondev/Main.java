package com.dannythompsondev;

public class Main {
	public static void main(String[] args){
		SimpleCalculator calc = new SimpleCalculator();

		double num = 50;
		calc.setFirstNumber(num);
		System.out.println(calc.getFirstNumber());
		System.out.println("+");
		double num2 = 100;
		calc.setSecondNumber(num2);
		System.out.println(calc.getSecondNumber());
		System.out.println("__________________");
		System.out.println(calc.getAdditionResult());
	}
}
