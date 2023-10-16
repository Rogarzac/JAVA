package tipoDeDatos;

public class TipoDeDatos {
public static void main (String[] args) {
	int numero = 45;
	double numero2 = 8.56;
	byte numero3 = 25;
	float numero4 = 56.69f;
	char letra = 'A'; ///Importante, char se declara con este tipo de comillas ''
	String letra2 = "Hola mundo"; ///String debe ser si o si en mayuscula la s

	
	////Este es un casteo forzado por que de fraccion a un numero entero es necesario declararlo de esta manera
	int numero2Entero = (int) numero2;
	///Este es un casteo implicioto o automatico, ya que de un valor entero a un double se puede hacer directamente
	double numeroFraccion = numero;
	
	
	System.out.println(numero);
	System.out.println(numero2);
	System.out.println(numero3);
	System.out.println(numero4);
	System.out.println(letra);
	System.out.println(letra2);
	System.out.println(numero2Entero);
	System.out.println(numeroFraccion);
}
}
