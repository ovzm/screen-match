package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int espisodiosPorTemporadas;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    public int getEspisodiosPorTemporadas() {
        return espisodiosPorTemporadas;
    }

    public void setEspisodiosPorTemporadas(int espisodiosPorTemporadas) {
        this.espisodiosPorTemporadas = espisodiosPorTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * minutosPorEpisodios * espisodiosPorTemporadas;
    }
}
