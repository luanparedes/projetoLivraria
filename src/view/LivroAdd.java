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

public class LivroAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
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
		textField.setBounds(79, 111, 469, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTitulo.setBounds(34, 113, 46, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblIdEditora = new JLabel("ID Editora:");
		lblIdEditora.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdEditora.setBounds(10, 202, 75, 14);
		contentPane.add(lblIdEditora);
		
		JLabel lblIdAutor = new JLabel("ID Autor 1:");
		lblIdAutor.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdAutor.setBounds(302, 159, 75, 14);
		contentPane.add(lblIdAutor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 200, 168, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(380, 157, 168, 20);
		contentPane.add(textField_2);
		
		JLabel lblIdAutor_1 = new JLabel("ID Autor 2:");
		lblIdAutor_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIdAutor_1.setBounds(302, 202, 75, 14);
		contentPane.add(lblIdAutor_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(380, 200, 168, 20);
		contentPane.add(textField_3);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIsbn.setBounds(41, 159, 75, 14);
		contentPane.add(lblIsbn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(79, 157, 168, 20);
		contentPane.add(textField_4);
		
		JLabel lblAdicionarLivro = new JLabel("Adicionar Livro");
		lblAdicionarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAdicionarLivro.setBounds(208, 32, 188, 29);
		contentPane.add(lblAdicionarLivro);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(360, 305, 89, 23);
		contentPane.add(btnAdicionar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnCancelar.setBounds(459, 305, 89, 23);
		contentPane.add(btnCancelar);
		setLocationRelativeTo(null);
	}
}
