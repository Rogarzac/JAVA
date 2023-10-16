package animales;

public class Felinos extends Animales {
	boolean cazador;

	public Felinos(String nombre, int peso, int altura, boolean cazador) {
		super(nombre, peso, altura);
		this.cazador = cazador;
	}

	@Override
	void comer() {
		System.out.println(getNombre() + " es un felino por lo tanto es carnivoro");
		
	}
	public void sonido () {
		System.out.println("meeow");
	}
	
}
