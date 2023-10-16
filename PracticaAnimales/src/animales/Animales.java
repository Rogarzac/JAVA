package animales;



public abstract class  Animales {
	//atributos
private String nombre;
private int peso;
private int altura;
//contructor
public Animales(String nombre, int peso, int altura) {
	super();
	this.nombre = nombre;
	this.peso = peso;
	this.altura = altura;
}
///Metodos
 abstract void comer ();{
	 
 }
 
 public void mostrarInfo() {
	 System.out.println("nombre: "+ nombre);
	System.out.println("peso: "+ peso);
	System.out.println("altura: "+ altura);
 }
 
 
 
 
 
 
 void dormir () {
	 System.out.println("zzzzzz");
 }

 public String getNombre (){
	 return nombre;
 }
 
 public void setNombre(String nombre) {
	 this.nombre = nombre;
	 
 }

 public int getPeso () {
	 return peso;
 }
public void setPeso (int peso) {
	this.peso = peso;
}

public int getAltura () {
	return altura;
}


public void setAltura ( int altura) {
	this.altura = altura;
}
}///clase animal
