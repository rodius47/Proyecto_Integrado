package pio.daw;

/**
 * Subclase que representa un videojuego en formato digital.
 */
public class JuegoDigital extends Videojuego {


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
        this.tamanoGB = tamanoGB;
    }

    public double getTamanoGB() {
        return this.tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }

    // @ Override
    // public String getPlataforma() {
    //     return super.getPlataforma();
    // }

    @Override
    public Float getValor() {
        return getPrecio();
    }

    @Override
    public String describir() {
        return "Juego Digital | Plataforma: " + getPlataforma() + " | Tamaño: " + getTamanoGB() + " GB";
    }

    @Override
    public String exportarCSV() {
        return getNombre() + ";" + getGenero() + ";" + getAño() + ";"
                + getValor() + ";" + getPlataforma() + ";" + getTamanoGB();
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getNombre() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAño() + ",\"valor\":" + getValor()
                + ",\"plataforma\":\"" + getPlataforma() + "\",\"tamanoGB\":" + getTamanoGB() + "}";
    }

    @Override
    public String toString() {
        return "JuegoDigital{" + super.toString() + ", plataforma='" + getPlataforma()
                + "', tamanoGB=" + getTamanoGB() + "}";
    }
}