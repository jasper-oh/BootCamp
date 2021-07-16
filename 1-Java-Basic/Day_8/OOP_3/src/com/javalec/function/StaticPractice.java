package com.javalec.function;

public class StaticPractice {
	public static int number1 ;
	public static int number2 ;
	public static int sum;
	
	
	/* static 변수는 this 를 참조할 인스턴스가 없기 때문에 this 를 사용하지 못한다.
	
	public StaticPractice(int number1 ,int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	*/
	
	public static int staticAddNum(int i ,int j) {
		
		sum = i + j;
		
		return i + j;
	}
	
	
	public static void intStaticAddNum(int[] args) {
		
		sum = 0;
		
		for(int i = 0 ; i < args.length ; i ++) {
			
			 sum += args[i];
			
		}
		
		System.out.println(sum);
		
	}
	
}
