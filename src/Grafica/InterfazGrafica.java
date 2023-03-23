package Grafica;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfazGrafica extends JFrame {
	
	public JPanel panel; 
	
	public InterfazGrafica() {
		setSize(680,680);
		setLocationRelativeTo(null);
		setTitle("Conversor de Monedas - ONE");
		this.getContentPane().setBackground(Color.darkGray);
		
		iniciarAcciones();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void iniciarAcciones() {
		
		panelOpciones();
		
	}

	private void panelOpciones() {
	
	
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
		letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
		
		JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
		JOptionPane.showMessageDialog(null, "El entero es: "+entero);
		JOptionPane.showMessageDialog(null, "El caracter es: "+letra);
		JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
		
	}
}
