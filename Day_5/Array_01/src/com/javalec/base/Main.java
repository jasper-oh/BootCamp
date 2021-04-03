package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	

		
		
		
		MorningClass mc = new MorningClass();
		
		mc.basicConceptArray_2();
//		mc.exercise11();
		
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
	void basicConceptArray_2() {
		
//		when initialized Array with syntax, On default, every value's are setting in 0 
		
		int[] array = new int[4];
		String[] strArray = new String[4];
		
//		Output : 0
		
		System.out.println(array[1]);
		System.out.println(strArray[1]);
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
	
	void exercise08() {
		
		int[] arr = new int[100];
		
		System.out.println("입력할 숫자의 갯수 ? (100개 미만) :  ");
		int num = sc.nextInt();
		
		int biggestNum = 0 ;
		int biggestidx = 0 ;
		
		System.out.println(num + "개의 숫자를 입력하세요");
		
		for(int i =  0 ; i < num ; i ++) {
			arr[i] = sc.nextInt();
			
			if(biggestNum < arr[i]) {
				biggestNum = arr[i];
				biggestidx = i;
			}
		}
			System.out.println("가장 큰값은 "+ arr[biggestidx] + "이고" +(biggestidx+1)+ "번째 값 입니다.");
		}
	
	void exercise09() {
		int num = 10;
		long result = 1;
		for(int i=0; i<=10; i++) {
			System.out.println("10 ^ " + String.format("%2d", i) + " = " + String.format("%11d", result));
			result *= num;
		}
	 }
	
	void exercise10() {
		
		int Karr[] = new int[4];
		int Earr[] = new int[4];
		int Marr[] = new int[4];
		int total[] = new int[4] ;

		System.out.println("Korean의 성적을 입력 : ");
		for(int i = 0 ; i <Karr.length; i ++) {
			System.out.println("No"+i+"의 성적은 : ");
			Karr[i] = sc.nextInt();
			  
		}
		
		System.out.println("English의 성적을 입력 : ");
		for(int i = 0 ; i <Earr.length; i ++) {
			System.out.println("No"+i+"의 성적은 : ");
			Earr[i] = sc.nextInt();
			  
		}
		
		System.out.println("Mathmatics 의 성적을 입력 :");
		
		for(int i = 0 ; i <Marr.length; i ++) {
			System.out.println("No"+i+"의 성적은 : ");
			Marr[i] = sc.nextInt();  
		}
		
		
		System.out.println("\t"+"Korean"+"\t"+"\t"+"English"+"\t"+"\t"+"Mathmatics"+"\t"+"Total"+"\t"+"Average");
		 for(int i = 0 ; i < Karr.length; i ++) {
			 
			 total[i] =Karr[i] + Earr[i] + Marr[i]; 
			 
			 System.out.println("No"+ (i+1) +"\t"+String.format("%6d", Karr[i])+"\t"+String.format("%12d", Earr[i])+"\t"+String.format("%14d", Marr[i])+"\t"+String.format("%11d", total[i])+"\t"+String.format("%6d", total[i]/3));
		 }
		
	}
	void exercise11() {
		String[] subjects = { "Korean" , "English" , "Mathmetics" };
		int Karr[] = new int[4];
		int Earr[] = new int[4];
		int Marr[] = new int[4];
		int total[] = new int[4];
		
		
		for(int i = 0 ; i < subjects.length ; i++) {
			System.out.println(subjects[i] + "의 성적을 입력 : ");
			
			
//			NOTE :// BUG ==>> If the user input 0 score in any Question 
//							  Than program down.
//							 
			for(int j = 0; j < 4 ; j ++) {
				System.out.println("No"+(j+1)+"의 성적은 : ");
				if(Karr[j] == 0 && Earr[j] == 0 && Marr[j] == 0 ) {
					Karr[j] = sc.nextInt();
				} else if(Karr[j] != 0 && Earr[j] == 0 && Marr[j] == 0 ) {
					Earr[j] = sc.nextInt();
				} else if(Karr[j] != 0 && Earr[j] != 0 && Marr[j] == 0 ) {
					Marr[j] = sc.nextInt();
				}
				total[j] = Karr[j] + Earr[j] + Marr[j];
				
			}
			
		}
		
		System.out.println("\t"+"Korean"+"\t"+"\t"+"English"+"\t"+"\t"+"Mathmatics"+"\t"+"Total"+"\t"+"Average");
		 for(int i = 0 ; i < Karr.length; i ++) {
			 
			 total[i] =Karr[i] + Earr[i] + Marr[i]; 
			 
			 System.out.println("No"+ (i+1) +"\t"+String.format("%6d", Karr[i])+"\t"+String.format("%12d", Earr[i])+"\t"+String.format("%14d", Marr[i])+"\t"+String.format("%11d", total[i])+"\t"+String.format("%6d", total[i]/3));
		 }
	}

		
	}
	
	

	

