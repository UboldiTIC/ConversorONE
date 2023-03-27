package MenuPrincipalConversor;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Contenedor extends JFrame {

	public JPanel panelPrincipal;

	//Área de trabajo principal:
	public Contenedor() {
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Conversor ONE (Alura + Oracle)");
		//this.getContentPane().setBackground(Color.DARK_GRAY);
		iniciarOpciones();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void iniciarOpciones() {
		iniciarPanel();
		tituloPrincipal();
		crearBotones();
		
		//seleccionarMonedaUno();
		//seleccionarMonedaDos();
	}
	
	//Panel principal:

	private void iniciarPanel() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.DARK_GRAY);
		panelPrincipal.setLayout(null);
		this.getContentPane().add(panelPrincipal);
		
		
		iniciarPanelTemperatura(); // revisar panel 2
		
		iniciarPanelMonedas(); // revisar y añadir listener a botones.
	}
	
	//Título Panel:
	
	private void tituloPrincipal() {
		JLabel titulo = new JLabel("Conversor ONE",SwingConstants.CENTER);
		//titulo.setLayout(null);
		titulo.setBounds(150, 5, 500, 80);
		titulo.setForeground(Color.WHITE);
		//etiqueta.setOpaque(true); //establecemos pintar el fondo de la etiqueta.
		titulo.setBackground(Color.BLACK);
		titulo.setFont(new Font("cooper black",Font.PLAIN,40));
		panelPrincipal.add(titulo);
	}
	
	
	//Botones selectores principales:
	
	private void crearBotones() {
		//Botón seleccionar temperatura:
		JButton botonTemperatura = new JButton("Temperatura");
		botonTemperatura.setLayout(null);
		botonTemperatura.setBounds(150, 80, 180, 40);
		botonTemperatura.setForeground(Color.BLACK);
		botonTemperatura.setFont(new Font("arial",Font.BOLD,20));
		panelPrincipal.add(botonTemperatura);
		//Botón seleccionar monedas:
		JButton botonMonedas = new JButton("Monedas");
		botonMonedas.setLayout(null);
		botonMonedas.setBounds(450, 80, 180, 40);
		botonMonedas.setForeground(Color.BLACK);
		botonMonedas.setFont(new Font("arial",Font.BOLD,20));
		panelPrincipal.add(botonMonedas);
		
	}
	
	//Panel conversor de temperaturas:
	private void iniciarPanelTemperatura() {
		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBounds(50, 150, 700, 400);
		panelTemperatura.setLayout(null);
		panelTemperatura.setBackground(Color.LIGHT_GRAY);
		
		//panelPrincipal.add(panelTemperatura); //revisar panel 2.
		
		//Revisar radiobotones:
		JRadioButton botonFahrenheit = new JRadioButton("Fahrenheit a Celsius", true);
		botonFahrenheit.setBounds(150,10,200,100);
		botonFahrenheit.setBackground(Color.LIGHT_GRAY);
		panelTemperatura.add(botonFahrenheit);
		JRadioButton botonCelsius = new JRadioButton("Celsius a Fahrenheit", true);
		botonCelsius.setBounds(450,10,200,100);
		botonCelsius.setBackground(Color.LIGHT_GRAY);
		panelTemperatura.add(botonCelsius);
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(botonFahrenheit);
		grupoRadioBotones.add(botonCelsius);
		
		//Ingresar valor:
		
		//Agregar boton convertir y crear boton convertir y reiniciar en panel principal

	}
	
	
	//Panel Conversor de monedas:
	
	private void iniciarPanelMonedas() {
		JPanel panelMonedas = new JPanel();
		panelMonedas.setBounds(50, 150, 700, 400);
		panelMonedas.setLayout(null);
		panelMonedas.setBackground(Color.LIGHT_GRAY);
		
		panelPrincipal.add(panelMonedas); //revisar panel 2.
		
		//SELECCIONADOR DE MONEDAS:
		String[] monedas = {"Dólar", "Euros", "Libras Esterlinas", "Yen Japonés", "Won Sul-Coreano","Peso Argentino"};

		JComboBox monedaUno = new JComboBox(monedas);
		monedaUno.setBounds(70, 20, 200, 30);
		monedaUno.setSelectedItem("Peso Argentino");
		panelMonedas.add(monedaUno);
		
		JComboBox monedaDos = new JComboBox(monedas);
		monedaDos.setBounds(300, 20, 200, 30);
		panelMonedas.add(monedaDos);
	
		
		
		
		
	}

}