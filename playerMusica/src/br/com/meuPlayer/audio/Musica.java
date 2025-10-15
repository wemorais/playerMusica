package br.com.meuPlayer.audio;

public class Musica extends Audio {
    private String album;
    private String genero;
    private String artista;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void exibirMusica() {
        System.out.println("\n ===== Tocando Agora =====\n");
        System.out.println("Título: " + getTitulo());
        System.out.println("Álbum: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Total de reproduções: " + getTotalDeReproducao());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");
    }

}
