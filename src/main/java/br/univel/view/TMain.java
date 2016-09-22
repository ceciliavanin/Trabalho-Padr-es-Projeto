package br.univel.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class TMain extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TMain frame = new TMain();
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
	public TMain() {
		setTitle("Fa\u00E7a seu login");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cecilia Vanin\\Pictures\\icone-orcamento.gif"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(5, 35, 64, 20);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSenha.setBounds(0, 67, 46, 14);
		contentPane.add(lblSenha);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(51, 66, 290, 20);
		contentPane.add(passwordField_1);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.setBounds(145, 157, 89, 23);
		contentPane.add(btnEnviar);
		
		JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnCliente.setBounds(127, 114, 109, 23);
		contentPane.add(rdbtnCliente);
		
		JRadioButton rdbtnBancrio = new JRadioButton("Banc\u00E1rio");
		rdbtnBancrio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnBancrio.setBounds(238, 114, 109, 23);
		contentPane.add(rdbtnBancrio);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usu\u00E1rio");
		lblTipoDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipoDeUsurio.setBounds(5, 113, 120, 20);
		contentPane.add(lblTipoDeUsurio);
		
		textField = new JTextField();
		textField.setBounds(51, 37, 290, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
