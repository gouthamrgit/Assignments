package com.Assignment1;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=1;i>=0;i--)
		   try{
		     System.out.println(a/i);  
		   }catch(ArithmeticException e){
		       System.out.println(e);
		   }

	}

}
