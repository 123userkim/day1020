package com.sist.exam05;
import java.util.Date;
public class System_CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long data = System.currentTimeMillis(); //���糯¥�� �ð��� ������ �и��������� �о����
		System.out.println(data); //��������� �뵵�ε� ����
		
		Date today = new Date(data);
		
		//long data2 = 2340325465436l; 
		//������ ���� ������ int�� �����.
		//���������� long�� ǥ���ϱ� ���Ͽ� ���̻� l�� ����(long�� l)
		long data2 =(long)16347153800821l;
		Date date = new Date(data2);
		System.out.printf("���ݽð� :%d�� %d�� %d��",today.getHours(),today.getMinutes(),today.getSeconds());
		System.out.printf("�Ʊ��� �ð� :%d�� %d�� %d��",date.getHours(),date.getMinutes(),date.getSeconds());
		
		
	}

}
