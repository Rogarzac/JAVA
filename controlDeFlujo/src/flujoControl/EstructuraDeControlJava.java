package flujoControl;

public class EstructuraDeControlJava {
	public static void main (String[] args) {// Todo dentro del metodo main 
		
		
		//Recordar que para que algo se ejecute, siempre debe de ir dentro del metodo principal
		
		
		//Primero definir una variable del tipo String donde almaceno un dato
		String citaProgramada = null; // Dejamos en null y despues lo cambiamos a una fecha "28-09-23"
		//La variable declarada, se inicia en null a proposito para tener un espacio de memoria ya asignado y solo reemplazarlo con un nuevo dato.
		

		if(citaProgramada != null) {
			System.out.println("ya hay una cita programada un disculpita."); //Por que la variable ya esta ocupada o llena
		} else {
		System.out.println("Puede registrar su cita."); //Podemos registrar otra cita o una cita
		}
		
		////////////////////////////////////////////////////////////////////////////////////
		//Seleccionando una opcion y almacenado la variable opcion
		int opcion = 2 ;
		//Creamos un menu
		System.out.println("Menú del diente Feliz consultorio dental");
		System.out.println("1 Desea programar una cita?");
		System.out.println("2. Verificar Cita Programada");
		System.out.println("3. Cancelar cita");
		System.out.println("4. Salir del menú.");
		System.out.println("Seleccione un opcion del Menú (1-4): ");
		
		switch (opcion) {
		case 1:
			System.out.println("Usted ha seleccionado la opcion programar cita.");
			break;
		case 2:
			System.out.println("Usted ha seleccionado la opcion verificar cita.");
			break;
		case 3:
			System.out.println("Usted ha seleccionado la opcion cancelar cita.");
			break;
		case 4:
			System.out.println("Usted ha seleccionado la opcion salir del menú.");
			break;
			default:
				System.out.println("Por favor seleccione una opcion valida (1-4)");
				break;
			
		} //Switch cierre
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
//- Verificar  si la edad del paciente es apta para cierto tratamiento
//- Investigar operador ternario ?:
//- Ejemplo de consultorio

//Ingresando una edad del paciente
int edadPaciente = 20;

System.out.println("Evaluando si el paciente es apto para medicamento...");

//Condicion if
if (edadPaciente >= 18){
System.out.println("Podemos otorgar su medicamento respectivo :)");
} else {
System.out.println("Lo sentimos, no podemos otorgarle un medicamento :(");
} 

// - Operador ternario ejercicio

String estado = (edadPaciente >= 60) ? "es de la tercera edad, requiere atencion especial" : "no es de la tercera edad, no requiere atencion especial";

System.out.println("El paciente " + estado);
		
		
	}//metodo

}///clase
