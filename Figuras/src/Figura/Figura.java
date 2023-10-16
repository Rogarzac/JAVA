///Vamos a usar clases abstractas para evitar la instanciacion de objetos que no necesito (generalmente son objetos muy abtractos, como persona, figura, transporte, animal, comida, etc



package Figura;


///Utilizando clases abstractas, evitamos las instancias no necesarias
//para que una clase se vuelca abstracta, usamos la palabra reservada abstract antes de class
public abstract class Figura {
	///declaramos un metodo abstracto (no tiene cuerpo)
	//Metodo abstracto que nos dice QUE TENEMOS QUE HACER PERO NO NOS DICE EL COMO
	public abstract double calcularArea();
	

}//clase figura

/*Nota: las clases abstractas pierden la capacidad de instanciar
 * una clase abstracta, necesita si o si metodos abtractos.
 * Cuando usamos clases abstractas, estamos "obligados" a utilizar todos los metodos abstractos
 */

