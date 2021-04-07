package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AddNum;
import com.javalec.function.DivideNum;
import com.javalec.function.MinusNum;
import com.javalec.function.MultiplyNum;

public class Main {

	public static void main(String[] args) {
		 
		
//		int num1 = 10 , num2 = 20 ;
		
		// Method 의 매개변수로 호출
		
//		AddNum addNum = new AddNum();
//		int resultNum = addNum.addAction(num1, num2);
//		System.out.println(resultNum);
		
		// 결과값과 sub Class 에서 실행
//		addNum.addPrint(num1,num2);
		
		//Constructor로 호춣
//		AddNum addNum2 = new AddNum(num1 , num2);
//		int resultNum2 = addNum2.addAction2();
//		System.out.println(resultNum2);
		
		
		// Field 값으로 호출
//		addNum.num1 = num1;
//		addNum.num2 = num2;
//		
//		int resultNum3 = addNum.addAction2();
//		System.out.println(resultNum3);
		
		
		/*  계산 부분 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 :");
		int num1 = sc.nextInt();
		
		System.out.println("숫자 2 :");
		int num2 = sc.nextInt();
	
		
		AddNum ad = new AddNum(num1, num2);
		int addResult = ad.addAction2();
		System.out.println(addResult);
		
		MinusNum mn = new MinusNum(num1 , num2);
		int minusResult = mn.minusNum2();
		System.out.println(minusResult);
		
		DivideNum dn = new DivideNum(num1, num2);
		int divideResult = dn.divideNum2();
		System.out.println(divideResult);
		
		MultiplyNum multin = new MultiplyNum(num1, num2);
		int multiplyNum = multin.multiplyNum2();
		System.out.println(multiplyNum);
		
		
		
		
		
	}

}
