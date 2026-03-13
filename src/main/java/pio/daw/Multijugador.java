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
    public Multijugador(String nombre, String desarrolladora, String genero, String plataforma, Float precio, Integer año, Integer numeroJugadores, String modoDeJuego) {
        super(nombre, desarrolladora, genero, plataforma, precio, año);
        this.numeroJugadores = numeroJugadores;
        this.modoDeJuego = modoDeJuego;

    }

    public Integer getNumeroJugadores(){ 
        return numeroJugadores;
    }

    public void setNumeroJugadores(Integer numeroJugadores){
        this.numeroJugadores = numeroJugadores;
    }

    public void setModoDeJuego(String modoDeJuego){
        this.modoDeJuego = modoDeJuego;
    }

    public String getModoDeJuego(){
        return modoDeJuego;
    }

    // public String informacion(){
    //     return System.out.printf("%s,  ", );
    // }
}
