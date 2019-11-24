package model;

public class ModelBooks {
	private String titulo;
	private String ISBN;
	private int cod_editora;
	private float preco;
	
	//Getters and Setters
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public int getCod_editora() {
		return cod_editora;
	}
	
	public void setCod_editora(int cod_editora) {
		this.cod_editora = cod_editora;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
