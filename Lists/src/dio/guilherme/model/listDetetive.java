package dio.guilherme.model;
import java.util.ArrayList;
import java.util.List;

public class listDetetive {

    public static void main(String[] args) {
        List<String> perguntas = new ArrayList<>();
        Integer contador = 0;
        System.out.println("Telefonou para a vítima?");
        perguntas.add("S");
        System.out.println("Esteve no local do crime?");
        perguntas.add("S");
        System.out.println("Mora perto da vítima?");
        perguntas.add("S");
        System.out.println("Devia para a vítima?");
        perguntas.add("N");
        System.out.println("Já trabalhou com a vítima?");
        perguntas.add("N");

        for (String pergunta : perguntas) {
            if(pergunta.equals("S")){
                contador += 1;
            }
        }
        if(contador == 2){
            System.out.println("Suspeita");
        }
        else if(contador == 3 || contador == 4){
            System.out.println("Cúmplice");
        }
        else if(contador == 5){
            System.out.println("Assasina");
        }
        else{
            System.out.println("Inocente");
        }
    }
}