package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class LivroAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

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
		textField.setBounds(83, 67, 469, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulo.setBounds(30, 69, 46, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblIdEditora = new JLabel("ID Editora:");
		lblIdEditora.setFont(new Font("Dialog", Font.BOLD, 10));
		lblIdEditora.setBounds(14, 116, 75, 14);
		contentPane.add(lblIdEditora);
		
		JLabel lblIdAutor = new JLabel("ID Autor 1:");
		lblIdAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdAutor.setBounds(292, 93, 89, 14);
		contentPane.add(lblIdAutor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 114, 168, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(384, 91, 168, 20);
		contentPane.add(textField_2);
		
		JLabel lblIdAutor_1 = new JLabel("ID Autor 2:");
		lblIdAutor_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdAutor_1.setBounds(292, 116, 89, 14);
		contentPane.add(lblIdAutor_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(384, 114, 168, 20);
		contentPane.add(textField_3);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIsbn.setBounds(34, 93, 75, 14);
		contentPane.add(lblIsbn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(83, 91, 168, 20);
		contentPane.add(textField_4);
		
		JLabel lblAdicionarLivro = new JLabel("Adicionar Livro");
		lblAdicionarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAdicionarLivro.setBounds(186, 26, 279, 29);
		contentPane.add(lblAdicionarLivro);
		
		JButton btnAdicionar = new JButton("Adicionar");
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
		
		JLabel lblPesquisar = new JLabel("Pesquisar:");
		lblPesquisar.setBounds(9, 170, 80, 15);
		contentPane.add(lblPesquisar);
		
		textField_5 = new JTextField();
		textField_5.setBounds(83, 168, 469, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		table = new JTable();
		table.setBounds(14, 197, 538, 71);
		contentPane.add(table);
		setLocationRelativeTo(null);
	}
}
