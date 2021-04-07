package com.javalec.function;

public class Gugu {
	
	private int num1;
	
	public Gugu(int num1) {
		this.num1 = num1;
		
	}
	
	
	
	public void guguPrint() {
		for(int i = 1 ; i <=9 ; i++ ) {
			System.out.println(num1 + "X" + i +"="+(i * num1));
		}
	}
}
