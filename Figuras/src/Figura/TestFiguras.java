package Figura;

public class TestFiguras {
	public static void main (String[] args) {
		
		//Generar las instancias de nuestras clases 
		//1. Instancia de la clase Figura 
		///Figura Generica = new Figura (); //Error: no se puede porque es una clase abstracta
		
		//2. Instancia de un rectangulo
		Figura rectangulo = new Rectangulo(5.0, 6.5);
		
		//3. Instancia de un circulo
		Figura circulo = new Circulo(3.14, 3.0);
		
		
		//invocacion del metodo
		System.out.println(rectangulo.calcularArea()); //base y altura
		System.out.println(circulo.calcularArea()); //pi y radio
		
		
		
	}//metodo main

}//Class TestFiguras
