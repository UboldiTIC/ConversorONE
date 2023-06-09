package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Temperaturas;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class VentanaOperaciones extends JFrame implements ActionListener, ItemListener {

	private JPanel panelPrincipal;
	JPanel panelMonedas, panelTemperaturas;
	JButton btnMonedas, btnTemperaturas;

	Temperaturas misConversiones;
	JTextField textValorTemperatura;
	private JTextField textResultadoTemperatura;

	// Variables Temperaturas:
	JLabel lblIngresarValor;
	JComboBox<String> comboBoxOpcionesTemperatura;
	JLabel lblResultadoEs;
	int elementoSeleccionado;

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		iniciarComponentes();

		setTitle("Convertidor ONE");
		getContentPane().setLayout(null);
		setResizable(false); // No permite maximizar ni modificar tamaño de la ventana.
		setLocationRelativeTo(null); // centrar
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 600, 400);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		// Convertir Temperaturas

		// Botones Principales

		btnMonedas = new JButton("Monedas");
		btnMonedas.setBounds(48, 15, 250, 40);
		btnMonedas.addActionListener(this);
		panelPrincipal.add(btnMonedas);

		btnTemperaturas = new JButton("Temperaturas");
		btnTemperaturas.setBounds(302, 15, 250, 40);
		btnTemperaturas.addActionListener(this);
		panelPrincipal.add(btnTemperaturas);

		// Panel Monedas - El intercambio de paneles gracias a: Cristian
		// Henao(https://www.youtube.com/watch?v=UUENqBb1l34&t=98s).

		panelMonedas = new JPanel();
		panelMonedas.setBackground(Color.BLUE);
		panelMonedas.setBounds(48, 72, 504, 228);
		panelMonedas.setLayout(null);
		panelMonedas.setVisible(true);
		panelPrincipal.add(panelMonedas);

		cargarComponentesMonedas();

		// Panel Temperaturas

		cargarComponentesTemperaturas();

	}

	private void cargarComponentesMonedas() {
		// TODO Auto-generated method stub

	}

	private void cargarComponentesTemperaturas() {
		panelTemperaturas = new JPanel();
		panelTemperaturas.setBackground(Color.LIGHT_GRAY);
		panelTemperaturas.setBounds(48, 72, 504, 228);
		panelTemperaturas.setLayout(null);
		panelTemperaturas.setVisible(false);
		panelPrincipal.add(panelTemperaturas);

		lblIngresarValor = new JLabel("Ingrese la temperatura que desea convertir:");
		lblIngresarValor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblIngresarValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresarValor.setBounds(0, 10, 504, 20);
		lblIngresarValor.setLayout(null);
		panelTemperaturas.add(lblIngresarValor);
		
		textValorTemperatura = new JTextField();
		textValorTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		textValorTemperatura.setBounds(77, 34, 350, 40);
		textValorTemperatura.setColumns(10);
		panelTemperaturas.add(textValorTemperatura);
		

		comboBoxOpcionesTemperatura = new JComboBox<String>(); // Cómo asignar valores desde Temperaturas???
		comboBoxOpcionesTemperatura.addItem("Celsius a Fahrenheit");
		comboBoxOpcionesTemperatura.addItem("Fahrenheit a Celsius");
		comboBoxOpcionesTemperatura.addItem("Kelvin a Celsius");
		comboBoxOpcionesTemperatura.addItem("Celsius a Kelvin");
		comboBoxOpcionesTemperatura.addItem("Fahrenheit a Kelvin");
		comboBoxOpcionesTemperatura.addItem("Kelvin a Fahrenheit");
		comboBoxOpcionesTemperatura.addItemListener(this);
		// revisar
		comboBoxOpcionesTemperatura.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getSource() == comboBoxOpcionesTemperatura) {
					String selectedElement = (String) comboBoxOpcionesTemperatura.getSelectedItem();
					elementoSeleccionado = Integer.parseInt(selectedElement);

				}
			}
		});


		comboBoxOpcionesTemperatura.setBounds(77, 84, 350, 40);
		panelTemperaturas.add(comboBoxOpcionesTemperatura);

		lblResultadoEs = new JLabel("El resultado es:");
		lblResultadoEs.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultadoEs.setFont(new Font("Dialog", Font.BOLD, 14));
		lblResultadoEs.setBounds(0, 138, 504, 15);
		panelTemperaturas.add(lblResultadoEs);

		// revisar
		textResultadoTemperatura = new JTextField();
		textResultadoTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		textResultadoTemperatura.setBounds(77, 158, 350, 40);
		panelTemperaturas.add(textResultadoTemperatura);
		textResultadoTemperatura.setColumns(10);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnMonedas == e.getSource()) {
			panelMonedas.setVisible(true);
			panelTemperaturas.setVisible(false);
		}
		if (btnTemperaturas == e.getSource()) {
			panelMonedas.setVisible(false);
			panelTemperaturas.setVisible(true);
		}

	}

	public void asignarTemperaturas(Temperaturas misConversiones) {
		this.misConversiones = misConversiones;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}

	public JTextField getTextValorTemperatura() {
		return textValorTemperatura;
	}

	public void setTextValorTemperatura(JTextField textValorTemperatura) {
		this.textValorTemperatura = textValorTemperatura;
	}

	public JTextField getTextResultadoTemperatura() {
		return textResultadoTemperatura;
	}

	public void setTextResultadoTemperatura(JTextField textResultadoTemperatura) {
		this.textResultadoTemperatura = textResultadoTemperatura;
	}
}
