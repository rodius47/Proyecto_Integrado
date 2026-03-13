package pio.daw;

/**
 * Subclase que representa un juego en formato fisico.
 */
public class JuegoFisico extends Videojuego {

    private String estado;

    /**
     * Constructor de JuegoFisico.
     * @param titulo titulo del juego
     * @param genero genero del juego
     * @param anio anio de lanzamiento
     * @param precio precio del juego
     * @param estado estado del juego (nuevo, usado, etc)
     */
    public JuegoFisico(String titulo, String genero, int anio, double precio, String estado) {
        super(titulo, genero, anio, precio);
        this.estado = estado;
    }

    public String getEstado() { return estado; }

    @Override
    public String describeTipo() {
        return "Juego Fisico en estado: " + estado;
    }

    @Override
    public String exportar() {
        return "FISICO | " + getTitulo() + " | " + getGenero() + " | " + getAnio() + " | " + getPrecio() + "eu | " + estado;
    }

    @Override
    public String toString() {
        return "[FISICO] " + super.toString() + " | Estado: " + estado;
    }
}
