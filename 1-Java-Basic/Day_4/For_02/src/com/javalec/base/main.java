package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		AfterNoonClass anc = new AfterNoonClass();
		anc.Exercise05();
	}

}

class AfterNoonClass{
	Scanner sc = new Scanner(System.in);
	void stringManage() {
		System.out.println("Apple\nBanana\nGrape");
		System.out.println("Apple\tBanana\tGrape");
		System.out.println("apple\"Banan\"Grape");
		System.out.println();
	}
	
	void calculateManage() {
		System.out.println("Input your number : ");
		int numEnd =sc.nextInt();
		// 1 단부터시작
		int startL = numEnd;
		
		// 9단이 마지막
		int endL = numEnd;
		
		// 한줄에 표시할 단의 수
		int PerLine = 9;
		
		// 최대 단의 갯수
		int maxGudan = 4;
		
		
		for (int i = startL; i <= endL; i += PerLine) {
			
		    for (int j = 1; j <= maxGudan; j++) {

//		    	현재 줄에서 가장 오른쪽에 놓일 단
		        int currentDanMax = i + (PerLine - 1);
		        
		        for (int danline = i; danline <= ((currentDanMax <= endL) ? currentDanMax : endL);danline++) {
		            System.out.print(danline + " x " + j + " = " + (danline * j) + "\t");
		        }
		       System.out.println();
		    }
		    System.out.println();
		}

	}
	void textCode(){
		for (int j = 1; j<=9 ; j ++){
			for(int i = 2 ; i<=9 ;i++) {
				System.out.println(i + "X" + j + "=" +(i*j)+"\t");
			}System.out.println();
		}
	}
	
	void inputDan() {
		System.out.println("Input your number : ");
		int num = sc.nextInt();
		
		
			for(int i = 1 ;i<=9;i++) {
				System.out.println();
			}
		
		
	}
	void Exercide04(){
		System.out.println("Input your number : ");
		int num = sc.nextInt();
		
		  for(int i=num; i<=num; i++) {
	            for (int j=1; j<8; j++) {
	                System.out.print(i +"*"+ j +"="+ i*j + "\t" + (i) +"*"+ (j+1) +"="+ (i)*(j+1) + "\t" +(i) +"*"+ (j+2) +"="+ (i)*(j+2) + "\n"); //print로 줄바꿈이 안 된채로 출력
	            }
	            System.out.println(); //각 숫자의 단이 끝나고 줄바꿈 역할
	        }
		
	}
	void Exercise04_1() {
		System.out.println("Input your number : ");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=9; i+=3) {
			Print(num, i);
			Print(num, i+1);
			Print(num, i+2);
		}
	}
	void Print(int i,int j) {
		System.out.println(i +"*"+ (j) +"="+ i*j + "\t"+i +"*"+ (j+1) +"="+ i*(j+1) + "\t"+i +"*"+ (j+2) +"="+ i*(j+2) );
	}
	void Exercise05(){
		for(int i = 2 ; i <= 9 ; i ++) {
			Print(i , 1);
		}
	}

}

