package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	
	
		public ChildMenu() {
			// TODO Auto-generated constructor stub
		}
		
		
		public void makeBeefChung() {
			System.out.println("Beef Chung");

		}
		
		public void makeHotDoen() {
			System.out.println("Spicy Doen");
		}
		
		
		//Parent's method override
		@Override
		public void makeChung() {
		// Mine => this // Parent class = > super
//		when using this thing, u can use parent stuff 
//			super.makeChung();
			System.out.println("non - smelly bean soup");
		}
}
