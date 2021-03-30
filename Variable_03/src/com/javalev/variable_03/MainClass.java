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
		}else if ( b== "%") {
			System.out.println(a+":"+ d + b +e + "=" + (d%e));
		}
		
				
			
		
			
			
		
	}
}
