package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		
//	 	변수와 상수
//		1) 문자열과 문자의 생성 차이
		
		String str = "James";	
		char chr = 'a';
//		char chr1  = 'abc'; 에러 발생
		
		int num = 10;
		
		System.out.println(str + ":" + + num);
		System.out.println(num + num);
		
		// Is integer type and float & integer and double & 
//		double and float can be add? 
		
		double numDouble = 20.3D;
		float numFloat = 20.4F;
		
		System.out.println(num + numDouble); // output : double type
		System.out.println(num +  (int)numFloat);// output : integer type
		System.out.println(chr);
		
		
		
//		 Boolean Type
		boolean bool = true; 
		

	}

}
