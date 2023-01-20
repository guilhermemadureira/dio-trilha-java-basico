package dio.guilherme.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) throws Exception {
        Map<String, Double> carrosPopularaes = new HashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.4);
            put("lklll", 16.4);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("tucson", 15.6);

        }};
        System.out.println(carrosPopularaes.toString());

        carrosPopularaes.put("gol", 15.2);
        System.out.println(carrosPopularaes.toString());

        System.out.println(carrosPopularaes.containsKey("tucson"));

        System.out.println(carrosPopularaes.get("uno"));

        System.out.println(carrosPopularaes);

        System.out.println(carrosPopularaes);

        System.out.println(carrosPopularaes.keySet());

        System.out.println(carrosPopularaes.values());

        double max = Collections.max(carrosPopularaes.values());
        System.out.println(max);
        double min = Collections.min(carrosPopularaes.values());
        System.out.println(min);



        Set<Map.Entry<String,Double>> entries = carrosPopularaes.entrySet();
        String ModeloMaisEficiente = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(max)){
                ModeloMaisEficiente = entry.getKey();
                System.out.println(ModeloMaisEficiente + " - " + max); 
            }
        }

        String ModeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : carrosPopularaes.entrySet()) {
            if(entry.getValue().equals(min)){
                ModeloMenosEficiente = entry.getKey();
                System.out.println(ModeloMenosEficiente + " - " + min); 
            }
        }

        Iterator<Double> iterator = carrosPopularaes.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println(soma/carrosPopularaes.size());

        Iterator<Double> iterator1 = carrosPopularaes.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopularaes);

        Map<String, Double> carrosPopularaes1 = new LinkedHashMap<String, Double>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.4);
            put("lklll", 16.4);
            put("hb20", 14.5);
            put("kwid", 15.6);
            put("tucson", 15.6);
        }};

        System.out.println(carrosPopularaes1.toString());

        Map<String, Double> carrosPopularaes2 = new TreeMap<String, Double>(carrosPopularaes1);
        System.out.println(carrosPopularaes2.toString());

        carrosPopularaes.clear();;
        System.out.println(carrosPopularaes.isEmpty());


    }
}
