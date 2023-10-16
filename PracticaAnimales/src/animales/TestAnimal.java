package animales;

public class TestAnimal {
public static void main (String[] args) {
	
	Felinos gato = new Felinos("Gato", 20, 1, true);
	gato.mostrarInfo();
	gato.dormir();
	gato.comer();
	gato.sonido();
	
	Caninos perro = new Caninos("Perro", 25, 2);
	System.out.println("**************");
	perro.mostrarInfo();
	perro.dormir();
	perro.comer();
	perro.sonido();
	
	
} // cieree de metodo main
}//cierre de test
