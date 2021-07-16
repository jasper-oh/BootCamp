package com.javalec.base;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		// Student 라는 타입으로 사용했다 Generic 
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student("James",100));
		arrayList.add(new Student("Jasper",200));
		arrayList.add(new Student("Harry",100));
		
		
		for( int i = 0 ; i < arrayList.size() ; i++) {
			System.out.print(arrayList.get(i).getName());
			System.out.println(arrayList.get(i).getScore());
		}
		

	}

}
