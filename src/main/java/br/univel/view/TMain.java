package br.univel.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

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
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{46, 74, 109, 109, 0};
		gbl_contentPane.rowHeights = new int[]{35, 22, 20, 24, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.SOUTH;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 3;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.anchor = GridBagConstraints.NORTH;
		gbc_lblSenha.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSenha.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenha.gridx = 0;
		gbc_lblSenha.gridy = 2;
		contentPane.add(lblSenha, gbc_lblSenha);
		
		passwordField_1 = new JPasswordField();
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.anchor = GridBagConstraints.NORTH;
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField_1.gridwidth = 3;
		gbc_passwordField_1.gridx = 1;
		gbc_passwordField_1.gridy = 2;
		contentPane.add(passwordField_1, gbc_passwordField_1);
		
		JLabel lblTipoDeUsurio = new JLabel("Tipo de usu\u00E1rio");
		lblTipoDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTipoDeUsurio = new GridBagConstraints();
		gbc_lblTipoDeUsurio.anchor = GridBagConstraints.NORTH;
		gbc_lblTipoDeUsurio.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTipoDeUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeUsurio.gridwidth = 2;
		gbc_lblTipoDeUsurio.gridx = 0;
		gbc_lblTipoDeUsurio.gridy = 3;
		contentPane.add(lblTipoDeUsurio, gbc_lblTipoDeUsurio);
		
		final JRadioButton rdbtnCliente = new JRadioButton("Cliente");
		rdbtnCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_rdbtnCliente = new GridBagConstraints();
		gbc_rdbtnCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnCliente.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnCliente.gridx = 2;
		gbc_rdbtnCliente.gridy = 3;
		contentPane.add(rdbtnCliente, gbc_rdbtnCliente);
		
		final JRadioButton rdbtnBancrio = new JRadioButton("Banc\u00E1rio");
		rdbtnBancrio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_rdbtnBancrio = new GridBagConstraints();
		gbc_rdbtnBancrio.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnBancrio.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnBancrio.gridx = 3;
		gbc_rdbtnBancrio.gridy = 3;
		contentPane.add(rdbtnBancrio, gbc_rdbtnBancrio);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if (rdbtnCliente.isSelected()){
					TPrincipalCliente cl = new TPrincipalCliente();
					cl.setVisible(true);

				}
				else if (rdbtnBancrio.isSelected()){
					TPrincipalCliente cl = new TPrincipalCliente();
					cl.setVisible(true);
				}
					else {
						JOptionPane.showMessageDialog(rootPane, "Selecionar uma opção para acessar!");
				}

				
			}
		});
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 2;
		gbc_btnEnviar.gridy = 4;
		contentPane.add(btnEnviar, gbc_btnEnviar);
	}
}
