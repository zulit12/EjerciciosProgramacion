package modFabricante;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class VentanaFabricante {

	Fabricante actual = null;
	
	
	private JFrame frame;
	private JTextField jtfid;
	private JTextField jtfCIF;
	private JTextField jtfnombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFabricante window = new VentanaFabricante();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaFabricante() {
		initialize();
//		this.actual = ControladorFabricante.getInstance().findPrimero();
//		cargarActualEnPantalla();
//	}
//	
//	private void cargarActualEnPantalla() {
//		if (this.actual != null) {
//			this.jtfid.setText("" + this.actual.getId());
//			this.jtfCIF.setText(this.actual.getCif());
//			this.jtfnombre.setText(this.actual.getNombre());
//		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 154, 0};
		gridBagLayout.columnWeights = new double[]{0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblId = new JLabel("Id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 5, 5, 5);
		gbc_lblId.gridx = 0;
		gbc_lblId.gridy = 0;
		frame.getContentPane().add(lblId, gbc_lblId);
		
		jtfid = new JTextField();
		GridBagConstraints gbc_jtfid = new GridBagConstraints();
		gbc_jtfid.ipady = 1;
		gbc_jtfid.ipadx = 1;
		gbc_jtfid.insets = new Insets(5, 0, 5, 25);
		gbc_jtfid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfid.gridx = 1;
		gbc_jtfid.gridy = 0;
		frame.getContentPane().add(jtfid, gbc_jtfid);
		jtfid.setColumns(10);
		
		JLabel lblCif = new JLabel("CIF:");
		GridBagConstraints gbc_lblCif = new GridBagConstraints();
		gbc_lblCif.anchor = GridBagConstraints.EAST;
		gbc_lblCif.insets = new Insets(0, 5, 5, 5);
		gbc_lblCif.gridx = 0;
		gbc_lblCif.gridy = 1;
		frame.getContentPane().add(lblCif, gbc_lblCif);
		
		jtfCIF = new JTextField();
		GridBagConstraints gbc_jtfCIF = new GridBagConstraints();
		gbc_jtfCIF.insets = new Insets(0, 0, 5, 25);
		gbc_jtfCIF.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCIF.gridx = 1;
		gbc_jtfCIF.gridy = 1;
		frame.getContentPane().add(jtfCIF, gbc_jtfCIF);
		jtfCIF.setColumns(10);
		
		JLabel lblNombreFabricante = new JLabel("nombre");
		GridBagConstraints gbc_lblNombreFabricante = new GridBagConstraints();
		gbc_lblNombreFabricante.anchor = GridBagConstraints.EAST;
		gbc_lblNombreFabricante.insets = new Insets(0, 5, 5, 5);
		gbc_lblNombreFabricante.gridx = 0;
		gbc_lblNombreFabricante.gridy = 2;
		frame.getContentPane().add(lblNombreFabricante, gbc_lblNombreFabricante);
		
		jtfnombre = new JTextField();
		GridBagConstraints gbc_jtfnombre = new GridBagConstraints();
		gbc_jtfnombre.insets = new Insets(0, 0, 5, 25);
		gbc_jtfnombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfnombre.gridx = 1;
		gbc_jtfnombre.gridy = 2;
		frame.getContentPane().add(jtfnombre, gbc_jtfnombre);
		jtfnombre.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 2;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		panel.add(btnUltimo);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 4;
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 4;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNuevo = new JButton("Nuevo");
		panel_1.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		panel_1.add(btnGuardar);
		
		JButton btnBorrar = new JButton("Borrar");
		panel_1.add(btnBorrar);
	}

}
