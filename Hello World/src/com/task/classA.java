package com.task;

public class classA 
{
	public String  testMethod1() 
	{
	System.out.println(35);
	return new classA().testMethod3(new classA().testMethod2())+new classA().testMethod4("here");
	
	}
	public int testMethod2() 
	{
		System.out.println(25);
		return 25+5;
	}
	public String testMethod3 (int a)
	{
		System.out.println(15);
		return "is";
	}
	public String testMethod4 (String s) 
	{
	System.out.println(45);	
	return "awesome";
	}
	public static void main(String[] args) 
	{
		classA k=new classA();
		System.out.println("java"+k.testMethod1());
	}
	
	

}
