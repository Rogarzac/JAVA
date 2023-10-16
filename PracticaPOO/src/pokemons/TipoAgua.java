package pokemons;

public class TipoAgua extends Pokemons {
	String tipo;
	String debilidad;

		//Construcotror
	public TipoAgua(String nombrePokemon, int nivel, String tipo, String debilidad) {
		super(nombrePokemon, nivel);
		this.tipo = tipo;
		this.debilidad = debilidad;
	}
		//Metodos
	
	public void nadar() {
		System.out.println(getNombrePokemon() + " es un pokemon de " + tipo + " y por lo tanto se pone a nadar " );
	}

	@Override
	public void mostrarInfo() {
		System.out.println("nombre: " + getNombrePokemon());
		
	}

	
	
	
}
