package com.javalearning.OOP.Encapsulation;

//POJO :Plain old java obj
class ProductInfo{
	private int pid;
	private String pname;
	private String pimg;
	
	
	ProductInfo(int productId,String productName,String productImg){
		this.pid = productId;
		this.pname = productName;
		this.pimg = productImg;
	}
	//setter and getter
	public void setPid(int id){
		this.pid =id;
	}
	public int getPid(){
		return this.pid;
	}
	public void setPname(String pname){
		this.pname =pname;
	}
	public String getPname(){
		return this.pname;
	}
	public void setPimg(String pimg){
		this.pimg =pimg;
	}
	public String getPimg(){
		return this.pimg;
	}
	
	public String toString(){
		return "ProductId = "+this.pid+" ProductName = "+this.pname+" ProductImg = "+this.pimg;
	}
}

public class Test2 {

	public static void main(String[] args) {
		ProductInfo p1 = new ProductInfo(102,"Mobiles","MobileImg");
//		p1.setPid(101);
//		int id = p1.getPid();
//		System.out.println(id);
//		String name = p1.getPname();
//		System.out.println(name);
		
		System.out.println(p1);
		

	}

}
