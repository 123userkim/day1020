package com.sist.exam03;

public class StringTestvalueOf {
	
	public static void pro(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //���� ���� � �޼ҵ�� String�� �Ű������� ���� �޼ҵ���
		
		int data =2021;
		
		//������ ������ data�� ����, pro�� ȣ���ؾ��ϴ� ��Ȳ
		//pro�� String�� �Ű������� ���� ������ �ٷ� ȣ���� ���� ����
		//data�� String���� ��ȯ
		
		//pro(data);
		pro(String.valueOf(data));
		pro(data+"");
	}

}
