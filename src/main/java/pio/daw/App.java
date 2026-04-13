package pio.daw;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Clase principal para probar la jerarquía de GameVault.
 */
public class App{

    public static void main(String[] args) {
        Scanner elec = new Scanner(System.in);
        String eleccion;


        try{
            System.out.println("Como desea abrir el catalogo:\n" +
                               "1. Con la terminal\n" +
                               "2. En ventana emerjente\n"
        );
            eleccion = elec.nextLine();
            switch (eleccion) {
                case "1":
                    Catalogo terminal = new Catalogo();
                    terminal.consola(args);
                    break;
                case "2":
                    GameVault catalogo = new GameVault();
                    new VentanaPrincipal(catalogo);
                    break;
            
                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("La accion seleccionada no es una opcion valida");
            elec.next(); //ESTO LIMPIA EL BÚFER Y EVITA EL BUCLE INFINITO
        } 
        

        Catalogo terminal = new Catalogo();
        terminal.consola(args);
    }
}