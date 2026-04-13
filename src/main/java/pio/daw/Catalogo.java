package pio.daw;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Catalogo {   //Utilizara el ArrayList y el Hasmap para mostrar los videojuegos 
    public void consola(String[] args){

        // // //     // Crear objetos de cada subclase
        // JuegoFisico j1 = new JuegoFisico("The Last of Us", "Naughty Dog", "PS4", "Accion", 2013, 19.99f, "Nuevo", true);
        // JuegoFisico j2 = new JuegoFisico("God of War", "Santa Monica Studio","PS4", "Accion", 2018, 29.99f, "Bueno", true);
        // JuegoDigital j3 = new JuegoDigital("Hollow Knight", "Team Cherry", "PC","Plataforma", 2017, 14.99f, 9.0);
        // JuegoDigital j4 = new JuegoDigital("Celeste", "Maddy Makes Games", "PS5", "Plataforma", 2018, 19.99f, 1.2);
        // JuegoDigital j5 = new JuegoDigital("Hades", "Supergiant Games", "PC", "Roguelike", 2020, 24.99f, 15.0);
        // Multijugador j6 = new Multijugador("World of Warcraft", "Un notas", "MMORPG", "PC", 17.99f, 2005, 5, "5 vs 5");
        // Individual j7 = new Individual("Red Dead Redemption II", "Rockstar Games", "Shooter", "PS4", 39.99f, 2018, "Abierto", "Ambiental", 72);
        // // Crear GameVault y agregar juegos
         GameVault vault = new GameVault();
        //  vault.agregarJuego(j1);
        //  vault.agregarJuego(j2);
        //  vault.agregarJuego(j3);
        //  vault.agregarJuego(j4);
        //  vault.agregarJuego(j5);
        //  vault.agregarJuego(j6);
        //  vault.agregarJuego(j7);

        // // // // Mostrar catálogo completo
        //  vault.mostrarCatalogo();

        // // // // Mostrar por género
        //  vault.mostrarPorGenero(); // Hay que combertirlo a un metodo mas amplio (PARA ORDENAR A GUSTO DEL USUARIO)

        // // // // Exportar CSV
        //  vault.exportarTodoCSV();

        // // // //Exportar JSON
        //  vault.exportarTodoJSON();

        //  System.out.println("\n===== PRUEBA IMPORTAR CSV =====");
        //  GameVault vault2 = new GameVault();
        //  vault2.importarDesdeCSV("catalogo.csv");
        //  vault2.mostrarCatalogo();

         // Probar método genérico
        // // System.out.println("\n===== MÉTODO GENÉRICO =====");
        // // j1.mostrarInfo("Probando método genérico con String");
        // // j3.mostrarInfo(42);

        // // // Probar descuento
        // // System.out.println("\n===== DESCUENTO =====");
        // // System.out.println("Valor antes: " + j1.getValor());
        // // j1.aplicarDescuento(10f); // Aplicar 10% de descuento
        // // System.out.println("Valor después (10% descuento): " + j1.getValor());
        


        // Todas las opciones del menú estaria bien que al seleccionarlas luego te dieran la posivilidad de volver a mostrar este texto, para ello esto abria que ponerlo fuera del app.
        System.out.printf(  "\n===== Menú del programa =====\n" +
                            "Con este menú podras realizar vusquedas y más\n" + // Explicacion vasica de como funciona el menú
                            "Pulse el boton contiguo a la acción que desea realizar\n" +
                            "1. Mostar catalogo\n" + // Que imprima la lista completa de juegos que hay
                            "2. Mostrar por genero\n" + // Imprime los juegos clasificados por genero
                            // "3. Mostrar clasificados por (elegir opcion)\n" + // ESTO AUN SE TIENE QUE CREAR. imprimira un texto con instrucciones al seleccionarlo para elegir como filtrar el contenido del catalogo
                            "4. Añadir juego\n" + // POR HACER imprimira instrucciones para seleccionar que crear e insertar sus datos
                            "5. Eliminar juego\n" + // POR HACER eleminara el juego que se quiera y pedira confirmación
                            "6. Exportar a CSV\n" + // Esto lla estava implementado pero NO LO HACIA CORRECTAMENTE (correjirlo para qque funcione)
                            "7. Exportar a JSON\n" + // Esto lla estava implementado pero NO LO HACIA CORRECTAMENTE (correjirlo para qque funcione)
                            "8. Mostrar por ID del juego\n" +// Puede que lo elimine para ponerlo en el 3. Cumple con la descripcion (que muestre los juegos por la ip que tenga cada juego asignada)
                            "9. SALIR\n"
                            
                            );

        // Esto tiene un problema, (NO DETECTA Ñ NI TILDES ) necesitara alguna extension tipo UTF-8
        Scanner sc = new Scanner(System.in);
        String p;
        boolean salir = false;
        // Integer contador4Juegos = 0;
        // System.out.println(p.CASE_INSENSITIVE_ORDER);  --> PUEDE QUE ESTO SIRVA
        


        

        // Hay que combertir p en case insensitive y ()
    while (!salir) {
        System.out.print("\n0. Volver a mostrar el menú\n Qué desea hacer: ");
        
        try {
            p = sc.nextLine();
            // System.out.println(p);

            switch (p) {
                case "0":
                    System.out.printf(  "\n===== Menú del programa =====\n" +
                            "Con este menú podras realizar vusquedas y más\n" + // Explicacion vasica de como funciona el menú
                            "Pulse el boton contiguo a la acción que desea realizar\n" +
                            "1. Mostar catalogo\n" + // Que imprima la lista completa de juegos que hay
                            "2. Mostrar por genero\n" + // Imprime los juegos clasificados por genero
                            "3. Mostrar por ID del juego\n" +// Puede que lo elimine para ponerlo en el 3. Cumple con la descripcion (que muestre los juegos por la ip que tenga cada juego asignada)
                            "4. Añadir juego\n" + // POR HACER imprimira instrucciones para seleccionar que crear e insertar sus datos
                            "5. Eliminar juego\n" + // POR HACER eleminara el juego que se quiera y pedira confirmación
                            "6. Exportar a CSV\n" + // Esto lla estava implementado pero NO LO HACIA CORRECTAMENTE (correjirlo para qque funcione)
                            "7. Exportar a JSON\n" + // Esto lla estava implementado pero NO LO HACIA CORRECTAMENTE (correjirlo para qque funcione)
                            "8. Importar CSV\n" +// Importa el catalogo de DATA
                            "9. SALIR\n"
                            
                            );
                    break;
                case "1":
                    vault.mostrarCatalogo();
                    
                    break;
                case "2":
                    vault.mostrarPorGenero();
                    break;
                case "3":
                    
                    break;
                case "4":
                    System.out.println("Seleccione que tipo de juego desea añadir: \n1. Juego físico\n2. Juego digital\n3. Multijugador\n4. Individual");
                    p = sc.nextLine();
                    String nombre, desarrolladora, genero, plataforma, estado, modoMultijugador, mundoIndividual, narrativaIndividual;
                    Integer año, jugadoresMultijugador, horasIndividual;
                    double tamañoGB;
                    Float precio;
                    boolean tieneCaja;

                    switch (p) {
                        case "1":
                            System.out.println("Escriba el nombre del juego: ");
                            p = sc.nextLine();
                            nombre = p;
                            System.out.println("Escriba la desarrolladora del juego: ");
                            p = sc.nextLine();
                            desarrolladora = p;
                            System.out.println("Escriba el genero del juego: ");
                            p = sc.nextLine();
                            genero = p;
                            System.out.println("Escriba la plataforma del juego: ");
                            p = sc.nextLine();
                            plataforma = p;
                            System.out.println("Escriba el estado del juego: ");
                            p = sc.nextLine();
                            estado = p;
                            System.out.println("Escriba el año del juego: ");
                            p = sc.nextLine();
                            año = Integer.parseInt(p);
                            System.out.println("Escriba el precio del juego: ");
                            p = sc.nextLine();
                            precio = Float.parseFloat(p);
                            System.out.println("¿El juego tiene caja? (true/false): ");
                            p = sc.nextLine();
                            tieneCaja = Boolean.parseBoolean(p);


                            JuegoFisico juego0 = new JuegoFisico(nombre, desarrolladora, plataforma, genero, año, precio, estado, tieneCaja);

                            vault.agregarJuego(juego0);

                            System.out.println("Juego añadido: " + juego0.toString());
                    
                            break;
                        case "2":
                            System.out.println("Escriba el nombre del juego: ");
                            p = sc.nextLine();
                            nombre = p;
                            System.out.println("Escriba la desarrolladora del juego: ");
                            p = sc.nextLine();
                            desarrolladora = p;
                            System.out.println("Escriba el genero del juego: ");
                            p = sc.nextLine();
                            genero = p;
                            System.out.println("Escriba la plataforma del juego: ");
                            p = sc.nextLine();
                            plataforma = p;
                            System.out.println("Escriba el año del juego: ");
                            p = sc.nextLine();
                            año = Integer.parseInt(p);
                            System.out.println("Escriba el precio del juego: ");
                            p = sc.nextLine();
                            precio = Float.parseFloat(p);
                            System.out.println("Escriba el tamaño del juego en GB: ");
                            p = sc.nextLine();
                            tamañoGB = Double.parseDouble(p);


                            JuegoDigital juego1 = new JuegoDigital(nombre, desarrolladora, genero, plataforma, año, precio, tamañoGB);

                            vault.agregarJuego(juego1);

                            System.out.println("Juego añadido: " + juego1.toString());

                            break;
                        case "3":
                            System.out.println("Escriba el nombre del juego: ");
                            p = sc.nextLine();
                            nombre = p;
                            System.out.println("Escriba la desarrolladora del juego: ");
                            p = sc.nextLine();
                            desarrolladora = p;
                            System.out.println("Escriba el genero del juego: ");
                            p = sc.nextLine();
                            genero = p;
                            System.out.println("Escriba la plataforma del juego: ");
                            p = sc.nextLine();
                            plataforma = p;
                            System.out.println("Escriba el año del juego: ");
                            p = sc.nextLine();
                            año = Integer.parseInt(p);
                            System.out.println("Escriba el precio del juego: ");
                            p = sc.nextLine();
                            precio = Float.parseFloat(p);
                            System.out.println("Escriba el número de jugadores maximos que permite el juego: ");
                            p = sc.nextLine();
                            jugadoresMultijugador = Integer.parseInt(p);
                            System.out.println("Escriba el modo de juego (ejemplo: 5 vs 5, cooperativo, etc.): ");
                            p = sc.nextLine();
                            modoMultijugador = p;



                            Multijugador juego2 = new Multijugador(nombre, desarrolladora, genero, plataforma, precio, año, jugadoresMultijugador, modoMultijugador);

                            vault.agregarJuego(juego2);

                            System.out.println("Juego añadido: " + juego2.toString());

                            break;
                        case "4":
                            System.out.println("Escriba el nombre del juego: ");
                            p = sc.nextLine();
                            nombre = p;
                            System.out.println("Escriba la desarrolladora del juego: ");
                            p = sc.nextLine();
                            desarrolladora = p;
                            System.out.println("Escriba el genero del juego: ");
                            p = sc.nextLine();
                            genero = p;
                            System.out.println("Escriba la plataforma del juego: ");
                            p = sc.nextLine();
                            plataforma = p;
                            System.out.println("Escriba el año del juego: ");
                            p = sc.nextLine();
                            año = Integer.parseInt(p);
                            System.out.println("Escriba el precio del juego: ");
                            p = sc.nextLine();
                            precio = Float.parseFloat(p);
                            System.out.println("Escriba la narrativa del juego (lineal, ramificada, sandbox, ambiental): ");
                            p = sc.nextLine();
                            narrativaIndividual = p;
                            System.out.println("Escriba el mundo del juego (abierto, cerrado, semiabierto): ");
                            p = sc.nextLine();
                            mundoIndividual = p;
                            System.out.println("Escriba la duración del juego en horas: ");
                            p = sc.nextLine();
                            horasIndividual = Integer.parseInt(p);


                            Individual juego3 = new Individual(nombre, desarrolladora, genero, plataforma, precio, año, mundoIndividual, narrativaIndividual, horasIndividual);

                            vault.agregarJuego(juego3);

                            System.out.println("Juego añadido: " + juego3.toString());

                            break;
                        default:
                    
                            break;
                    }
                    
                    break;
                case "5":
                    System.out.println("\nLista de juegos: ");
                    vault.mostrarCatalogo();
                    
                    System.out.print("\nEscriba el nombre del juego que desea eliminar: ");
                    p = sc.nextLine();
                    vault.eliminarVideojuego(p);
                    System.out.println("\nJuegos eliminados: " + vault.getJuegosEleiminados());
                     
                    
                    break;
                case "6":
                    vault.exportarTodoCSV();
                    break;
                case "7":
                    vault.exportarTodoJSON();
                    break;
                case "8":
                    vault.importarDesdeCSV("catalogo.csv");// He cambiado vault2 por vault 
                    vault.mostrarCatalogo();// He cambiado vault2 por vault
                    
                    break;
                case "9":
                    System.out.println("Hasta la proxima.");
                    System.exit(0);
                    salir = true;
                    break;
                
                default:
                    System.err.println("La accion seleccionada no es una opcion valida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.err.println("La accion seleccionada no es una opcion valida");
            sc.next(); //ESTO LIMPIA EL BÚFER Y EVITA EL BUCLE INFINITO
        }    
    }   

    }

}
