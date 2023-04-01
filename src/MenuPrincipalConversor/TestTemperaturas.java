package MenuPrincipalConversor;

public class TestTemperaturas {
	
	public static void main(String[] args) {
		
		ConvertirTemperaturas prueba = new ConvertirTemperaturas();
		prueba.setCelsius(40);
		System.out.println(prueba.getCelsius());
		System.out.println(prueba.fahrenheit);
		//System.out.println(prueba.resultado);
		
	}

}
