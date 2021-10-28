package com.sist.exam05; 
 
import java.util.GregorianCalendar;
public class TeamTest {

		public static void main(String[] args) {
	 
			GregorianCalendar today = new GregorianCalendar(); //현재 날짜 만들기
			int year = today.get(GregorianCalendar.YEAR); //현재날짜에서, 연도 갖고오기
			int month = today.get(GregorianCalendar.MONTH); //mounth+1 필수
		
		 

			GregorianCalendar startDate = new GregorianCalendar(year,month,1);//1일 설정
			
			 
			
			 
			
			int day = startDate.get(GregorianCalendar.DAY_OF_WEEK);//일요일이 1
			System.out.printf("%d년 %d월\n",year,month+1);
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			 
			
			//startDate가 무슨 요일인지 구하기
			 
			
			 
			
			
			 
			
			//그 요일만큼 더하기
			for(int i =1; i<day;i++) {
				System.out.print("\t");
			}
			
			
			
			//마지막날
			int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			for(int i=1;i<= lastDate[month]; i++) {
				System.out.print(i+"\t");
				if((i+day-1)%7 ==0) {
					System.out.println();
				}
			}
			
		
						
						
						
					
						
					
		
		}
}
