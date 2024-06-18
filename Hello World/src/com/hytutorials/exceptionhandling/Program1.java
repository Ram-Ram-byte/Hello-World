package com.hytutorials.exceptionhandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Program1 {

	public static void main(String[] args)throws FileNotFoundException  ,IOException {
	System.out.println("Program start");
     int a=5;
     int  b=0;
      int result=0;
      File file=new File("D:/resume.dox");
      FileInputStream fis=new FileInputStream(file);
      System.out.println(fis);
     try {
    	 result=a/b;
     }
     catch(Exception e){ 
    	 System.out.println(e);
    	 System.out.println(e.getMessage());
    	 System.out.println(e.toString());
    	 System.out.println(Arrays.toString(e.getStackTrace()));
    	//  throw e;
     }
     finally {
    	 System.out.println("Final block present");
     }
     System.out.println( "output:"+ result);
    System.out.println("Program stop") ;
	}

}
