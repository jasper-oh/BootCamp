package com.javalec.base;

import java.util.*;


public class Main {

	
	public static void main(String[] args) {
		
		// hashSet 은 집합이기 때문에 중복된것을 없애주는 역활을 한다. 
		
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		
		System.out.println(hashSet);
		
	}
}
