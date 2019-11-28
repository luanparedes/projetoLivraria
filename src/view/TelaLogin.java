package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.UsuarioModel;
import model.dao.postgres.ConexaoBD;
import modelDao.UsuarioDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {
	
	UsuarioModel user = new UsuarioModel();
	UsuarioDao controle = new UsuarioDao();
	public ConexaoBD connect = new ConexaoBD();
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLogin() {
		setResizable(false);
		setVisible(true);
		setTitle("Livraria Amazonia - LOGIN");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 449, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
				setVisible(false);
				}
		});
		
		btnEntrar.setBounds(183, 147, 73, 38);
		contentPane.add(btnEntrar);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(103, 93, 66, 15);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(148, 90, 174, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(103, 120, 66, 15);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 117, 174, 19);
		contentPane.add(passwordField);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setBounds(0, -13, 463, 304);
		imagemFundo.setIcon(new ImageIcon(TelaLogin.class.getResource("/zimages/telaLogin.png")));
		contentPane.add(imagemFundo);
		
		setLocationRelativeTo(null);
	}
}


