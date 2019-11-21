package model;

import control.LivroController;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel{
    
    public ModeloTabela() throws SQLException{
        dados = LivroController.listaLivrosCompleto();
    }

    public void setDados(ArrayList<LivroModel> dados) {
        this.dados = dados;
    }
    
    //Esse array guarda as linhas da tabela, que sao dadas pela funcao que esta no construtor da classe
    private ArrayList<LivroModel> dados = new ArrayList<>();

    public ArrayList<LivroModel> getDados() {
        return this.dados;
    }
   
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
                return dados.get(linha).getAutor();
            case 2:
                return dados.get(linha).getEditora();
            case 3:
                return dados.get(linha).getPrice();
        }
        
        return null;
    }
    
    //Atualiza a tabela, para mostrar as alteracoes feitas 
    public void atualizaTable(){
        this.fireTableDataChanged();
    }
}
