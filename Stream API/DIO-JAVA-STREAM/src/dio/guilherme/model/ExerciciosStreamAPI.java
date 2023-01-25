package dio.guilherme.model;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) throws Exception {
        List<String> numeroAleatorios=
            Arrays.asList("1","0","4","1","2","3","9","9","6","5");
       /*  numeroAleatorios.stream().forEach(s -> System.out.println(s));
        numeroAleatorios.forEach(s -> System.out.println(s));
        numeroAleatorios.forEach(System.out::println); */

        /* numeroAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        Set<String> collectSet = numeroAleatorios.stream().limit(5).collect(Collectors.toSet()); */

        List<Integer> numerosAleatorios1 = numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        /* numeroAleatorios.stream().map(new Function<String,Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }); */
/*      numeroAleatorios.stream().map(s -> Integer.parseInt(s));*/     
        List<Integer> collectList =numeroAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collectList);

        /* List<Integer> ListparesMaioresQue2 = numeroAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer %2 == 0 && integer > 2) return true;
                return false;
            }
            
        }).collect(Collectors.toList());
        System.out.println(ListparesMaioresQue2);

        List<Integer> ListparesMaioresQue2_1 = numeroAleatorios.stream().map(Integer::parseInt).filter(integer -> integer %2 == 0 && integer > 2).collect(Collectors.toList());
        System.out.println(ListparesMaioresQue2_1); */

       /*  numeroAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        }); */

       /* numeroAleatorios.stream().mapToInt(Integer::parseInt).average()
        .ifPresent(System.out::println); */

        /* numerosAleatorios1.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer %2 !=0) return true;
                return false;
            }
        }); */
        numerosAleatorios1.removeIf(integer->integer %2 !=0);
        System.out.println(numerosAleatorios1);



    }
}