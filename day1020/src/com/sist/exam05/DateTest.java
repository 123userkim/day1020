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
	
	String []arr = {"��","��","ȭ","��","��","��","��"};
	String yoil1 = arr[day];
	
	/*switch(day) {
	case 0 : yoi= "��";break;
	case 1 : yoi="��";break;
	case 2 : yoi="ȭ";break;
	case 3 : yoi="��";break;
	case 4 : yoi="��";break;
	case 5 : yoi="��";break;
	case 6 : yoi="��";break;
	}
	*/
	
	System.out.println(day);
	System.out.printf("����� %d�� %d�� %d��(%s����) %d�� %d�� %d��",year,month,date,yoil1,hour,minutes,seconds);
	System.out.print("=======");
	
	//1995/07/29
	int birthYear =1995;
	int birthMonth=7;
	int birthDate =29;
	
	Date leeDate = new Date(birthYear-1900, birthMonth-1 ,birthDate);
	int day2 = leeDate.getDay();
	System.out.printf("�̰ǿ찡 �¾ ���� %s�����Դϴ�.",arr[day2]);
	
	
	
	
	
}
}
