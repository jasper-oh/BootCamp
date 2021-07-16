package com.javalec.base;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AfterNoonClass anc = new AfterNoonClass();
		
//		anc.string();
//		anc.stringBuilder();
		
//		anc.randomRSP();
		
	}

}

class AfterNoonClass{
	Scanner sc = new Scanner(System.in);
	Random ran = new Random();
	void string() {
		 String str1 = "abcd";
		 String str2 = "EFGH";
		 String str3 = "IJKL";
		 String str4 = " abc def ghi";
		 
		 System.out.println(str1.concat(str2)); 
		 System.out.println(str1.substring(3)); 
		 System.out.println(str4.substring(3,5)); 
		 System.out.println(str1.length()); 
		 System.out.println(str4.toUpperCase()); 
		 System.out.println(str3.toLowerCase()); 
		 System.out.println(str1.charAt(3));
		 
		 
		 for(int i = 0; i < str1.length(); i ++) {
			 System.out.println(str1.charAt(3));
		 }

		 
		 System.out.println(str1.indexOf('c'));
		 System.out.println(str1.equals(str3));
		 
		 
//		 스페이스 제거 
		 System.out.println(str4.trim());
		 
//		 a 에서 Z 로 바뀜 
		 System.out.println(str1.replace('a','Z'));
		 System.out.println(str1.replaceAll("abc","KKKKKK"));
	}
	
	
//	stringbuilder 와 stringbuffer 그리고 string 용도는 모두 비슷하다.
//	
	
	void stringBuilder() {
		
//		String str = new String("abcdef");
		
		StringBuilder sb = new StringBuilder("abcdef");
		
		sb.append("ghijklm");
		
		System.out.println(sb);
		
		sb.insert(3, "zzz");
		System.out.println(sb);
		
		
		sb.delete(3, 5);
		System.out.println(sb);
	}
	
	void stringBuffer() {
		StringBuffer sb = new StringBuffer("abcdef");
		
		sb.append("ghijklm");
		
		System.out.println(sb);
		
		sb.insert(3, "zzz");
		System.out.println(sb);
		
		
		sb.delete(3, 5);
		System.out.println(sb);
		
	}
//	생성자가 있는 객체와 생성자가 없는 객체가 있다 === > new를 안쓰고 생성 가능!?
	void calendar() {
		
		Calendar cal = Calendar.getInstance();
//		YEAR == > static 변수
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(second +":"+ min + hour+":"+day + "," + month + "," + year );
	}
	
	/* String 과 StringBuilder 의 측정*/
	void timer() {
		String str1 = "a";
		
		long startTime = System.currentTimeMillis();
		
		for(int i=1; i<=50000 ; i ++) {
			str1 += "a";
		}
		
		long endTime= System.currentTimeMillis();
		System.out.println("Term1 : " + (endTime - startTime));
		
		
		StringBuilder sb = new StringBuilder("a");
		
		long startTimesb = System.currentTimeMillis();
		
		for(int i=1; i<=50000 ; i ++) {
			sb = sb.append("a");
		}
		
		long endTimesb= System.currentTimeMillis();
		System.out.println("Term2 : " + (endTimesb - startTimesb));
	}
	
	void random() {
		
//		Math 라는 클래스의 random 이라는 메소드
		
//		double 로 받기 때문에 걷드릴 것이많음
		double d = Math.random();
		int a = (int)(d*3) + 1;
		System.out.println(a);
		
//		int 로 받는것 요즘에 많이 쓰임
		
		int i = ran.nextInt(3);
		System.out.println(i+1);
	}
	
	void randomRSP() {
		
		
		String[] arrCom = {"R","S","P"};
		String[] arrMy = {"R","S","P"}; 
		int i = ran.nextInt(3);
		System.out.println(arrCom[i]);
		
		
		System.out.print("당신의 선택은 ? (0 : 바위 // 1 :가위 // 2 : 보) : ");
		int num = sc.nextInt();
		
		
		if(arrCom[i].equals(arrMy[num])) {
			System.out.println("Draw");
		}else {
			//Compare with index number ? //
			/* String[] arrMy = {"P","R","S"} => index same index num >> victory
			 * Lose / Draw Add & divide & multiply */
			if(i == 1 && num == 0 || i == 2 && num == 1 || i == 0 && num == 2) {
				System.out.println("You Win!");
			}else {
				System.out.println("You lose");
			}
			
		}
		
	}
	
	void intString() {
		/*MVC pattern == design (constructure)
		 * Model (DB) && View && Controller (WEB)
		 */
		
		int num1 = 123;
		String str1 = "12345";
		String str2 = "ABCDE";
		
		// num1 (int) => (String) 
		String str3 = Integer.toString(num1);
//		System.out.println(str1 + str3);
		
//		str1 (String) => (int)
		int num2 = Integer.parseInt(str1);
//		System.out.println(num1 + num2);
		
		Double.toString(num2);
		
		
		
		
		
	}
}
























