package com.exercise.shit;

import java.util.Scanner;

public class Whatever {

	public static void main(String[] args) {
		MorningClass mc = new MorningClass();
		
		
			mc.exercise14();
		
	}

}

class MorningClass{
	Scanner sc = new Scanner(System.in);
	
	
	void exercise14() {
		
		int[] arr = new int[5];
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 현황");
		System.out.println("4. 종료");
		System.out.print("번호를 선택하세여 : ");
		int x = sc.nextInt();
		
		
		while(x != 4) {
			
			
			switch( x ) {
			
			case 1:
				System.out.print("고객번호 : " );
				int customerNum = sc.nextInt();
				System.out.print("금액 : ");
				int deposit= sc.nextInt();
				
				System.out.println("입금 결과 => 고객번호 : " + customerNum + "\t" + "잔액 : " + (arr[customerNum - 1] + deposit ) );
				
				arr[ customerNum -1 ] += deposit;
				
				System.out.println("-------------------------------------------");
				break;
				
			case 2:
				System.out.print("고객번호 : " );
				customerNum = sc.nextInt();
				System.out.print("금액 : ");
				int withdraw = sc.nextInt();
				if(arr[customerNum - 1] >= withdraw) {
					System.out.println("출금 되셨습니다.");
					System.out.println("출 결과 : 고객번호 :" + customerNum + "잔액 : " + (arr[customerNum - 1] - withdraw));
					arr[ customerNum -1 ] -= withdraw;
				}else if(arr[customerNum - 1] < withdraw) {
					System.out.println("잔액이 부족합니다.");
				}
				
				System.out.println("-------------------------------------------");
				break;
			case 3:
				System.out.println("\t" + "고객명"+"\t"+"잔액");
				System.out.println("\t" + "----"+"\t"+"----");
				for(int i = 0; i < 5 ; i++) {
					System.out.println("\t" +(i +1)+"\t"+arr[i]);
				}
				System.out.println("-------------------------------------------");
				break;
			case 4:
				System.out.println(">>>>> Thank you <<<<<");
				break;			
			
			}
			
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 현황");
			System.out.println("4. 종료");
			System.out.print("번호를 선택하세여 : ");
			x = sc.nextInt();
			
		}
		System.out.println(">>>>> Thank you <<<<<");
	}
	}
	
	
