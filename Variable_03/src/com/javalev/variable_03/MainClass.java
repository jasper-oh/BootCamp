package com.javalev.variable_03;

public class MainClass {
	
	public static void main(String[] args) {
		int i = 10;
		int j = 2, k =5;
		
		System.out.println("<--산술 연산자-->");
//		System.out.println("덧셈:" + i + "+"+ j + "="+(i+j));
		Print("덧셈","+",i,j);
		Print("뺄셈","-",i,j);
		Print("곱셈","*",i,j);
		Print("나눈 몫","/",i,j);
		Print("나눈 나머지","%",i,j);
		
		System.out.println("<--자동 증감 연산자-->");
		
		i = i + 1 ;
		i ++;
		j--;
		
		
		System.out.println(i);
		
		System.out.println("<--동등 비교 관계 연산자-->");
		System.out.println("i == j" + (i == j)); // false 반환
		System.out.println("i != j" + (i != j)); //true 반환
		System.out.println("i >= j" + (i >= j));
		System.out.println("i <= j" + (i <= j));
		
		System.out.println("<--논리 연산자-->");
		System.out.println((i > j) && (j >k));
		System.out.println((i > j) || (j >k));
		
		System.out.println("<--삼항 연산자-->");
		System.out.println(k == 5 ? "k==5" : "k!=5");
		System.out.println(k == 3 ? "k==5" : null );
		
		//Exercise : i가 홀수 인지 짝수 인지 출력 하시오
		
		System.out.println(i % 2 == 0 ? "짝수" : "홀수");
		
		
	}
	// public 해도 private 해도 됨 cause in the same main method
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
