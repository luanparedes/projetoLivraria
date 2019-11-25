package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.LivroModel;
import model.dao.postgres.ConexaoBD;

public class LivroControl {
	ConexaoBD connect = new ConexaoBD();
	LivroModel modelo = new LivroModel();
	
	public void salvar(LivroModel modelo) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO books VALUES(?, ?, ?, ?)");
			pst.
			System.out.println("Livro salvo com sucesso!");
			JOptionPane.showMessageDialog(null, "Adicionado com sucesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Não foi possível salvar esse livro!\n" + e.getMessage());
			e.printStackTrace();
		}
		
		connect.disconectBD();
	}
}
