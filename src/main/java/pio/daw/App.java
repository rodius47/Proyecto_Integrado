package pio.daw;

/**
 * Clase principal para probar la jerarquía de GameVault.
 */
public class App {

    public static void main(String[] args) {

        // Crear objetos de cada subclase
        JuegoFisico j1 = new JuegoFisico("The Last of Us", "Accion", 2013, 19.99, "Nuevo", true);
        JuegoFisico j2 = new JuegoFisico("God of War", "Accion", 2018, 29.99, "Bueno", true);
        JuegoDigital j3 = new JuegoDigital("Hollow Knight", "Aventura", 2017, 14.99, "Steam", 9.0);
        JuegoDigital j4 = new JuegoDigital("Celeste", "Plataformas", 2018, 19.99, "Epic", 1.2);
        JuegoDigital j5 = new JuegoDigital("Hades", "Roguelike", 2020, 24.99, "Steam", 15.0);

        // Crear GameVault y agregar juegos
        GameVault vault = new GameVault();
        vault.agregarJuego(j1);
        vault.agregarJuego(j2);
        vault.agregarJuego(j3);
        vault.agregarJuego(j4);
        vault.agregarJuego(j5);

        // Mostrar catálogo completo
        vault.mostrarCatalogo();

        // Mostrar por género
        vault.mostrarPorGenero();

        // Exportar CSV
        vault.exportarTodoCSV();

        // Probar método genérico
        System.out.println("\n===== MÉTODO GENÉRICO =====");
        j1.mostrarInfo("Probando método genérico con String");
        j3.mostrarInfo(42);

        // Probar descuento
        System.out.println("\n===== DESCUENTO =====");
        System.out.println("Valor antes: " + j1.getValor());
        j1.aplicarDescuento(10);
        System.out.println("Valor después (10% descuento): " + j1.getValor());
    }
}
