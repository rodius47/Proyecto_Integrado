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

    // public interface Exportable
    public String exportar(){  // cada clase sabe exportarse a JSON
    return null;
    }   

    // public interface Valuable
    @Override
    public Float getValor(){
        return getPrecio();
    }

    // @Override
    // public boolean esGanga() {
    //     return getValor() < 20;
    // }

    @Override
    public String describir() {
        return "Juego Multijugador | Modo de Juego: " + modoDeJuego + " | Ganga: " + (esGanga(getPrecio()) ? "Sí" : "No");
    }

    @Override
    public String exportarCSV() {
        return getNombre() + "," + getGenero() + "," + getAño() + ","
                + getPrecio() + "," + getNumeroJugadores() + "," + getModoDeJuego();
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getNombre() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAño() + ",\"valor\":" + getPrecio()
                + ",\"numeroJugadores\":\"" + getNumeroJugadores() + "\",\"modoDeJuego\":" + getModoDeJuego() + "}";
    }
}