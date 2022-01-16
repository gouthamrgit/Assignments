package com.Assignment1;

import java.util.Scanner;

public class Average {
	
 public static void main(String[] args) {
	 int result=0;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter ");
	 for(int i=1;i<=10;i++) {
	 
	 int num1=sc.nextInt();
	 result=result+i;
	 
 }
	 System.out.println(result);
 }
}
