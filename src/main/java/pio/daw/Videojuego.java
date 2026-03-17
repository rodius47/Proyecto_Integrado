package pio.daw;

/**
 * Superclase abstracta que representa un videojuego genérico.
 */
public abstract class Videojuego implements Valuable, Exportable {

    /**
     * Título del videojuego
     */
    private String titulo;

    /**
     * Género del videojuego
     */
    private String genero;

    /**
     * Año de lanzamiento
     */
    private int anio;

    /**
     * Valor económico del videojuego
     */
    private double valor;

    /**
     * Constructor de Videojuego.
     *
     * @param titulo título del juego
     * @param genero género del juego
     * @param anio año de lanzamiento
     * @param valor precio en euros
     */
    public Videojuego(String titulo, String genero, int anio, double valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.valor = valor;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Aplica un descuento al valor del videojuego.
     *
     * @param porcentaje porcentaje de descuento (0-100)
     */
    @Override
    public void aplicarDescuento(double porcentaje) {
        this.valor = this.valor - (this.valor * porcentaje / 100);
    }

    /**
     * Método genérico con tipo T que retorna info del juego.
     *
     * @param <T> tipo de dato
     * @param dato dato a mostrar
     * @return el dato recibido
     */
    public <T> T mostrarInfo(T dato) {
        System.out.println("Info: " + dato);
        return dato;
    }

    /**
     * Método abstracto que describe el tipo de videojuego.
     *
     * @return descripción del tipo
     */
    public abstract String describir();

    @Override
    public String toString() {
        return "Videojuego{titulo='" + titulo + "', genero='" + genero
                + "', anio=" + anio + ", valor=" + valor + "}";
    }
}
