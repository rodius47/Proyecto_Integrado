package pio.daw;

public class Multijugador extends Videojuego{
    // private String nombre;
    // private String desarrolladora;
    // private String genero;
    // private String plataforma;
    // private Float precio;

    /**
     * 
     */
    private Integer numeroJugadores;
    private String modoDeJuego; // cooperativo, competitivo, ambos, historiaCoop, MMORPG, etc

    /**
     * 
     * @param nombre
     * @param desarrolladora
     * @param genero
     * @param plataforma
     * @param precio
     * @param numeroJugadores
     */
    public Multijugador(String nombre, String desarrolladora, String genero, String plataforma, Float precio, Integer numeroJugadores, String modoDeJuego) {
        super(nombre, desarrolladora, genero, plataforma, precio);
        this.numeroJugadores = numeroJugadores;
        this.modoDeJuego = modoDeJuego;

    }

    //Esto en principio no se usaria
    // public String getNombre() {
    //     return nombre;
    // }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }

    // public String getDesarrolladora() {
    //     return desarrolladora;
    // }

    // public void setDesarrolladora(String desarrolladora) {
    //     this.desarrolladora = desarrolladora;
    // }

    // public String getGenero() {
    //     return genero;
    // }

    // public void setGenero(String genero) {
    //     this.genero = genero;
    // }

    // public String getPlataforma() {
    //     return plataforma;
    // }
    
    // public void setPlataforma(String plataforma) {
    //     this.plataforma = plataforma;
    // }
    
    // public String informacion(){
    //     return System.out.printf("%s,  ", );
    // }
}
