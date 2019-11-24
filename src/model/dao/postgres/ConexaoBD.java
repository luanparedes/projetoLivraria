package model.dao.postgres;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConexaoBD {
	public Statement stm;
	public ResultSet rs;
	public Connection conn;
	private String DRIVER = "org.postgresql.Driver";
	private String URL = "jdbc:postgresql:postgres";
	private String USER = "postgres";
	private String PASS = "101017";
	
	public void connectBD() {
		try {
			System.setProperty("jdcb.Drivers", DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexão realizada com sucesso");
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO ao se conectar ao DataBase!!!\n" + e.getMessage());
			e.printStackTrace();
			System.out.println("Conexão NÃO realizada!");
		}
	}
	
	public void disconectBD() {
		try {
			conn.close();
			JOptionPane.showMessageDialog(null, "DataBase desconectado com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERRO ao desconectar do DataBase!!!\n" + e.getMessage());
		}
	}
}
