package br.univel.view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;

import br.univel.client.ImplOperacoes;
import br.univel.client.TipoConta;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TDeposito extends JPanel {
	private JTextField tfValor;
	private JTextField tfAgencia;
	private JTextField tfConta;
	private JTextField tfTitular;
	private JCheckBox cbContaLogada;
	private JComboBox comboBox;
	public TDeposito() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {20, 170, 190, 89};
		gridBagLayout.rowHeights = new int[]{30, 0, 0, 0, 30, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblInformeValorA = new JLabel("Informe valor a ser depositado");
		GridBagConstraints gbc_lblInformeValorA = new GridBagConstraints();
		gbc_lblInformeValorA.anchor = GridBagConstraints.WEST;
		gbc_lblInformeValorA.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformeValorA.gridx = 1;
		gbc_lblInformeValorA.gridy = 0;
		add(lblInformeValorA, gbc_lblInformeValorA);
		
		tfValor = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		add(tfValor, gbc_textField);
		tfValor.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
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
					
				op.deposito(tfAgencia.getText(), tfConta.getText(), tipo, tfTitular.getText(), valor);;
				DConfirmar confirmar = new DConfirmar();
				confirmar.setLocationRelativeTo(null);;
				confirmar.setVisible(true);
			}	
			});	
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 0;
		add(btnConfirmar, gbc_btnNewButton);
		
		cbContaLogada = new JCheckBox("Conta logada");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.anchor = GridBagConstraints.WEST;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 2;
		add(cbContaLogada, gbc_chckbxNewCheckBox);
		
		JLabel lblAgncia = new JLabel("Ag\u00EAncia:");
		GridBagConstraints gbc_lblAgncia = new GridBagConstraints();
		gbc_lblAgncia.anchor = GridBagConstraints.WEST;
		gbc_lblAgncia.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgncia.gridx = 1;
		gbc_lblAgncia.gridy = 3;
		add(lblAgncia, gbc_lblAgncia);
		
		JLabel lblConta = new JLabel("Conta:");
		GridBagConstraints gbc_lblConta = new GridBagConstraints();
		gbc_lblConta.anchor = GridBagConstraints.WEST;
		gbc_lblConta.insets = new Insets(0, 0, 5, 5);
		gbc_lblConta.gridx = 2;
		gbc_lblConta.gridy = 3;
		add(lblConta, gbc_lblConta);
		
		tfAgencia = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		add(tfAgencia, gbc_textField_1);
		tfAgencia.setColumns(10);
		
		tfConta = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		add(tfConta, gbc_textField_2);
		tfConta.setColumns(10);
		
		JLabel lblTipoDeConta = new JLabel("Tipo de Conta:");
		GridBagConstraints gbc_lblTipoDeConta = new GridBagConstraints();
		gbc_lblTipoDeConta.anchor = GridBagConstraints.WEST;
		gbc_lblTipoDeConta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeConta.gridx = 1;
		gbc_lblTipoDeConta.gridy = 5;
		add(lblTipoDeConta, gbc_lblTipoDeConta);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Conta Corrente", "Conta Poupan\u00E7a", "Conta Eletr\u00F4nica"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 6;
		add(comboBox, gbc_comboBox);
		
		JLabel lblTitular = new JLabel("Titular:");
		GridBagConstraints gbc_lblTitular = new GridBagConstraints();
		gbc_lblTitular.anchor = GridBagConstraints.WEST;
		gbc_lblTitular.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitular.gridx = 1;
		gbc_lblTitular.gridy = 7;
		add(lblTitular, gbc_lblTitular);
		
		tfTitular = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 0, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 8;
		add(tfTitular, gbc_textField_3);
		tfTitular.setColumns(10);

	}

}
