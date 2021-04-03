package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		More mr = new More();
		mr.whileExercise06();
		
	}
}

class More{
	Scanner sc = new Scanner(System.in);
	void whileIterator() {
		
		int remainder = 0;
		int sum = 0;
		
		System.out.print("Enter an integer(0~9) : ");
		int iv = sc.nextInt();
		
		
		while (iv != 0) {
			remainder = iv % 10;
			sum += remainder;
			iv = iv / 10;
	}
		System.out.println("Sum of digits = " + sum);

	}
	
	void whileExercise06() {
		int i =0;
		int sum = 0;
		System.out.println("몇개의 숫자를 더할까요 ? : ");
		int num = sc.nextInt();
		
		System.out.println(num+"의 숫자를 입력하세요");
		
		while(i < num) {
			int numK = sc.nextInt();
			sum += numK;
			i++;
	}
		System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
}
}
