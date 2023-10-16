///Clase circulo que herede de Figura


package Figura;
////Herencia de la clase abstracta figura
public class Circulo extends Figura{
	//1. Atributos 
	double pi;
	double radio;
	
	//2.Constructor 
	Circulo(double pi, double radio){
		this.pi = pi;
		this.radio = radio;
	}//contructor


		//3. MEtodos (metodo abtracto heredado de Figura)
	@Override
	public double calcularArea() {
double areaCirculo = pi * (radio*radio);
return areaCirculo;
		
	}//metodo calcularArea

	
}//class Circulo
