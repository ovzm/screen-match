import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {
       Titulo filme = new Titulo();
       filme.setNome("Capitão America");
       filme.setDuracaoEmMinutos(180);
       filme.setAnoDeLancamento(2020);

       filme.exibeFichaTecnica();
       filme.avalia(8);
       filme.avalia(5);
       filme.avalia(4);

        System.out.println("Total de avaliações: " + filme.getTotalAvaliacao());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setDuracaoEmMinutos(190);
        lost.setAnoDeLancamento(2019);
        lost.setTemporadas(3);
        lost.setEspisodiosPorTemporadas(5);
        lost.setMinutosPorEpisodios(50);
    }
}