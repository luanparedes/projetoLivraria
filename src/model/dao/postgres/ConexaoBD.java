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
	private String PASS = "123456";
	
	public void connectBD() {
		try {
			System.setProperty("jdcb.Drivers", DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexao realizada com sucesso");
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERRO ao se conectar ao DataBase!!!\n" + e.getMessage());
			e.printStackTrace();
			System.out.println("Conexao NAO realizada!");
		}
	}
	
	public void disconectBD() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Erro ao desconectar do DataBase!");
			JOptionPane.showMessageDialog(null, "ERRO ao desconectar do DataBase!!!\n" + e.getMessage());
		}
	}
}
