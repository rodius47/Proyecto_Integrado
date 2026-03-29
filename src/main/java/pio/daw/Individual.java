package pio.daw;

public class Individual extends Videojuego {

    private String narrativa;
    private String mundo;
    private int duracion;
    private String desarrolladora;
    private String plataforma;

    public Individual(String titulo, String desarrolladora, String genero, String plataforma, double valor, int anio, String mundo, String narrativa, int duracion) {
        super(titulo, genero, anio, valor);
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.mundo = mundo;
        this.narrativa = narrativa;
        this.duracion = duracion;
    }

    public String getNarrativa() { return narrativa; }
    public void setNarrativa(String narrativa) { this.narrativa = narrativa; }
    public String getMundo() { return mundo; }
    public void setMundo(String mundo) { this.mundo = mundo; }
    public int getDuracion() { return duracion; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public String getPlataforma() { return plataforma; }
    public String getDesarrolladora() { return desarrolladora; }

    @Override
    public String describir() {
        return "Juego Individual | Mundo: " + mundo + " | Narrativa: " + narrativa
                + " | Duracion: " + duracion + " h";
    }

    @Override
    public String exportarCSV() {
        return "Individual;" + getTitulo() + ";" + desarrolladora + ";"
                + getGenero() + ";" + plataforma + ";" + getAnio() + ";"
                + getValor() + ";" + mundo + ";" + narrativa + ";" + duracion;
    }

    @Override
    public String exportarJSON() {
        return "{\"tipo\":\"Individual\",\"titulo\":\"" + getTitulo()
                + "\",\"desarrolladora\":\"" + desarrolladora
                + "\",\"genero\":\"" + getGenero()
                + "\",\"plataforma\":\"" + plataforma
                + "\",\"anio\":" + getAnio()
                + ",\"valor\":" + getValor()
                + ",\"mundo\":\"" + mundo
                + "\",\"narrativa\":\"" + narrativa
                + "\",\"duracion\":" + duracion + "}";
    }
}