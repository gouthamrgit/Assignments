package com.Assignment1;

public class Product {
	private static final String Neww = null;
	int productid;
	String productname;
	double price;
	double qty;
	public Product(int productid, String productname, double price, double qty) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.qty = qty;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQty() {
		return qty;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	void display() {
	System.out.println( price*qty);
	}
	public static void main(String[] args) {
		Product p1=new Product(123, Neww, 50, 32);
		p1.display();
	}
}
