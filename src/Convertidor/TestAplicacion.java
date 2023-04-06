package Convertidor;

public class TestAplicacion extends Aplicacion {
	
	public static void main(String[] args) {
		Aplicacion appPrueba = new Aplicacion();
		appPrueba.setValorIngresado(25);
		System.out.println(appPrueba.getValorIngresado());
		appPrueba.setOpcionConvertir(2);
		System.out.println(appPrueba.getOpcionConvertir(0));
		System.out.println(appPrueba.getRespuestaUno());
		
		
	}

}
