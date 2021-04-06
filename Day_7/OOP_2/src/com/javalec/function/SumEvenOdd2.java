package com.javalec.function;


public class SumEvenOdd2 {

	//Field
	public int num = 0 ;
	
	//Method (함수)
	public void sumCalc(int num1, int num2) {
		int sum = 0;
		
		for(int i = num1 ; i <= num2 ; i ++){
			sum += i;
		}
		num = sum;
		System.out.println(num);
	}
	

	public void evenOdd() {
		String result;
		if(num % 2 == 1) {
			result = "Odd" ;
		}else {
			result = "Even";
		}
		
		System.out.println(result);
	}
	
	
	
}