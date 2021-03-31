package com.javalec.base;

public class ForMain {

	public static void main(String[] args) {
		

		AfterNoonClass anc = new AfterNoonClass();
		anc.iteratorFor();
		
	}

}

class AfterNoonClass {
	void iteratorFor() {
		int i;
		for(i = 0 ; i <=10 ; i ++) {
			print(i);
		}
		
	}
	 void print(int i) {
		System.out.println(i + " 를 출력합니다.");
	}
}
