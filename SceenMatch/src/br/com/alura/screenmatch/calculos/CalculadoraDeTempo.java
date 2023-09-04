package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
//    public void inclui(Filme f){
//       this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inlui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " +titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();


    }
}
