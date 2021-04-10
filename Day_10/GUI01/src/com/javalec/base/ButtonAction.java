package com.javalec.base;

public class ButtonAction {
	
	//Field
	
	int num1, num2;
	int result;
	
	//Constructor
	
	public ButtonAction(String num1 , String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);

	}
	
	//Method
	
	public String addAction() {
		
		result = num1 + num2;
		
		return Integer.toString(result);
		
	}
	
	public String minusAction() {
		
		result = num1 - num2;
		
		return Integer.toString(result);
	}
	
	public String muliplyAction() {
		
		result = num1 * num2;
		
		return Integer.toString(result);
	}
	
	public String divideAction() {
		
		double divResult = num1 / (num2*(1.0));
		
		String result = String.format("%4.2f",divResult);
		return result;
	}
	
	
	
	
	

}
