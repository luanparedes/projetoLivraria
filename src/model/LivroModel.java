/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Luan;
 */
public class LivroModel {
    
    private String title;
    private Double price;
    private String autor;
    private String editora;

    
    public LivroModel(String title, String aAutor, String aEditora, Double aPrice) {
        this.title = title;
        this.autor = aAutor;
        this.editora = aEditora;
        this.price = aPrice;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
}
