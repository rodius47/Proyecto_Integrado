package pio.daw;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

// Tutorial de GUI: https://www.geeksforgeeks.org/java/introduction-to-java-swing/

public class VentanaPrincipal extends JFrame{

    public GameVault catalogo = new GameVault();
    // catalogo.importarDesdeCSV("catalogo.csv");
    public DefaultListModel<String> listModel;
    public JList lista;

    public JTextField buscador;


    public VentanaPrincipal(GameVault catalogo){
        this.catalogo = catalogo;
        setTitle("Catálogo de Videojuegos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        
        JFrame frame = new JFrame("Mi GUI Básica");
        // JButton boton = new JButton("MOSTRAR CATALOGO");
                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Tamaño de la ventana al aparecer
        // frame.add(boton);
        frame.setVisible(true); // Si no esta en true la ventana no aparece

        // Lista
        listModel = new DefaultListModel<>();
        lista = new JList<>(listModel);
        add(new JScrollPane(lista), BorderLayout.CENTER);

        // Panel inferior

        JPanel panel = new JPanel(new GridLayout(19, 2));

        JTextField txtNombre = new JTextField();//S
        JTextField txtGenero = new JTextField();//S
        JTextField txtAño = new JTextField();//S
        JTextField txtPlataforma = new JTextField();//S
        JTextField txtDesarrolladora = new JTextField();//S
        JTextField txtPrecio = new JTextField();//S
        JTextField txtTamañoGB = new JTextField();//S
        JTextField txtEstado = new JTextField();//S
        JTextField txtTieneCaja = new JTextField();//S
        JTextField txtNarrativa = new JTextField();//S
        JTextField txtMundo = new JTextField();//S
        JTextField txtDuracion = new JTextField();//S
        JTextField txtJugadores = new JTextField();//S
        JTextField txtModoMultijugador = new JTextField();//S
        JTextField txtTipo = new JTextField();

        

        panel.add(new JLabel("Tipo (1: JuegoFisico, 2: JuegoDigital, 3: Multijugador, 4: Individual):"));
        panel.add(txtTipo);

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Desarrolladora:"));
        panel.add(txtDesarrolladora);
        panel.add(new JLabel("Género:"));
        panel.add(txtGenero);
        panel.add(new JLabel("Plataforma:"));
        panel.add(txtPlataforma);
        panel.add(new JLabel("Narrativa (lineal, ramificada, sandbox, ambiental):"));
        panel.add(txtNarrativa);
        panel.add(new JLabel("Mundo (abierto, cerrado, semiabierto):"));
        panel.add(txtMundo);
        panel.add(new JLabel("Duración (horas):"));
        panel.add(txtDuracion);
        panel.add(new JLabel("Número de jugadores (para multijugador):"));
        panel.add(txtJugadores);
        panel.add(new JLabel("Modo de juego (para multijugador):"));
        panel.add(txtModoMultijugador);
        panel.add(new JLabel("Estado del disco (para físico):"));
        panel.add(txtEstado);
        panel.add(new JLabel("¿Tiene caja? (true/false, para físico):"));
        panel.add(txtTieneCaja);
        panel.add(new JLabel("Tamaño en GB (para digital):"));
        panel.add(txtTamañoGB);
        panel.add(new JLabel("Año:"));
        panel.add(txtAño);
        panel.add(new JLabel("Precio:"));
        panel.add(txtPrecio);
        
        JButton btnMostrar = new JButton("Mostrar Catalogo");
        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnImportar = new JButton("Importar CSV");
        JButton btnMostrarPorGenero = new JButton("Mostrar por Género");
        JButton btnSalir = new JButton("Salir");
        JButton btnExportarCSV = new JButton("Exportar CSV");
        JButton btnExportarJSON = new JButton("Exportar JSON");


        
        panel.add(btnAgregar);
        panel.add(btnEliminar);
        panel.add(btnImportar);
        panel.add(btnMostrarPorGenero);
        panel.add(btnExportarCSV);
        panel.add(btnExportarJSON);
        panel.add(btnMostrar);
        panel.add(btnSalir);


        add(panel, BorderLayout.SOUTH);

        // Acción agregar
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tip = txtTipo.getText();
                    String nombre = txtNombre.getText();
                    String desarrolladora = txtDesarrolladora.getText();
                    String plataforma = txtPlataforma.getText();
                    String genero = txtGenero.getText();
                    Float precio = Float.parseFloat(txtPrecio.getText());
                    Double tamañoGB = Double.parseDouble(txtTamañoGB.getText());
                    String estado = txtEstado.getText();
                    Boolean tieneCaja = Boolean.parseBoolean(txtTieneCaja.getText());
                    String narrativaIndividual = txtNarrativa.getText();
                    String mundoIndividual = txtMundo.getText();
                    Integer horasIndividual = Integer.parseInt(txtDuracion.getText());
                    Integer jugadoresMultijugador = Integer.parseInt(txtJugadores.getText());
                    String modoMultijugador = txtModoMultijugador.getText();
                    Integer año = Integer.parseInt(txtAño.getText());
                    // JuegoFisico juegorg = new JuegoFisico(nombre, desarrolladora, plataforma, genero, año, precio, estado, tieneCaja);
                    Catalogo juego = new Catalogo();
                    // Videojuego Jueguitos = new Videojuego();
                    if (tip .equals("JuegoFisico") || tip.equals("1")) {
                        JuegoFisico juegorg  = new JuegoFisico(nombre, desarrolladora, plataforma, genero, año, precio, estado, tieneCaja);
                        catalogo.agregarJuego(juegorg);
                    } else if (tip.equals("JuegoDigital") || tip.equals("2")) {
                        JuegoDigital juegor = new JuegoDigital(nombre, desarrolladora, plataforma, genero, año, precio, tamañoGB);
                        catalogo.agregarJuego(juegor);
                    } else if (tip.equals("3")) {
                        Multijugador juegorg1 = new Multijugador(nombre, desarrolladora, genero, plataforma, precio, año, jugadoresMultijugador, modoMultijugador);
                        catalogo.agregarJuego(juegorg1);
                    } else if (tip.equals("Individual") || tip.equals("4")) {
                        Individual juegore2 = new Individual(nombre, desarrolladora, genero, plataforma, precio, año, mundoIndividual, narrativaIndividual, horasIndividual);
                        catalogo.agregarJuego(juegore2);
                    } else {
                        JOptionPane.showMessageDialog(VentanaPrincipal.this, "Tipo inválido");
                        return;
                    }
                    actualizarLista();
                    
                    
                    txtNombre.setText("");
                    txtGenero.setText("");
                    txtAño.setText("");
                    txtPlataforma.setText("");
                    txtDesarrolladora.setText("");
                    txtTamañoGB.setText("");
                    txtEstado.setText("");
                    txtTieneCaja.setText("");
                    txtNarrativa.setText("");
                    txtMundo.setText("");
                    txtDuracion.setText("");
                    txtJugadores.setText("");
                    txtModoMultijugador.setText("");
                    txtTipo.setText("");
                    txtPrecio.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(VentanaPrincipal.this, "Datos inválidos");
                }
            }
        });

        // Acción eliminar
        btnEliminar.addActionListener(e -> {
            // int index = lista.getSelectedIndex();
            // if (index != -1) {
            //     catalogo.eliminarVideojuego(getName());
            //     actualizarLista();
            // }
            String nombre = txtNombre.getText();
            catalogo.eliminarVideojuego(nombre);
                actualizarLista();
        });

        //Importar CSV 
        btnImportar.addActionListener(e -> {
            listModel.clear();
            // catalogo.importarDesdeCSV("catalogo.csv");
            //     actualizarLista();
            String nombreFichero = JOptionPane.showInputDialog(VentanaPrincipal.this, "Ingrese el nombre del fichero CSV (ej: catalogo.csv):");
            if (nombreFichero != null && !nombreFichero.trim().isEmpty()) {
                catalogo.importarDesdeCSV(nombreFichero.trim());
                actualizarLista();
            }

        });
        
        // Mostrar por Genero
        btnMostrarPorGenero.addActionListener(e -> {
            // String genero = txtGenero.getText();
            String genero = JOptionPane.showInputDialog(VentanaPrincipal.this, "Ingrese el género a filtrar:");
            if (genero != null && !genero.trim().isEmpty()) {
                listModel.clear();
                for (Videojuego j : catalogo.getCatalogo()) {
                    if (j.getGenero().equalsIgnoreCase(genero.trim())) {
                        listModel.addElement(j.toString());
                    }
                }
            }
        });

        //Acción mostrar
        btnMostrar.addActionListener(e -> {
            listModel.clear();
            for (Videojuego j : catalogo.getCatalogo()) {
                listModel.addElement(j.toString());
            }
        });

        //Acción exportar CSV

        btnExportarCSV.addActionListener(e -> {
            catalogo.exportarTodoCSV();
        });

        //Acción exportar JSON

        btnExportarJSON.addActionListener(e -> {
            catalogo.exportarTodoJSON();
        });
        
        //Acción salir

        btnSalir.addActionListener(e -> {
            System.exit(0);
        });

        setVisible(true);
    }


    // // 
    


    private void actualizarLista() {
        listModel.clear();
        for (Videojuego j : catalogo.getCatalogo()) {
            listModel.addElement(j.toString());
        }
    }
}
