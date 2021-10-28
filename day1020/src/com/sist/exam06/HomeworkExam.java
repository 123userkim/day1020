package com.sist.exam06;
import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class HomeworkExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 컬렉션은 객체를 일렬로 늘어놓은 구조, 객체를 인덱스로 관리, 객체를 저장하면 자동 인덱스가 부여되고 인덱스로 객체를 검색/ 삭제할 수 있는 기능을 제공
		//get()
		//중복허용
		        ArrayList<String> arrList = new ArrayList<String>();
		        // 리스트에 요소의 저장
		        arrList.add("넷");
		        arrList.add("둘");
		        arrList.add("셋");
		        arrList.add("하나");
		        // 리스트 요소의 출력

		        for(int i = 0; i < arrList.size(); i++) {
		            System.out.println(arrList.get(i));
		        }
		        System.out.println("========");
		    
		
		//Set컬렉션의 경우에는 저장 순서가 유지x, Set컬렉션은 순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메서드도 존재x
		//대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공. iterator() 메서드를 호출하면 얻을 수 있음.
		//중복허용 x

		        
		        	
		        		HashSet<Integer> A = new HashSet<Integer>(); // set 선언
		        		
		        		A.add(1);
		        		A.add(2);
		        		A.add(3); // set에 중복값 저장 불가 
		        		A.add(4); // set에 값 담기
		        		
		        		System.out.println("set 크기 확인 : " + A.size());
		        		
		        		Iterator hi = (Iterator)A.iterator(); 
		        		while(hi.hasNext()) { 
		        			System.out.println(hi.next()); // 
		        		}
		        		
		        		 System.out.println("========");
		        	

		    
		
		//Map 컬렉션은 키(key)와 값(value)으로 구성된 객체를 저장하는 구조, 키는 중복으로 저장할 수 없고 값은 중복으로 저장할 수 있으며
		// 중복된 key값이 들어온다면 기존의 값은 없어지고 새로운 값으로 대체
		        
		        HashMap<String, Integer> b = new HashMap<String, Integer>();
		        b.put("one",1);
		        b.put("two",2);
		        b.put("three",3);
		        b.put("four",4);
		        
		        System.out.println(b.get("one"));
		        System.out.println(b.get("two"));
		        System.out.println(b.get("three"));
		        System.out.println(b.get("four"));
		        
		        
		        
		        
	}
}