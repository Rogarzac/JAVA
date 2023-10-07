package Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	public static void main (String[] args) {
		
		/*
		
		//Instancia de Persona
		Persona Felipe = new Persona("Felipe", "Maqueda", (byte)31, "5512345678", "Felipe@mail.com");
		
		System.out.println(Felipe); //imprime el lugar de la memoria 
		Felipe.imprimirInfo(); //imprime la informacion
		Felipe.saludar(); //imprimir saludo
		
		
		//Instancia de Dentista
		Dentista Simi = new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344","500","avanzado", "matutino", 500);
		
		System.out.println("*****");
		Simi.calcularSalario();
		Simi.imprimirInfoDentista();
		
		/// Instancia de Paciente con todos sus datos
		Paciente Chencho = new Paciente ("CHNCH1234", "RH Positivo", true, true, "05/oct/2023", "Doc.Simi Lares", false);
		System.out.println("*****************");
		System.out.println(Chencho);
		
		//Instancia de Paciente con datos obligatorios
		Paciente Masiosare = new Paciente ("MAS12345", false, false);
		System.out.println("*****************");
		System.out.println(Masiosare);
		   
		//Cambiar el false de seguroMedico a true
		Masiosare.setSeguroGastosMedicos(true);
		System.out.println("*****************");
		System.out.println(Masiosare);
		  
		*/
		
		
		//Implementacion de ArraysList de Dentistas 
		List<Dentista> listaDentistasArraysList = new ArrayList <>();
		
		//Primero genero una instancia de dentista
		Dentista DrChapatin = new Dentista("Dr.Chapatin", "Chespirito", (byte)45, "11223344", "chapatin@gmail.com","General","666123455", "Consultorio 200", "avanzado", "matutino", 450);
			//Luego la agrego a la lista 
		listaDentistasArraysList.add(DrChapatin);
		
		//Si agrego la instancia a una variable, puedo imprimir su informacion usando un toString, o un metodo mostrarInfo();
		
		
		
		

		
		//Hago una instancia y le agrego directamente a la lista
		listaDentistasArraysList.add(new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344","500","avanzado", "matutino", 500));
		
		//Si genero la instancia y agrego directa,ente al arrayList, para sacar el dato tendre que utilizar un forech o algun ciclo para imprimir dato pro dato 
		
		//Implementacion de lista de dentista con un HashSet
		Set<Dentista> conjuntoDentista = new HashSet<>();
		
		//Agregando Dentista a mi Conjunto
		conjuntoDentista.add(new Dentista("Dr.Simi", "Lares", (byte)50, "123456789", "simi@lares.com", "Odontologia", "55113344","500","avanzado", "matutino", 500));
		
		//implementacion de un hashmap de Dentistas
		Map<String, Dentista> mapaDentistas = new HashMap<> ();
		
		//Agregar un dentista a mi mapa 
		mapaDentistas.put("Dr. House", new Dentista ("Gregory", "House", (byte)55, "12345678", "house.com", "Cirujano", "55113344", "Consultorio 600", "avanzado", "vespertino", 1400));
		
		//imprimir el objeto doctor house
		Dentista DoctorBuscado = mapaDentistas.get("Dr. House");
		System.out.println(DoctorBuscado);
		
		
		
		
		
	}//Cierre metodo main
}//// cierre class Persona
