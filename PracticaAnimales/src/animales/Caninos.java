package animales;

public class Caninos extends Animales{

	public Caninos(String nombre, int peso, int altura) {
		super(nombre, peso, altura);
		
	}

	@Override
	void comer() {
		System.out.println(getNombre() + " es un canino por lo tanto es carnivoro");
		
	}

	void sonido() {
		System.out.println("Waowao");
	}


}
