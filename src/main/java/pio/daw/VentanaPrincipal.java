package pio.daw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
        JButton boton = new JButton("MOSTRAR CATALOGO");
                            
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Tamaño de la ventana al aparecer
        frame.add(boton);
        frame.setVisible(true); // Si no esta en true la ventana no aparece

        // Lista
        listModel = new DefaultListModel<>();
        lista = new JList<>(listModel);
        add(new JScrollPane(lista), BorderLayout.CENTER);

        // Panel inferior
        JPanel panel = new JPanel(new GridLayout(4, 2));

        JTextField txtNombre = new JTextField();
        JTextField txtGenero = new JTextField();
        JTextField txtAnio = new JTextField();

        panel.add(new JLabel("Nombre:"));
        panel.add(txtNombre);
        panel.add(new JLabel("Género:"));
        panel.add(txtGenero);
        panel.add(new JLabel("Año:"));
        panel.add(txtAnio);

        JButton btnAgregar = new JButton("Agregar");
        JButton btnEliminar = new JButton("Eliminar");

        panel.add(btnAgregar);
        panel.add(btnEliminar);

        add(panel, BorderLayout.SOUTH);

        // Acción agregar
        btnAgregar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText();
                String genero = txtGenero.getText();
                int anio = Integer.parseInt(txtAnio.getText());

                Catalogo juego = new Catalogo();
                catalogo.agregarJuego(null);
                actualizarLista();

                txtNombre.setText("");
                txtGenero.setText("");
                txtAnio.setText("");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Datos inválidos");
            }
        });
        // Acción eliminar
        btnEliminar.addActionListener(e -> {
            int index = lista.getSelectedIndex();
            if (index != -1) {
                catalogo.eliminarVideojuego(getName());
                actualizarLista();
            }
        });

        setVisible(true);
    }
    

    private void actualizarLista() {
        listModel.clear();
        for (Videojuego j : catalogo.getCatalogo()) {
            listModel.addElement(j.toString());
        }
    }
}
