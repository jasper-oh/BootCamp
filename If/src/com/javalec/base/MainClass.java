package com.javalec.base;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Scanner;

public class MainClass {
	
	static int i = 10;
	static int j = 20;
	static int k = 10;
	
	static int koreanScore;
	static int englishScore;
	static int mathScore;
	static double scoreAverage;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//		ifPractice1();
//		ifPractice2();
//		getScoreAverage();
		getBmiAverage();
		
		

		
		//반복문으로 묶기
//		String ans;
		
//		do {
//			
//			ifExercise();
//			System.out.println("계속 하시겠습니까 ?");
//			ans = sc.next();
//		}while(ans.equals("y"));
//		
//		System.out.println("while escape !");
//		
//		
		
		
	}
	
	
	private static void getBmiAverage() {
		
	
            //초기 메시지 표시
            System.out.println("당신의 BMI를 계산합니다.");
 
            //신장의 입력을 요구한다.
            System.out.println("신장을 입력해 주십시오. ( cm )");
            
            double fullHeight = sc.nextDouble();
            
            int height = (int)fullHeight;

            //체중 입력을 요구한다.
            System.out.println("체중을 입력해 주십시오");
 
            double fullWeight = sc.nextDouble();
            
            int weight = (int)fullWeight;
            
            long bmi = Math.round(weight /Math.pow(height, 2) *10000);

            
            System.out.println("당신의 BMI는 " + bmi +"입니다.");
            
            //18.5 저체중 22.9 정상 23.0 과체중
            
            if(bmi >= 23.0) {
            	System.out.println("당신은 과체중 입니다.");
            }else if(bmi < 23.0) {
            	System.out.println("당신은 정상 입니다.");
            }else if(bmi < 18.5) {
            	System.out.println("당신은 저체중입니다.");
            }
            
		
		
	}


	private static void getScoreAverage() {
		System.out.println("국어 점수 입력 : ");
		koreanScore = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		englishScore = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		mathScore = sc.nextInt();
		
		scoreAverage = (koreanScore + englishScore + mathScore) / 3;
		
		System.out.println("평균 점수는 : " + scoreAverage);
		
		ifStatement(koreanScore, englishScore, mathScore);

	}
	
	
	public static void ifStatement(int kScore,int eScore,int mScore) {
		
		if(kScore > scoreAverage){
			System.out.println("국어 점수는 평균보다 높다.");
		}else if(kScore == (int)scoreAverage) {
			System.out.println("국어 점수는 평균이다.");
		}else {
			System.out.println("국어 점수는 평균보다 낮다.");
		}
		
		if(eScore > scoreAverage){
			System.out.println("영어 점수는 평균보다 높다.");
		}else if(eScore == (int)scoreAverage) {
			System.out.println("영어 점수는 평균이다.");
		}else {
			System.out.println("영어 점수는 평균보다 낮다.");
		}
		
		if(mScore > scoreAverage){
			System.out.println("수학 점수는 평균보다 높다.");
		}else if(mScore == (int)scoreAverage) {
			System.out.println("수학 점수는 평균이다.");
		}else {
			System.out.println("수학 점수는 평균보다 낮다.");
		}
		
		
	}
	
	public static void ifPractice1() {
		// 비교문 #1
				
				if(i > j) {
					
				}
				
				System.out.println(">>> End <<<");
	}
	public static void ifPractice2() {
		//비교문 #2 비교문으로 입력한 숫자 크기의 차이 구하기
		
				if(i > j) {
					System.out.println("i가 j 보다" + (i -j)+" 만큼 큽니다");
				}else if(i == j) {
					System.out.println("i 와 j 가 같습니다.");
				}
				else {
					System.out.println("j가 i보다" + (j-i) + "만큼 큽니다.");
				}
				
				System.out.println(">>> End <<<");
	}
	public static void ifExercise() {
		
		System.out.println("성적을 입력하세요 :");
		int score = sc.nextInt();
		String grade;
		
		if (score >= 90) {
			grade = "A";
		} else if((score < 80) && (score > 70)) {
			grade = "B";
		} else if((score <= 70) && (score > 60)) {
			grade = "C";
		} else if((score <= 60) && (score > 50)) {
			grade = "D";
		}else if(score <= 50) {
			grade = "F";
		}else {
			grade = "error";
		}
		
		// 출력 부 
		if(grade.equals("error")) {
			System.out.println("점수가 잘못 입력되었습니다.");
		}else {
			System.out.println("귀하의 학점은 "+ grade +"입니다.");
		}
		
	}

}
