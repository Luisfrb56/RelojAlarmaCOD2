
package relojalarmacod2;

import java.util.Date;

public class Reloj {
    /*
    *Declaramos de manera Static los atributos que vamos a usar para configurar nuestro reloj.
    */
    static Date hora;
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;
    
    
    
 public Reloj(){
        hora = new Date();
        horas=hora.getHours();
        minutos=hora.getMinutes();
        segundos=hora.getSeconds();
    }
/**
 *Metodo que incrementa la hora en 1.
 */
    public static void IncrementarunaHora(){
        if(horas<23)
            Reloj.horas++;
        else
            Reloj.horas=0;
    }

/**
 * Otro metodo que incrementa pero minutos en 1.
 */
    public static void IncrementarunMinuto(){
        if(minutos<59)
            Reloj.minutos++;
        else{
            Reloj.minutos=0;
            if(horas<23)
                Reloj.horas++;
            else
                Reloj.horas=0;
        }
    }
/**
 * Incrementa el tiempo del reloj.
 */
    public static void incrementoHora(){
        if(segundos<59)
            segundos++;
        else if(segundos<=60){
            segundos=0;
            if(minutos<59)
                minutos++;
            else if(minutos<=60){
                minutos=0;
                if(horas<23){
                    horas++;
                }else
                    horas=0;
            }
        
        }
        horacompleta=horas+":"+minutos;   
    } 
}
