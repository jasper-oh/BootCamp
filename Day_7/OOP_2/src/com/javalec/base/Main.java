package com.javalec.base;

import com.javalec.function.SumEvenOdd;
import com.javalec.function.SumEvenOdd2;

public class Main {

	public static void main(String[] args) {
		
		
		int i = 1, j = 15;
		
		
//		SumEvenOdd seo = new SumEvenOdd();
//		int sum = seo.sumCalc(i , j);
//		
//		String chk = seo.evenOdd(sum);
//		
//		System.out.println(sum);
//		System.out.println(chk);

		
		SumEvenOdd2 seo2 = new SumEvenOdd2();
		
		seo2.sumCalc(1, 10);
		
		/* 다른 클래스 파일에서 접근하기 위해서는 해당하는 객체변수가 있는 
		 * 클래스 파일에 public 이라고 명시 해주면 접근이 가능하다. */
		
		int newNum = seo2.num;
		
		seo2.evenOdd();		
	}

}
