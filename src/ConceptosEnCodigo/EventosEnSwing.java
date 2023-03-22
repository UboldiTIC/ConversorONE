package ConceptosEnCodigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EventosEnSwing extends JFrame {

	private JPanel panelEventos;
	private JLabel saludo;
	private JTextField cajaTexto;
	private JButton boton;

	public EventosEnSwing() {
		setSize(500, 500);
		setLocationRelativeTo(null); // Establece la ventana en el centro.

		setTitle("Eventos");
		// this.getContentPane().setBackground(Color.GREEN);
		iniciarComponentes();

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private void iniciarComponentes() {

		colocarPaneles();
		colocarEtiquetas();
		colocarBoton();
		// colocarRadioBotones();
		colocarCajasDeTexto();
		// colocarAreasDeTexto();
		// colocarListasDesplegables();

	}

	private void colocarPaneles() {
		panelEventos = new JPanel();

		// panel.setBackground(Color.WHITE);
		panelEventos.setLayout(null); // desactivamos el diseño por defecto.
		this.getContentPane().add(panelEventos); // Agregamos el panel a la ventana.

	}

	private void colocarEtiquetas() {
		JLabel etiqueta = new JLabel("Ingrese su nombre: ", SwingConstants.LEFT);
		etiqueta.setBounds(20, 20, 300, 30);
		etiqueta.setForeground(Color.BLACK);
		etiqueta.setFont(new Font("cooper black", Font.PLAIN, 20));
		panelEventos.add(etiqueta);
	}

	private void colocarCajasDeTexto() {
		JTextField cajaTexto = new JTextField();
		cajaTexto.setBounds(20, 50, 300, 40);
		System.out.println("Texto en la caja: " + cajaTexto.getText());
		panelEventos.add(cajaTexto);
	}

	private void colocarBoton() {
		
		JButton boton = new JButton("¡Pulse aquí!");
		boton.setBounds(100, 100, 150, 40);
		boton.setFont(new Font("arial",Font.BOLD,15));
		panelEventos.add(boton);
		
		saludo = new JLabel();
		saludo.setBounds(50,200,300,40);
		saludo.setFont(new Font("arial",1,20));
		panelEventos.add(saludo);
		
		
		//Escuchar Eventos:
		ActionListener oyenteDeAccion = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				saludo.setText("Hola "+cajaTexto.getText());
				
			}
		};
		
		boton.addActionListener(oyenteDeAccion);	
	}
}
