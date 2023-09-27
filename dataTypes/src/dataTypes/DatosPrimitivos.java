package dataTypes;

public class DatosPrimitivos {
	public static void main (String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, dohble, boolean, char
		 */
		//vmin y vmax
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		
		System.out.println("El valor minimo de byte es: " + minByte);
		System.out.println("El valor maximo de byte es: " + maxByte);
		///short. vmin y vmax
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		
		System.out.println("El valor minimo de short es: " + minShort);
		System.out.println("El valor maximo de short es: " + maxShort);
		
		///char. vmin y vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de character es: " + maxChar);
		System.out.println("El valor maximo de character es: " + minChar);
		
		////int
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println("El valor minimo de int es: " + maxInt);
		System.out.println("El valor maximo de int es: " + minInt);
		///long
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		System.out.println("El valor minimo de long es: " + maxLong);
		System.out.println("El valor maximo de long es: " + minLong);
		
		///float
		float maxFloat = Float.MAX_VALUE;
		float minFloat = Float.MIN_VALUE;
		System.out.println("El valor minimo de Float es: " + maxFloat);
		System.out.println("El valor maximo de Float es: " + minFloat);
		
		///doble
		double maxDouble = Double.MAX_VALUE;
		double minDouble = Double.MIN_VALUE;
		System.out.println("El valor minimo de Float es: " + maxDouble);
		System.out.println("El valor maximo de Float es: " + minDouble);
		
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/* Casteo ( Conversion de tipos en JAva).
		 * --Automatico (datos mas pequeño a un dato mas grande)
		 * ---Manual (tipo de dato mas grande a tipo de dato mas pequeño)
		 *
		 * */
		/////Casteo automatico
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		/////Casteo manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		//////convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		///Convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
	}
}
