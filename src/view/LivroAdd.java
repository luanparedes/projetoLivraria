package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.LivroModel;
import modelDao.LivroDao;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class LivroAdd extends JFrame {
	
	LivroModel livro = new LivroModel();
	LivroDao controle = new LivroDao();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;

	public LivroAdd() {
		setTitle("Livraria Amazonia - Adicionar Livro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(90, 134, 469, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulo.setBounds(50, 136, 46, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblIdEditora = new JLabel("ID Editora:");
		lblIdEditora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdEditora.setBounds(21, 183, 75, 14);
		contentPane.add(lblIdEditora);
		
		JLabel lblIdAutor = new JLabel("Preco:");
		lblIdAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdAutor.setBounds(343, 160, 51, 14);
		contentPane.add(lblIdAutor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 181, 168, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(391, 158, 168, 20);
		contentPane.add(textField_2);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIsbn.setBounds(50, 161, 75, 14);
		contentPane.add(lblIsbn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(90, 158, 168, 20);
		contentPane.add(textField_4);
		
		JLabel lblAdicionarLivro = new JLabel("Adicionar Livro");
		lblAdicionarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAdicionarLivro.setBounds(186, 26, 279, 29);
		contentPane.add(lblAdicionarLivro);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				livro.setTitle(textField.getText());
				livro.setIsbn(textField_4.getText());
				livro.setPublisher_id(Integer.parseInt(textField_1.getText()));
				livro.setPrice(Double.parseDouble(textField_2.getText()));
				controle.salvarLivro(livro);
				setVisible(false);
			}
		});
		btnAdicionar.setBounds(300, 305, 132, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(444, 305, 104, 23);
		contentPane.add(btnCancelar);
		setLocationRelativeTo(null);
	}
}
