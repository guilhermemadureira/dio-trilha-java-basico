package dio.guilherme.model;

import java.util.ArrayList;
import java.util.Iterator;

public class  arrayList{
    public static void main(String[] args) throws Exception {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(0d);
        notas.add(5d);
        notas.add(5d);
        notas.add(5.2d);
        notas.add(6.2d);
        notas.add(8.2d);
        notas.add(5.2d);
/*      notas.add(0, 2d);
 */     /* System.out.println(notas.contains(5d));
        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));
        Double soma = 0.0;
        Double soma1 = 0.0;
        */
/*         Iterator<Double> iterator = notas.iterator();
 */        /* while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        } */
        /*
        for (Double nota : notas) {
            soma1 += nota;
        }
        System.out.println(soma);
        System.out.println(soma1);
        System.out.println(soma / notas.size()); */
        notas.remove(6);
        System.out.println(notas);
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()) {
            double next = iterator.next();
            if(next < 7 ){
                iterator.remove();                
            }
        }
        System.out.println(notas);

        notas.clear();
        System.out.println(notas);

        System.out.println(notas.isEmpty());


    }
}
