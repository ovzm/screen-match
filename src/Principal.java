import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
           Filme creed = new Filme();
           creed.setNome("Capitão America");
           creed.setDuracaoEmMinutos(180);
           creed.setAnoDeLancamento(2020);
           creed.setDiretor("Michael B. Jordan");

           Filme Up = new Filme();
           Up.setNome("Up");

           creed.exibeFichaTecnica();
           creed.avalia(8);
           creed.avalia(5);
           creed.avalia(4);

            System.out.println("Total de avaliações: " + creed.getTotalAvaliacao());

            Serie lost = new Serie();
            lost.setNome("Lost");
            lost.setDuracaoEmMinutos(190);
            lost.setAnoDeLancamento(2019);
            lost.setTemporadas(3);
            lost.setEspisodiosPorTemporadas(5);
            lost.setMinutosPorEpisodios(50);

            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.inclui(creed);
            calculadora.inclui(lost);
            System.out.println(calculadora.getTempoTotal());

            ArrayList<Filme> listaDeFilmes = new ArrayList<>();
            listaDeFilmes.add(creed);
            listaDeFilmes.add(Up);
            System.out.println("Lista de filmes: " + listaDeFilmes);
            System.out.println("Primeiro Filme: " + listaDeFilmes.get(1).getNome());
    }
}