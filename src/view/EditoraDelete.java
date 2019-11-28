package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.EditoraModel;
import modelDao.EditoraDao;

public class EditoraDelete extends JFrame {
	
	EditoraModel editora = new EditoraModel();
	EditoraDao controle = new EditoraDao();
	private JPanel contentPane;
	private JTextField textField;

	public EditoraDelete() {
		setTitle("Livraria Amazonia - Adicionar Livro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblDeletarLivro = new JLabel("Deletar Editora");
		lblDeletarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDeletarLivro.setBounds(195, 30, 224, 29);
		contentPane.add(lblDeletarLivro);
		
		JButton btnDeletar = new JButton("Excluir");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editora.setPublisher_id(Integer.parseInt(textField.getText()));
				controle.deletarEditora(editora);
				setVisible(false);
			}
		});
		btnDeletar.setBounds(330, 305, 89, 23);
		contentPane.add(btnDeletar);
				
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(430, 305, 118, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblCdigoDaEditora = new JLabel("Código da Editora");
		lblCdigoDaEditora.setBounds(232, 142, 141, 15);
		contentPane.add(lblCdigoDaEditora);
		
		textField = new JTextField();
		textField.setBounds(195, 169, 205, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		setLocationRelativeTo(null);
	}
}
