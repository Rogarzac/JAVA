package pokemons;

public class TestPokemon {
	public static void main (String[] args) {
		TipoFuego charmander = new TipoFuego("charmander", 5, "Fuego", "Agua");
		TipoFuego charizar = new TipoFuego("charizard", 5, "Fuego", "Agua",true);
		System.out.println(charmander);
		charmander.mostrarInfo();
		charmander.atacar();
		
		charmander.subirNivel();
		charmander.subirNivel();
		System.out.println("////////////////////////////////////////////////////////");
		charizar.mostrarInfo();
		charizar.atacar();
		
		charizar.subirNivel();
		charizar.subirNivel();
		System.out.println("*************************");
		TipoAgua squirtel = new TipoAgua("squirtel", 5, "Agua", "Fuego");
				squirtel.mostrarInfo();
				squirtel.nadar();
				squirtel.setNombrePokemon("war");
				squirtel.mostrarInfo();
	}//cierre metodo main
	
}
