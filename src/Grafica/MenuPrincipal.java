package Grafica;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {
		//construir el Menú.
		double decimal;
		
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
		
		JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
		
	}

}
