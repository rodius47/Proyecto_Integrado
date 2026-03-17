package pio.daw;

/**
 * Interface que define el valor de un videojuego.
 */
public interface Valuable {
    /**
     * Retorna el valor estimado del juego.
     * @return valor en euros
     */
    Float getValor();

    /**
     * Indica si el juego es una ganga.
     * @return true si vale menos de 20 euros
     */
    default boolean esGanga() {
        return getValor() < 20.0;
    }

    /**
     * Aplica un descuento al valor del videojuego.
     *
     * @param porcentaje porcentaje de descuento (0-100)
     */
    void aplicarDescuento(Float porcentaje);
}
