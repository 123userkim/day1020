package com.sist.exam03;
import java.util.Scanner;


public class StringTeststartwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("?̸??? ?Է??Ͻÿ?");
		name =sc.next();
		
		if(name.startsWith("??")) {
			System.out.println("?达?Դϴ?.");
		}else {
			System.out.println("?达?? ?ƴմϴ?.");
		}
		
	}
}
