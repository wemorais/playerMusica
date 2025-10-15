package br.com.meuPlayer.audio;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void exibirPodcast(){
        System.out.println("\n ===== Tocando o Podcast =====\n ");
        System.out.println("Podcast: " + getTitulo());
        System.out.println("Host: " + getHost());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Total de Reproduções: " + getTotalDeReproducao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");

    }

}

