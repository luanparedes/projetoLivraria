package model;

public class LivroModel {
    
    private String title;
    private String isbn;
    private int publisher_id;
    private double price;

    
    public LivroModel() {
        
    }


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public int getPublisher_id() {
		return publisher_id;
	}


	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
