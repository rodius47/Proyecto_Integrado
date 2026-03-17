package pio.daw;

/**
 * Interface que permite exportar la información de un videojuego.
 */
public interface Exportable {

    /**
     * Exporta la información del videojuego en formato CSV.
     *
     * @return String con los datos en formato CSV
     */
    String exportarCSV();

    /**
     * Exporta la información del videojuego en formato JSON.
     *
     * @return String con los datos en formato JSON
     */
    String exportarJSON();
}
