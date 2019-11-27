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

import control.LivroControl;
import model.LivroModel;

import java.awt.BorderLayout;

public class LivroDelete extends JFrame {
	
	LivroControl controle = new LivroControl();
	private JPanel contentPane;
	private JTextField textField;
	public String isbn;
	
	public LivroDelete() {
		getContentPane().setLayout(null);
		setTitle("Livraria Amazonia - Adicionar Livro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblDeletarLivro = new JLabel("Deletar Livro");
		lblDeletarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDeletarLivro.setBounds(205, 31, 188, 29);
		contentPane.add(lblDeletarLivro);
		
		JButton btnDeletar = new JButton("Excluir");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isbn = textField.getText();
				controle.deletarLivro(isbn);
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
		
		JLabel lblIsbn = new JLabel("ISBN");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIsbn.setBounds(276, 135, 46, 14);
		contentPane.add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(196, 160, 197, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblparaASegurana = new JLabel("*Para a seguranca de seus dados, so e permitido a exclusao pelo ISBN.");
		lblparaASegurana.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblparaASegurana.setBounds(41, 202, 533, 14);
		contentPane.add(lblparaASegurana);
		setLocationRelativeTo(null);
	}
}
