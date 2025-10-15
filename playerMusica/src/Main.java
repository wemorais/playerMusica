import br.com.meuPlayer.audio.Musica;
import br.com.meuPlayer.audio.Podcast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selecaoMusica = 0;
        String curtidaMusica = """
                ° GOSTOU DA MUSICA? °
                1 | Sim :)
                2 | Não :(
                """;
        String curtidaPodcast = """
                ° GOSTOU DO PODCAST? °
                1 | Sim :)
                2 | Não :(
                \n""";

        Scanner scanner = new Scanner(System.in);

        Musica musica01 = new Musica();
        musica01.setTitulo("Numb");
        musica01.setAlbum("Meteora");
        musica01.setArtista("Linkin Park");
        musica01.setGenero("Rock");


        Musica musica02 = new Musica();
        musica02.setTitulo("Californication");
        musica02.setAlbum("Californication");
        musica02.setArtista("Red Hot Chilli Peppers");
        musica02.setGenero("Rock");


        Musica musica03 = new Musica();
        musica03.setTitulo("Duality");
        musica03.setAlbum("The Subliminal Verses");
        musica03.setArtista("Slipknot");
        musica03.setGenero("Rock");


        Musica musica04 = new Musica();
        musica04.setTitulo("Man In The Box");
        musica04.setAlbum("Facelift");
        musica04.setArtista("Alice In Chains");
        musica04.setGenero("Rock");


        Musica musica05 = new Musica();
        musica05.setTitulo("My Away");
        musica05.setAlbum("Chocolate Starfish And The Hot Dog Flavored Water");
        musica05.setArtista("Limp Bizkit");
        musica05.setGenero("Rock");

        Podcast podcast01 = new Podcast();
        podcast01.setTitulo("Hipster .tech");
        podcast01.setHost("Alura");
        podcast01.setDescricao("Discussões acaloradas sobre desenvolvimento de software,\n startups, programação, IA, UX, gadgets e as últimas tendências em tecnologia.\n");

        Podcast podcast02 = new Podcast();
        podcast02.setTitulo("Eslen Podcast");
        podcast02.setHost("Eslen Delanogare");
        podcast02.setDescricao("O Eslen Delanogare Podcast tem como objetivo abrir um espaço para discussões relevantes em temas diversos.\n Principalmente, objetiva dar voz aos acadêmicos que possam contribuir de alguma forma para o conhecimento humano.\n");

        Podcast podcast03 = new Podcast();
        podcast03.setTitulo("Flow Podcast");
        podcast03.setHost("Igor 3K");
        podcast03.setDescricao("O Flow Podcast é um dos maiores canais de podcast do Brasil, conhecido por seu formato de entrevistas informais\n e sem pauta pré-definida, o que gera conversas descontraídas sobre diversos assuntos.\n");


        while (selecaoMusica != 7) {
            System.out.println("""
                     ====== BEM VINDO AO MEU PLAYER ======
                    \s
                         ° Escolha Sua Musica: °
                    \s
                         1 | Numb | Linkink Park
                         2 | Californication | Red Hot Chilli Peppers
                         3 | Duality | Slipknot
                         4 | Man In The Box | Alice Chains
                         5 | My Away | Limp Bizkit
                        \s
                         6 | Podcast`s
                         7 | Sair do player\s""");

            System.out.println("\nSua seleção: ");
            selecaoMusica = scanner.nextInt();

            switch (selecaoMusica) {
                case 1:
                    musica01.exibirMusica();
                    musica01.reproduzir();
                    System.out.println(curtidaMusica);
                    if (scanner.nextInt() == 1) {
                        musica01.curtir();
                    }
                    break;
                case 2:
                    musica02.exibirMusica();
                    musica02.reproduzir();
                    System.out.println(curtidaMusica);
                    if (scanner.nextInt() == 1) {
                        musica02.curtir();
                    }
                    break;
                case 3:
                    musica03.exibirMusica();
                    musica03.reproduzir();
                    System.out.println(curtidaMusica);
                    if (scanner.nextInt() == 1) {
                        musica03.curtir();
                    }
                    break;
                case 4:
                    musica04.exibirMusica();
                    musica04.reproduzir();
                    System.out.println(curtidaMusica);
                    if (scanner.nextInt() == 1) {
                        musica04.curtir();
                    }
                    break;
                case 5:
                    musica05.exibirMusica();
                    musica05.reproduzir();
                    System.out.println(curtidaMusica);
                    if (scanner.nextInt() == 1) {
                        musica05.curtir();
                    }
                    break;
                case 6: {
                    System.out.println("""
                            \n===== Categoria Podcast =====
                            
                            1 | Hipster .tech - Tecnologia
                            2 | Eslen Podcast - Psicologia
                            3 | Flow Podcast - Curiosidades
                            
                            0 | Voltar ao menu principal
                            \n===============================
                            """);
                    System.out.println("Selecione o podcast desejado");
                    int selecaoPodcast = scanner.nextInt();

                    switch (selecaoPodcast){
                        case 1 -> {
                            podcast01.exibirPodcast();
                            podcast01.reproduzir();
                            System.out.println(curtidaPodcast);
                            if (scanner.nextInt() == 1) podcast01.curtir();
                        }
                        case 2 -> {
                            podcast02.exibirPodcast();
                            podcast02.reproduzir();
                            System.out.println(curtidaPodcast);
                            if (scanner.nextInt() == 1) podcast02.curtir();
                        }
                        case 3 ->{
                            podcast03.exibirPodcast();
                            podcast03.reproduzir();
                            System.out.println(curtidaPodcast);
                            if (scanner.nextInt() == 1) podcast03.curtir();
                        }
                        case 0 -> System.out.println("Retornando ao menu principal: ");
                        default -> System.out.println("Opção invalida... Tente novamente: ");
                    }
                }
                    break;
                case 7:
                    System.out.println("=== Saindo do player, até logo :) ===");
                    break;
                default:
                    System.out.println("Opção inválida... Tente novamente \n");
            }
        }
    }
}
