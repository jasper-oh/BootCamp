package com.javalec.calc;

import java.util.*;

public class Calc {

	//instance, object 객체 를 만들었다.
	static String ans1;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		calculator();
		
		
		
		do {	
			
			isThisNumberEven();
					
		}while(ans1.equals("y"));
	
		sc.close();
	}
	
	
	private static void isThisNumberEven() {
		System.out.println("숫자를 입력해 주세요 : ");
		int numCheck = sc.nextInt();
			
		System.out.println(numCheck % 3 == 0 ? "입력하신 숫자는 3의 배수입니다" : "입력하신 숫자는 3의 배수가 아닙니다");
		System.out.println("다시? y/n");
		ans1 = sc.next();
		
	}
	
	
	public static void calculator() {
		System.out.println("숫자를 입력하세요 : ");
		//.nextInt --> 메소드
		int num = sc.nextInt();
		
		System.out.println("숫자 1 을 입력하세요 : ");
		int num2 = sc.nextInt();
		// nextInt 는 파라미터가 어떻게 되는거지?? -> 없는 건가?
		
		System.out.println("원하시는 연산자를 입력하세요 :");
		String iterator = sc.next();
		
		System.out.println("숫자를 입력해 주세요 : ");
		int numCheck = sc.nextInt();	
		System.out.println(numCheck % 3 == 0 ? "입력하신 숫자는 3의 배수입니다" : "입력하신 숫자는 3의 배수가 아닙니다");
		
		//이것도 된다 .. !
		System.out.println(num % 2 == 0 ? "2의 배수" : num % 3 == 0 ? "3의 배수" : "모름");
	
	}
	
	public static void Print(String a,String b,int d, int e) {
		if (b == "+") {
			System.out.println(a+":"+ d + b +e + "=" + (d+e));
		}else if (b == "-") {
			System.out.println(a+":"+ d + b +e + "=" + (d-e));
		}else if (b == "*") {
			System.out.println(a+":"+ d + b +e + "=" + (d*e));
		}else if (b == "/") {
			System.out.println(a+":"+ d + b +e + "=" + (d/e));
		}else if ( b == "%") {
			System.out.println(a+":"+ d + b +e + "=" + (d%e));
		}
	}

}
