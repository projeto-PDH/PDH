package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Config {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Config window = new Config();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Config() {
		initialize();
	}
	public void iniciaConfig() {
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelConfig = new JPanel();
		panelConfig.setBackground(new Color(0, 0, 51));
		panelConfig.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panelConfig);
		panelConfig.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Volume");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(35, 25, 150, 25);
		panelConfig.add(lblNewLabel);
		
		JSlider slider = new JSlider();
		slider.setBackground(new Color(0, 0, 51));
		slider.setBounds(195, 24, 200, 26);
		panelConfig.add(slider);
		
		JCheckBox checkBoxSom = new JCheckBox("Som");
		checkBoxSom.setBackground(new Color(0, 0, 51));
		checkBoxSom.setForeground(new Color(0, 255, 255));
		checkBoxSom.setSelected(true);
		checkBoxSom.setFont(new Font("Arial Black", Font.PLAIN, 15));
		checkBoxSom.setBounds(35, 85, 100, 20);
		panelConfig.add(checkBoxSom);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnVoltar.setBounds(35, 220, 110, 30);
		panelConfig.add(btnVoltar);
		
		JCheckBox checkBoxSombra = new JCheckBox("Sombras");
		checkBoxSombra.setForeground(new Color(0, 255, 255));
		checkBoxSombra.setBackground(new Color(0, 0, 51));
		checkBoxSombra.setSelected(true);
		checkBoxSombra.setFont(new Font("Arial Black", Font.PLAIN, 15));
		checkBoxSombra.setBounds(35, 145, 100, 20);
		panelConfig.add(checkBoxSombra);
	}
}
