package com.MyShop.home.app.customer;

import com.MyShop.Appliances;

public class Customers {
	private int CustId;
	private String CustName;
	private double quantity;
	private double amountByCustomers;
	private double totalAmount;
	private Appliances ap;
	
	public Customers( int CustId, String CustName, double quantity, double amountByCustomers,
			double totalAmount) {
		super();
		this.setCustId(CustId);
		this.setCustName(CustName);
		this.quantity = quantity;
		this.amountByCustomers = amountByCustomers;
		this.totalAmount = totalAmount;
		
	}
	public int getCustId() {
		return CustId;
	}
	public void setCustId(int CustId) {
		this.CustId = CustId;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String CustName) {
		this.CustName = CustName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getAmoungtByCustomers() {
		return amountByCustomers;
	}
	public void setAmoungtByCustomers(double amountByCustomers) {
		this.amountByCustomers = amountByCustomers;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	public void setAp(Appliances ap) {
		this.ap = ap;
	}
	Customers()
	{
		
	}
	public Appliances getAp() {
		return ap;
		
	}
	

	
}