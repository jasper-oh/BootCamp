package com.javalec.function;

public class DivideNum {
	public int num1 , num2;
	
	public DivideNum(int num1 , int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int divideNum(int i , int j) {
		return j / i ;
	}
	
	public int divideNum2() {
		return num1 / num2;
	}
	
	
}
