package br.univel.view;

import javax.swing.JPanel;

import br.univel.client.ImplOperacoes;

import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.GridBagConstraints;

public class TPrincipalBancario extends JPanel {

	public TPrincipalBancario() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 117, 30, 117, 0};
		gridBagLayout.rowHeights = new int[] {30, 23, 44, 23, 44, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnInfContas = new JButton("1 - Informações de contas");
		btnInfContas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DInfContas infConta = new DInfContas();
				infConta.setLocationRelativeTo(null);;
				infConta.setVisible(true);
			}	
			});	
		GridBagConstraints gbc_btnInfContas = new GridBagConstraints();
		gbc_btnInfContas.gridx = 1;
		gbc_btnInfContas.gridy = 1;
		add(btnInfContas, gbc_btnInfContas);

		
		JButton btnProfissionais = new JButton("4 -Profissionais");
		btnProfissionais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TCadProfissional cadProfissional = new TCadProfissional();
				cadProfissional.setVisible(true);
			}	
			});	
		GridBagConstraints gbc_btnProfissionais = new GridBagConstraints();
		gbc_btnProfissionais.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnProfissionais.insets = new Insets(0, 0, 5, 0);
		gbc_btnProfissionais.gridx = 3;
		gbc_btnProfissionais.gridy = 1;
		add(btnProfissionais, gbc_btnProfissionais);

		JButton btnNovaConta = new JButton("2 - Nova conta");
		GridBagConstraints gbc_btnNovaConta = new GridBagConstraints();
		gbc_btnNovaConta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNovaConta.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovaConta.gridx = 1;
		gbc_btnNovaConta.gridy = 3;
		add(btnNovaConta, gbc_btnNovaConta);
		
		JButton btnBalanco = new JButton("5 - Balanço");
		GridBagConstraints gbc_btnBalanco = new GridBagConstraints();
		gbc_btnBalanco.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBalanco.insets = new Insets(0, 0, 5, 0);
		gbc_btnBalanco.gridx = 3;
		gbc_btnBalanco.gridy = 3;
		add(btnBalanco, gbc_btnBalanco);
		
		JButton btnClientes = new JButton("3 - Clientes");
		GridBagConstraints gbc_btnClientes = new GridBagConstraints();
		gbc_btnClientes.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClientes.insets = new Insets(0, 0, 0, 5);
		gbc_btnClientes.gridx = 1;
		gbc_btnClientes.gridy = 5;
		add(btnClientes, gbc_btnClientes);

		JButton btnAgencias = new JButton("6 - Agências");
		GridBagConstraints gbc_btnAgencias = new GridBagConstraints();
		gbc_btnAgencias.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAgencias.gridx = 3;
		gbc_btnAgencias.gridy = 5;
		add(btnAgencias, gbc_btnAgencias);

	}


}
