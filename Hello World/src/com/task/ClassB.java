package com.task;

public class ClassB 
{  int a=10;
   public String testMethod1()
   {
	   new ClassB(100,200,"Java");
	   System.out.println("40");
return new ClassB().testMethod3(new ClassB(50).testMethod2())+new ClassB().testMethod4("hi");   
   }
   ClassB()
   { 
	   System.out.println("HI");
   }
   public int testMethod2()
   {
	   System.out.println(50);
	   return 10+15;
   }
   ClassB(int a)
   {
	   System.out.println("java is awesome");
   }
   public String testMethod3(int a) 
   {System.out.println(18);
   return "is";
   }
   ClassB(int a,int b,String s)
   {
	   System.out.println(a+b);
	   System.out.println(s);
   }
   public String testMethod4(String s) 
   {
	   System.out.println(88);
	   return "good";
   }
   public static void main(String[] args)
   {
	   ClassB t1=new ClassB();
	   t1.a=10;
	   ClassB t2=new ClassB(50);
	   t2.a=30;
	 System.out.println("java"+t1.testMethod1()+" "+(t1.a+t2.a-30));  
	
}
 
}
