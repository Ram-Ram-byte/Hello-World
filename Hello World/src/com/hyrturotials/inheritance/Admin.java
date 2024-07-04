package com.hyrturotials.inheritance;

public class Admin extends Developer {
	public void mange() 
	{  
		 super.read();//we can access parent method with super key word
		write();//we can call method without object in child class
	System.out.println("admin can manage");	
	}
   public void read() {
	   
	 System.out.println("admin read method");
   }
}
