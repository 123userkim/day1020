package com.sist.exam05; 
 
import java.util.GregorianCalendar;
public class TeamTest {

		public static void main(String[] args) {
	 
			GregorianCalendar today = new GregorianCalendar(); //���� ��¥ �����
			int year = today.get(GregorianCalendar.YEAR); //���糯¥����, ���� �������
			int month = today.get(GregorianCalendar.MONTH); //mounth+1 �ʼ�
		
		 

			GregorianCalendar startDate = new GregorianCalendar(year,month,1);//1�� ����
			
			 
			
			 
			
			int day = startDate.get(GregorianCalendar.DAY_OF_WEEK);//�Ͽ����� 1
			System.out.printf("%d�� %d��\n",year,month+1);
			System.out.println("��\t��\tȭ\t��\t��\t��\t��");
			 
			
			//startDate�� ���� �������� ���ϱ�
			 
			
			 
			
			
			 
			
			//�� ���ϸ�ŭ ���ϱ�
			for(int i =1; i<day;i++) {
				System.out.print("\t");
			}
			
			
			
			//��������
			int []lastDate = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			for(int i=1;i<= lastDate[month]; i++) {
				System.out.print(i+"\t");
				if((i+day-1)%7 ==0) {
					System.out.println();
				}
			}
			
		
						
						
						
					
						
					
		
		}
}
