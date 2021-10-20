package com.sist.exam05;
import java.util.Date;
public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long data = System.currentTimeMillis(); //현재날짜와 시간의 정보를 밀리세컨으로 읽어오기
		System.out.println(data); //난수만드는 용도로도 쓰임
		
		Date today = new Date(data);
		
		//long data2 = 2340325465436l; 
		//정수가 오면 무조건 int로 취급함.
		//정수형값에 long을 표시하기 위하여 접미사 l을 붙임(long의 l)
		long data2 =(long)16347153800821l;
		Date date = new Date(data2);
		System.out.printf("지금시간 :%d시 %d분 %d초",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("아까의 시간 :%d시 %d분 %d초",date.getHours(),date.getMinutes(),date.getSeconds());
		
		
	}

}
