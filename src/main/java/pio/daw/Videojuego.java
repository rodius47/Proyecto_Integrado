package pio.daw;

public abstract class Videojuego {// implements Valorable, Exportable
    private String nombre;
    private String desarrolladora;
    private String genero;
    private String plataforma;
    private Float precio;

    // public Videojuego() {
    //     this.nombre = "";
    //     this.desarrolladora = "";
    //     this.genero = "";
    //     this.plataforma = "";
    //     this.precio = 0.0f; // float de dos decimales

    // }

    public Videojuego(String nombre, String desarrolladora, String genero, String plataforma, Float precio) {
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    // public abstract String informacion();

}
