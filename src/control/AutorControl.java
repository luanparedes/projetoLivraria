package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.AutorModel;
import model.dao.postgres.ConexaoBD;

public class AutorControl {
	
	ConexaoBD connect = new ConexaoBD();
	AutorModel autor = new AutorModel();
	
	public void salvarAutor(AutorModel autor) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO authors VALUES(?, ?, ?)");
			pst.setInt(1, autor.getAuthor_id());
			pst.setString(2, autor.getName());
			pst.setString(3, autor.getFname());
			pst.execute();
			System.out.println("Autor salvo com sucesso!");
			JOptionPane.showMessageDialog(null, "Autor salvo com sucesso!!!");
		} catch(SQLException e) {
			System.out.println("Nao foi possivel salvar esse autor!");
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar esse livro!\n" + e.getMessage());
			e.printStackTrace();
		}
		
		connect.disconectBD();
	}
}
