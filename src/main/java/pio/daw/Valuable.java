package pio.daw;

/**
 * Interface que define el valor económico de un videojuego.
 */
public interface Valuable {

    /**
     * Retorna el valor estimado del videojuego.
     *
     * @return valor en euros
     */
    double getValor();

    /**
     * Aplica un descuento al valor del videojuego.
     *
     * @param porcentaje porcentaje de descuento (0-100)
     */
    void aplicarDescuento(double porcentaje);
}
