package view;

import java.awt.BorderLayout;
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

public class AutorDelete extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	public AutorDelete() {
		setTitle("Livraria Amazonia - Adicionar Livro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblDeletarLivro = new JLabel("Deletar Autor");
		lblDeletarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDeletarLivro.setBounds(205, 31, 188, 29);
		contentPane.add(lblDeletarLivro);
		
		JButton btnDeletar = new JButton("Excluir");
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
		
		JLabel lblIsbn = new JLabel("Código do Autor");
		lblIsbn.setFont(new Font("Dialog", Font.BOLD, 13));
		lblIsbn.setBounds(235, 129, 141, 14);
		contentPane.add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(205, 155, 188, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		setLocationRelativeTo(null);
	}
}
