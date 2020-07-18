package com.alevel;
// class of product
class Product{
	// attributes
	private int pid;
	 String name;
	 int price;
	
	// method (Behaviour)
	
	void setProductDetails(int pid , String name ,int price)
	{
		
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	
	//to read data from object Product
	
	void showProductDetails()
	{
		System.out.println("-----Pid:"+ pid +"------");
		System.out.println("-----name:"+ name +"------");
		System.out.println("-----price:"+ price +"------");
	}
	//using setter 
	void setpid(int pid) {
		this.pid=pid;
	}
	
	// using getter
	
	int getpid()
	{
		return pid;
	}
	
 class 	mobile extends Product
 {
	 // this class shows Is A relation ship
	 
	 String os;
		int ram;
		int rom;
		

		mobile(){
			System.out.println(">>mobile object constructed");
			}
 }
	
	
	Product(){
		System.out.println("<<Product Object Constructed");
		
	}
}
public class inharitance {

	public static void main(String[] args) {
		
		//creating an object named product
		
	/*	Product product1 = new Product();
		// this is not an object this is a reference variable which holds the hexcode of Product 
		//System.out.println("product is ="+ product1);
       
		
		// write data in object 
		
//		product1.setProductDetails(01, "iphonex", 50000);
//		//printing data
//		product1.showProductDetails();
//		
		//lets write data directly
		
		Product product2 = new Product();
	//	product2.pid=02; // we can not use this attribute because this is private.
		product2.setpid(02);
		product2.name="Iphone5";
		product2.price=40000;
		product2.showProductDetails();
		*/
		
		
		
		
	}

}
