package com.javalec.base;

public class MainClass {

	public static void main(String[] args) {
		
//		화면에 문자열 상수 출력
		System.out.println("---------------");
		System.out.println("| Hello, World |");
		System.out.println("---------------");
		
//		화면에 정수(숫자) 상수 출력
		System.out.println(10);
		System.out.println(10 + 20);
		System.out.println(10 - 20);
		System.out.println(10 * 20);
		
		
//		나눗셈을 할떄는 범위를 정해서 보내주기 때문에 정수와 정수를 나면 정수를 반환, 실수와 실수를 나누면 실수를 반환
		 
		System.out.println(10 / 20);
		System.out.println(10.0 / 20.0);
		
//		정수와 실수를 실수와 정수를 하게 된다면 실수를 반환하게 된다.
		
		System.out.println(10/20.0);

		
//		변수 선언
		int a = 10;
		int b = 20;
//		형변환 int -> float
		double afloat = (double)a;
		double bfloat = (double)b;
				
		System.out.println(a+"+"+b+"="+a+b);
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(afloat+"/"+bfloat+"="+(afloat/bfloat));
		
	}

}
