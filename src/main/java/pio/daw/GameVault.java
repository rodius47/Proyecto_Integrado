package pio.daw;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase principal que gestiona la coleccion de videojuegos.
 */
public class GameVault {

    private ArrayList<Videojuego> catalogo;
    private HashMap<String, ArrayList<Videojuego>> porGenero;

    /**
     * Constructor de GameVault.
     */
    public GameVault() {
        this.catalogo = new ArrayList<>();
        this.porGenero = new HashMap<>();
    }

    /**
     * Agrega un juego al catalogo.
     * @param juego juego a agregar
     */
    public void agregarJuego(Videojuego juego) {
        catalogo.add(juego);
        porGenero.putIfAbsent(juego.getGenero(), new ArrayList<>());
        porGenero.get(juego.getGenero()).add(juego);
    }

    /**
     * Muestra todos los juegos del catalogo.
     */
    public void mostrarCatalogo() {
        System.out.println("=== GAMEVAULT - CATALOGO ===");
        for (Videojuego v : catalogo) {
            System.out.println(v);
        }
    }

    /**
     * Muestra los juegos por genero.
     */
    public void mostrarPorGenero() {
        System.out.println("=== JUEGOS POR GENERO ===");
        for (String genero : porGenero.keySet()) {
            System.out.println("[ " + genero + " ]");
            for (Videojuego v : porGenero.get(genero)) {
                System.out.println("  " + v);
            }
        }
    }
}
