package com.pojo.borrower;

public class Borrower {
	private int borrowerId;
	private String borrowerName;
	private String bookName;
	private int bookId;
	private int Fine;
	public int getBorrowerId() {
		return borrowerId;
	}
	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}
	public String getBorrowerName() {
		return borrowerName;
	}
	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getFine() {
		return Fine;
	}
	public void setFine(int fine) {
		Fine = fine;
	}
	@Override
	public String toString() {
		return "Borrower [borrowerId=" + borrowerId + ", borrowerName=" + borrowerName + ", bookName=" + bookName
				+ ", bookId=" + bookId + ", Fine=" + Fine + "]";
	}
	public Borrower(int borrowerId, String borrowerName, String bookName, int bookId, int fine) {
		super();
		this.borrowerId = borrowerId;
		this.borrowerName = borrowerName;
		this.bookName = bookName;
		this.bookId = bookId;
		Fine = fine;
	}
	public Borrower() {
	}
	
	

}
