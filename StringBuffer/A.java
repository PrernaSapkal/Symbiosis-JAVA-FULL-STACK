package com.Demo;

public class A {
	public static void main(String[] args) {
		class Appliances {
			private int productId;
			private String productName;
			private double productPrice;
			private double GST;
			private int Stock;

			public double getGST() {
				return GST;
			}
			public void setGST(double GST) {
				this.GST = GST;
			}
			public void setProductId(int productId){
				this.productId=productId;	
			}
			public String getProductName() {
				return productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
			}
			public void setProductPrice(Double productPrice) {
				this.productPrice = productPrice;
			}
			public Double getProductPrice() {
				return productPrice;
			}

			public int getProductId() {
				return productId;
			}
			public int getStock() {
				return Stock;
			}
			public void setStock(int Stock) {
				this.Stock = Stock;
			}
			@Override
			public String toString() {
				return "Appliances [productId=" + productId + ", productName=" + productName + ", productPrice="
						+ productPrice + ", GST=" + GST + ", Stock=" + Stock + ", getGST()=" + getGST()
						+ ", getProductName()=" + getProductName() + ", getProductPrice()=" + getProductPrice()
						+ ", getProductId()=" + getProductId() + ", getStock()=" + getStock() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			
			
			}


		StringBuffer sb = new StringBuffer();
		System.out.println("capacity "+sb.capacity());
		System.out.println(sb.append("mumbai"));
		System.out.println(sb.append("-pune"));
		System.out.println(sb.append("-satara"));
		System.out.println(sb.append("-karad"));
		System.out.println("after capacity "+sb.capacity());
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb.append("-Delhi"));
	    System.out.println(sb.append("-Goa"));
	    
	    System.out.println(sb.append(sb1));
	    System.out.println("after capacity "+sb1.capacity());
	    Appliances ap = new Appliances();
	    ap.setGST(12);
	    ap.setProductId(1);
	    ap.setProductName("prer");
	    ap.setProductPrice(10000.0);
	    ap.setStock(0);
	    
	    sb.append(ap);
	    System.out.println(sb);
	    
	}
	

}
