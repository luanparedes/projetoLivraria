package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;

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
			public void actionPerformed(ActionEvent arg0) {
				JanelaPrincipal janelaPrincipal = new JanelaPrincipal();
				janelaPrincipal.setVisible(true);
				setVisible(false);
			}
		});
		
		btnEntrar.setBounds(102, 206, 231, 23);
		contentPane.add(btnEntrar);
		
		JLabel imagemFundo = new JLabel("");
		imagemFundo.setBounds(0, 0, 433, 262);
		imagemFundo.setIcon(new ImageIcon(TelaLogin.class.getResource("/zimages/telaLogin.png")));
		contentPane.add(imagemFundo);
		
		setLocationRelativeTo(null);
	}
}


