package br.univel.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTabbedPane;

public class TInicial extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TInicial frame = new TInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{105, 161, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTextPane txtpnBancoTadsAqui = new JTextPane();
		txtpnBancoTadsAqui.setToolTipText("");
		txtpnBancoTadsAqui.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnBancoTadsAqui.setText("Banco TADS\t\t\t\t\r\nAqui sua nota n\u00E3o vai ser zero \t\t\t");
		GridBagConstraints gbc_txtpnBancoTadsAqui = new GridBagConstraints();
		gbc_txtpnBancoTadsAqui.gridwidth = 3;
		gbc_txtpnBancoTadsAqui.insets = new Insets(0, 0, 5, 0);
		gbc_txtpnBancoTadsAqui.fill = GridBagConstraints.BOTH;
		gbc_txtpnBancoTadsAqui.gridx = 0;
		gbc_txtpnBancoTadsAqui.gridy = 0;
		contentPane.add(txtpnBancoTadsAqui, gbc_txtpnBancoTadsAqui);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 3;
		gbc_tabbedPane.gridwidth = 3;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		TPrincipalCliente telaInicial = new TPrincipalCliente();
		tabbedPane.addTab("Tela Inicial", telaInicial);
		mostra();
	}

	private void mostra() {
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);

	}

}
