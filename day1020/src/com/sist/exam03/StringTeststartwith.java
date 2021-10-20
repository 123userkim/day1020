package com.sist.exam03;
import java.util.Scanner;


public class StringTeststartwith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("ÀÌ¸§À» ÀÔ·ÂÇÏ½Ã¿À");
		name =sc.next();
		
		if(name.startsWith("±è")) {
			System.out.println("±è¾¾ÀÔ´Ï´Ù.");
		}else {
			System.out.println("±è¾¾°¡ ¾Æ´Õ´Ï´Ù.");
		}
		
	}
}
