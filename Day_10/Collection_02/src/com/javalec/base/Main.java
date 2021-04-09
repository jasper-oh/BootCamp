package com.javalec.base;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		//HashMap
		//key 와 value
		// 흔히 알고 있는 dictionary 와 비슷한 개념으로 생각하면 좋을듯 하다. 
		// 검색 위주의 용도로 사용하는 경우라고 생각하면 된다. 
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(10, "str0");
		hashMap.put(11, "str1");
		hashMap.put(21, "str2");
		hashMap.put(31, "str3");
		
		System.out.println(hashMap);
		
		

		// key 값을 get 안에 집어 넣으면 된다.
		// 순서가 있는 배열이 아니다.
		System.out.println(hashMap.get(11));
		
		
		HashMap<String,String> hashMap2 = new HashMap<String, String>();
		hashMap2.put("a", "apple");
		hashMap2.put("b", "banana");
		hashMap2.put("c", "kiwi");
		hashMap2.put("d", "Sprite");
		
		// 가져 오기
		System.out.println(hashMap2);
		System.out.println(hashMap2.get("c"));
		
		hashMap2.remove("a");
		System.out.println(hashMap2);
		
		hashMap2.clear();
		
		
	}
}
