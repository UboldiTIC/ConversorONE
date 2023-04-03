package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;

public class VentanaOperaciones extends JFrame {

	private JPanel panelPrincipal;
	private JTextField textCampoIngresarValor;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
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
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Convertir Temperaturas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
		lblTitulo.setBounds(12, 12, 426, 21);
		panelPrincipal.add(lblTitulo);
		
		textCampoIngresarValor = new JTextField();
		textCampoIngresarValor.setBounds(226, 45, 187, 19);
		panelPrincipal.add(textCampoIngresarValor);
		textCampoIngresarValor.setColumns(10);
		
		JLabel lblIngresarTemperatura = new JLabel("Ingresar temperatura:");
		lblIngresarTemperatura.setBounds(59, 45, 187, 15);
		panelPrincipal.add(lblIngresarTemperatura);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(38, 214, 187, 25);
		panelPrincipal.add(btnConvertir);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(226, 214, 187, 25);
		panelPrincipal.add(btnSalir);
		
		JLabel lblSeleccionarOpcin = new JLabel("Seleccionar opción");
		lblSeleccionarOpcin.setBounds(84, 76, 176, 15);
		panelPrincipal.add(lblSeleccionarOpcin);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(226, 76, 187, 24);
		panelPrincipal.add(comboBox);
		
		JLabel lblElResultadoEs = new JLabel("El resultado es:");
		lblElResultadoEs.setBounds(105, 134, 141, 15);
		panelPrincipal.add(lblElResultadoEs);
		
		textField = new JTextField();
		textField.setBounds(226, 132, 187, 19);
		panelPrincipal.add(textField);
		textField.setColumns(10);
	}
}
