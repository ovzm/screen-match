package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme creed = new Filme("Creed", 2020);
        creed.avalia(10);
        Filme up = new Filme("Up", 2010);
        up.avalia(8);
        Serie lost = new Serie("Lost", 2019);
        lost.avalia(7);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(creed);
        lista.add(up);
        lista.add(lost);

        for (Titulo item: lista) { // :
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
