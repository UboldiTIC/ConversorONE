package ConceptosEnCodigo;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosEnSwing extends JFrame {

public JPanel panelEventos; 
	
	public EventosEnSwing() {
		setSize(500,500);
		//setLocation(100,200);
		//setBounds(100,200,500,500);
		setLocationRelativeTo(null); // Establece la ventana en el centro.
		
		setTitle("Eventos: ");
		
		//this.getContentPane().setBackground(Color.GREEN);
		
		iniciarComponentes();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void iniciarComponentes() {
		
		colocarPaneles();
		//colocarEtiquetas();
		//colocarBotones();
		//colocarRadioBotones();
		//colocarCajasDeTexto();
		//colocarAreasDeTexto();
		//colocarListasDesplegables();
	
	}

	private void colocarPaneles() {
		panelEventos = new JPanel();
		
		//panel.setBackground(Color.WHITE);
		panelEventos.setLayout(null); //desactivamos el diseño por defecto.
		this.getContentPane().add(panelEventos); // Agregamos el panel a la ventana.
	
	}
	
}
