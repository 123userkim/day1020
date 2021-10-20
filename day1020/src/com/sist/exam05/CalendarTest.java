package com.sist.exam05;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
	//오류남 : Calendar today = new Calendar();
		
		//Calendar today = Calendar.getInstance();
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH); //월은 출력시 +1
		int date = today.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.",year,month+1,date);
		
		
}
}
