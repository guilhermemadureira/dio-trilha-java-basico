package dio.guilherme.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class Exercicio {
    public static void main(String[] args) throws Exception {
        Set<String> arcoIris = new LinkedHashSet<>();
        arcoIris.add("Vermelho");
        arcoIris.add("Laranja");
        arcoIris.add("Amarela");
        arcoIris.add("Verde");
        arcoIris.add("Azul");
        arcoIris.add("Anil");
        arcoIris.add("Violeta");

        /* System.out.println(arcoIris);
        System.out.println(arcoIris.size());

        Set<String> arcoIris1 = new TreeSet<>(arcoIris);

        System.out.println(arcoIris1); */

      /*   LinkedList<String> list = new LinkedList<>(arcoIris);
        Iterator<String> iterator = list.descendingIterator();
        Set<String> arcoIris2 = new LinkedHashSet<>();

        while(iterator.hasNext()){
            String next = iterator.next();
            arcoIris2.add(next);
        }
        System.out.println(arcoIris2); */

        Iterator<String> iterator1 = arcoIris.iterator();
        Set<String> arcoIris3 = new LinkedHashSet<>();
        while(iterator1.hasNext()){
            String next = iterator1.next();
            char letra = next.charAt(0);
            if(letra == 'V'){
                arcoIris3.add(next);
            }
        }
        System.out.println(arcoIris3);

        Iterator<String> iterator2 = arcoIris.iterator();
        while(iterator2.hasNext()){
            String next = iterator2.next();
            char letra = next.charAt(0);
            if(letra == 'V'){
                iterator2.remove();
            }
        }
        System.out.println(arcoIris);
        arcoIris.clear();
        System.out.println(arcoIris.isEmpty());
        
    }   
}
