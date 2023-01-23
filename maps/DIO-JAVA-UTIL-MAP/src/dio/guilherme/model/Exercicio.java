package dio.guilherme.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercicio {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> Populacao = new HashMap<String, Integer>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(Populacao);
        Populacao.put("RN",3534165);
        System.out.println(Populacao);

        if(!Populacao.containsKey("PB")){
            Populacao.put("PB", 4039277);
        }
        System.out.println(Populacao);

        Map<String, Integer> Populacao1 = new LinkedHashMap<String, Integer>(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};
        System.out.println(Populacao1);

        Map<String, Integer> Populacao2 = new TreeMap<String, Integer>(Populacao);
        System.out.println(Populacao2);

        double max = Collections.max(Populacao.values());
        double min = Collections.min(Populacao.values());
        System.out.println(max);
        System.out.println(min);
        Iterator<Integer> iterator = Populacao.values().iterator();
        Integer soma = 0;

        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println(soma/Populacao.size());

        Iterator<Integer> iterator1 = Populacao.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next() < 4000000)iterator1.remove();
        }
        System.out.println(Populacao);

    }
}
