package com.sist.exam06;
import java.util.Scanner;

import java.util.GregorianCalendar;
public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inputYear,inputMonth;
		
		System.out.println("�⵵�� �Է��Ͻÿ�.");
		inputYear = sc.nextInt();
		System.out.println("���� �Է��Ͻÿ�.");
		inputMonth = sc.nextInt();
	
		GregorianCalendar today = new GregorianCalendar();
		GregorianCalendar startDate = new GregorianCalendar(inputYear , inputMonth-1,1);//�Է¹��� ��¥
		
		//���� ���ϱ�
		int day = startDate.get(GregorianCalendar.DAY_OF_WEEK);//�Ͽ����� 1
		
		System.out.printf("%d�� %d��\n",inputYear,inputMonth);   
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		//���� 1���� ���ϸ�ŭ ��ĭ ���
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
