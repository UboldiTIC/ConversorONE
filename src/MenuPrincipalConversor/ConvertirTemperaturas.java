package MenuPrincipalConversor;

public class ConvertirTemperaturas {

	// Convertir de grados celsius a Fahrenheit
	public double convertirCelsiusAFahrenheit(double valorIngresado) {
		double fahrenheit = (valorIngresado * 1.8) + 32;
		return fahrenheit;
	}
	// Convertir de grados Fahrenheit a Celsius
	public static double convertirFahrenheitACelsius(double valorIngresado) {
		double celsius = (valorIngresado - 32) / 1.8;
		return celsius;
	}
	// Convertir de grados kelvin a Celsius
	public static double convertirKelvinACelsius(double valorIngresado) {
		double celsius = valorIngresado - 273.15;
		return celsius;
	}
	// Convertir de grados Celsius a Kelvin
	public static double convertirCelsiusAKelvin(double valorIngresado) {
		double kelvin = valorIngresado + 273.15;
		return kelvin;
	}
	// Convertir de Fahrenheit a Kelvin
	public static double convertirFahrenheitAKelvin(double valorIngresado) {
		double kelvin = (valorIngresado - 32) / 1.8 + 273.15;
		return kelvin;
	}
	// Convertir de Kelvin a Fahrenheit
		public static double convertirKelvinAFarenheit(double valorIngresado) {
			double fahrenheit = (valorIngresado - 273.15) * 1.8 + 32;
			return fahrenheit;
		}
	
		
////	// testear
////	public static void main(String[] args) {
////		double valorIngresado = 25; // ejemplo
////		double fahrenheit = convertirKelvinAFarenheit(valorIngresado);
////		System.out.println(valorIngresado + " grados, son " + fahrenheit + " grados.");
//	}
}
