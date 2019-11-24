package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.dao.postgres.ConexaoBD;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JanelaPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JTable table;

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
		
		JLabel lblSolustechSoftwares = new JLabel("Developed by: Luan Paredes");
		lblSolustechSoftwares.setForeground(Color.WHITE);
		lblSolustechSoftwares.setBounds(293, 545, 205, 14);
		painelPrincipal.add(lblSolustechSoftwares);
		
		JLabel lblLivraria = new JLabel("Livraria Amazonia");
		lblLivraria.setForeground(new Color(255, 255, 255));
		lblLivraria.setFont(new Font("Monotype Corsiva", Font.PLAIN, 35));
		lblLivraria.setBounds(246, 12, 321, 26);
		painelPrincipal.add(lblLivraria);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(41, 45, 717, 501);
		painelPrincipal.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Pesquisar", null, panel, null);
		
		table = new JTable();
		panel.add(table);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/fundoDosCards.png")));
		panel.add(label_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Adicionar", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnAdicionarEditora = new JButton("Adicionar Editora");
		btnAdicionarEditora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditoraAdd editoraAdd = new EditoraAdd();
				editoraAdd.setVisible(true);
			}
		});
		btnAdicionarEditora.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/editoraAdd.png")));
		btnAdicionarEditora.setBounds(383, 181, 291, 123);
		panel_1.add(btnAdicionarEditora);
		
		JButton btnAdicionarLivro = new JButton("Adicionar Livro");
		btnAdicionarLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LivroAdd livroadd = new LivroAdd();
				livroadd.setVisible(true);
			}
		});
		btnAdicionarLivro.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/livroAdd.png")));
		btnAdicionarLivro.setBounds(44, 60, 300, 123);
		panel_1.add(btnAdicionarLivro);
		
		JButton btnAdicionarAutor = new JButton("Adicionar Autor");
		btnAdicionarAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AutorAdd autorAdd = new AutorAdd();
				autorAdd.setVisible(true);
			}
		});
		btnAdicionarAutor.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/autorAdd.png")));
		btnAdicionarAutor.setBounds(44, 296, 300, 123);
		panel_1.add(btnAdicionarAutor);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/fundoDosCards.png")));
		label.setBounds(0, 0, 712, 473);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Deletar", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LivroDelete livroDelete = new LivroDelete();
				livroDelete.setVisible(true);
			}
		});
		button.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/livroDelete1.png")));
		button.setBounds(71, 164, 153, 131);
		panel_2.add(button);
		
		JLabel lblDeletarLivro = new JLabel("Deletar Livro");
		lblDeletarLivro.setBounds(102, 132, 122, 15);
		panel_2.add(lblDeletarLivro);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditoraDelete editoraDelete = new EditoraDelete();
				editoraDelete.setVisible(true);
			}
		});
		button_1.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/editoraDelete1.png")));
		button_1.setBounds(286, 164, 153, 131);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AutorDelete autorDelete = new AutorDelete();
				autorDelete.setVisible(true);
			}
		});
		button_2.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/autorDelete1.png")));
		button_2.setBounds(500, 164, 153, 131);
		panel_2.add(button_2);
		
		JLabel lblDeletarEditora = new JLabel("Deletar Editora");
		lblDeletarEditora.setBounds(306, 132, 122, 15);
		panel_2.add(lblDeletarEditora);
		
		JLabel lblDeletarAutor = new JLabel("Deletar Autor");
		lblDeletarAutor.setBounds(531, 132, 122, 15);
		panel_2.add(lblDeletarAutor);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/fundoDosCards.png")));
		label_2.setBounds(0, 0, 762, 500);
		panel_2.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/zimages/fundo5.png")));
		label_3.setBounds(-12, 0, 822, 571);
		painelPrincipal.add(label_3);
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
