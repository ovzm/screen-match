package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Victor");
        buscaPorArtista.add("Nicole");
        buscaPorArtista.add("Juan");

        Collections.sort(buscaPorArtista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano de lancamento");
        System.out.println(lista);
    }
}
