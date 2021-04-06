package com.javalec.base;

public class OOPMain {
	public static void main(String[] args) {
		OrientedProgram cn = new OrientedProgram();
		cn.checkNum();
	}
}

class OrientedProgram {
	void checkNum() {
		// 1~10까지의 합을 구하여 출력하고, 그 합이 짝수 인지 홀수 인지 판단...
		int sum = 0 ;
		
		for(int i = 1 ; i < 11 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		if(sum % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		
		
	}
}