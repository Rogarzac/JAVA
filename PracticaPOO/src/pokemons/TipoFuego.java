package pokemons;

public class TipoFuego extends Pokemons {
	//metodos
	String tipo;
	String debilidad;

	TipoFuego(  String nombrePokemon, int nivel, String tipo, String debilidad) {
		super(nombrePokemon, nivel);
		this.tipo = tipo;
		this.debilidad = debilidad;
	}
	
	
	
	
	

	TipoFuego(String nombrePokemon, int nivel,String tipo, String debilidad, boolean capturado) {
		super(nombrePokemon, nivel, capturado);
		this.tipo = tipo;
		this.debilidad = debilidad;
		
	}






	@Override
	public void mostrarInfo() {
		System.out.println("nombre: " + getNombrePokemon());
		System.out.println("Tiene dueño?" + getCapturado());
	}
	

}
