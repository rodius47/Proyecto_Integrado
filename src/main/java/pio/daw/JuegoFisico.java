package pio.daw;

public class JuegoFisico extends Videojuego {

    private String estadoDisco;
    private boolean tieneCaja;
    private String plataforma;
    private String desarrolladora;

    public JuegoFisico(String titulo, String desarrolladora, String plataforma, String genero, int anio, double valor, String estadoDisco, boolean tieneCaja) {
        super(titulo, genero, anio, valor);
        this.desarrolladora = desarrolladora;
        this.plataforma = plataforma;
        this.estadoDisco = estadoDisco;
        this.tieneCaja = tieneCaja;
    }

    public String getEstadoDisco() {
        return estadoDisco;
    }

    public void setEstadoDisco(String estadoDisco) {
        this.estadoDisco = estadoDisco;
    }

    public boolean isTieneCaja() {
        return tieneCaja;
    }

    public void setTieneCaja(boolean tieneCaja) {
        this.tieneCaja = tieneCaja;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public String getDesarrolladora() {
        return desarrolladora;
    }

    @Override
    public String describir() {
        return "Juego Fisico | Plataforma: " + plataforma + " | Disco: " + estadoDisco + " | Caja: " + (tieneCaja ? "Si" : "No");
    }

    @Override
    public String exportarCSV() {
        return "JuegoFisico;" + getTitulo() + ";" + desarrolladora + ";"
                + getGenero() + ";" + plataforma + ";" + getAnio() + ";"
                + getValor() + ";" + estadoDisco + ";" + tieneCaja;
    }

    @Override
    public String exportarJSON() {
        return "{\"tipo\":\"JuegoFisico\",\"titulo\":\"" + getTitulo()
                + "\",\"desarrolladora\":\"" + desarrolladora
                + "\",\"genero\":\"" + getGenero()
                + "\",\"plataforma\":\"" + plataforma
                + "\",\"anio\":" + getAnio()
                + ",\"valor\":" + getValor()
                + ",\"estadoDisco\":\"" + estadoDisco
                + "\",\"tieneCaja\":" + tieneCaja + "}";
    }

    @Override
    public String toString() {
        return "JuegoFisico{" + super.toString() + ", plataforma='" + plataforma
                + "', estadoDisco='" + estadoDisco + "', tieneCaja=" + tieneCaja + "}";
    }
}
