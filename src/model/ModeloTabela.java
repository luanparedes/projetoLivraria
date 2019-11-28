package model;

import control.LivroController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabela extends AbstractTableModel{
    
	private ArrayList<PrincipalModel> dados = new ArrayList<>();
	
    public ModeloTabela() throws SQLException{
        dados = LivroController.listaLivrosCompleto();
       
    }

    public void setDados(ArrayList<PrincipalModel> dados) {
        this.dados = dados;
    }
    
    public ArrayList<PrincipalModel> getDados() {
        return this.dados;
        
    }
   
    //Coluans da tabela
    private String[] colunas = {"Titulo","Autores", "Editoras","Preco"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }
    
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    //Exibe as linhas da tabela
    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getTitle();
            case 1:
                return dados.get(linha).getAuthor();
            case 2:
                return dados.get(linha).getPublisher();
            case 3:
                return dados.get(linha).getPrice();
        }
        return null;
    }
    
    //atualiza a tabela, para mostrar as alteracoes feitas 
    public void atualizaTable(){
        this.fireTableDataChanged();
    }
    
}