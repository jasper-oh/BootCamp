package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		
//		ExceptionPractice ep = new ExceptionPractice();
//		
//		try {
//			ep.practice01();
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
		
		
		 new ThrowsClass();

	}

}

class ExceptionPractice{
	
	void practice01() {
		
		int i = 10;
		int j = 0;
		
		System.out.println("Add :" + (i+j));
		System.out.println("Sub :" + (i-j));
		System.out.println("Mul :" + (i*j));
		System.out.println("Div :" + (i/j));
		
	}
	
	void practice02() {
		
	
		
	}
	
	
}
