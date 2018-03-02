/*
*Clase TimerTask para recorrer la hora y detectar la alarma creada
*Usamos la hora del sistema.
*/
package relojalarmacod2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;


public class Recorrido extends TimerTask {
            Date hora=new Date();
SimpleDateFormat formatoHora= new SimpleDateFormat("HH:mm:ss");

//System.out.println(formatoHora.format(hora));
    @Override
    public void run() {
        
    }
    
}
