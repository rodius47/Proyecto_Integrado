package pio.daw;

/**
 * Interface que define el valor de un videojuego.
 */
public interface Valuable {
    /**
     * Retorna el valor estimado del juego.
     * @return valor en euros
     */
    double getValor();

    /**
     * Indica si el juego es una ganga.
     * @return true si vale menos de 20 euros
     */
    default boolean esGanga() {
        return getValor() < 20.0;
    }
}
