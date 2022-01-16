package com.Assignment1.Assign;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,num2;
		double output;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1=sc.nextDouble();
		System.out.println("Enter 2nd number");
		num2=sc.nextDouble();
		System.out.print("Enter an operator +, -, *, / ");
        char operator = sc.next().charAt(0);
        switch(operator) {
        case '+':
        	output = num1 + num2;
            break;
        case '-':
        	output = num1 - num2;
            break;
        case '*':
        	output = num1 * num2;
            break;
        case '/':
        	output = num1 / num2;
            break;
        default:
            System.out.printf("You have entered wrong operator");
            return;
        }
        System.out.println(num1+" "+operator+""+num2+" = "+output);

	}

}
