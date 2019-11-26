package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.LivroModel;
import model.dao.postgres.ConexaoBD;

public class LivroControl {
	
	ConexaoBD connect = new ConexaoBD();
	LivroModel modelo = new LivroModel();
	
	public void salvarLivro(LivroModel modelo) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO books VALUES(?, ?, ?, ?)");
			pst.setString(1, modelo.getTitle());
			pst.setString(2, modelo.getIsbn());
			pst.setInt(3, modelo.getPublisher_id());
			pst.setDouble(4, modelo.getPrice());
			pst.execute();
			System.out.println("Livro salvo com sucesso!");
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Nao foi possivel salvar esse livro!");
			JOptionPane.showMessageDialog(null, "Não foi possível salvar esse livro!\n" + e.getMessage());
			e.printStackTrace();
		}
		
		connect.disconectBD();
	}
}
