package com.MyShop;
	public class Appliances {
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
	
	
	}




