package com.javalec.base;

import java.util.*;

public class ForMain {

	public static void main(String[] args) {
		

		AfterNoonClass anc = new AfterNoonClass();
//		anc.iteratorFor();
		anc.OtoTsum2();
//		anc.autoSum();
		
	}

}

class AfterNoonClass {
	
	Scanner sc = new Scanner(System.in);
	int i;
		
	void iteratorFor() {
		
		for(i = 0 ; i <=10 ; i ++) {
			synPrint(i);
		}
		
	}
	 void synPrint(int i) {
		System.out.println(i + " 을(를) 출력합니다.");
	}
	 
	void OtoTsum() {
		int varSum = 0;
		
		for(i = 1 ; i<=50;i++) {
			varSum = varSum + i;
		}
		
		
		synPrint(varSum);
	}
	void OtoTsum2() {
		int varSumE = 0;
		int varSumO = 0;
		for(i = 1; i <= 100;i++) {
			if(i % 2 == 0) {
				varSumE += i;
			}else {
				varSumO += i;
			}
		}
	System.out.println("짝수의 합"+varSumE);
	System.out.println("홀수의 합"+varSumO);	
	}
	
	void autoSum() {
		int sNum = sc.nextInt();
		int eNum = sc.nextInt();
		
		int totalSum = ((eNum - sNum + 1)*(sNum + eNum))/2;
		
		synPrint(totalSum);
	}
}
