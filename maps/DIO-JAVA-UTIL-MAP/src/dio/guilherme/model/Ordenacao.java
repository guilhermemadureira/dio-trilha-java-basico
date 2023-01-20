package dio.guilherme.model;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenacao {
    public static void main(String[] args) throws Exception {
        Map<String, Livro> meusLivros = new HashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("12 Lições para o Século 21", 432));
        }};

        /* for(Map.Entry<String,Livro> livro :meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } */

        Map<String, Livro> meusLivros1 = new LinkedHashMap<String, Livro>(){{
            put("Hawking, Stephen", new Livro("Uma breve História do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("12 Lições para o Século 21", 432));
        }};
       /*  for(Map.Entry<String,Livro> livro :meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } */

        Map<String, Livro> meusLivros2 = new TreeMap<String, Livro>(meusLivros1);
       /*  for(Map.Entry<String,Livro> livro :meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        } */

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new comparatorNome());
       /*  meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3.toString()); */
        
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new comparatorPagina());
        meusLivros4.addAll(meusLivros.entrySet());
        System.out.println(meusLivros4.toString());
    }
}

class Livro {
    private String nome;
    private Integer paginas;
    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
    }
}

class comparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        // TODO Auto-generated method stub
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
    
}

class comparatorPagina implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        // TODO Auto-generated method stub
        return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
    }
    
}