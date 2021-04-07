package com.javalec.function;

public class AddNum {
	
	
	
	
	// Field
	
	public int num1 ,num2;	
	
	
//	 Constructor 
//	 Constructor 는 무조건 class 의 명과 같아야 한다. 그래야 메소드와 Constructor 의 형태를 구분 할 수 있다. 
	
<<<<<<< HEAD
	// Constructor
=======
>>>>>>> oop_1_concept
	public AddNum() {
		
	}
	
	
//	오버로딩 이라는 개념
	public AddNum(int num1, int num2) {
//		super(); =>  클래스 상속할때 나오는 개념 
//		super 라는 메소드 ?  의 개념
		this.num1 = num1;
		this.num2 = num2;
//		만약에 this 라는 키워드를 사용하지 않기 위해서는 변수 이름을 다르게 사용하면 된다. 
		
		
//		this.num1 => 위에 있는 전역 변수 (field 에 있는 것) = num1 => 파라미터에서 받아온 num1 , num2
		
	}

	// Method
	
	
	
	public int addAction(int x, int y ) {
		return x + y ;
	}
	
	public void addPrint(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}
	
	
	public int addAction2() {
		return num1 + num2;
	}
	
	
	
}
