
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoModel {

    public final static String DATABASE = "postgres";
    public final static String URL = "jdbc:postgresql:" + DATABASE;
    public final static String USER = "postgres";
    public final static String PASS = "123456";
    
    static public void fazConexao() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASS)) {
            System.out.println("Conexao feita");
        } catch (SQLException e) {
            System.out.println("ERROR: Erro ao tentar conexao");
        }
    }
    
    // metodo que cria a conexao e retorna ela
    public static Connection getConexao() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        return conn;        
    }

}
