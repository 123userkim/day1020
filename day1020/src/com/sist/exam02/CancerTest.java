package com.sist.exam02;
import java.util.Scanner;
import java.util.Date;

public class CancerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		System.out.println("이름입력");
		name =sc.next();
		System.out.println("주민번호입력");
		jumin=sc.next();
		
		Date today = new Date();
		int thisYear = today.getYear()+1900;
		int userYear =Integer.parseInt(jumin.substring(0,2))+1900;  //substring은 잘라오는 것
		//integer.parseInt() ->숫자를 만들어주는 것
		int age = thisYear-userYear;
		
		char gender= jumin.charAt(7);
		String result ="위암, 간암";
		System.out.println("=======");
		System.out.println("올해연도"+thisYear);
		System.out.println("이름"+name);
		System.out.println("출생연도"+userYear);
		System.out.println("나이"+age);
		System.out.println("성별"+((gender=='1')?"남자":"여자"));
		System.out.println("=======");
		
		if(age>=40 && thisYear%2 == userYear%2){
			if(age>=50) {
				result += ",대장암";
			}if(gender=='2') {
				result += ",유방암,자궁암";
			}
			System.out.println(name+"님, "+thisYear+"연도에"+"무료 암검진 대상자가 입니다");
			System.out.println("검진항목은 "+result);
		}else {
			System.out.println(name+"님, "+thisYear+"연도에"+"무료 암검진 대상자가 아닙니다");
		}
	}

}
