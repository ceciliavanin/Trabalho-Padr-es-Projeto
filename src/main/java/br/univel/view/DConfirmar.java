package br.univel.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;

public class DConfirmar extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DConfirmar dialog = new DConfirmar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DConfirmar() {
		setBounds(100, 100, 344, 196);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblRealizadoComSucesso = new JLabel("realizado com sucesso");
		lblRealizadoComSucesso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblRealizadoComSucesso = new GridBagConstraints();
		gbc_lblRealizadoComSucesso.anchor = GridBagConstraints.WEST;
		gbc_lblRealizadoComSucesso.insets = new Insets(0, 0, 5, 5);
		gbc_lblRealizadoComSucesso.gridx = 1;
		gbc_lblRealizadoComSucesso.gridy = 1;
		getContentPane().add(lblRealizadoComSucesso, gbc_lblRealizadoComSucesso);
		
		JLabel lblValor = new JLabel("Valor: R$ ");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.anchor = GridBagConstraints.WEST;
		gbc_lblValor.gridx = 1;
		gbc_lblValor.gridy = 2;
		getContentPane().add(lblValor, gbc_lblValor);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRetornar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TPrincipalCliente pCliente = new TPrincipalCliente();
				pCliente.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnRetornar = new GridBagConstraints();
		gbc_btnRetornar.gridx = 2;
		gbc_btnRetornar.gridy = 3;
		getContentPane().add(btnRetornar, gbc_btnRetornar);
	}

}
