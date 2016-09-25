package br.univel.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.math.BigDecimal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.univel.Cliente;
import br.univel.Produto;
import br.univel.SerIMP;
import br.univel.Venda;
import br.univel.client.ImplOperacoes;

public class TSaque extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TSaque() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 100, 30, 100, 100, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btn50 = new JButton("R$ 50,00");
		GridBagConstraints gbc_btn50 = new GridBagConstraints();
		gbc_btn50.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn50.insets = new Insets(0, 0, 5, 5);
		gbc_btn50.gridx = 1;
		gbc_btn50.gridy = 1;
		add(btn50, gbc_btn50);
		
		JButton btn300 = new JButton("R$ 300,00");
		GridBagConstraints gbc_btn300 = new GridBagConstraints();
		gbc_btn300.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn300.insets = new Insets(0, 0, 5, 5);
		gbc_btn300.gridx = 3;
		gbc_btn300.gridy = 1;
		add(btn300, gbc_btn300);
		
		JButton btn100 = new JButton("R$ 100,00");
		GridBagConstraints gbc_btn100 = new GridBagConstraints();
		gbc_btn100.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn100.insets = new Insets(0, 0, 5, 5);
		gbc_btn100.gridx = 1;
		gbc_btn100.gridy = 3;
		add(btn100, gbc_btn100);
		
		JButton btn500 = new JButton("R$ 500,00");
		GridBagConstraints gbc_btn500 = new GridBagConstraints();
		gbc_btn500.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn500.insets = new Insets(0, 0, 5, 5);
		gbc_btn500.gridx = 3;
		gbc_btn500.gridy = 3;
		add(btn500, gbc_btn500);
		
		JButton btn200 = new JButton("R$ 200,00");
		GridBagConstraints gbc_btn200 = new GridBagConstraints();
		gbc_btn200.fill = GridBagConstraints.HORIZONTAL;
		gbc_btn200.insets = new Insets(0, 0, 5, 5);
		gbc_btn200.gridx = 1;
		gbc_btn200.gridy = 5;
		add(btn200, gbc_btn200);
		
		JLabel lblInformeOuto = new JLabel("Informe outo valor:");
		GridBagConstraints gbc_lblInformeOuto = new GridBagConstraints();
		gbc_lblInformeOuto.anchor = GridBagConstraints.WEST;
		gbc_lblInformeOuto.insets = new Insets(0, 0, 5, 5);
		gbc_lblInformeOuto.gridx = 3;
		gbc_lblInformeOuto.gridy = 5;
		add(lblInformeOuto, gbc_lblInformeOuto);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 5;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImplOperacoes op = new ImplOperacoes();
				BigDecimal valor = new BigDecimal(textField.getText());
				op.saques(valor);
				DConfirmar confirmar = new DConfirmar();
				confirmar.setLocationRelativeTo(null);;
				confirmar.setVisible(true);
			}	
			});	
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnConfirmar.gridx = 4;
		gbc_btnConfirmar.gridy = 6;
		add(btnConfirmar, gbc_btnConfirmar);

	}

}
