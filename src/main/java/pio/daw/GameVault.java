package pio.daw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Clase principal que gestiona la coleccion de videojuegos.
 */
public class GameVault {

    private ArrayList<Videojuego> catalogo;
    private HashMap<String, ArrayList<Videojuego>> porGenero;
    ArrayList<Videojuego> juegosEliminados = new ArrayList<>();
    

    public GameVault() {
        this.catalogo = new ArrayList<>();
        this.porGenero = new HashMap<>();
    }

    public void agregarJuego(Videojuego juego) {
        catalogo.add(juego);
        porGenero.putIfAbsent(juego.getGenero(), new ArrayList<>());
        porGenero.get(juego.getGenero()).add(juego);
    }

    public void mostrarCatalogo() {
        System.out.println("\n===== CATALOGO GAMEVAULT =====");
        for (Videojuego v : catalogo) {
            System.out.println(v);
            System.out.println("  -> " + v.describir());
        }
    }

    public void mostrarPorGenero() {
        System.out.println("\n===== JUEGOS POR GENERO =====");
        for (String genero : porGenero.keySet()) {
            System.out.println("Genero: " + genero);
            for (Videojuego v : porGenero.get(genero)) {
                System.out.println("  - " + v.getNombre());
            }
        }
    }

    public void exportarTodoCSV() {
        System.out.println("\n===== EXPORTAR CSV =====");
        for (Videojuego v : catalogo) {
            System.out.println(v.exportarCSV());
        }
    }

    public ArrayList<Videojuego> getCatalogo() {
        return catalogo;
    }

    public ArrayList<Videojuego> getJuegosEleiminados() {
        return juegosEliminados;
    }

    public HashMap<String, ArrayList<Videojuego>> getPorGenero() {
        return porGenero;
    }

    public ArrayList<Videojuego> eliminarVideojuego(String nombre){
        Iterator<Videojuego> it = catalogo.iterator();
        while (it.hasNext()) {
            Videojuego v = it.next();
            if (v.getNombre().equals(nombre)) {
                it.remove();
                juegosEliminados.add(v);
            }
        }
        getJuegosEleiminados();
        return catalogo;
        
    }
}