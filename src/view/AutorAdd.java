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

import model.AutorModel;
import modelDao.AutorDao;

public class AutorAdd extends JFrame {
	
	AutorModel autor = new AutorModel();
	AutorDao controle = new AutorDao();
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public AutorAdd() {
		setTitle("Livraria Amazonia - Adicionar Livro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblDeletarLivro = new JLabel("Adicionar Autor");
		lblDeletarLivro.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblDeletarLivro.setBounds(192, 30, 261, 29);
		contentPane.add(lblDeletarLivro);
		
		JLabel lblCdigo = new JLabel("Código do Autor:");
		lblCdigo.setBounds(94, 159, 127, 15);
		contentPane.add(lblCdigo);
		
		JLabel lblNome = new JLabel("Sobrenome:");
		lblNome.setBounds(128, 182, 93, 15);
		contentPane.add(lblNome);
		
		JLabel lblUrl = new JLabel("Nome:");
		lblUrl.setBounds(168, 205, 53, 15);
		contentPane.add(lblUrl);
				
		JButton button = new JButton("Adicionar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				autor.setAuthor_id(Integer.parseInt(textField.getText()));
				autor.setName(textField_1.getText());
				autor.setFname(textField_2.getText());
				controle.salvarAutor(autor);
				setVisible(false);
			}
		});
		button.setBounds(321, 313, 132, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setBounds(465, 312, 104, 23);
		contentPane.add(button_1);
		
		textField = new JTextField();
		textField.setBounds(217, 157, 221, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 180, 221, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 203, 221, 19);
		contentPane.add(textField_2);
		setLocationRelativeTo(null);
	}

}
