package com.javalec.function;


public class SumEvenOdd2 {

	//Field
	
	/* 다른 클래스 파일에서 접근하기 위해서는 해당하는 객체변수가 있는 
	 * 클래스 파일에 public 이라고 명시 해주면 접근이 가능하다. */
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