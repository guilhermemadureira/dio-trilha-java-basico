package dio.guilherme.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> dados = new ArrayList<Integer>();
        


        for(int i = 0; i < 100; i++){
            int numeroAleatiorio = (int)(Math.random() * (6 - 1 + 1)) + 1;
            dados.add(numeroAleatiorio);
        }
        
        int frequencia1=Collections.frequency(dados, 1);
        int frequencia2=Collections.frequency(dados, 2);
        int frequencia3=Collections.frequency(dados, 3);
        int frequencia4=Collections.frequency(dados, 4);
        int frequencia5=Collections.frequency(dados, 5);
        int frequencia6=Collections.frequency(dados, 6);
        System.out.println(frequencia1 +  " - " + frequencia2 + " - " +frequencia3 + " - " +frequencia4+  " - " +frequencia5 + " - " +frequencia6);
        
    }
}