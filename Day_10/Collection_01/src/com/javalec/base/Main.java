package com.javalec.base;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Practice pr = new Practice();
		
		pr.practice1();
		
//
//		
//	//ArrayList  <> -> Generic => type specification
//	ArrayList<String> arr = new ArrayList<String>();
//				
//	System.out.println("<<< ArrayList >>>");
//	
//	arr.add("str1");
//	arr.add("str3");
//	arr.add("str4");
//	arr.add("str5");
//
//	// 선택한 index에 해당하는 값을 집어넣기
//	arr.add(1,"str2");
//	
//	
//	System.out.println(arr);
//	// ArrayList의 Data 불러오기
//	//add 를 가져오고 get 으로 불러오기
//	
//	String str1 = arr.get(3);
//	System.out.println("Index 3 : " + str1);
//	
//	// ArrayList의 특정 index의 data를 수정하기
//	arr.set(1,"str2222");
//	System.out.println(arr);
//	
//	//ArrayList 의 크기 확인하기
//	int size = arr.size();
//	System.out.println("Size : " + size);
//
//	//ArrayList의 내용 삭제하기
//	arr.remove(1);
//	System.out.println(arr);
//	// => you can remove with the data value
//	arr.remove("str2222");
//	System.out.println(arr);
//	
//	// ArrayList 의 내용 전부 초기하 하기
//	arr.clear();
//	System.out.println(arr);
//	
//	
//	// Linked List
//	LinkedList<String> linkedList = new LinkedList<String>();
//	System.out.println(">>> Linked List <<<");
//	linkedList.add("str1");
//	linkedList.add("str3");
//	linkedList.add("str4");
//	linkedList.add("str5");
//	
//	System.out.println(linkedList);
//	String str11 = linkedList.get(3);
//	System.out.println("Index 3 : " + str1);
//	
//	// LinkedList의 특정 index의 data를 수정하기
//	linkedList.set(1,"str2222");
//	System.out.println(linkedList);
//	
//	//linkedListayList 의 크기 확인하기
//	int linkedSize = linkedList.size();
//	System.out.println("Size : " + linkedSize);
//
//	//ArrayList의 내용 삭제하기
//	linkedList.remove(1);
//	System.out.println(linkedList);
//	// => you can remove with the data value
//	linkedList.remove("str2222");
//	System.out.println(linkedList);
//	
//	// ArrayList 의 내용 전부 초기하 하기
//	linkedList.clear();
//	System.out.println(linkedList);
//	
//	// Vector
//	Vector<String> vector = new Vector<String>();
	
	
	}

}
class Practice{
	void practice1() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i= 1 ; i < 101 ; i++) {
			if( i % 2 == 0) {
				arr.add(i);
			}
		}
			
		int sum = 0;
		
			for(int i =0 ; i < arr.size(); i ++) {
				
				sum += arr.get(i);
				
			}
		System.out.println(sum);	
		}
	
	
	
	}



	
	
	
	
	
	
	
	
	
	
	
	
	

