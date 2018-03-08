/*
*@Luis Fernando
*Clase para configuarar la alarma.
*/
package relojalarmacod2;

public class Alarma {
 /*
 *Declaramos como Static todos los atributos. 
 */   
        public static final String marca="A";
    public static boolean activa=false;
    
    static int horas,minutos,segundos;
    static String horacompleta=horas+":"+minutos;
    
    public Alarma(){
        horas=Reloj.horas;
        minutos=Reloj.minutos;
        segundos=Reloj.segundos;
        horacompleta=horas+":"+minutos;
        
    }
    
    
/**
 * Creamos un metodo que incremente el numero de horas
 */
    public static void IncrementarHoras(){
        if(horas<23)
            Alarma.horas++;
        else
            Alarma.horas=0;
    }
/**
 * Otro metodo que incrementa el numero de minutos.
 */
    public static void incrementarMinutos(){
        if(minutos<59)
            Alarma.minutos++;
        else{
            Alarma.minutos=0;
            if(horas<23)
                Alarma.horas++;
            else
                Alarma.horas=0;
        }
    }
/**
 * Creamos un ultimo metodo que devuelva la hora completa
 */
    public static String getHoracompleta(){
        return horas+":"+minutos;
    }   
}

