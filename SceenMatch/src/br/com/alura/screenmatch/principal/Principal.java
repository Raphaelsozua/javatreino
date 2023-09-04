package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.nio.file.FileAlreadyExistsException;
import java.security.spec.ECPoint;
import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("lost" , 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadads(10);
        lost.setEpisodeosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: "+ lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);

        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inlui(meuFilme);
        calculadora.inlui(outroFilme);
        calculadora.inlui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var  filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList <Filme> listDeFilmes = new ArrayList<>();
        listDeFilmes.add(filmeDoPaulo);
        listDeFilmes.add(meuFilme);
        listDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista "+ listDeFilmes.size());
        System.out.println("primeiro filme "+ listDeFilmes.get(0).getNome());
        System.out.println(listDeFilmes);
        System.out.println("toString do filme " +listDeFilmes.get(0).toString());


    }


}