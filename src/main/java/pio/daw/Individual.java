package pio.daw;

public class Individual extends Videojuego{

    private String narrativa; // lineal(Uncharted), ramificada(tipo Telltale), sandbox(Practicamente haz lo que quieras), ambiental(Biosock)
    private String mundo; // abierto, cerrado, semiabierto, etc
    private Integer duracion; // En horas

    public Individual(String nombre, String desarrolladora, String genero, String plataforma, Float precio, Integer año, String mundo, String narrativa, Integer duracion) {
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
    public void setDuracion(Integer duracion){
        this.duracion = duracion;
    }

    public Integer getDuracion(){
        return duracion;
    }

    // public interface Exportable
    public String exportar(){  // cada clase sabe exportarse a JSON
    return null;
    }   

    @Override
    public Float getValor(){
        return getPrecio();
    }

    // @Override
    // public boolean esGanga() {
    //     return getValor() < 20;
    // }

    @Override
    public String describir() {
        return "Juego Individual | Mundo: " + mundo + " | Narrativa: " + narrativa + " | Duración: " + duracion + " | Ganga: " + (esGanga(getPrecio()) ? "Sí" : "No");
    }

    @Override
    public String exportarCSV() {
        return getNombre() + ";" + getGenero() + ";" + getAño() + ";"
                + getPrecio() + ";" + getNarrativa() + ";" + getMundo() + ";" + getDuracion();
    }

    @Override
    public String exportarJSON() {
        return "{\"titulo\":\"" + getNombre() + "\",\"genero\":\"" + getGenero()
                + "\",\"anio\":" + getAño() + ",\"valor\":" + getPrecio()
                + ",\"narrativa\":\"" + getNarrativa() + "\",\"mundo\":\"" + getMundo() + "\",\"tieneCaja\":" + getDuracion() + "}";
    }
    @Override
    public String toString() {
        return "JuegoIndividual{" + super.toString() + ", narrativa='" + getNarrativa() + "', mundo='" + getMundo() + "', duracion=" + getDuracion() + "}";
    }
}
