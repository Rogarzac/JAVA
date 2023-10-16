package Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collections {
	public static void main(String[] args) {
	   //Array
		String[] listaDeCompras = new String[] { "Leche","Pan", "Huevos"};
		System.out.println(listaDeCompras);
		
		
		//Imprimir info de listaDeCompras con un forEach
				//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo vamos a tomar y lo vamos a imprimir
				for(String productoAImprimir : listaDeCompras) {
					System.out.println(productoAImprimir);
				}
		
		///implementacion de un arrayList
		 ///Clase General (interfaz), tipo de dato que usare, nombre de mi estructura de datos, instancia de dicha clase general
		  
		  
		 List<String> listaDeContactos = new ArrayList<>();
		 
		 //Agrego elementos del tipo String a mi arrayList llamado listaDeContactos
		 listaDeContactos.add("Felipe");
		 listaDeContactos.add("Roberto");
		 listaDeContactos.add("Alicia");
		 listaDeContactos.add("Fatima");
		 
		//Obtener un elemento de la lista - asignarlo a una variable
		 String datoFelipe = listaDeContactos.get(0);
		 System.out.println(datoFelipe);
		 
		 //Borrar un elmento de la lista
		 listaDeContactos.remove(1);
		 System.out.println(listaDeContactos);
		
		 
		 
		 
		 
		//Implementacion de un conjunto (SET)
		 //Sintaxis
		 //Interfaces de donde implemento + tipo de dato que usare + nombre que le doy al conjuto + instancia de la clase especifica
		 
		 Set<String> cartasDeJuego = new HashSet <> ();
		
		 //Agregar elementos 
		 cartasDeJuego.add("As de Corazones");
		 cartasDeJuego.add("2 de picas");
		 cartasDeJuego.add("Reina de Treboles");
		 
		 //No puedo saber posiciones, solo saber si lo contiene
		 if(cartasDeJuego.contains("Reina de Tebole")) {
			 System.out.println("La reina de treboles si esta en el conjunto");
		 }else {
			 System.out.println("No encuentro el elemento solicitado");
		 }
		 
		 
		 
		 
		 //Implementacion de un mapa (hashMap)
		 Map<String, String> libretaDirecciones = new HashMap<> ();
		 //Agregar elementos a mi libreta de direcciones, donde mi k=nombre y mi v=direccion
		 libretaDirecciones.put("Felipe", "Tlalnepantla");
		 libretaDirecciones.put("Doctor Simi", "CDMX");
		 libretaDirecciones.put("Konoha", "Naruto");
		 
		 //metodo para sacar informacion de la libreta, creando una nueva variables 
		 String direccionDeFelipe = libretaDirecciones.get("Felipe");
		 String direccionDeNaruto = libretaDirecciones.get("Naruto");
		 
		 
		 //impresion
		 System.out.println(direccionDeFelipe);
		 System.out.println(direccionDeNaruto);
		 
		 
		 
	}//metodo main
	

}//collections

/*
 * Colecciones
 * 
 * 
 * - Arrays (arreglos)
 *  Es una estructura de datos lineal que contiene elementos del mismo tipo. Los elementos estan almacenado de forma contigua es decir, uno al lado del otro y se pueden acceder a ellos a traves de un indice. las principales caracteristicas de un array son:
 *  	-Es una estructura de datos fija. generalmente alamacena datos del mismo tipo
 *  	-La longitud de un array se establece al momento de crearlo, y no cambia.
 *  	-Podemos acceder a elementos por medio de un indice
 *  	-Los arrays pueden contener datos primitivos y objetos
 *  	-no proporciona metodo adicionales para agregar o eliminar elementos
 *  
 *  
 *  Un ejemplo de array es una lista de compras del supermercado
 *  
 *  
 *  - ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.
 *  
 *  
 *  
 *  
 *  set (conjunto)
 *  
 *  Estructura de datos que alamcena datos unicos sin orden especifico.
 *  principales caracteristicas de un set son: 
 *  	-No hay elmentos duplicados. ya que los conjutnos no los pueden contener, si se intenta agregar un elmento ya existente, la operacion se ignora
 *  	-no hay un orden especifico, los elementos se almacenan sin orden especifico
 *  	-La bsuqueda es mas sencilla, ya que al no tener elementos ducplicados se usa una funcion hash para encontrar elmento deseado.
 *  
 *  
 *  Map (mapas) 
 *  un mapa es una estructura de datos que almacena pares de clave-valor.
 *  	-Almacenamiento con pares K-V (Key-Value)
 *  	-Sin orden especifico (similar a un set)
 *  	-Busqueda rapida, la busqueda se hace por medio de un valor (key), y usa una funcion interna hash para buscar elementos.
 *  
 *  
 *  Agenda telefonica (agregar, modificar, eliminar)
 *  
 *  */
