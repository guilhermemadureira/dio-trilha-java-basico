import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>() {
            {
                add(new Gato("Jon", 18, "Preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
            }
        };
        System.out.println(meusGatos);

        System.out.println(meusGatos);

        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        Collections.sort(meusGatos);
        System.out.println(meusGatos);

/*         Collections.sort(meusGatos, new comparatorIdade());*/
        meusGatos.sort(new comparatorIdade());
        System.out.println(meusGatos);


        meusGatos.sort(new comparatorCor());
        System.out.println(meusGatos);

        meusGatos.sort(new comparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    

    @Override
    public String toString() {
        return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        // TODO Auto-generated method stub
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
class comparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class comparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
    
}

class comparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        // TODO Auto-generated method stub
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
     
    }

}