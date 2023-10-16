package Animal;

public class Perro extends Animal {  //Herencia de la clase superior Animal

		//"polimorfear" o sobreescribir el metodo heredado
		
		@Override //con la anotacion @Override, le decimos a Java que el metodo hacerSonido sera sobreescrito
		public void hacerSonido() {
			System.out.println("El perrito ladra y hace guau");
			
		}// metodo hacerSonido heredado de Animal

		public static void main (String[] args) {
			
			///Ejemplo de como veniamos trbaajando, AQUI NO HAY POLIMORFISMO, ya qque instancio un animal generico y utilizo su metodo hacerSonido
			Animal Generico = new Animal (); //Genera un animal generico (abstracto)
			Generico.hacerSonido(); //antes de la ejecucion
			
			
			//Generar la instancia de mi perrito
			//Si hay polimorfimos, porque es el equivalente a decir "instancio un animal que es un perrito"
			///Referenciar primero la clase general, y luego la instancia particular, permite el polimorfismo
			Animal Chilaquil = new Perro(); ///Partes de un ancesntro general (animal), pero tu Chilaquil eres un (PERRO)
			Chilaquil.hacerSonido(); //Polimorfismo en tiempo de ejecucion
			
			
		} //Metodo main
		
		
		
} //Cierre clase perro