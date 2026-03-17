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
    
    /**
     * Establece el año de lanzamiento del videojuego.
     * @param año año de lanzamiento
     */
    public void setAño(Integer año) {
        this.año = año;
    }

    /**
     * Aplica un descuento al valor del videojuego.
     *
     * @param porcentaje porcentaje de descuento (0-100)
     */
    @Override
    public void aplicarDescuento(Float porcentaje) {
        this.precio = this.precio - (this.precio * porcentaje / 100);
    }
    
    /**
     * Metodo generico para mostrar informacion de cualquier tipo, se puede usar para mostrar el nombre, la desarrolladora, el genero, etc.
     * @param <T> tipo de dato
     * @param dato dato a mostrar
     * @return el dato recibido
     */
    public <T> T mostrarInfo(T dato){
        System.out.println("Info: " + dato);
        return dato;
    }

    public abstract String describir(); // Identifica el tipo de juego dentro de la colección

   @Override
    public String toString() {
        return "Videojuego{titulo='" + nombre + "', genero='" + genero
                + "', anio=" + año + ", valor=" + precio + "}";
    }
}
