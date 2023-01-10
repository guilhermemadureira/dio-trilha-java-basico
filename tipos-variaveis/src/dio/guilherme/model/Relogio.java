package dio.guilherme.model;

import java.util.Date;

public class Relogio {
    
    public static String Mensagem(Date hora){
        if(hora.getHours() == 6){
            return "Bom dia";
        }
        else if(hora.getHours() == 12){
            return "Boa tarde";
        }
        else{
            return "Boa noite";
        }
    }
}
