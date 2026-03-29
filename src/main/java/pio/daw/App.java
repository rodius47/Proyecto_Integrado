package pio.daw;

public class App {

    public static void main(String[] args) {

        JuegoFisico j1 = new JuegoFisico("The Last of Us", "Naughty Dog", "PS4", "Accion", 2013, 19.99, "Nuevo", true);
        JuegoFisico j2 = new JuegoFisico("God of War", "Santa Monica Studio", "PS4", "Accion", 2018, 29.99, "Bueno", true);
        JuegoDigital j3 = new JuegoDigital("Hollow Knight", "Team Cherry", "PC", "Plataforma", 2017, 14.99, 9.0);
        JuegoDigital j4 = new JuegoDigital("Celeste", "Maddy Makes Games", "PC", "Plataforma", 2018, 19.99, 1.2);
        JuegoDigital j5 = new JuegoDigital("Hades", "Supergiant Games", "PC", "Roguelike", 2020, 24.99, 15.0);
        Multijugador j6 = new Multijugador("World of Warcraft", "Blizzard", "MMORPG", "PC", 17.99, 2005, 5, "5 vs 5");
        Individual j7 = new Individual("Red Dead Redemption II", "Rockstar Games", "Shooter", "PS4", 39.99, 2018, "Abierto", "Ambiental", 72);

        GameVault vault = new GameVault();
        vault.agregarJuego(j1);
        vault.agregarJuego(j2);
        vault.agregarJuego(j3);
        vault.agregarJuego(j4);
        vault.agregarJuego(j5);
        vault.agregarJuego(j6);
        vault.agregarJuego(j7);

        vault.mostrarCatalogo();
        vault.mostrarPorGenero();

        vault.exportarTodoCSV();

        vault.exportarTodoJSON();

        System.out.println("\n===== PRUEBA IMPORTAR CSV =====");
        GameVault vault2 = new GameVault();
        vault2.importarDesdeCSV("catalogo.csv");
        vault2.mostrarCatalogo();

        System.out.println("\n===== MÉTODO GENÉRICO =====");
        j1.mostrarInfo("Probando método genérico con String");
        j3.mostrarInfo(42);

        System.out.println("\n===== DESCUENTO =====");
        System.out.println("Valor antes: " + j1.getValor());
        j1.aplicarDescuento(10);
        System.out.println("Valor después (10% descuento): " + j1.getValor());
    }
}