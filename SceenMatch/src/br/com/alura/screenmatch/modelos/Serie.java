package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
private int temporadads;
private boolean ativa;
private int episodeosPorTemporada;
private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadads() {
        return temporadads;
    }

    public void setTemporadads(int temporadads) {
        this.temporadads = temporadads;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodeosPorTemporada() {
        return episodeosPorTemporada;
    }

    public void setEpisodeosPorTemporada(int episodeosPorTemporada) {
        this.episodeosPorTemporada = episodeosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadads * episodeosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString(){
        return "Serie: "+ this.getNome() + "(" +this.getAnoDeLancamento() + ")";
    }
}
