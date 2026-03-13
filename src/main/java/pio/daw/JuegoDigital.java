package pio.daw;

/**
 * Subclase que representa un juego en formato digital.
 */
public class JuegoDigital extends Videojuego {

    private String plataforma;

    /**
     * Constructor de JuegoDigital.
     * @param titulo titulo del juego
     * @param genero genero del juego
     * @param anio anio de lanzamiento
     * @param precio precio del juego
     * @param plataforma plataforma digital (Steam, PS Store, etc)
     */
    public JuegoDigital(String titulo, String genero, int anio, double precio, String plataforma) {
        super(titulo, genero, anio, precio);
        this.plataforma = plataforma;
    }

    public String getPlataforma() { return plataforma; }

    @Override
    public String describeTipo() {
        return "Juego Digital en plataforma: " + plataforma;
    }

    @Override
    public String exportar() {
        return "DIGITAL | " + getTitulo() + " | " + getGenero() + " | " + getAnio() + " | " + getPrecio() + "eu | " + plataforma;
    }

    @Override
    public String toString() {
        return "[DIGITAL] " + super.toString() + " | Plataforma: " + plataforma;
    }
}
