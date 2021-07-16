package com.javalec.base;

public class ThrowsClass {
	
	
	
//	 field
	
	
//	 constructor
	public ThrowsClass(){
	
		//생성되는 대로 바로 실행하게 된다. 
		doC();
	}
	
	
	
	
//	method
	
	private void doA() {
	
		System.out.println("doA");
		int[] arr = {1,2,3,4};
		System.out.println(arr[4]);
		
	}
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
		}catch(Exception e) {
			System.out.println("Exception is from here");
			System.out.println(e.getMessage());
		}
		System.out.println("endB");
	}
	
	private void doC() {
		System.out.println("doC");
		doB();
		System.out.println("endC");

	}

}
