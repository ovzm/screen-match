public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
        System.out.println("Total Avaliacao: " + totalAvaliacao);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    double calculaMediaAvaliacao() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
