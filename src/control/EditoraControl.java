package control;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.EditoraModel;
import model.dao.postgres.ConexaoBD;

public class EditoraControl {
	
	ConexaoBD connect = new ConexaoBD();
	EditoraModel modelo = new EditoraModel();
	
	public void salvarEditora(EditoraModel modelo) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("INSERT INTO publishers VALUES(?, ?, ?)");
			pst.setInt(1, modelo.getPublisher_id());
			pst.setString(2, modelo.getName());
			pst.setString(3, modelo.getUrl());
			pst.execute();
			System.out.println("Editora salva com sucesso!");
			JOptionPane.showMessageDialog(null, "Editora salva com sucesso!");
		} catch(SQLException e) {
			System.out.println("Nao foi possivel salvar esse livro!\n" + e.getMessage());
			JOptionPane.showMessageDialog(null, "Editora NAO pode ser salva!\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
