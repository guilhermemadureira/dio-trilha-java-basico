package dio.guilherme.model;

import java.util.LinkedList;

public class linkedListExer {
    public static void main(String[] args) {
        LinkedList<Double> notas = new LinkedList<Double>();
        notas.add(7d);
        notas.add(0d);
        notas.add(5d);
        notas.add(5d);
        notas.add(5.2d);
        notas.add(6.2d);
        notas.add(8.2d);
        notas.add(5.2d);

        System.out.println("LinkedList: " + notas.getFirst());
        System.out.println("LinkedList: " + notas);
        System.out.println("LinkedList: " + notas.removeFirst());
        System.out.println("LinkedList: " + notas);

    }
}
