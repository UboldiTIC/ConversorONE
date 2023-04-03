package Operaciones;

public class Temperaturas {
	// 1. Convertir de grados celsius a Fahrenheit
	public static double convertirCelsiusAFahrenheit(double valorIngresado) {
		double fahrenheit = (valorIngresado * 1.8) + 32;
		return fahrenheit;
	}

	// 2. Convertir de grados Fahrenheit a Celsius
	public static double convertirFahrenheitACelsius(double valorIngresado) {
		double celsius = (valorIngresado - 32) / 1.8;
		return celsius;
	}

	// 3. Convertir de grados kelvin a Celsius
	public static double convertirKelvinACelsius(double valorIngresado) {
		double celsius = valorIngresado - 273.15;
		return celsius;
	}

	// 4. Convertir de grados Celsius a Kelvin
	public static double convertirCelsiusAKelvin(double valorIngresado) {
		double kelvin = valorIngresado + 273.15;
		return kelvin;
	}

	// 5. Convertir de Fahrenheit a Kelvin
	public static double convertirFahrenheitAKelvin(double valorIngresado) {
		double kelvin = (valorIngresado - 32) / 1.8 + 273.15;
		return kelvin;
	}

	// 6. Convertir de Kelvin a Fahrenheit
	public static double convertirKelvinAFarenheit(double valorIngresado) {
		double fahrenheit = (valorIngresado - 273.15) * 1.8 + 32;
		return fahrenheit;
	}
}
