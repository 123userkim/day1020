package com.sist.exam04;

public class StringBufferTestAppend {

public static void pro(String str) {
	System.out.println(str);
}
	
 public static void main(String[] args) {
	StringBuffer data = new StringBuffer("hello");
	String msg ="java";
	int year =2021;
	boolean flag = true;
	
	data.append("/");
	data.append(msg);
	data.append("/");
	data.append(year);
	data.append("/");
	data.append(flag);
	
	System.out.println(data);
	
	//data�� ����, pro�޼ҵ带 ȣ���ϱ�
	
	pro(data.toString()); //string���� ������ִ� �� 
	
}
}