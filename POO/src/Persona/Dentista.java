package Persona;

public class Dentista extends Persona {
	///1 atributos
	/*
	 * Ya no creo valores como nombre, edad apellido, etc por que estos valores los voy a heredar de la clase Persona
	 */
	 String especialidad;
	 String cedula;
	 String consultorioAsignado;
	 String experiencia;
	 String turno;
	 int salario;
	 //2 cosntructor 
	public Dentista(String nombre, String apellido, byte edad, String telefono, String email, String especialidad,
			String cedula, String consultorioAsignado, String experiecia, String turno, int salario) {
		super(nombre, apellido, edad, telefono, email); //informacion de la clase Persona
		this.especialidad = especialidad;
		//Informacion de la clase Dentista
		this.cedula = cedula;
		this.consultorioAsignado = consultorioAsignado;
		this.experiencia = experiecia;
		this.turno = turno;
		this.salario = salario;
	}//cierre del constructor
	
	//3 Metodos (Metodo para calcular salario basado en la experiencia
		//Experiencia  = basico, intermedio, avanzado 
		//Si el dentista esta en rango basico, gana 30,000. Si es intermedio, gana 40000, si es avanzado gana 50000
	void calcularSalario() {
		//Logica de programacion
		if (experiencia.equals("basico")) {
			salario = 30000;
		}else if (experiencia.equals("intermedio")) {
			salario = 40000;
		}else if (experiencia.equals("avanzado")) {
			salario = 50000;
		}
	}
	 void imprimirInfoDentista() {
		 System.out.println("la especialidad: " + especialidad);
		 System.out.println("El salario es: " + salario);
		 
	 }

	@Override
	public String toString() {
		return "Dentista [especialidad=" + especialidad + ", cedula=" + cedula + ", consultorioAsignado="
				+ consultorioAsignado + ", experiencia=" + experiencia + ", turno=" + turno + ", salario=" + salario
				+ "]";
	}
	 
}//cierre de dentista
