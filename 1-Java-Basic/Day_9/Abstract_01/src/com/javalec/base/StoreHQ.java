package com.javalec.base;

public abstract class StoreHQ {

	
	
	// field
	
	// constructor
	
	public StoreHQ() {
		// TODO Auto-generated constructor stub
	}
	
	//	method
	// abstract  => 메소드 이름을 정할 수 있다. 장점이 이게 끝? 더 찾아보자
	
	/* 메소드 명 정의 의외의 abstract 사용법 
	 * 1. 기본적으로 이렇게 제공되는 것을 제거 할 수 없다 => 상속받는 클래스에게 강제성을 부여 하는것 처럼 보임
	 * 2. ~ ? */
	
	public abstract void orderKim();
	public abstract void orderBu();
	public abstract void orderBi();
	
	
}
