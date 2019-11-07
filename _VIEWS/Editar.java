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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Editar {

	JFrame frame;
	private JTextField txtNome;
	private JPasswordField txtSenhaConf;
	private JPasswordField txtSenha;
	static JogadorModel a = new JogadorModel();
	static String nome;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editar window = new Editar(a);
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
	public Editar(JogadorModel a) {
		initialize();
		this.a = a;
		this.nome = a.getNome();
		this.txtNome.setText(a.getNome());		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEditar = new JLabel("Editar");
		lblEditar.setForeground(new Color(0, 255, 255));
		lblEditar.setFont(new Font("Arial", Font.BOLD, 24));
		lblEditar.setBounds(188, 11, 75, 36);
		panel.add(lblEditar);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 255, 255));
		lblNome.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNome.setBounds(10, 60, 60, 24);
		panel.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setText(nome);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 20));
		txtNome.setBounds(80, 61, 344, 24);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenhaConf = new JLabel("Confirma\u00E7\u00E3o Senha:");
		lblSenhaConf.setForeground(new Color(0, 255, 255));
		lblSenhaConf.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenhaConf.setBounds(10, 144, 183, 24);
		panel.add(lblSenhaConf);
		
		txtSenhaConf = new JPasswordField();
		txtSenhaConf.setBounds(203, 143, 221, 25);
		panel.add(txtSenhaConf);
		
		JButton btnFinEditar = new JButton("Finalizar Edi\u00E7\u00E3o");
		btnFinEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String senha = String.valueOf(txtSenha.getPassword());
				String senhaConf = String.valueOf(txtSenhaConf.getPassword());
				if(nome.equals("") | senha.equals("") | senhaConf.equals("")) {
					JOptionPane.showMessageDialog(null, "Prencha todos os campos!");
				}else {
					if(senha.equals(senhaConf)){
						try {
							a.setNome(nome);
							a.setSenha(senha);
							a.editarJogador(a);
							frame.dispose();
							Menu menu = new Menu(a.getId(),a.getNome());
							menu.frame.setVisible(true);
						}catch(org.hibernate.TransientObjectException exc) {
							JOptionPane.showMessageDialog(null, "Erro 404: inicie o app pela tela de Login");
						}catch(Exception ex){
							JOptionPane.showMessageDialog(null, "Erro");
						}
					}else {
						JOptionPane.showMessageDialog(null, "A confirmação de senha está incorreta!");
					}
				}
				
			}
				
		});
		btnFinEditar.setFont(new Font("Arial", Font.BOLD, 22));
		btnFinEditar.setBounds(201, 195, 223, 36);
		panel.add(btnFinEditar);
		
		JLabel lblSenha = new JLabel("Nova Senha:");
		lblSenha.setForeground(new Color(0, 255, 255));
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSenha.setBounds(10, 105, 200, 24);
		panel.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(203, 107, 221, 25);
		panel.add(txtSenha);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				Menu menu = new Menu(a.getId(),a.getNome());
				menu.frame.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 22));
		btnVoltar.setBounds(10, 195, 167, 36);
		panel.add(btnVoltar);
		
		
	}
}
