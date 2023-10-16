package pokemons;

public abstract  class Pokemons {
	///atributos
	private String nombrePokemon;
	private int nivel;
	private boolean capturado;

  	///contructor 
  Pokemons (String nombrePokemon, int nivel){
	  this.nombrePokemon = nombrePokemon;
	  this.nivel = nivel;
	  
	  
  }
  Pokemons (String nombrePokemon, int nivel, boolean capturado){
	  this.nombrePokemon = nombrePokemon;
	  this.nivel = nivel;
	  this.capturado = capturado;
	  
	  
  }
	
  ///Metodos
 public abstract void mostrarInfo();
   public void atacar (){
	  System.out.println(nombrePokemon + " Atacaaaaa!");
  }
   public void subirNivel() {
       nivel++;
       System.out.println(nombrePokemon + " sube de nivel a " + nivel);
   }
  public String getNombrePokemon() {
	  return nombrePokemon;
  }
  
  public void setNombrePokemon(String nombrePokemon) {
	  this.nombrePokemon = nombrePokemon;
  }
  
  public int  getNivel() {
	  return nivel;
	
  }
  public void SetNivel( int nivel) {
	  this.nivel = nivel;
  }
  
  public boolean getCapturado() {
	  return capturado;
  }
  public void setCapturado(boolean capturado) {
	  this.capturado = capturado;
  }
  
  
  
}
