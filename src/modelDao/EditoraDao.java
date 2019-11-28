package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.EditoraModel;
import model.dao.postgres.ConexaoBD;

public class EditoraDao {
	
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
	
	public void deletarEditora(EditoraModel editora) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("DELETE FROM publishers WHERE publisher_id = '" + editora.getPublisher_id() + "'");
			int input = JOptionPane.showConfirmDialog(null, "Você realmente deseja deletar essa editora? É irreversivel...");
			if(input == 0) {
				pst.execute();
				System.out.println("Editora deletada com sucesso!");
				JOptionPane.showMessageDialog(null, "Editora deletada com sucesso!");
			}
		} catch(SQLException e) {
			System.out.println("A editora não pôde ser excluida!");
			JOptionPane.showMessageDialog(null, "A editora não pode ser deletada!\n" + e.getMessage());
			e.printStackTrace();
		}
	}
}
