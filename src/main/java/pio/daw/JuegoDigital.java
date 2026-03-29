package pio.daw;

public class JuegoDigital extends Videojuego {

    private String plataforma;
    private String desarrolladora;
    private double tamanoGB;

    public JuegoDigital(String titulo, String desarrolladora, String plataforma, String genero, int anio, double valor, double tamanoGB) {
        super(titulo, genero, anio, valor);
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.tamanoGB = tamanoGB;
    }

    public double getTamanoGB() {
        return tamanoGB;
    }

    public void setTamanoGB(double tamanoGB) {
        this.tamanoGB = tamanoGB;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public String describir() {
        return "Juego Digital | Plataforma: " + plataforma + " | Tamanio: " + tamanoGB + " GB";
    }

    @Override
    public String exportarCSV() {
        return "JuegoDigital;" + getTitulo() + ";" + desarrolladora + ";"
                + getGenero() + ";" + plataforma + ";" + getAnio() + ";"
                + getValor() + ";" + tamanoGB;
    }

    @Override
    public String exportarJSON() {
        return "{\"tipo\":\"JuegoDigital\",\"titulo\":\"" + getTitulo()
                + "\",\"desarrolladora\":\"" + desarrolladora
                + "\",\"genero\":\"" + getGenero()
                + "\",\"plataforma\":\"" + plataforma
                + "\",\"anio\":" + getAnio()
                + ",\"valor\":" + getValor()
                + ",\"tamanoGB\":" + tamanoGB + "}";
    }

    @Override
    public String toString() {
        return "JuegoDigital{" + super.toString() + ", plataforma='" + plataforma
                + "', tamanoGB=" + tamanoGB + "}";
    }
}
