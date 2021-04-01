package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		GuGuDan ggd = new GuGuDan();
//		ggd.inputGuGuDan();
		ggd.fullGuGuDan();
		
		
		}

	}

class GuGuDan {
	Scanner sc = new Scanner(System.in);
	
	
	void inputGuGuDan(){
		System.out.println("Input number");
		int dan = sc.nextInt();
		
		for (int i = 1; i<=9;i++) {
			System.out.println(dan + "X" + i + " = "+ String.format("%2s",(dan*i)));
		}
		
	}
	
	void fullGuGuDan() {
		System.out.println("시작단을 입력하세요 : ");
		int numS = sc.nextInt();
		System.out.println("끝단을 입력하세요 : ");
		int numE = sc.nextInt();
		
		
		
		
		if(numS > numE) {
			int temp  = numS;
			numS = numE;
			numE = temp;
		} 
		for(int i =numS; i <= numE; i ++) {
			System.out.println("<--" + i + "단 -->");
			for(int j = 1; j <= 9; j++) {
				
				if( i % 2 == 0) {
					if(j % 2 == 0) {
						System.out.println(i + "x" + j + "=" + (i*j));
					}else {
//						System.out.println(i + "x" + "_" + "=" + (i*j));
						System.out.println("홀수 행이 사라집니다.");
					}
				} else {
					if( j % 2 == 0) {
//					System.out.println(i + "x" + "_" + "=" + (i*j));
						System.out.println("짝수 행이 사라집니다.");
				} else {
					System.out.println(i + "x" + j + "=" + (i*j));
				}
			}
			
			
		}
	}
	}
}
