package pio.daw;

/**
 * Subclase que representa un videojuego en formato digital.
 */
public class JuegoDigital extends Videojuego {

    /**
     * Plataforma de descarga
     */
    private String plataforma;

    /**
     * Tamaño en GB
     */
    private double tamanoGB;

    /**
     * Constructor de JuegoDigital.
     *
     * @param titulo título del juego
     * @param genero género del juego
     * @param anio año de lanzamiento
     * @param valor precio en euros
     * @param plataforma plataforma de descarga (Steam, Epic, PS Store...)
     * @param tamanoGB tamaño en gigabytes
     */
    public JuegoDigital(String titulo, String genero, int anio, double valor,
            String plataforma, double tamanoGB) {
        super(titulo, genero, anio, valor);
        this.plataforma = plataforma;
        this.tamanoGB = tamanoGB;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }

    @Override
    public String describir() {
        return "Juego Digital | Plataforma: " + plataforma + " | Tamaño: " + tamanoGB + " GB";
    }

    @Override
    public String exportarCSV() {
        return getTitulo() + "," + getGenero() + "," + getAnio() + ","
                + getValor() + "," + plataforma + "," + tamanoGB;
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getTitulo() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAnio() + ",\"valor\":" + getValor()
                + ",\"plataforma\":\"" + plataforma + "\",\"tamanoGB\":" + tamanoGB + "}";
    }

    @Override
    public String toString() {
        return "JuegoDigital{" + super.toString() + ", plataforma='" + plataforma
                + "', tamanoGB=" + tamanoGB + "}";
    }
}
