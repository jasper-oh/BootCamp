package com.javalec.base;

import java.util.*;


/********************************/
// 2021.03.31								
//	Writer								
//							
//								
//								
/*******************************/



public class ForMain {

	public static void main(String[] args) {
		

		AfterNoonClass anc = new AfterNoonClass();
//		anc.iteratorFor();
//		anc.OtoTsum();
//		anc.OtoTsum2();
//		anc.autoSum();
		anc.factorialCal();
		
	}

}

class AfterNoonClass {
	
	Scanner sc = new Scanner(System.in);
	int i;
//		print number 0 to 10 Method
	void iteratorFor() {
		for(i = 0 ; i <=10 ; i ++) {
			synPrint(i);
		}
	}
	
//	 get Sum Start 0 to 50 Method
	void OtoTsum() {
		int varSum = 0;
		for(i = 1 ; i<=50;i++) {
			varSum = varSum + i;
		}
		synPrint(varSum);
	}

//	Start in 0 End at 100 get Sum with for Iterator Method
	void OtoTsum2() {
		int varSumE = 0;
		int varSumO = 0;
//		for(i = 1; i <= 100;i++) {
//			if(i % 2 == 0) {
//				varSumE += i;
//			}else {
//				varSumO += i;
			
//			}
//		}
		for(i = 2;i <= 100; i+=2) {
			varSumE += i;
		}
	
	System.out.println("짝수의 합"+varSumE);
	System.out.println("홀수의 합"+varSumO);	
	}
//	 Take the Start Number and End Number from user and get Sum //
	void autoSum() {
		int sNum = sc.nextInt();
		int eNum = sc.nextInt();
		
		int totalSum = ((eNum - sNum + 1)*(sNum + eNum))/2;
		
		synPrint(totalSum);
	}
	// Factorial calculation Method
	void factorialCal() {
		System.out.println("숫자를 입력하세요 :");
		int eNum = sc.nextInt();
		double fNum =1;
		
		for(i = 1;i<= eNum;i++) {
			fNum *= i;
		}
		
		System.out.println(eNum+"'s"+"factorial value = " + fNum);
	}
	
//	Print syntex
	 void synPrint(int i) {
		System.out.println(i + " 을(를) 출력합니다.");
	}
}
