package com.javalec.base;



public class ParentsClass  {

	private static int number1 = 1;
	private static int number2 = 2;
	
	
	
	public ParentsClass(int number1, int number2) {
		ParentsClass.number1 = number1;
		ParentsClass.number2 = number2;
		
	}
	
	
	static void addNumber(PracticeShit ps) {
		
		System.out.println(number1 + number2);
		
		
	}


	
}
