package pio.daw;



/**
 * Clase principal para probar la jerarquía de GameVault.
 */
public class App{

    public static void main(String[] args) {


// Todo el codigo comiteado esta demomento en el main de Catalogo
//=====================================
        // // Crear objetos de cada subclase
        // JuegoFisico j1 = new JuegoFisico("The Last of Us", "Naughty Dog", "PS4", "Accion", 2013, 19.99f, "Nuevo", true);
        // JuegoFisico j2 = new JuegoFisico("God of War", "Santa Monica Studio","PS4", "Accion", 2018, 29.99f, "Bueno", true);
        // JuegoDigital j3 = new JuegoDigital("Hollow Knight", "Team Cherry", "PC","Plataforma", 2017, 14.99f, 9.0);
        // JuegoDigital j4 = new JuegoDigital("Celeste", "Maddy Makes Games", "PC", "Plataforma", 2018, 19.99f, 1.2);
        // JuegoDigital j5 = new JuegoDigital("Hades", "Supergiant Games", "PC", "Roguelike", 2020, 24.99f, 15.0);
        // Multijugador j6 = new Multijugador("World of Warcraft", "Un notas", "MMORPG", "PC", 17.99f, 2005, 5, "5 vs 5");
        // Individual j7 = new Individual("Red Dead Redemption II", "Rockstar Games", "Shooter", "PS4", 39.99f, 2018, "Abierto", "Ambiental", 72);
        // // Crear GameVault y agregar juegos
        // GameVault vault = new GameVault();
        // vault.agregarJuego(j1);
        // vault.agregarJuego(j2);
        // vault.agregarJuego(j3);
        // vault.agregarJuego(j4);
        // vault.agregarJuego(j5);
        // vault.agregarJuego(j6);
        // vault.agregarJuego(j7);

        // // Mostrar catálogo completo
        // vault.mostrarCatalogo();

        // // Mostrar por género
        // vault.mostrarPorGenero(); // Hay que combertirlo a un metodo mas amplio (PARA ORDENAR A GUSTO DEL USUARIO)

        // // Exportar CSV
        // vault.exportarTodoCSV();

        // // Probar método genérico
        // System.out.println("\n===== MÉTODO GENÉRICO =====");
        // j1.mostrarInfo("Probando método genérico con String");
        // j3.mostrarInfo(42);

        // // Probar descuento
        // System.out.println("\n===== DESCUENTO =====");
        // System.out.println("Valor antes: " + j1.getValor());
        // j1.aplicarDescuento(10f); // Aplicar 10% de descuento
        // System.out.println("Valor después (10% descuento): " + j1.getValor());
        
//=====================================


        // Más adelante tendre que permitir optar si usar terminal o pantalla emerjente
        System.out.println("La haketona");
        Catalogo terminal = new Catalogo();
        terminal.consola(args);
    }
}