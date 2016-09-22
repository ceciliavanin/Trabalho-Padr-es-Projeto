package br.univel.view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;


import java.awt.GridBagLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TPrincipalCliente extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TPrincipalCliente frame = new TPrincipalCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TPrincipalCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 117, 30, 117, 0};
		gridBagLayout.rowHeights = new int[] {30, 23, 44, 23, 44, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JButton btnSaques = new JButton("1 - Saques");
		
		GridBagConstraints gbc_btnSaques = new GridBagConstraints();
		gbc_btnSaques.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSaques.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaques.gridx = 1;
		gbc_btnSaques.gridy = 1;
		getContentPane().add(btnSaques, gbc_btnSaques);
		
		JButton btnTrans = new JButton("4 -Transfer\u00EAncias");
		GridBagConstraints gbc_btnTrans = new GridBagConstraints();
		gbc_btnTrans.insets = new Insets(0, 0, 5, 0);
		gbc_btnTrans.gridx = 3;
		gbc_btnTrans.gridy = 1;
		getContentPane().add(btnTrans, gbc_btnTrans);
		
		JButton btnSaldos = new JButton("2 - Saldos");
		GridBagConstraints gbc_btnSaldos = new GridBagConstraints();
		gbc_btnSaldos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSaldos.insets = new Insets(0, 0, 5, 5);
		gbc_btnSaldos.gridx = 1;
		gbc_btnSaldos.gridy = 3;
		getContentPane().add(btnSaldos, gbc_btnSaldos);
		
		JButton btnPag = new JButton("5 - Pagamentos");
		GridBagConstraints gbc_btnPag = new GridBagConstraints();
		gbc_btnPag.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPag.insets = new Insets(0, 0, 5, 0);
		gbc_btnPag.gridx = 3;
		gbc_btnPag.gridy = 3;
		getContentPane().add(btnPag, gbc_btnPag);
		
		JButton btnDep = new JButton("3 - Dep\u00F3sitos");
		btnSaques.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				Deposito();
			}
		});

		GridBagConstraints gbc_btnDep = new GridBagConstraints();
		gbc_btnDep.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDep.insets = new Insets(0, 0, 0, 5);
		gbc_btnDep.gridx = 1;
		gbc_btnDep.gridy = 5;
		getContentPane().add(btnDep, gbc_btnDep);
		
		JButton btnEnd = new JButton("6 - Finalizar");
		GridBagConstraints gbc_btnEnd = new GridBagConstraints();
		gbc_btnEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEnd.gridx = 3;
		gbc_btnEnd.gridy = 5;
		getContentPane().add(btnEnd, gbc_btnEnd);

	}

	protected void Deposito() {
	 String titulo = "Deposito";
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			if (tabbedPane.getTitleAt(i).equals(titulo)) {
				tabbedPane.setSelectedIndex(i);
				return;
			}
		}
		TDeposito telaDeposito = new TDeposito();
		tabbedPane.addTab(titulo, telaDeposito);
		mostra();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	private void mostra() {
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
	}
}
