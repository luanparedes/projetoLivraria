package modelDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.UsuarioModel;
import model.dao.postgres.ConexaoBD;

public class UsuarioDao {
	
	ConexaoBD connect = new ConexaoBD();
	
	public void verificarUsuario(UsuarioModel user) {
		connect.connectBD();
		try {
			PreparedStatement pst = connect.conn.prepareStatement("SELECT user_name, pass FROM users "
																 + "WHERE user_name = '?' AND pass = ?");
			pst.setString(1, user.getName());
			pst.setInt(2, user.getSenha());
			pst.execute();
			JOptionPane.showMessageDialog(null, "Login Efetuado com sucesso!!!");
			System.out.println("Login efetuado com sucesso!");
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Login inválido!\nUsuário não cadastrado.");
			System.out.println("Usuário não cadastrado. Login inválido!");
		}
		
		connect.disconectBD();
	}
}
