package dio.guilherme.model;

public class calcAreaQuadrilateros {

    public static void calcular(double lado) {
        double total = Math.pow(lado, 2);

        System.out.println("A area do quadrado é: "+total);
    }
    public static void calcular(double base,double altura) {
        double total = (base*altura);
        System.out.println("A area do retangulo é: "+total);

    }
    public static void calcular(double baseMaior, double baseMenor, double altura) {
        double total = ((baseMaior+baseMenor)*altura)/2;
        System.out.println("A area do trapézio é: "+total);
    }
}
