package br.univel.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JTextField;

import br.univel.client.ImplOperacoes;
import br.univel.client.TipoConta;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class TTransferencia extends JPanel {
	private JTextField tfAgencia;
	private JTextField tfConta;
	private JTextField tfTitular;
	private JTextField tfValor;

	/**
	 * Create the panel.
	 */
	public TTransferencia() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 50, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblAgncia = new JLabel("Ag\u00EAncia:");
		GridBagConstraints gbc_lblAgncia = new GridBagConstraints();
		gbc_lblAgncia.anchor = GridBagConstraints.WEST;
		gbc_lblAgncia.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgncia.gridx = 1;
		gbc_lblAgncia.gridy = 1;
		add(lblAgncia, gbc_lblAgncia);
		
		JLabel lblConta = new JLabel("Conta:");
		GridBagConstraints gbc_lblConta = new GridBagConstraints();
		gbc_lblConta.anchor = GridBagConstraints.WEST;
		gbc_lblConta.insets = new Insets(0, 0, 5, 5);
		gbc_lblConta.gridx = 2;
		gbc_lblConta.gridy = 1;
		add(lblConta, gbc_lblConta);
		
		tfAgencia = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		add(tfAgencia, gbc_textField);
		tfAgencia.setColumns(10);
		
		tfConta = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		add(tfConta, gbc_textField_1);
		tfConta.setColumns(10);
		
		JLabel lblT = new JLabel("Tipo Conta:");
		GridBagConstraints gbc_lblT = new GridBagConstraints();
		gbc_lblT.anchor = GridBagConstraints.WEST;
		gbc_lblT.insets = new Insets(0, 0, 5, 5);
		gbc_lblT.gridx = 1;
		gbc_lblT.gridy = 3;
		add(lblT, gbc_lblT);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CC - Conta Corrente", "CP - Conta Poupan\u00E7a", "CE - Conta Eletr\u00F4nica"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		JLabel lblNewLabel = new JLabel("Titular:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tfTitular = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 6;
		add(tfTitular, gbc_textField_2);
		tfTitular.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.anchor = GridBagConstraints.WEST;
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 1;
		gbc_lblValor.gridy = 7;
		add(lblValor, gbc_lblValor);
		
		tfValor = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.anchor = GridBagConstraints.WEST;
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 8;
		add(tfValor, gbc_textField_3);
		tfValor.setColumns(10);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TipoConta tipo = null;
				ImplOperacoes op = new ImplOperacoes();
				BigDecimal valor = new BigDecimal(tfValor.getText());
				if (comboBox.getSelectedIndex()==0){
					tipo = tipo.CC;
				} else if (comboBox.getSelectedIndex()==1){
					tipo = tipo.CP;
				} else {
					tipo = tipo.CE;
				}
					
				op.transferencia(valor, tfAgencia.getText(), tfConta.getText(), tipo , tfTitular.getText());
				DConfirmar confirmar = new DConfirmar();
				confirmar.setLocationRelativeTo(null);;
				confirmar.setVisible(true);
			}	
			});	
		
		GridBagConstraints gbc_btnConfirme = new GridBagConstraints();
		gbc_btnConfirme.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConfirme.insets = new Insets(0, 0, 0, 5);
		gbc_btnConfirme.gridx = 2;
		gbc_btnConfirme.gridy = 8;
		add(btnConfirme, gbc_btnConfirme);

	}

}
