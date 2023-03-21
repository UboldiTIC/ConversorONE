package ConceptosEnCodigo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
	
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
		JPanel panel = new JPanel();
		
		//panel.setBackground(Color.WHITE);
		panel.setLayout(null); //desactivamos el diseño por defecto.
		this.getContentPane().add(panel); // Agregamos el panel a la ventana.
		
		JLabel etiqueta = new JLabel("Hola",SwingConstants.CENTER);
		//etiqueta.setText("Hola");
		etiqueta.setBounds(10, 10, 50, 20);
		etiqueta.setForeground(Color.WHITE);
		etiqueta.setOpaque(true); //establecemos pintar el fondo de la etiqueta.
		etiqueta.setBackground(Color.BLACK);
		etiqueta.setFont(new Font("arial",Font.PLAIN,20));
		panel.add(etiqueta);
		
	}

	
	
}
