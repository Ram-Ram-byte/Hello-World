package com.hyrturotials.inheritance;

public class User {

	public static void main(String[] args) {
		Guest uobj=new Guest();
		uobj.read();
		Developer dobj=new Developer();
		dobj.read();
		dobj.write();
		Admin  aobj=new Admin();
		aobj.read();
		aobj.write();
		aobj.mange();

	}

}
