package com.javalec.base;

public class Variable_01 {

	public static void main(String[] args) {
//		변수(Variable)
//		문자열 변수 선언
		
//		data type , 변수 이름 =(-> 할당 연산자) 데이터
		String hello = "Hello World";
		
		System.out.println(hello);
		System.out.println(hello);
		
		hello = "GoodBye World";
		
//		변수 이름을 만들기 위해서는 Camel Cascading 
//		타입은 소문자 이지만, String 문자열 (클라스형태) 이것만 대문자로 시작--> 나중에 업데이트 됨
//		정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		
//		선언 부분은 위에 있는게 무조건 좋다 ! 
		int plusResult;
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println((double)num1 / num2);
		
		System.out.println((double)(num1 / num2));// 변환 의미 없음
		
		plusResult = num1 + num2;
		
		num1 = 100;
		
		System.out.println(plusResult);
		
		
//		------Exercise------
		
		int startNum = 30, endNum = 40;
		
//		30과 40의 덧셈의 결과는 70 입니다.
//		30과 40의 뺄셈의 결과는 -10 입니다.
//		30과 40의 곱셈의 결과는 1200 입니다.
//		30과 40의 나눗셈의 결과는  0 입니다.
		
		System.out.println(startNum+"과"+endNum+"의"+"덧셈 결과는"+(startNum + endNum)+"입니다");
		System.out.println(startNum+"과"+endNum+"의"+"뻴셈 결과는"+(startNum - endNum)+"입니다");
		System.out.println(startNum+"과"+endNum+"의"+"곱셈 결과는"+(startNum * endNum)+"입니다");
		float dividResult = startNum / endNum;
		System.out.println(startNum+"과"+endNum+"의"+"나눗셈 중 몫는"+(int)dividResult+"입니다");
		System.out.println(startNum+"과"+endNum+"의"+"나눗셈 결과는"+startNum/(double)endNum+"입니다");
		System.out.println(startNum+"과"+endNum+"의"+"덧셈 결과와 뺄셈결과의 곱은"+(startNum + endNum)*(startNum - endNum)+"입니다");
		
		
		
		
	}

}
