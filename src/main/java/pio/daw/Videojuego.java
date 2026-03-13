package pio.daw;

/**
 * Superclase abstracta que representa un videojuego.
 */
public abstract class Videojuego implements Valuable, Exportable {

    private String titulo;
    private String genero;
    private int anio;
    private double precio;

    /**
     * Constructor de Videojuego.
     * @param titulo titulo del juego
     * @param genero genero del juego
     * @param anio anio de lanzamiento
     * @param precio precio del juego
     */
    public Videojuego(String titulo, String genero, int anio, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.precio = precio;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getAnio() { return anio; }
    public double getPrecio() { return precio; }

    @Override
    public double getValor() { return precio; }

    /**
     * Metodo abstracto que describe el tipo de juego.
     * @return descripcion del tipo
     */
    public abstract String describeTipo();

    @Override
    public String toString() {
        return titulo + " (" + anio + ") - " + genero + " - " + precio + "eu";
    }
}
