package dio.guilherme.model;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Set<LinguagemFavorita> linguagens = new HashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("B",2004,"Vbsual Studio"));
            add(new LinguagemFavorita("C#",2004,"Vasual Studio"));
            add(new LinguagemFavorita("C",1990,"Notepad++"));
            add(new LinguagemFavorita("A",2003,"Visual Studio"));
            add(new LinguagemFavorita("A",2004,"Visual Studio"));
            add(new LinguagemFavorita("C",1990,"Netbeans IDE"));
            add(new LinguagemFavorita("AB",2004,"Visual Studio"));

        }};

/*         System.out.println(linguagens);
 */
        
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<LinguagemFavorita>(){{
            add(new LinguagemFavorita("C#",2004,"Visual Studio"));
            add(new LinguagemFavorita("C",1990,"Notepad++"));
            add(new LinguagemFavorita("Java",1994,"Netbeans IDE"));
        }};

        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);

  /*       for (LinguagemFavorita linguagemFavorita : linguagens2) {
            System.out.println(linguagemFavorita.getNome()+ " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        } */


        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new comparetoIde());
       /*  linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens3) {
            System.out.println(linguagemFavorita.getNome()+ " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        } */

       /*  Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new comparetoAnoDeCriacaoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens4) {
            System.out.println(linguagemFavorita.getNome()+ " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }
         */
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new comparetoNomeAnoDeCriacaoIde());
        linguagens5.addAll(linguagens);
        for (LinguagemFavorita linguagemFavorita : linguagens5) {
            System.out.println(linguagemFavorita.getNome()+ " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

    }
}


class LinguagemFavorita implements Comparable <LinguagemFavorita>{

    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        // TODO Auto-generated method stub
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public String toString() {
        return "LinguagemFavorita [nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeCriacao;
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao != other.anoDeCriacao)
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }
    
}

class comparetoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        // TODO Auto-generated method stub
        return l1.getIde().compareTo(l2.getIde());
    }

}

class comparetoAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        // TODO Auto-generated method stub
        int ano =  Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class comparetoNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;
        int ano =  Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());
    }
    
}
