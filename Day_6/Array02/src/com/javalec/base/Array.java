package com.javalec.base;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		MorningClass mc = new MorningClass();
		
		mc.practice_10();
		System.out.println("---Histogram---");
		mc.print();
		

		
		

	}

}

class MorningClass {
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	int[] histo = new int[10];
	
	void practice_10() {
		
		
		
		System.out.println("Input Score : ");
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println((i+1)+"의 score : ");
			arr[i] = sc.nextInt();		
			
//			if(num > 0 && num <= 10) {
//				arr[0] += 1;
//			}else if( num > 10 && num <=20) {
//				arr[1] += 1;
//			}else if( num > 20 && num <=30) {
//				arr[2] += 1;
//			}else if( num > 30 && num <= 40) {
//				arr[3] += 1;
//			}else if( num > 40 && num <= 50) {
//				arr[4] += 1;
//			}else if(num > 50 && num <= 60) {
//				arr[5] += 1;
//			}else if(num > 60 && num <= 70) {
//				arr[6] += 1;
//			}else if(num >70 && num <=80) {
//				arr[7] += 1;
//			}else if(num >80 && num <= 90) {
//				arr[8] += 1;
//			}else if(num >90 && num <=100) {
//				arr[9] += 1;
//			}
			histo[arr[i]/10]++;
			
		}
			
		}
	

	void print() {
		for(int i = 0 ; i < 100 ; i+=10) {
			System.out.println((i) + ":");
			hashPrint(histo[(i+1)/10]);
		}
	}
	
		
		
	
	void hashPrint(int c) {
		for(int i = 0 ; i < c ; i ++) {
			System.out.println("#");
		}
		System.out.println("");
	
	
}
}