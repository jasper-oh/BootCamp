package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Gugu;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇단? : ");
		int num1 = sc.nextInt();
		
		Gugu gu = new Gugu(num1);
		gu.guguPrint();
		
		
		

	}

}
