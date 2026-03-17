package pio.daw;

/**
 * Subclase que representa un videojuego en formato físico.
 */
public class JuegoFisico extends Videojuego {

    /**
     * Estado del disco
     */
    private String estadoDisco;

    /**
     * Indica si tiene caja original
     */
    private boolean tieneCAja;

    // /**
    //  * Constructor de JuegoFisico.
    //  *
    //  * @param nombre título del juego
    //  * @param desarrolladora desarrolladora del juego
    //  * @param plataforma plataforma del juego (PS4, Xbox, PC)
    //  * @param genero género del juego
    //  * @param año año de lanzamiento
    //  * @param precio precio en euros
    //  * @param estadoDisco estado del disco (Nuevo, Bueno, Regular)
    //  * @param tieneCaja si tiene caja original
    //  */
    /**
     * 
     * @param nombre
     * @param desarrolladora
     * @param plataforma
     * @param genero
     * @param año
     * @param precio
     * @param estadoDisco
     * @param tieneCaja
     */
    public JuegoFisico(String nombre,String desarrolladora, String plataforma, String genero, Integer año, Float precio, String estadoDisco, boolean tieneCaja) {
        super(nombre, desarrolladora, plataforma, genero, precio , año);
        this.estadoDisco = estadoDisco;
        this.tieneCAja = tieneCaja;
    }

    public String getEstadoDisco() {
        return estadoDisco;
    }

    public void setEstadoDisco(String estadoDisco) {
        this.estadoDisco = estadoDisco;
    }

    public boolean isTieneCaja() {
        return tieneCAja;
    }

    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCAja = tieneCaja;
    }

    @Override
    public Float getValor() {
        return getPrecio();
    }

    @Override
    public String describir() {
        return "Juego Físico | Disco: " + estadoDisco + " | Caja: " + (tieneCAja ? "Sí" : "No");
    }

    @Override
    public String exportarCSV() {
        return getNombre() + "," + getGenero() + "," + getAño() + ","
                + getPrecio() + "," + estadoDisco + "," + tieneCAja;
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getNombre() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAño() + ",\"valor\":" + getPrecio()
                + ",\"estadoDisco\":\"" + estadoDisco + "\",\"tieneCaja\":" + tieneCAja + "}";
    }

    @Override
    public String toString() {
        return "JuegoFisico{" + super.toString() + ", estadoDisco='" + estadoDisco
                + "', tieneCaja=" + tieneCAja + "}";
    }

}