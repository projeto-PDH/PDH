package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import models.JogadorModel;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	JFrame frame;
	public JTextField txtId;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 434, 260);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(new Color(0, 255, 255));
		lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
		lblLogin.setBounds(174, 11, 88, 36);
		panel.add(lblLogin);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(new Color(0, 255, 255));
		lblId.setBackground(new Color(255, 255, 255));
		lblId.setFont(new Font("Arial", Font.PLAIN, 20));
		lblId.setBounds(10, 60, 60, 24);
		panel.add(lblId);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Arial", Font.PLAIN, 20));
		txtId.setBounds(80, 61, 344, 24);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setForeground(new Color(0, 255, 255));
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(10, 122, 66, 24);
		panel.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(80, 122, 344, 25);
		panel.add(txtSenha);
		
		JButton btnCadastar = new JButton("Cadastrar");
		btnCadastar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Cadastro cadastro = new Cadastro();
				cadastro.frame.setVisible(true);
			}
		});
		btnCadastar.setFont(new Font("Arial", Font.BOLD, 22));
		btnCadastar.setBounds(59, 196, 153, 36);
		panel.add(btnCadastar);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				try{
					if(txtId.getText().equals("") | String.valueOf(txtSenha.getPassword()).equals("")) {
						JOptionPane.showMessageDialog(null, "Prencha todos os campos!");
					}else {
						JogadorModel a = new JogadorModel();				
						a = a.pegarJogador(String.valueOf(txtId.getText()));
						if(a == null) {
							throw new NullPointerException();
						}
									
						if(String.valueOf(txtSenha.getPassword()).equals(a.getSenha())) {												
							String nome = a.getNome();
							Menu menu = new Menu(String.valueOf(txtId.getText()),nome);
							frame.setVisible(false);
							JOptionPane.showMessageDialog(null, "Acesso permitido!");
							menu.frame.setVisible(true);						
						}else {
							JOptionPane.showMessageDialog(null, "Senha incorreta");
						}
					}
				}catch(java.lang.NullPointerException e) {
					JOptionPane.showMessageDialog(null, "Prontuário incorreto");	
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro");
				}
			}
		});
		btnEntrar.setFont(new Font("Arial", Font.BOLD, 22));
		btnEntrar.setBounds(242, 196, 126, 36);
		panel.add(btnEntrar);
	}
}
