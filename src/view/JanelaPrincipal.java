package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setResizable(false);
		setTitle("Livraria Amazonia");
		setMaximumSize(new Dimension(800, 600));
		setMinimumSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setMaximumSize(new Dimension(800, 600));
		contentPane.setMinimumSize(new Dimension(800, 600));
		contentPane.setPreferredSize(new Dimension(800, 600));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setBounds(0, 0, 794, 571);
		contentPane.add(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		JLabel lblLivraria = new JLabel("Livraria Amazonia");
		lblLivraria.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		lblLivraria.setBounds(285, 11, 255, 33);
		painelPrincipal.add(lblLivraria);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(41, 29, 717, 517);
		painelPrincipal.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pesquisar livro", null, panel, null);
		
		table = new JTable();
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Adicionar livro", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblAdicionarLivro = new JLabel("ADICIONAR LIVRO");
		lblAdicionarLivro.setFont(new Font("Arial", Font.ITALIC, 32));
		lblAdicionarLivro.setBounds(208, 45, 287, 38);
		panel_1.add(lblAdicionarLivro);
		
		JLabel lblTitulo = new JLabel("Titulo:");
		lblTitulo.setBounds(108, 162, 46, 14);
		panel_1.add(lblTitulo);
		
		JLabel lblEditora = new JLabel("ID Editora:");
		lblEditora.setBounds(108, 187, 57, 14);
		panel_1.add(lblEditora);
		
		JLabel lblAutor = new JLabel("ID Autor 1:");
		lblAutor.setBounds(108, 212, 64, 14);
		panel_1.add(lblAutor);
		
		JLabel lblAutor_1 = new JLabel("ID Autor 2:");
		lblAutor_1.setBounds(391, 212, 64, 14);
		panel_1.add(lblAutor_1);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setBounds(391, 190, 46, 14);
		panel_1.add(lblIsbn);
		
		textField = new JTextField();
		textField.setBounds(164, 159, 434, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 184, 218, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(423, 184, 175, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 209, 217, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(449, 209, 149, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("ADICIONAR");
		btnNewButton.setBounds(255, 357, 189, 23);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Deletar livro", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblExcluirLivro = new JLabel("EXCLUIR LIVRO");
		lblExcluirLivro.setBounds(240, 46, 241, 38);
		lblExcluirLivro.setFont(new Font("Arial", Font.ITALIC, 32));
		panel_2.add(lblExcluirLivro);
		
		JLabel lblparaSuaSeguranca = new JLabel("*Para sua seguranca, a exclus\u00E3o de um livro s\u00F3 pode ser feita pelo seu ISBN.");
		lblparaSuaSeguranca.setBounds(173, 187, 382, 14);
		panel_2.add(lblparaSuaSeguranca);
		
		JLabel lblIsbn_1 = new JLabel("ISBN");
		lblIsbn_1.setBounds(343, 274, 46, 14);
		panel_2.add(lblIsbn_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(284, 299, 143, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(240, 376, 241, 23);
		panel_2.add(btnExcluir);
		
		JLabel livroEsquerda = new JLabel("");
		livroEsquerda.setBounds(-85, -76, 526, 715);
		painelPrincipal.add(livroEsquerda);
		livroEsquerda.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/livros.png")));
		
		JLabel livroDireita = new JLabel("");
		livroDireita.setBounds(451, -76, 429, 715);
		painelPrincipal.add(livroDireita);
		livroDireita.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/livros.png")));
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
