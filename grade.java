/*If Condition
The below table details how the grade is calculated for a student based on this/her score Write a program to display the grade of a student.
a.90-100 Grade A
b.80-89 Grade B
c.60-79 Grade C
d.50-59 Grade D
e.Others Grade E*/
package com.Assignment1;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		int num;
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num>=90) {
			System.out.println("Grade A");
		}
		else if(num>=80 && num<=89) {
			System.out.println("Grade B");
		}
		else if(num>=60 && num<=79) {
			System.out.println("Grade B");
		}
		else if(num>=50 && num<=59) {
			System.out.println("Grade B");
		}
		else  {
			System.out.println("Grade B");
		}
		
	}

}
