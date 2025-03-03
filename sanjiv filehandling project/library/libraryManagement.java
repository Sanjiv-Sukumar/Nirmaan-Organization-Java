package library;

import java.io.Serializable;

public class libraryManagement implements Serializable {
	private int bookId;
	private String bookName;
	private String author;
	private double price;
	
	public libraryManagement(int bookId, String bookName, String author, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	public libraryManagement() {
		super();
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "libraryManagement [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price="
				+ price + "]";
	}
	
	
}
