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
     * @param nombre título del juego
     * @param desarrolladora desarrolladora del juego
     * @param plataforma plataforma de descarga (Steam, Epic, PS Store...)
     * @param genero género del juego
     * @param año año de lanzamiento
     * @param precio precio en euros
     * @param tamanoGB tamaño en gigabytes
     */
    public JuegoDigital(String nombre,String desarrolladora, String plataforma, String genero, Integer año, Float precio,double tamanoGB) {
        super(nombre, desarrolladora, genero, plataforma, precio, año);
        this.plataforma = plataforma;
        this.tamanoGB = tamanoGB;
    }

    // @Override
    // public String getPlataforma() {
    //     return plataforma;
    // }

    // @Override
    // public void setPlataforma(String plataforma) {
    //     this.plataforma = plataforma;
    // }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }

    @Override
    public Float getValor() {
        return getPrecio();
    }

    @Override
    public String describir() {
        return "Juego Digital | Plataforma: " + plataforma + " | Tamaño: " + tamanoGB + " GB";
    }

    @Override
    public String exportarCSV() {
        return getNombre() + "," + getGenero() + "," + getAño() + ","
                + getValor() + "," + plataforma + "," + tamanoGB;
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getNombre() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAño() + ",\"valor\":" + getValor()
                + ",\"plataforma\":\"" + plataforma + "\",\"tamanoGB\":" + tamanoGB + "}";
    }

    @Override
    public String toString() {
        return "JuegoDigital{" + super.toString() + ", plataforma='" + plataforma
                + "', tamanoGB=" + tamanoGB + "}";
    }
}