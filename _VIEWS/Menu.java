package views;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

import models.JogadorModel;

import java.awt.Color;
import javax.swing.border.TitledBorder;

import jogo.Principal;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Menu {
	static String id,nome;

	public JFrame frame;	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu(id,nome);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param string 
	 */
	public Menu(String id, String nome) {
		this.id = id;
		this.nome = nome;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 750, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Login login = new Login();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBounds(0, 0, 744, 421);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Menu");
		lblLogin.setForeground(new Color(0, 255, 255));
		lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
		lblLogin.setBounds(320, 20, 100, 29);
		panel.add(lblLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(60, 80, 200, 250);
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setForeground(new Color(0, 255, 255));
		lblPerfil.setFont(new Font("Arial", Font.BOLD, 20));
		lblPerfil.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblPerfil, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				frame.setVisible(false);
				Login login = new Login();
				login.frame.setVisible(true);
			}
		});
		btnVoltar.setFont(new Font("Arial", Font.BOLD, 20));
		btnVoltar.setBounds(40, 156, 119, 23);
		panel_3.add(btnVoltar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JogadorModel a = new JogadorModel();
				try {
					a = a.pegarJogador(id);
					a.deletarJogador(a);
					frame.dispose();
					Login login = new Login();
					login.frame.setVisible(true);					
				}catch(java.lang.IllegalArgumentException exc) {
					JOptionPane.showMessageDialog(null, "Erro 404: inicie o app pela tela de Login");
					frame.dispose();
				}
			}
		});
		btnDeletar.setFont(new Font("Arial", Font.BOLD, 20));
		btnDeletar.setBounds(40, 122, 119, 23);
		panel_3.add(btnDeletar);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBackground(new Color(0, 0, 0));
		lblId.setForeground(new Color(0, 255, 255));
		lblId.setFont(new Font("Arial", Font.PLAIN, 14));
		lblId.setBounds(10, 11, 71, 14);
		panel_3.add(lblId);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(new Color(0, 255, 255));
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(10, 42, 46, 14);
		panel_3.add(lblNome);
		
		JLabel lbltxtId = new JLabel(id);
		lbltxtId.setForeground(new Color(0, 255, 255));
		lbltxtId.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltxtId.setBounds(53, 11, 70, 14);
		panel_3.add(lbltxtId);
		
		JLabel lbltxtNome = new JLabel(nome);
		lbltxtNome.setForeground(new Color(0, 255, 255));
		lbltxtNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lbltxtNome.setBounds(53, 43, 108, 14);
		panel_3.add(lbltxtNome);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				JogadorModel a = new JogadorModel();
				try {
					a = a.pegarJogador(id);					
					Editar editar = new Editar(a);
					editar.frame.setVisible(true);
					frame.dispose();
				}catch(java.lang.IllegalArgumentException exc) {
					JOptionPane.showMessageDialog(null, "Erro 404: inicie o app pela tela de Login");
					frame.dispose();
				}catch(Exception ex){
					JOptionPane.showMessageDialog(null, "Erro");
				}
			}
		});
		btnEditar.setFont(new Font("Arial", Font.BOLD, 20));
		btnEditar.setBounds(40, 88, 119, 23);
		panel_3.add(btnEditar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(420, 80, 250, 300);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblProfessor = new JLabel("Passos da Hist\u00F3ria");
		lblProfessor.setForeground(new Color(0, 255, 255));
		lblProfessor.setBackground(SystemColor.menu);
		lblProfessor.setFont(new Font("Arial", Font.BOLD, 20));
		lblProfessor.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblProfessor, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(70, 130, 180));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setForeground(new Color(0, 255, 255));
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Not\u00EDcias", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 255, 255)));
		panel_5.setBounds(5, 30, 240, 150);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JTextArea txtrdev = new JTextArea();
		txtrdev.setFont(new Font("Arial", Font.PLAIN, 13));
		txtrdev.setText("30/09/2019 - [Dev] Selme Barretto:\r\nOl\u00E1 Senhores, trazemos boas novas, \r\no PDH est\u00E1 mais perto do que\r\nnunca de ser concluido,\r\nagora estamos com 3% do \r\nprojeto p r e p a r a d o.");
		txtrdev.setBounds(10, 21, 220, 118);
		panel_5.add(txtrdev);
		
		JButton btnAdicionar = new JButton("Configura\u00E7\u00F5es");
		btnAdicionar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Config config = new Config();
				config.frame.setVisible(true);
			}
		});
		btnAdicionar.setFont(new Font("Arial", Font.BOLD, 11));
		btnAdicionar.setBounds(10, 200, 124, 33);
		panel_4.add(btnAdicionar);
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				Principal jogo = new Principal();
				frame.dispose();
				jogo.iniciarJogo();
				
				
			}
		});
		btnJogar.setFont(new Font("Arial", Font.BOLD, 13));
		btnJogar.setBounds(150, 200, 75, 33);
		panel_4.add(btnJogar);
	}
}
