package com.javalec.function;

public class SumEvenOdd {

	
	// Property
	
	
	
	/*Constructor (생성자)
	 *클래스 명 => Scanner sc = new // 생성자 => Scanner() //*/
	public SumEvenOdd() {
		
	}
	
	
	//Method (함수)
	public int sumCalc(int num1, int num2) {
		int sum = 0;
		
		for(int i = num1 ; i <= num2 ; i ++){
			sum += i;
		}
		
		return sum;
	}
	
	public String evenOdd(int num) {
		String result;
		if(num % 2 == 1) {
			result = "Odd" ;
		}else {
			result = "Even";
		}
		
		return result;
	}
	
	
	
}

