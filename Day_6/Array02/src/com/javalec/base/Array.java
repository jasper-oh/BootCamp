package com.javalec.base;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array {

	public static void main(String[] args) {
		MorningClass mc = new MorningClass();
		
//		mc.practice_10();
//		System.out.println("---Histogram---");
//		mc.print();
		
//		mc.exercise12();
		
		mc.Pyramid();
		

		
		

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
			histo[arr[i]/10]++;
		}
		
		sc.close();
		
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
	
	
	void Pyramid() {
		
		
		//Question
		System.out.print("몇 단계의 피라미드 ? : ");
		int x = sc.nextInt();
		int[][] arr1 = new int[x][x];
		
		int n = 1;
	    //첫 번째 직각삼각형
	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j <= i; j++){
	            arr1[i][j] = n;
	            
	            System.out.print(arr1[i][j] + " ");
	        
	            n++;
	        }
	        System.out.println();

	 }
	}
		
	
	

	
	void exercise11() {
		
		System.out.print("입력한 숫자의 갯수? : ");
		int num1 = sc.nextInt();
		
		int[] arr = new int[num1 + 1];
		
		System.out.println(num1+"개의 숫자를 입력하세요! :");
		int i ;
		for(i = 0 ; i < arr.length - 1 ; i++) {
			System.out.print((i+1)+"의 숫자 : ");
			arr[i] = sc.nextInt();
			}
		
		
		System.out.print("검색할 숫자는? : ");
		int num2 = sc.nextInt();
		

		if(IntStream.of(arr).anyMatch(x -> x == num2)) {
			System.out.print(num2 + "의 위치는 "+ i +"입니다." );
		}else {
			System.out.print(num2 + "는 존재하지 않습니다.");
		}
		
	}
	
void exercise12() {
		
		System.out.print("입력할 숫자의 갯수? : ");
		int num1 = sc.nextInt();
		
		int[] arr = new int[num1];
		int[] newArr = new int[num1+1];
		
		System.out.println(num1+"개의 숫자를 입력하세요!");
		
		for(int i = 0 ; i < num1  ; i++) {
			System.out.print((i+1)+"의 숫자 : ");
			arr[i] = sc.nextInt();
			}
		
		
		System.out.print("숫자를 삽입하고자 하는 위치는 ? : ");
		int num2 = sc.nextInt();
		
		System.out.print("삽입하고자 하는 숫자는 ? : ");
		int num3 = sc.nextInt();
		
		
		for(int f = 0 ; f < num2 - 1; f++ ) {
			
			newArr[f] = arr[f];
		}
		
		newArr[num2 - 1] = num3;
		
		for(int j = num1 ; j > num2 - 1 ; j--) {
			
			newArr[ j ] = arr[ j - 1  ];
		}
		
		
		
		
		System.out.println("=====conclusion======");
		
		for(int k = 0 ; k < num1 + 1 ; k++) {
			System.out.println(newArr[k]);
			
		
		}
		
	}
void exercise13() {
	
	System.out.print("입력한 숫자의 갯수? : ");
	int num1 = sc.nextInt();
	
	int[] arr = new int[num1];
	int[] newArr = new int[num1 -1];
	
	
	System.out.println(num1+"개의 숫자를 입력하세요! :");
	int i ;
	for(i = 0 ; i < num1  ; i++) {
		System.out.print((i+1)+"의 숫자 : ");
		arr[i] = sc.nextInt();
		}
	
	
	System.out.print("몇번째 숫자를 삭제 하시겠습니 ? : ");
	int num2 = sc.nextInt();
	
	int count = num2 - 2;
	

	
	for(int j = num2 - 2 ; j >= 0 ; j --) {
		newArr[ j ] = arr[count];
		count --;
	}
	
	for(int j = num1 - 2 ; j >= num2 - 1; j--) {
		newArr[ j ] = arr [ j + 1 ];
	}
	
	
	System.out.println("=====conclusion======");
	
	for(int k = 0 ; k < num1-1; k++) {
		System.out.println(newArr[k]);
		
	
	}
	
}
	    

	}