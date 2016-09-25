package br.univel.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import br.univel.banking.ImplOperacoes;

public class TCadProfissional extends JPanel {
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfUsuario;
	private JTextField tfSenhaAcesso;
	private JTextField tfSenhaOperacoes;

	/**
	 * Create the panel.
	 */
	public TCadProfissional() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 100, 0, 0, 0, 4};
		gridBagLayout.rowHeights = new int[] {0, 0, 0, 0, 4};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		add(lblNome, gbc_lblNome);
		
		tfNome = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(tfNome, gbc_textField);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Idade:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tfIdade = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		add(tfIdade, gbc_textField_1);
		tfIdade.setColumns(10);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio:");
		GridBagConstraints gbc_lblUsurio = new GridBagConstraints();
		gbc_lblUsurio.anchor = GridBagConstraints.EAST;
		gbc_lblUsurio.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsurio.gridx = 0;
		gbc_lblUsurio.gridy = 2;
		add(lblUsurio, gbc_lblUsurio);
		
		tfUsuario = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		add(tfUsuario, gbc_textField_2);
		tfUsuario.setColumns(10);
		
		JLabel lblSenhaDeAcessos = new JLabel("Senha de Acessos:");
		GridBagConstraints gbc_lblSenhaDeAcessos = new GridBagConstraints();
		gbc_lblSenhaDeAcessos.anchor = GridBagConstraints.EAST;
		gbc_lblSenhaDeAcessos.insets = new Insets(0, 0, 0, 5);
		gbc_lblSenhaDeAcessos.gridx = 0;
		gbc_lblSenhaDeAcessos.gridy = 3;
		add(lblSenhaDeAcessos, gbc_lblSenhaDeAcessos);
		
		tfSenhaAcesso = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		add(tfSenhaAcesso, gbc_textField_3);
		tfSenhaAcesso.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha Opera\u00E7\u00F5es:");
		GridBagConstraints gbc_lblSenha = new GridBagConstraints();
		gbc_lblSenha.anchor = GridBagConstraints.EAST;
		gbc_lblSenha.insets = new Insets(0, 0, 0, 5);
		gbc_lblSenha.gridx = 2;
		gbc_lblSenha.gridy = 3;
		add(lblSenha, gbc_lblSenha);
		
		tfSenhaOperacoes = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 0, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 3;
		add(tfSenhaOperacoes, gbc_textField_4);
		tfSenhaOperacoes.setColumns(10);

		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ImplOperacoes op = new ImplOperacoes();
				Integer idade = new Integer(tfIdade.getText());
				op.cadProfissional(tfNome.getText(), idade, tfUsuario.getText(), tfSenhaAcesso.getText(), tfSenhaOperacoes.getText());
			}
		});
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.gridx = 4;
		gbc_btnConfirmar.gridy = 3;
		add(btnConfirmar, gbc_btnConfirmar);

	}

}
