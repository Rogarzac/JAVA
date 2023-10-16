package practicaControlDeFlujo;

public class ControlDeFlujo {
	public static void main (String[] args) {
		
		System.out.println("****if else***");
		int numero = 5;
		if(numero == 5) {
			System.out.println("Bonito ciclo");
		}else {
			System.out.println("Aun mas bonito crack");
		}//cierre de mi control de flujo
		
		
		System.out.println("****if elseif elseif else***");
		if (numero ==6) {
			System.out.println("PRIMER VALOR");
		} else if (numero <= 4) {
		System.out.println("segunda opcion");
		} else {
			System.out.println("yeeei");
		}
		switch(numero){
		case 1: System.out.println("hola");
		break;
		case 5: System.out.println("hola");
		break;
		}
		
		String terniario = (numero >6) ? "si" : "no"; 
		System.out.println(terniario);
		
	}//cierre del metodo main

	
	
	
	
	
}//cierre de la clase
