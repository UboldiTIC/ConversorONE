package MenuPrincipalConversor;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Contenedor extends JFrame {

	public JPanel panelPrincipal;

	public Contenedor() {
		setSize(800, 640);
		setLocationRelativeTo(null);
		setTitle("Conversor ONE (Alura + Oracle)");
		//this.getContentPane().setBackground(Color.DARK_GRAY);
		iniciarOpciones();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarOpciones() {
		iniciarPanel();
		seleccionarMonedaUno();
		seleccionarMonedaDos();
	}

	private void iniciarPanel() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.DARK_GRAY);
		panelPrincipal.setLayout(null);
		this.getContentPane().add(panelPrincipal);
	}

	private void seleccionarMonedaUno() {
		String[] monedas = {"Dólar", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sul-Coreano" };

		JComboBox listaMonedas = new JComboBox(monedas);
		listaMonedas.setBounds(600, 20, 200, 30);
		panelPrincipal.add(listaMonedas);
	}
	
	private void seleccionarMonedaDos() {
		String[] monedas = {"Peso Argentino", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sul-Coreano" };

		JComboBox listaMonedas = new JComboBox(monedas);
		listaMonedas.setBounds(400, 20, 200, 30);
		panelPrincipal.add(listaMonedas);
	}
	
}