/*
 * Clase que mostrara hora, la guarda para su modificación
 * Recorre en segundo plano y ccomprueba si la alarma concuerda con la hora
 */
package relojalarmacod2;

import java.util.Timer;


public class HoraAlarma {
    Timer timer;
    String sonido="DESPIERTA!!";
    public HoraAlarma() {
        timer=new Timer();
        timer.schedule(new Recorrido(),0,1000);
    }
    
    public void verHora(){
        
    }
    
}
