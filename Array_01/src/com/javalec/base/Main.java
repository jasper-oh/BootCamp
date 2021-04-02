package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		MorningClass mc = new MorningClass();
		
//		mc.stringArray();
		mc.squareLogic();
		
	}

}

class MorningClass {
	
	Scanner sc = new Scanner(System.in);
	void basicConceptArray(){
		String[] str = new String[7];
		str[0] = "Sunday";
		str[1] = "Monday";
		str[2] = "Tuesday";
		str[3] = "Wendsday";
		str[4] = "Thursday";
		str[5] = "Friday";
		str[6] = "Saturday";
		
		System.out.println(str);
		System.out.println(str[1]);
		
		for(int i = 0 ; i <= (str.length); i ++) {
			System.out.println(str[i]);
		}
		System.out.println("당신의 요일은?");
		
	}
	void basicConceptArray_1() {
		//초기값이 있는경우
		String[] str = {"Sun","Mon","Tues","Wed","Thur","Fri","Sat"};
		
	}
	void appArray() {
		int[] inputValue = new int[5];
		int total = 0;
		double avg ;
		
		// 사용자로 부터 정보 입력 받아서 배열에 넣기
		
		System.out.println("Input 5 Num");
		for(int i = 0 ; i <= inputValue.length ; i ++) {	
			inputValue[i] = sc.nextInt();
		}
		
		// 입력한 정보의 합계 구하기
		for(int i = 0; i <= inputValue.length;i++) {
			total += inputValue[i];
		}
		
		
		// 입력한 정보의 평균 구하기 
		avg = (double)total /inputValue.length;

		
		// 입력한 정보 출력하기
		
		System.out.println("귀하가 입력한 정보는 다음과 같습니다");
		System.out.println("===========================");
		
		for(int i = 0 ; i <= inputValue.length ; i ++) {
			System.out.println(inputValue[i] + "\t");
		}
		
		System.out.println();
		System.out.println("입력한 숫자의 총합 : " + total);
		System.out.println("입력한 숫자의 평균 : " + avg);
		
		
		
	}
	void arrayAdvance() {
		int[] array1 = new int[5];
		array1[0] = 10;
		array1[1] = 20;
		array1[2] = 30;
		array1[3] = 40;
		array1[4] = 50;
		
		int[] array2 = new int[array1.length];
		
		for(int i = 0; i <array1.length; i ++) {
			array2[i] = array1[i];
		}
	
		
	}
	
	void stringArray() {
		double total  = 0D;
		int heightIndexMax = 0;
		int heightMax = 0;
		int heightIndexLow = 0;
		int heightLow = 0;
		
		String[] name = { "Jasper" , "Tylor" , "뜨또" , "Big T" , "Migos" };
		int[] height = new int[name.length];
		
		
		for( int i = 0 ; i < name.length ; i ++) {
			System.out.println(name[i]+"의 신장을 입력하세요!");
			height[i] = sc.nextInt();
			total += height[i];
			
			if(height[heightIndexMax] < height[i]) {
				heightMax = height[i];
				heightIndexMax = i;
			}else if(height[heightIndexLow] > height[i]){
				heightMax = height[i];
				heightIndexLow = i;
			}
		}
		
		System.out.println( "평균 신장은 : " + total / height.length );
		
		System.out.println("가장 큰 학생은" + name[heightIndexMax] + "이고 그 학생의 키는" + height[heightIndexMax] );
		System.out.println("가장 작은 학생은" +name[heightIndexLow]+ "이고 그 학생의 키는" + height[heightIndexLow]);
	}
	
	void squareLogic() {
		
			for(int i = 0 ; i <= 10 ; i++) {
				System.out.println("10 ^ "+ String.format("%2d",i)+" = " + String.format("%11.0f", Math.pow(10,i)));
			}
		}
	}
	

