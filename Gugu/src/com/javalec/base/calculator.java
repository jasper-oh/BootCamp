package com.javalec.base;

import java.util.*;

public class calculator {

	public static void main(String[] args) {
		
		GuGudan ggd = new GuGudan();
		
//		ggd.gugudanNoOddnumber();
		
		ggd.enterNumAdd();
		
//		ggd.numberLength();
	}

}
class GuGudan{
	int dan;
	Scanner sc = new Scanner(System.in);
	
//	구구단 짝수만 출력 하는 method
	void gugudanEvenNumber() {
		dan = sc.nextInt();
		
		for(int i = 2;i<10;i+=2) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
	}
//	구구단 짝수만 출력 & 홀수부분은 생략 하는 method 
	void gugudanNoOddnumber() {
		dan = sc.nextInt();
		
		for(int i = 1;i<10;i++) {

			System.out.println(dan + " X " + (i%2 == 0 ? i : "_") + " = " + (dan * i));

			
		}
		
	
		
	}
	void enterNumAdd() {
		System.out.println("Enter an integer(0~9) :");
		int num = sc.nextInt();
		
		int sNum = 0;
		
		System.out.println((int)(Math.log10(num)+1));
		
//		(int)(Math.log10(num)+1)
		for(int i = num; i > 0  ; i/=10 ) {
			sNum += i % 10;
		}
		
//		while(num != 0) {
//			
//			sNum += num % 10;
//			
//			num /= 10;
//		}
		
		
		System.out.println("Sum of digits = " + sNum);
		
		
	}
	void numberLength() {
		int num = 3648;
		int length = (int)(Math.log10(num)+1);
		
		System.out.println(length);
	}
}
