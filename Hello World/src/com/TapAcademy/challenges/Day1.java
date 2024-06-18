package com.TapAcademy.challenges;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int n=a.nextInt(); 
		System.out.println("input nunmber:"+n);
		System.out.println(checkZero(n));
	}
   public static String checkZero  (int a) {
	   
	if(a%10==0) {
	   System.out.println("number ends with Zero");
	   return "yes";
	}
	else {
		System.out.println("number  not ends with Zero");
		return "NO";
	}

	}

}
