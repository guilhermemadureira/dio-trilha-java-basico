package dio.guilherme.model;

public class calcEmprestimo {
    
    public static double calcValFinal(double valor,int parcelas){
        if(parcelas < 12){
            return (valor * 1.10) / parcelas;
        }
        else if(parcelas <= 18){
            return (valor * 1.20) / parcelas;
        }
        else if(parcelas <= 24){
            return (valor * 1.30) / parcelas;
        }
        else{
            return (valor * 1.40) / parcelas;
        }
    }
}
