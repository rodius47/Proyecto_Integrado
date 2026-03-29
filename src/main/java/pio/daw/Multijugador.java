package pio.daw;

public class Multijugador extends Videojuego {

    private int numeroJugadores;
    private String modoDeJuego;
    private String desarrolladora;
    private String plataforma;

    public Multijugador(String titulo, String desarrolladora, String genero, String plataforma, double valor, int anio, int numeroJugadores, String modoDeJuego) {
        super(titulo, genero, anio, valor);
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.numeroJugadores = numeroJugadores;
        this.modoDeJuego = modoDeJuego;
    }

    public int getNumeroJugadores() { return numeroJugadores; }
    public void setNumeroJugadores(int numeroJugadores) { this.numeroJugadores = numeroJugadores; }
    public String getModoDeJuego() { return modoDeJuego; }
    public void setModoDeJuego(String modoDeJuego) { this.modoDeJuego = modoDeJuego; }
    public String getPlataforma() { return plataforma; }
    public String getDesarrolladora() { return desarrolladora; }

    @Override
    public String describir() {
        return "Juego Multijugador | Modo: " + modoDeJuego + " | Jugadores: " + numeroJugadores;
    }

    @Override
    public String exportarCSV() {
        return "Multijugador;" + getTitulo() + ";" + desarrolladora + ";"
                + getGenero() + ";" + plataforma + ";" + getAnio() + ";"
                + getValor() + ";" + numeroJugadores + ";" + modoDeJuego;
    }

    @Override
    public String exportarJSON() {
        return "{\"tipo\":\"Multijugador\",\"titulo\":\"" + getTitulo()
                + "\",\"desarrolladora\":\"" + desarrolladora
                + "\",\"genero\":\"" + getGenero()
                + "\",\"plataforma\":\"" + plataforma
                + "\",\"anio\":" + getAnio()
                + ",\"valor\":" + getValor()
                + ",\"numeroJugadores\":" + numeroJugadores
                + ",\"modoDeJuego\":\"" + modoDeJuego + "\"}";
    }
}