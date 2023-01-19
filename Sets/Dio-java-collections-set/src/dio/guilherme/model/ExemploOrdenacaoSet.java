package dio.guilherme.model;

import dio.guilherme.model.Serie;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) throws Exception {
        
        Set<Serie> minhasSeries= new HashSet(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that ' 70s show","comédia",25));
        }};
        /* for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        } */

        Set<Serie> minhasSeries1= new LinkedHashSet(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that ' 70s show","comédia",25));
        }};
        /* for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        } */

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        /* for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        } */
        
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
        /* minhasSeries3.addAll(minhasSeries);
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        } */

        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatoGenero());
        /* minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        } */

        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparaTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome()+ " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        // TODO Auto-generated method stub
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}

class ComparatoGenero implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        // TODO Auto-generated method stub
        return s1.getGenero().compareTo(s2.getGenero());
    }

}

class ComparaTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        // TODO Auto-generated method stub
        int tempoEpisodio =  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
        if(tempoEpisodio != 0)return tempoEpisodio;

        return s1.getGenero().compareTo(s2.getGenero());

    }

}