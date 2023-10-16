package Figura;


///clase concreta (normal) que implementa metodos de una interfax llamada calculable

public class Esfera implements Calculable{
	
	////Atributos 
	double radio = 4;
	double pi = 3.1416;

	@Override
	public double calcularArea() {
		///4 π r 2
		double area = (4*pi)*(radio*radio);
		return  area;
	}

	@Override
	public double calcularVolumen() {
		/// V = 4/3 π r³
	}

	@Override
	public double calcularPerimetro() {
		/// 2 × π × r 
	}
	
	
	
	

}//class Esfera
