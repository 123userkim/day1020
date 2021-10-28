package com.sist.exam06;
import java.util.Scanner;

import java.util.GregorianCalendar;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inputYear,inputMonth;
		
		System.out.println("년도를 입력하시오.");
		inputYear = sc.nextInt();
		System.out.println("월을 입력하시오.");
		inputMonth = sc.nextInt();
	
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar startDate = new GregorianCalendar(inputYear , inputMonth-1,1);//입력받은 날짜
		
		//요일 구하기
		int day = startDate.get(GregorianCalendar.DAY_OF_WEEK);//일요일이 1
		
		System.out.printf("%d년 %d월\n",inputYear,inputMonth);   
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//달의 1일의 요일만큼 빈칸 출력
		for(int i=1; i<day; i++) {
			System.out.print("\t");
		}
	
		int []lastDate= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = today.get(GregorianCalendar.MONTH);
		for(int i =1 ; i<= ( lastDate[month])+1;i++) {
			System.out.print(i+"\t");
			if(  (i+day-1)  %7==0 ){
				System.out.println();
		    }
		}
		

	}

	 

}
