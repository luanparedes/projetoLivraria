package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.AutorModel;
import model.dao.postgres.ConexaoBD;

public class AutorDao {
	
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
	
	public void deletarAutor(AutorModel autor) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("DELETE FROM authors WHERE author_id = '" + autor.getAuthor_id() + "'");
			int input = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar? É irreversível...");
			if(input == 0) {
				pst.execute();
				System.out.println("Autor deletado com sucesso!");
				JOptionPane.showMessageDialog(null, "Editora deletada com sucesso!");
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Este autor não pode ser deletado!\n" + e.getMessage());
			System.out.println("Não foi possível deletar esse autor!");
			e.printStackTrace();
		}
	}
}
