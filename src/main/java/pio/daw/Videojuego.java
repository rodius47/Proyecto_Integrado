package pio.daw;

public abstract class Videojuego implements Valuable, Exportable{
    private String nombre;
    private String desarrolladora;
    private String genero;
    private String plataforma;
    private Float precio;
    private Integer año;

    // public Videojuego() {
    //     this.nombre = "";
    //     this.desarrolladora = "";
    //     this.genero = "";
    //     this.plataforma = "";
    //     this.precio = 0.0f; // float de dos decimales

    // }

    public Videojuego(String nombre, String desarrolladora, String genero, String plataforma, Float precio, Integer año) {
        this.nombre = nombre;
        this.desarrolladora = desarrolladora;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
        this.año = año;
    }

    //Esto en principio no se usaria
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    public void setDesarrolladora(String desarrolladora) {
        this.desarrolladora = desarrolladora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Float getPrecio() {
        return precio;
    }
    
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getAño() {
        return año;
    }
    
    public void setPrecio(Integer año) {
        this.año = año;
    }
    

    // public abstract String informacion();

}
