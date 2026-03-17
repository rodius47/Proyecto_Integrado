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

    /**
     * Constructor de JuegoFisico.
     *
     * @param titulo título del juego
     * @param genero género del juego
     * @param anio año de lanzamiento
     * @param valor precio en euros
     * @param estadoDisco estado del disco (Nuevo, Bueno, Regular)
     * @param tieneCaja si tiene caja original
     */
    public JuegoFisico(String titulo, String genero, int anio, double valor,
            String estadoDisco, boolean tieneCaja) {
        super(titulo, genero, anio, valor);
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
    public String describir() {
        return "Juego Físico | Disco: " + estadoDisco + " | Caja: " + (tieneCAja ? "Sí" : "No");
    }

    @Override
    public String exportarCSV() {
        return getTitulo() + "," + getGenero() + "," + getAnio() + ","
                + getValor() + "," + estadoDisco + "," + tieneCAja;
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getTitulo() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAnio() + ",\"valor\":" + getValor()
                + ",\"estadoDisco\":\"" + estadoDisco + "\",\"tieneCaja\":" + tieneCAja + "}";
    }

    @Override
    public String toString() {
        return "JuegoFisico{" + super.toString() + ", estadoDisco='" + estadoDisco
                + "', tieneCaja=" + tieneCAja + "}";
    }
}
