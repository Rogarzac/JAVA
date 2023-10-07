package Persona;

public class Persona {
	//1 atributos (info de como se mostrara mi objeto cuando se instancie)
	String nombre;
	String apellido;
	byte edad; //para tener una correcta asignacion de memoria
	String telefono;
	String email;
	
	//2 constructor
	//solo con poner el nombre de mi clase (Poo) sin decirle que es constructor
	Persona (String nombre, String apellido, byte edad, String telefono, String email){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
		this.email= email;
	} //cierre constructor
	
	//3 metodos lo que podra hacer mi objeto
	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
	}
	
	void saludar () {
		System.out.println("hola, te mando saluditos");
	}

	


	//toString
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ ", email=" + email + "]";
	}
		
	
		
		

} // cierre POO
