package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public int getTotalAvaliacao(){
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Avaliacao: " + somaDasAvaliacoes);
        System.out.println("Total Avaliacao: " + totalAvaliacao);
        System.out.println("Duracao em minutos: " + duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double calculaMediaAvaliacao() {
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
