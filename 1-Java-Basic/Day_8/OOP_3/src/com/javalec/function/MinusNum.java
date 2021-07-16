package com.javalec.function;

public class MinusNum {
	
	public int num1 , num2;
	
	public MinusNum(int num1 ,int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	public int minusNum(int i, int j) {	
		return j - i ;
	}
	
	public int minusNum2() {
		return num2 - num1;
	}
}
