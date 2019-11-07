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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro {

	JFrame frame;
	private JTextField txtId;
	private JPasswordField txtSenha;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro window = new Cadastro();
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
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCadastro = new JLabel("Cadastro");
		lblCadastro.setForeground(new Color(0, 255, 255));
		lblCadastro.setFont(new Font("Arial", Font.BOLD, 24));
		lblCadastro.setBounds(161, 11, 115, 36);
		panel.add(lblCadastro);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(new Color(0, 255, 255));
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
		lblSenha.setBounds(10, 144, 66, 24);
		panel.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(80, 143, 344, 25);
		panel.add(txtSenha);
		
		JButton btnFinCadasto = new JButton("Finalizar Cadastro");
		btnFinCadasto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtId.getText();
				String nome = txtNome.getText();
				String senha = String.valueOf(txtSenha.getPassword());
				
				if(id.equals("") | nome.equals("") | senha.equals("")) {
					JOptionPane.showMessageDialog(null, "Prencha todos os campos!");
				}else {
					//try {
					JogadorModel da = new JogadorModel();
					da.inserirJogador(id, nome, senha);
					JOptionPane.showMessageDialog(null, "Jogador inserido com sucesso!");
					frame.dispose();
					//}catch(Exception ex){
					//	JOptionPane.showMessageDialog(null, "Erro");
					//}
				}
			}
		});
		btnFinCadasto.setFont(new Font("Arial", Font.BOLD, 22));
		btnFinCadasto.setBounds(109, 195, 223, 36);
		panel.add(btnFinCadasto);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 255, 255));
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 105, 66, 24);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 20));
		txtNome.setColumns(10);
		txtNome.setBounds(80, 105, 344, 24);
		panel.add(txtNome);
	}
}
