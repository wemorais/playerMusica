package br.com.meuPlayer.audio;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int curtidas;



    public void reproduzir(){
        this.totalDeReproducao++;
    }
    public void curtir(){
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }
}



