package control;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.LivroModel;
import model.PrincipalModel;
import model.dao.postgres.ConexaoBD;

public class LivroController{

	static public ArrayList listaLivrosCompleto() throws SQLException{
        
		ArrayList<PrincipalModel> books = new ArrayList<>();
		ConexaoBD connect = new ConexaoBD();
		
		String query = "select bo.Title, au.name, pu.name, bo.price from books bo "
					   + "inner join booksauthors ba ON (bo.isbn = ba.isbn) "
					   + "inner join authors au ON (ba.author_id = au.author_id) "
					   + "inner join publishers pu ON (bo.publisher_id = pu.publisher_id)";
		connect.connectBD();
		try{
			Statement stm = c.createStatement();
			ResultSet rs = stm.executeQuery(query);
			
			while(rs.next()) {
                            //pega os dados do result set e atribui eles a uma var, para ser criado a linha com as informacoes do livro
				String title = rs.getString(1);
                                String nomeAutor = rs.getString(2);
                                String nomePublisher = rs.getString(3);
                                Double oPreco = rs.getDouble(4);
				books.add(new PrincipalModel(title,nomeAutor,nomePublisher,oPreco));
                                
			}
             return books;
        }
    }
	
	static public ArrayList buscaLivrosCompleto(String busca){
	    
		ConexaoBD connect = new ConexaoBD();
		ArrayList<PrincipalModel> books = new ArrayList<>();
		
		final String query = "select bo.title, au.name, pu.name, bo.price from books bo "
							 + "inner join booksauthors ba ON (bo.isbn = ba.isbn) "
							 + "inner join authors au ON (ba.author_id = au.author_id) "
							 + "inner join publishers pu ON (bo.publisher_id = pu.publisher_id)"
							 + "WHERE LOWER(bo.title)  LIKE LOWER(?) or LOWER(pu.name) LIKE LOWER((?)) or LOWER(au.name) LIKE LOWER((?))";
	    
	    connect.connectBD();
	    try {
	        PreparedStatement pst = connect.conn.prepareStatement(query);
	        pst.setString(1, "%"+busca+"%");
	        pst.setString(2, "%"+busca+"%");
	        pst.setString(3, "%"+busca+"%");      
	        ResultSet rs = pst.executeQuery();
		
			while(rs.next()) {
				String title = rs.getString(1);
		        String nomeAutor = rs.getString(2);
		        String nomePublisher = rs.getString(3);
		        Double oPreco = rs.getDouble(4);
				books.add(new PrincipalModel(title, nomeAutor, nomePublisher, oPreco));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return books;
	}
}
