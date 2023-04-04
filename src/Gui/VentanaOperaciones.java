package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Operaciones.Temperaturas;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.SystemColor;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	private JTextField textIngresarValor;
	private JTextField textResultado;
	JButton btnMonedas, btnTemperaturas;
	
	Temperaturas misConversiones;
	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setTitle("Convertidor ONE");
		setResizable(false); //No permite maximizar ni modificar tamaño de la ventana.
		setLocationRelativeTo(null); //centrar
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 600, 400);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		
		//Convertir Temperaturas
		
		
		//Botones Principales
		
		btnMonedas = new JButton("Monedas");
		btnMonedas.setBounds(48, 15, 250, 40);
		btnMonedas.addActionListener(this);
		panelPrincipal.add(btnMonedas);
		
		btnTemperaturas = new JButton("Temperaturas");
		btnTemperaturas.setBounds(302, 15, 250, 40);
		btnTemperaturas.addActionListener(this);
		panelPrincipal.add(btnTemperaturas);
		
		//Panel Monedas
		
		JPanel panelMonedas = new JPanel();
		panelMonedas.setBackground(SystemColor.desktop);
		panelMonedas.setBounds(48, 72, 504, 228);
		panelPrincipal.add(panelMonedas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnMonedas==e.getSource()) {
			JOptionPane.showMessageDialog(null, "Hola Mundo");
			//panelMonedas.setVisible(true);
		}
		if (btnTemperaturas==e.getSource()) {
			JOptionPane.showMessageDialog(null, "Hola Mundo");
		}
		
	}
	
	
			

	public void asignarTemperaturas(Temperaturas misConversiones) {
		this.misConversiones=misConversiones;
		
	}
}
