package ConceptosEnCodigo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	
	public JPanel panel; 
	
	public Ventana() {
		setSize(500,500);
		//setLocation(100,200);
		//setBounds(100,200,500,500);
		setLocationRelativeTo(null); // Establece la ventana en el centro.
		
		setTitle("El mejor título");
		
		//this.getContentPane().setBackground(Color.GREEN);
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void iniciarComponentes() {
		
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		colocarCajasDeTexto();
	
	}

	private void colocarPaneles() {
		panel = new JPanel();
		
		//panel.setBackground(Color.WHITE);
		panel.setLayout(null); //desactivamos el diseño por defecto.
		this.getContentPane().add(panel); // Agregamos el panel a la ventana.

	}
	
	private void colocarEtiquetas() {
		JLabel etiqueta = new JLabel("Mundial 2018",SwingConstants.CENTER);
		//etiqueta.setText("Hola");
		etiqueta.setBounds(85, 10, 300, 80);
		etiqueta.setForeground(Color.BLACK);
		//etiqueta.setOpaque(true); //establecemos pintar el fondo de la etiqueta.
		//etiqueta.setBackground(Color.WHITE);
		etiqueta.setFont(new Font("cooper black",Font.PLAIN,40));
		panel.add(etiqueta);
		
		//Agregar imagen en un JLabel
		/*
		JLabel etiqueta2 = new JLabel(new ImageIcon("pelota.jpg"));
		etiqueta2.setBounds(10, 80, 350, 350);
		panel.add(etiqueta2);
		*/
	}
	
	private void colocarBotones() {
		//Boton de texto:
		JButton boton1 = new JButton("Click");
		//boton1.setText("Click");
		boton1.setBounds(100, 100, 100, 40);
		//boton1.setEnabled(false);
		//boton1.setMnemonic('a'); //manejar con Alt + a.
		
		//Mejorar diseño:
		boton1.setForeground(Color.BLUE);
		boton1.setFont(new Font("arial",Font.BOLD,20));

		panel.add(boton1);
		
		//Boton de imagen:
		JButton boton2 = new JButton();
		boton2.setBounds(100, 200, 100, 40);
		//boton2.setOpaque(true); En versiones que no se puede setBackground directamente.
		//AGREGAR IMAGEN AL BOTON:
		/*
		 * ImageIcon clicAqui = new ImageIcon("boton.png");
		 * boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
		 */
		
		boton2.setBackground(Color.BLUE);
		panel.add(boton2);
		
	}
	
	private void colocarRadioBotones() {
		JRadioButton radioBoton1 = new JRadioButton("Opcion 1", true);
		radioBoton1.setBounds(50, 100, 150, 50);
		radioBoton1.setEnabled(true);
		radioBoton1.setText("Programación");
		radioBoton1.setFont(new Font("arial",0,20));
		panel.add(radioBoton1);
		
		JRadioButton radioBoton2 = new JRadioButton("Opcion 2", false);
		radioBoton2.setBounds(50, 150, 100, 50);
		panel.add(radioBoton2);
		
		JRadioButton radioBoton3 = new JRadioButton("Opcion 3", false);
		radioBoton3.setBounds(50, 200, 100, 50);
		panel.add(radioBoton3);
		
		//Para seleccionar una sóla opción se deben agrupar.
		ButtonGroup grupoRadioBotones = new ButtonGroup();
		grupoRadioBotones.add(radioBoton1);
		grupoRadioBotones.add(radioBoton2);
		grupoRadioBotones.add(radioBoton3);
	
	}
	
	private void colocarCajasDeTexto() {
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(50, 50, 200, 30);
		cajaTexto.setText("Hola...");
		
		System.out.println("Texto en la caja: "+cajaTexto.getText());
		panel.add(cajaTexto);
		
	}
}
