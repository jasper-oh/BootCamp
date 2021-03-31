package com.javalec.base;

import java.util.*;

public class Switch {

	public static void main(String[] args) {
		
		//클래스 객체화
		MorningClass mc = new MorningClass();
		
		//메소드 실행
//		mc.ifState();
		
		//메소드 실행
//		mc.switchState();
		
		mc.switchStateGrade();
		
	}

}

//오전 수업 클래스 생성
class MorningClass{
	
	//선언문
	Scanner sc = new Scanner(System.in);
	int num;
	String result;
	
	void ifState() {
		//선언문
		System.out.println("Enter the number! : ");
		num = sc.nextInt();
		
		
		//처리
		if(num % 2 == 0) {
			result = "Even Num";
		} else {
			result = "Odd Num";
		}
		
		//결과 보여주기
		System.out.println(result);
		
	}
	
	void switchState(){
		
		System.out.println("Enter the number! : ");
		num = sc.nextInt();
		
		//처리
		switch(num % 2) {
		case 0:
			result = "Even num";
			break;
		case 1:
			result = "Odd num";
			break;
		}
		
		//결과 보여주기
		System.out.println(result);
	}
	
	void switchStateGrade() {
		double grade;
		String result;
		
		System.out.println("점수를 입력하세요 : ");
		grade = sc.nextInt();
		
		double dCheckGrade = grade/10;
		int checkGrade = (int)(grade/10);
		
		
		switch(checkGrade) {
		case 10:
			if(dCheckGrade > 10) {
				System.out.println("Invalid Score");
				break;
			}
			
		case 9:
			result = "Grade A";
			System.out.println(result);
			break;
		case 8:
			result = "Grade B";
			System.out.println(result);
			break;
		case 7:
			result = "Grade C";
			System.out.println(result);
			break;
		case 6:
			result = "Grade D";
			System.out.println(result);
			break;
		case 5:
			
		case 4:
			
		case 3:
			
		case 2:
			
		case 1:
			
		case 0:
			result = "Grade F";
			System.out.println(result);
			break;
		}
		
	}
}
