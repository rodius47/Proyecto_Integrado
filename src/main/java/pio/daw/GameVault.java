package pio.daw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        
        try {
            Files.createDirectories(Paths.get("Data"));
        } catch (IOException e) {
            System.out.println("Error al crear la carpeta Data/: " + e.getMessage());
            return;
        }
        String ruta = "Data/catalogo.csv";
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(ruta), "UTF-8"))) {
            bw.write("tipo;titulo;desarrolladora;genero;plataforma;anio;valor;extra1;extra2;extra3");
            bw.newLine();
            for (Videojuego v : catalogo) {
                String linea = v.exportarCSV();
                bw.write(linea);
                bw.newLine();
                System.out.println(linea);
            }
            System.out.println("\nFichero CSV guardado en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir el CSV: " + e.getMessage());
        }
    }

    public void importarDesdeCSV(String nombreFichero) {
        String ruta = "Data/" + nombreFichero;
        System.out.println("\n===== IMPORTAR CSV: " + ruta + " =====");
        try (BufferedReader br = new BufferedReader(
                new java.io.InputStreamReader(new java.io.FileInputStream(ruta), "UTF-8"))) {
            String linea;
            boolean primeraLinea = true;
            int importados = 0;
            while ((linea = br.readLine()) != null) {
                if (primeraLinea) { primeraLinea = false; continue; }
                if (linea.trim().isEmpty()) continue;
                String[] c = linea.split(";");
                if (c.length < 7) { System.out.println("Linea invalida: " + linea); continue; }
                try {
                    String tipo          = c[0].trim();
                    String titulo        = c[1].trim();
                    String desarrolladora = c[2].trim();
                    String genero        = c[3].trim();
                    String plataforma    = c[4].trim();
                    Integer anio             = Integer.parseInt(c[5].trim());
                    Float valor         = Float.parseFloat(c[6].trim());
                    Videojuego juego = null;
                    switch (tipo.toLowerCase()) {
                        case "juegofisico":
                            String estadoDisco = c.length > 7 ? c[7].trim() : "Desconocido";
                            boolean tieneCaja  = c.length > 8 && Boolean.parseBoolean(c[8].trim());
                            juego = new JuegoFisico(titulo, desarrolladora, plataforma, genero, anio, valor, estadoDisco, tieneCaja);
                            break;
                        case "juegodigital":
                            double tamanoGB = c.length > 7 ? Double.parseDouble(c[7].trim()) : 0.0;
                            juego = new JuegoDigital(titulo, desarrolladora, plataforma, genero, anio, valor, tamanoGB);
                            break;
                        case "individual":
                            String mundo     = c.length > 7 ? c[7].trim() : "Desconocido";
                            String narrativa = c.length > 8 ? c[8].trim() : "Desconocida";
                            int duracion     = c.length > 9 ? Integer.parseInt(c[9].trim()) : 0;
                            juego = new Individual(titulo, desarrolladora, genero, plataforma, valor, anio, mundo, narrativa, duracion);
                            break;
                        case "multijugador":
                            int numJugadores   = c.length > 7 ? Integer.parseInt(c[7].trim()) : 2;
                            String modoDeJuego = c.length > 8 ? c[8].trim() : "Desconocido";
                            juego = new Multijugador(titulo, desarrolladora, genero, plataforma, valor, anio, numJugadores, modoDeJuego);
                            break;
                        default:
                            System.out.println("Tipo desconocido: " + tipo);
                    }
                    if (juego != null) { agregarJuego(juego); importados++; }
                } catch (NumberFormatException e) {
                    System.out.println("Error de formato en linea: " + linea);
                }
            }
            System.out.println("Juegos importados: " + importados);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    //Exportar JSON
    public void exportarTodoJSON() {
        System.out.println("\n===== EXPORTAR JSON =====");
        try {
            Files.createDirectories(Paths.get("Data"));
        } catch (IOException e) {
            System.out.println("Error al crear la carpeta Data/: " + e.getMessage());
            return;
        }
        String ruta = "Data/catalogo.json";
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(ruta), "UTF-8"))) {
            bw.write("[");
            bw.newLine();
            for (int i = 0; i < catalogo.size(); i++) {
                bw.write("  " + catalogo.get(i).exportarJSON());
                if (i < catalogo.size() - 1) bw.write(",");
                bw.newLine();
            }
            bw.write("]");
            bw.newLine();
            System.out.println("Fichero JSON guardado en: " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir el JSON: " + e.getMessage());
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