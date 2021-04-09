package com.javalec.base;

public class child1 extends LunchMenu{
	
	public child1() {
		
	}
	
	
	
	
	
	
	public child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		
	}






	@Override
	public int calc() {
		
		return rice + bulgogi + banana;
	}
	
	
	

}
