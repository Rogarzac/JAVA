package dataTypes;

public class DatosEstructurados {
	public static void main (String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas de caracteres o bien, algún tipo de dato primitivo
		 * -- String. Cadena de Caracteres, se declaran entre comillas y hay que definir el tipo de dato con la palabra reservada String
		 * -- Arrays.
		 * -- Creados por el usuario (API Java)
*/
		String myString = "Hola, soy un string";
		System.out.println(myString);

		
		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);
		/*
		 * Metodo para Strings.
		 * --String length. Metodo que permite medir la longitud de una cadena de caracteres
		 */
		String texto = "aBcDeFgHiJ";
		//-- String Length. Meétodo que permite medir la longitud de una cadea de carateres
		System.out.println("La longitud de la variable texto de tipo string es " + texto.length());
		/*
		 * Guardando la variable texto en una nueva variable de tipo int para pasarle el método length
		 * int metodoLength = texto.length();
		 *--Output: 10
		 *Imprimimos en consola la nueva variable
		 *System.out.println(metodoLength);
		 */
		//-- String: toUpperCase() y toLowerCase()
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicando el metodo toUpperCase: " + upperCase);
		
		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicando el metodo toLowerCase: " + lowerCase);
		
		///-- indexOf(). Devuelve el indice de la primera aparición de un texto especifico
		String fraseMotivacional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivacional.indexOf("temporal"); //8
		System.out.println("La palabra 'temporal' inicia en el indice: " + indexOf);
		
		//-- Concatenación
		String fristName = "Daniel ";
		String lastName = "Maldonado";
		String userName = fristName + " "+ lastName;
		System.out.println(userName);
		System.out.println(fristName.concat(lastName));
		//-- Metodos de conversion (parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + "y el tipo de dato es " + presupuesto.getClass().getSimpleName());
		int parseado = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo " + presupuesto.getClass().getSimpleName() + " ahora es " + parseado + " que ahora es de tipo " + ((Object)parseado).getClass().getSimpleName()) ;
		
}


}
