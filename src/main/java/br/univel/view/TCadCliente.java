package br.univel.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import br.univel.banking.ImplOperacoes;
import br.univel.banking.Operacoes;
import br.univel.client.TipoConta;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class TCadCliente extends JPanel {
	private JTextField tfNome;
	private JTextField tfIdade;
	private JTextField tfCPF;
	private JTextField tfAgencia;
	private JTextField tfUsuario;
	private JPasswordField pfSenhaAcesso;
	private JPasswordField pfSenhaOperacoes;

	/**
	 * Create the panel.
	 */
	public TCadCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 80, 67, 92, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		tfNome = new JTextField();
		GridBagConstraints gbc_tFNome = new GridBagConstraints();
		gbc_tFNome.gridwidth = 4;
		gbc_tFNome.insets = new Insets(0, 0, 5, 0);
		gbc_tFNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFNome.gridx = 1;
		gbc_tFNome.gridy = 1;
		add(tfNome, gbc_tFNome);
		tfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tfIdade = new JTextField();
		GridBagConstraints gbc_tFIdade = new GridBagConstraints();
		gbc_tFIdade.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIdade.anchor = GridBagConstraints.NORTH;
		gbc_tFIdade.insets = new Insets(0, 0, 5, 5);
		gbc_tFIdade.gridx = 1;
		gbc_tFIdade.gridy = 2;
		add(tfIdade, gbc_tFIdade);
		tfIdade.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		GridBagConstraints gbc_lblCpf = new GridBagConstraints();
		gbc_lblCpf.anchor = GridBagConstraints.EAST;
		gbc_lblCpf.insets = new Insets(0, 0, 5, 5);
		gbc_lblCpf.gridx = 2;
		gbc_lblCpf.gridy = 2;
		add(lblCpf, gbc_lblCpf);
		
		tfCPF = new JTextField();
		GridBagConstraints gbc_tFCPF = new GridBagConstraints();
		gbc_tFCPF.gridwidth = 2;
		gbc_tFCPF.insets = new Insets(0, 0, 5, 0);
		gbc_tFCPF.fill = GridBagConstraints.BOTH;
		gbc_tFCPF.gridx = 3;
		gbc_tFCPF.gridy = 2;
		add(tfCPF, gbc_tFCPF);
		tfCPF.setColumns(10);
		
		JLabel lblAgncia = new JLabel("Ag\u00EAncia:");
		GridBagConstraints gbc_lblAgncia = new GridBagConstraints();
		gbc_lblAgncia.anchor = GridBagConstraints.EAST;
		gbc_lblAgncia.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgncia.gridx = 0;
		gbc_lblAgncia.gridy = 3;
		add(lblAgncia, gbc_lblAgncia);
		
		tfAgencia = new JTextField();
		GridBagConstraints gbc_tFAgencia = new GridBagConstraints();
		gbc_tFAgencia.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAgencia.anchor = GridBagConstraints.ABOVE_BASELINE;
		gbc_tFAgencia.insets = new Insets(0, 0, 5, 5);
		gbc_tFAgencia.gridx = 1;
		gbc_tFAgencia.gridy = 3;
		add(tfAgencia, gbc_tFAgencia);
		tfAgencia.setColumns(10);
		
		JLabel lblTipoDeConta = new JLabel("Tipo de Conta:");
		GridBagConstraints gbc_lblTipoDeConta = new GridBagConstraints();
		gbc_lblTipoDeConta.anchor = GridBagConstraints.EAST;
		gbc_lblTipoDeConta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoDeConta.gridx = 2;
		gbc_lblTipoDeConta.gridy = 3;
		add(lblTipoDeConta, gbc_lblTipoDeConta);
		
		final JComboBox cBTipoConta = new JComboBox();
		cBTipoConta.setModel(new DefaultComboBoxModel(new String[] {"CC - Conta Corrente", "CP - Conta Poupan\u00E7a", "CE - Conta Eletr\u00F4nica"}));
		GridBagConstraints gbc_cBTipoConta = new GridBagConstraints();
		gbc_cBTipoConta.gridwidth = 2;
		gbc_cBTipoConta.insets = new Insets(0, 0, 5, 0);
		gbc_cBTipoConta.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBTipoConta.gridx = 3;
		gbc_cBTipoConta.gridy = 3;
		add(cBTipoConta, gbc_cBTipoConta);
		
		JLabel lblNewLabel_2 = new JLabel("Usu\u00E1rio:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tfUsuario = new JTextField();
		GridBagConstraints gbc_tFUsuario = new GridBagConstraints();
		gbc_tFUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_tFUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFUsuario.gridx = 1;
		gbc_tFUsuario.gridy = 5;
		add(tfUsuario, gbc_tFUsuario);
		tfUsuario.setColumns(10);
		
		JLabel lblSenhaAcesso = new JLabel("Senha Acesso:");
		GridBagConstraints gbc_lblSenhaAcesso = new GridBagConstraints();
		gbc_lblSenhaAcesso.anchor = GridBagConstraints.EAST;
		gbc_lblSenhaAcesso.insets = new Insets(0, 0, 5, 5);
		gbc_lblSenhaAcesso.gridx = 0;
		gbc_lblSenhaAcesso.gridy = 6;
		add(lblSenhaAcesso, gbc_lblSenhaAcesso);
		
		pfSenhaAcesso = new JPasswordField();
		GridBagConstraints gbc_pFSenhaAcesso = new GridBagConstraints();
		gbc_pFSenhaAcesso.insets = new Insets(0, 0, 5, 5);
		gbc_pFSenhaAcesso.fill = GridBagConstraints.HORIZONTAL;
		gbc_pFSenhaAcesso.gridx = 1;
		gbc_pFSenhaAcesso.gridy = 6;
		add(pfSenhaAcesso, gbc_pFSenhaAcesso);
		
		JLabel lblNewLabel_3 = new JLabel("Senha Opera\u00E7\u00F5es:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 6;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		pfSenhaOperacoes = new JPasswordField();
		GridBagConstraints gbc_pFSenhaOperacoes = new GridBagConstraints();
		gbc_pFSenhaOperacoes.insets = new Insets(0, 0, 5, 5);
		gbc_pFSenhaOperacoes.fill = GridBagConstraints.HORIZONTAL;
		gbc_pFSenhaOperacoes.gridx = 3;
		gbc_pFSenhaOperacoes.gridy = 6;
		add(pfSenhaOperacoes, gbc_pFSenhaOperacoes);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				TipoConta tipo = null;
				Operacoes op = new ImplOperacoes();
				if (cBTipoConta.getSelectedIndex()==0){
					tipo = tipo.CC;
				} else if (cBTipoConta.getSelectedIndex()==1){
					tipo = tipo.CP;
				} else {
					tipo = tipo.CE;
				}
				int idade = Integer.parseInt(tfIdade.getText());	
				op.novaConta(tfNome.getText(), idade, tfCPF.getText(), tfAgencia.getText(), tipo, tfUsuario.getText(), pfSenhaAcesso.getText(), pfSenhaOperacoes.getText());
				DConfirmar confirmar = new DConfirmar();
				confirmar.setLocationRelativeTo(null);;
				confirmar.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
		gbc_btnConfirmar.gridx = 4;
		gbc_btnConfirmar.gridy = 7;
		add(btnConfirmar, gbc_btnConfirmar);

	}

}
