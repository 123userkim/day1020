package com.sist.exam03;

public class StringTestvalueOf {
	
	public static void pro(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //위와 같은 어떤 메소드는 String만 매개변수로 갖는 메소드임
		
		int data =2021;
		
		//정수형 데이터 data를 갖고, pro를 호출해야하는 상황
		//pro는 String을 매개변수로 갖지 때문에 바로 호출할 수는 없고
		//data를 String으로 변환
		
		//pro(data);
		pro(String.valueOf(data));
		pro(data+"");
	}

}
