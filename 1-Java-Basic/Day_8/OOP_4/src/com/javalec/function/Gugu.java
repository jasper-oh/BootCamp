package com.javalec.function;

import java.util.Scanner;

public class Gugu {
	
	private int num1;
	
	public Gugu(int num1) {
		this.num1 = num1;
		
	}
	
	
	
	public void guguPrint() {
		for(int i = 1 ; i <=9 ; i++ ) {
			if(i % 2 == 0) {
				System.out.println(num1 + "X" + i +"="+(i * num1));
			}else {
				System.out.println(num1 + "X" + "*" + "=" + (i * num1));
			}
			//System.out.println(num1 + "X" + (i % 2 == 0 ? "*" : i ) + "=" + (i * num1));
		}
	}
	
	//입력한 한자릿수 정수의 합을 출력하는 프로그램을 객체 지향형식으로 작성
	public void digitsSum() {
		System.out.println("Enter an integer (0~9) : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        
        System.out.println(sum); 
	}
}
