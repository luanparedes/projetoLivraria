package model;

public class PrincipalModel {
	
	private String title;
	private String author;
	private String publisher;
	private double price;
	
	public PrincipalModel(String aTitle, String aAuthor, String aPublisher, double aPrice) {
		this.setTitle(aTitle);
		this.setAuthor(aAuthor);
		this.setPublisher(aPublisher);
		this.setPrice(aPrice);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
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
	
}
