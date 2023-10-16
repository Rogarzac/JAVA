//En esta clase a heredar el atributo de la clase abstracta Figura, y lo vamos a sobreescribir

package Figura;
//1. Aplicamos herencia
	public class Rectangulo extends Figura{
		
		///Parametros 
		double base;
		double altura;
		//Contructor
		Rectangulo(double base, double altura){
			this.base = base;
			this.altura = altura;
		}//contructor de mi objeto Rectangulo

		@Override
		public double calcularArea() {
			double formulaRectangulo = base * altura;
			return formulaRectangulo;
		}//metodo calcularArea
		
		
	}//Class figura


