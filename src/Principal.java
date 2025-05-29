import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
       Filme filme = new Filme();
       filme.setNome("Capitão America");
       filme.setDuracaoEmMinutos(180);
       filme.setAnoDeLancamento(2020);


       filme.exibeFichaTecnica();
       filme.avalia(8);
       filme.avalia(5);
       filme.avalia(4);

        System.out.println("Total de avaliações: " + filme.getTotalAvaliacao());
    }
}