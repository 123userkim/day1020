package com.sist.exam02;
import java.util.Scanner;
import java.util.Date;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		System.out.println("�̸��Է�");
		name =sc.next();
		System.out.println("�ֹι�ȣ�Է�");
		jumin=sc.next();
		
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int userYear =Integer.parseInt(jumin.substring(0,2))+1900;  //substring�� �߶���� ��
		//integer.parseInt() ->���ڸ� ������ִ� ��
		int age = thisYear-userYear;
		
		char gender= jumin.charAt(7);
		String result ="����, ����";
		System.out.println("=======");
		System.out.println("���ؿ���"+thisYear);
		System.out.println("�̸�"+name);
		System.out.println("�������"+userYear);
		System.out.println("����"+age);
		System.out.println("����"+((gender=='1')?"����":"����"));
		System.out.println("=======");
		
		if(age>=40 && thisYear%2 == userYear%2){
			if(age>=50) {
				result += ",�����";
			}if(gender=='2') {
				result += ",�����,�ڱþ�";
			}
			System.out.println(name+"��, "+thisYear+"������"+"���� �ϰ��� ����ڰ� �Դϴ�");
			System.out.println("�����׸��� "+result);
		}else {
			System.out.println(name+"��, "+thisYear+"������"+"���� �ϰ��� ����ڰ� �ƴմϴ�");
		}
	}

}