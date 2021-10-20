package com.sist.exam05;
import java.util.Date;
public class DateTest {
public static void main(String[] args) {
	
	Date today = new Date();
	int year = today.getYear()+1900;
	int month = today.getMonth()+1;
	int date =today.getDate();
	int hour =today.getHours();
	int minutes =today.getMinutes();
	int seconds =today.getSeconds();
	int day = today.getDay();
	String yoil = "";
	
	String []arr = {"일","월","화","수","목","금","토"};
	String yoil1 = arr[day];
	
	/*switch(day) {
	case 0 : yoi= "일";break;
	case 1 : yoi="월";break;
	case 2 : yoi="화";break;
	case 3 : yoi="수";break;
	case 4 : yoi="목";break;
	case 5 : yoi="금";break;
	case 6 : yoi="토";break;
	}
	*/
	
	System.out.println(day);
	System.out.printf("현재는 %d년 %d월 %d일(%s요일) %d시 %d분 %d초",year,month,date,yoil1,hour,minutes,seconds);
	System.out.print("=======");
	
	//1995/07/29
	int birthYear =1995;
	int birthMonth=7;
	int birthDate =29;
	
	Date leeDate = new Date(birthYear-1900, birthMonth-1 ,birthDate);
	int day2 = leeDate.getDay();
	System.out.printf("이건우가 태어난 날은 %s요일입니다.",arr[day2]);
	
	
	
	
	
}
}
