/*Abstract class
ABC Bank has two types of accounts - Savings Account and Current Account. 
Savings Account has the details such as account number, customer name,
balance and the minimum balance a customer needs to maintain. 
Current Account has details such as account number, customer name, 
balance and the customers of current account are permitted a overdraft 
amount upto a certain limit. Write a program to perform the transactions such as withdraw 
and deposit for both type of accounts.*/
package com.Assignment1;
//public class abc {
abstract class SAcc{
	int accnum;
	String Custname;
	double bal;
	double minbal;
	public SAcc(int accnum, String custname, double bal, double minbal) {
		super();
		this.accnum = accnum;
		Custname = custname;
		this.bal = bal;
		this.minbal = minbal;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getCustname() {
		return Custname;
	}
	public void setCustname(String custname) {
		Custname = custname;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getMinbal() {
		return minbal;
	}
	public void setMinbal(double minbal) {
		this.minbal = minbal;
	}
abstract void withDrraw();
	//{
//		if(minbal<=bal) {
//			
//		System.out.println("withdraw Amount");
//	}
//	}
abstract void deposit(double dAmount) ;
//{
//		double amount=bal+dAmount;
//		System.out.println();
//	}
}
abstract class CAcc{
	int accnum;
	String Custname;
	double bal;
	public CAcc(int accnum, String custname, double bal) {
		super();
		this.accnum = accnum;
		Custname = custname;
		this.bal = bal;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getCustname() {
		return Custname;
	}
	public void setCustname(String custname) {
		Custname = custname;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
abstract void withDrraw() ;
	//{
//		
//			
//		System.out.println("withdraw Amount");
//	
//	}
abstract void deposit2(double dAmount) ;
//{
//		double amount=bal+dAmount;
//		System.out.println();
//	}
 abstract class abc extends SAcc
//abstract class SAcc , CAcc implements  abc
{
	public abc(int accnum, String custname, double bal, double minbal) {
		super(accnum, custname, bal, minbal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			}
	}
}
