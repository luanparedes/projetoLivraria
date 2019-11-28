package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.LivroModel;
import model.dao.postgres.ConexaoBD;

public class LivroDao {
	
	ConexaoBD connect = new ConexaoBD();
	LivroModel modelo = new LivroModel();
	
	public LivroModel pesquisaPrincipal(LivroModel livro) {
		connect.connectBD();
		connect.executaSQL("SELECT * FROM books WHERE title LIKE '%" + livro.getPesquisa() + "%");
		try {		
			connect.rs.first();
			livro.setTitle(connect.rs.getString("title"));
			livro.setIsbn(connect.rs.getString("isbn"));
			livro.setPublisher_id(connect.rs.getInt("publisher_id"));
			livro.setPrice(connect.rs.getDouble("price"));
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar!");
			System.out.println("Erro de pesquisa!");
			e.printStackTrace();
		}
		
		connect.disconectBD();
		return livro;
	}
	
	public LivroModel pesquisarLivro(LivroModel livro) {
		connect.connectBD();
		connect.executaSQL("SELECT * FROM books WHERE title LIKE '%" + livro.getPesquisa() + "%");
		try {		
			connect.rs.first();
			livro.setTitle(connect.rs.getString("title"));
			livro.setIsbn(connect.rs.getString("isbn"));
			livro.setPublisher_id(connect.rs.getInt("publisher_id"));
			livro.setPrice(connect.rs.getDouble("price"));
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao pesquisar livro!");
			System.out.println("Não existe esse livro no sistema!");
		}
		
		connect.disconectBD();
		return livro;
	}
	
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
			JOptionPane.showMessageDialog(null, "N�o foi poss�vel salvar esse livro!\n" + e.getMessage());
			e.printStackTrace();
		}
		
		connect.disconectBD();
	}
	
	public void deletarLivro(String isbn) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("DELETE FROM books WHERE isbn = '"+ isbn +"'");
			pst.execute();
			System.out.println("Livro excluido com sucesso!");
			JOptionPane.showMessageDialog(null, "Livro excluido com sucesso!!!");
		} catch (SQLException e) {
			System.out.println("Não foi possível excluir esse livro!\n" + e.getMessage());
			JOptionPane.showMessageDialog(null, "Nao foi possivel deletar este livro\n" + e.getMessage());
			e.printStackTrace();
		}
		
		connect.disconectBD();
	}
}
