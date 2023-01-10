import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(5d);
        notas.add(5d);
        notas.add(5.2d);
        notas.add(6.2d);
        notas.add(8.2d);
        notas.add(5.2d);
        notas.add(0, 2d);
        System.out.println(notas.contains(5d));
        for (Double nota : notas) {
            System.out.println(nota);
        }
    }
}
