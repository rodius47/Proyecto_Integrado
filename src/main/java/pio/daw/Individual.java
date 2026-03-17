package pio.daw;

public class Individual extends Videojuego{

    private String narrativa; // lineal(Uncharted), ramificada(tipo Telltale), sandbox(Practicamente haz lo que quieras), ambiental(Biosock)
    private String mundo; // abierto, cerrado, semiabierto, etc
    private Float duracion; // En horas

    public Individual(String nombre, String desarrolladora, String genero, String plataforma, Float precio, Integer año, String mundo, String narrativa, Float duracion) {
        super(nombre, desarrolladora, genero, plataforma, precio, año);
        this.mundo = mundo;
        this.narrativa = narrativa;
        this.duracion = duracion;
    }
    
    public void setNarrativa(String narrativa){
        this.narrativa = narrativa;
    }

    public String getNarrativa(){
        return narrativa;
    }

    public void setMundo(String mundo){
        this.mundo = mundo;
    }

    public String getMundo(){
        return mundo;
    }
    public void setDuracion(Float duracion){
        this.duracion = duracion;
    }

    public Float getDuracion(){
        return duracion;
    }

    // public interface Exportable
    public String exportar(){  // cada clase sabe exportarse a JSON
    return null;
    }   

    // public interface Valuable
    public Float getValor(){
        return getPrecio();
    }
    public boolean esGanga() {
        return getValor() < 20.0;
    }



}
