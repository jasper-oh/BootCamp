package com.javalec.base;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		
		
		int i = 1, j = 15;
		
		
		SumEvenOdd seo = new SumEvenOdd();
		int sum = seo.sumCalc(i , j);
		
		String chk = seo.evenOdd(sum);
		
		System.out.println(sum);
		System.out.println(chk);

	}

}
