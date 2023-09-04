package br.com.alura.minhasmusicas.modelo;

public class Podcast extends Audio{
    private String apresentdor;
    private String descricao;

    public String getApresentdor() {
        return apresentdor;
    }

    public void setApresentdor(String apresentdor) {
        this.apresentdor = apresentdor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
