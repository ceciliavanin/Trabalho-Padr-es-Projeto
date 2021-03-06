package br.univel.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.univel.client.ImplOperacoes;
import br.univel.client.Operacoes;

public class TPagamento extends JPanel {
	private JTextField tfCodBarra;
	private JTextField tfValor;

	public TPagamento() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 100, 46, 0};
		gridBagLayout.rowHeights = new int[]{0, 14, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo de barras");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tfCodBarra = new JTextField();
		GridBagConstraints gbc_tFCodBarra = new GridBagConstraints();
		gbc_tFCodBarra.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCodBarra.insets = new Insets(0, 0, 5, 5);
		gbc_tFCodBarra.gridx = 1;
		gbc_tFCodBarra.gridy = 2;
		add(tfCodBarra, gbc_tFCodBarra);
		tfCodBarra.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor a ser pago");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfValor = new JTextField();
		GridBagConstraints gbc_tFValor = new GridBagConstraints();
		gbc_tFValor.anchor = GridBagConstraints.WEST;
		gbc_tFValor.insets = new Insets(0, 0, 5, 5);
		gbc_tFValor.gridx = 1;
		gbc_tFValor.gridy = 4;
		add(tfValor, gbc_tFValor);
		tfValor.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacoes op = new ImplOperacoes();
				BigDecimal valor = new BigDecimal(tfValor.getText());
				op.pagamento(tfCodBarra.getText(), valor);
				DConfirmar confirmar = new DConfirmar();
				confirmar.setLocationRelativeTo(null);;
				confirmar.setVisible(true);
			}	
			});	

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		add(btnConfirmar, gbc_btnNewButton);

	}

}
