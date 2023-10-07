package Persona;

public class AsistenteDental {
//1 Atributos
	private String fechaIngreso;
	private double salario;
//2 Constructor publico
	public AsistenteDental (String fechaIngreso, double salario) {
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
	} //contructor
	
	//3 Metodos
	

	//Metodo para imprimir informacion
		public void mostrarDatosAsistente() {
			System.out.println("La fecha de ingreso del asistente es: " + fechaIngreso);
			System.out.println("El salario del asistente es: " + salario);
		} //Metodo imprimir informacion
		
		//Getters y setters para poder acceder a mis datos privador y poder realizar operaciones con ellos
		//sin getters, la informacion me aparece en null
		//sin setters, no puedo cambiar la informacion
		
		//Este getter perimte retornar el dato de la fehca de ingreso en formato String
		public String getFechaIngreso() {
			return fechaIngreso;
		}//getter
		
		//getter para salario
		public double getSalario () {
			return salario;
		}
		
		//setter para salario (modificar los datos)
		public void setSalario(double nuevoSalario) {
			if (nuevoSalario >0 && nuevoSalario <100) {
				salario = nuevoSalario;
			}//cierre if
		}//cierre setter
		
		
} //Cierre asistente dental