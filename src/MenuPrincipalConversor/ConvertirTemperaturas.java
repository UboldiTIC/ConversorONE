package MenuPrincipalConversor;

public class ConvertirTemperaturas {

	private double celsius;
	double resultado;
	public double fahrenheit = resultado;
	//private double resultado = this.fahrenheit;
	
//	public double AsignarCelsius(double celsius) {
//		return this.celsius = this.celsius + celsius;
//	}

	public double convertirCelsius() {
		resultado = (celsius*1.8)+32;
		return resultado;
	}
	
	public double getCelsius() {
		return this.celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getFahrenheit() {
		return this.fahrenheit;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
	}
	
}
