package br.univel.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.univel.client.TipoConta;

public class DInfContas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfAgencia;
	private JTextField tfConta;
	private JComboBox cbTipoConta;
	private JLabel lblTitular;
	private JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DInfContas dialog = new DInfContas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DInfContas() {
		setBounds(100, 100, 401, 243);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{261, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 98, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblAgencia = new JLabel("Ag\u00EAncia:");
			GridBagConstraints gbc_lblAgencia = new GridBagConstraints();
			gbc_lblAgencia.anchor = GridBagConstraints.WEST;
			gbc_lblAgencia.insets = new Insets(0, 0, 5, 5);
			gbc_lblAgencia.gridx = 1;
			gbc_lblAgencia.gridy = 1;
			contentPanel.add(lblAgencia, gbc_lblAgencia);
		}
		{
			JLabel lblConta = new JLabel("Conta:");
			GridBagConstraints gbc_lblConta = new GridBagConstraints();
			gbc_lblConta.anchor = GridBagConstraints.WEST;
			gbc_lblConta.insets = new Insets(0, 0, 5, 5);
			gbc_lblConta.gridx = 2;
			gbc_lblConta.gridy = 1;
			contentPanel.add(lblConta, gbc_lblConta);
		}
		{
			tfAgencia = new JTextField();
			GridBagConstraints gbc_tfAgencia = new GridBagConstraints();
			gbc_tfAgencia.anchor = GridBagConstraints.WEST;
			gbc_tfAgencia.insets = new Insets(0, 0, 5, 5);
			gbc_tfAgencia.gridx = 1;
			gbc_tfAgencia.gridy = 2;
			contentPanel.add(tfAgencia, gbc_tfAgencia);
			tfAgencia.setColumns(10);
		}
		{
			tfConta = new JTextField();
			GridBagConstraints gbc_tfConta = new GridBagConstraints();
			gbc_tfConta.insets = new Insets(0, 0, 5, 5);
			gbc_tfConta.anchor = GridBagConstraints.WEST;
			gbc_tfConta.gridx = 2;
			gbc_tfConta.gridy = 2;
			contentPanel.add(tfConta, gbc_tfConta);
			tfConta.setColumns(10);
		}
		{
			lblTitular = new JLabel("Titular:");
			GridBagConstraints gbc_lblTitular = new GridBagConstraints();
			gbc_lblTitular.anchor = GridBagConstraints.WEST;
			gbc_lblTitular.insets = new Insets(0, 0, 5, 5);
			gbc_lblTitular.gridx = 1;
			gbc_lblTitular.gridy = 3;
			contentPanel.add(lblTitular, gbc_lblTitular);
		}
		{
			cbTipoConta = new JComboBox();
			cbTipoConta.setModel(new DefaultComboBoxModel(new String[] {"CC - Conta Corrente", "CP - Conta Poupan\u00E7a", "CE - Conta Eletr\u00F4nica"}));
			GridBagConstraints gbc_cbTipoConta = new GridBagConstraints();
			gbc_cbTipoConta.insets = new Insets(0, 0, 5, 5);
			gbc_cbTipoConta.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbTipoConta.gridx = 1;
			gbc_cbTipoConta.gridy = 4;
			contentPanel.add(cbTipoConta, gbc_cbTipoConta);
		}
		{
			btnConfirmar = new JButton("Confirmar");
			btnConfirmar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					TPrincipalCliente cliente = new TPrincipalCliente();
					cliente.setVisible(true);
				}
			});
			GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
			gbc_btnConfirmar.anchor = GridBagConstraints.EAST;
			gbc_btnConfirmar.insets = new Insets(0, 0, 0, 5);
			gbc_btnConfirmar.gridx = 1;
			gbc_btnConfirmar.gridy = 6;
			contentPanel.add(btnConfirmar, gbc_btnConfirmar);
		}
	}

}
