package Convertidor;

import javax.swing.JOptionPane;

import Operaciones.Temperaturas;

public class Aplicacion {
	//misConversiones = Temperaturas;
	
	public Aplicacion() {
		Temperaturas misConversiones = new Temperaturas();
		
		presentarMenu();
	}

	private void presentarMenu() {
		String menu="Convertir Temperaturas";
		menu+="1.Celsius a Fahrenheit";
		menu+="2.Fahrenheit a Celsius";
		menu+="3.Kelvin a Celsius";
		menu+="4.Celsius a Kelvin";
		menu+="5.Fahrenheit a Kelvin";
		menu+="6.Kelvin a Fahrenheit";
		menu+="Ingrese una opción";
		
		int cod=0;
		
		do {
			double valorIngresado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Temperatura: "));
			
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1:
				double respuestaUno=Temperaturas.convertirCelsiusAFahrenheit(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaUno + " grados Fahrenheit");
				break;
			case 2:
				double respuestaDos=Temperaturas.convertirFahrenheitACelsius(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaDos + " grados Celsius");
				break;
			case 3:
				double respuestaTres=Temperaturas.convertirKelvinACelsius(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaTres + " grados Celsius");
				break;
			case 4:
				double respuestaCuatro=Temperaturas.convertirCelsiusAKelvin(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaCuatro + " grados Kelvin");
				break;
			case 5:
				double respuestaCinco=Temperaturas.convertirFahrenheitAKelvin(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaCinco + " grados Kelvin");
				break;
			case 6:
				double respuestaSeis=Temperaturas.convertirKelvinAFarenheit(valorIngresado);
				JOptionPane.showMessageDialog(null, "El resultado es " +respuestaSeis + " grados Fahrenheit");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio");

			default: JOptionPane.showMessageDialog(null, "Ingrese un código válido.");
				break;
			}
		} while(cod!=7);
	}
	
}
