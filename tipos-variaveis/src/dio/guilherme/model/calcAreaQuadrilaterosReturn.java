package dio.guilherme.model;

public class calcAreaQuadrilaterosReturn {
    public static double calcular(double lado) {
        double total = Math.pow(lado, 2);
        return total;
    }
    public static double calcular(double base,double altura) {
        double total = (base*altura);
        return total;

    }
    public static double calcular(double baseMaior, double baseMenor, double altura) {
        double total = ((baseMaior+baseMenor)*altura)/2;
        return total;
    }
}
