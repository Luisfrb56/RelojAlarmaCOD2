package relojalarmacod2;

/**
 * Luis Fernando
 * Prueba 2 de reloj alarma sin interfaz
 */
import java.awt.Toolkit;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;



public class RelojAlarmaCOD2 {
 Timer timer,timer2;
    String hora;
    /**
     * Clase main dónde se instancian el reloj y la alarma.
     * @param args 
     */
    public static void main(String[] args){
        Interfaz ventana=new Interfaz();
        Reloj reloj=new Reloj();
        new RelojAlarmaCOD2();
    }
    /**
     * Constructor de la clase principal para lanzar el TimerTask.
     */
    public RelojAlarmaCOD2(){
        timer=new Timer();
        timer2=new Timer();
        timer.schedule(new TicTac(), 0, 1000);
        timer2.schedule(new TicTac2(),0, 1000);
    }
    /**
     * Clase que se ejecuta en segundo plano para gestionar el incremento del reloj y refescar la hora del display.
     */
    public class TicTac extends TimerTask {
        @Override
        public void run() {    
            Reloj.incrementoHora();
            if(Interfaz.alarma_reloj==true)
                Interfaz.mostrarHora();
            else
                Interfaz.mostrarAlarma();
        }
    }
    /**
     * Clase que se ejecuta en segundo plano para comprobar alarma.
     */
    public class TicTac2 extends TimerTask {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        @Override
        public void run() {    
            if(Reloj.horacompleta.equals(Alarma.getHoracompleta())&&Alarma.activa==true){
                System.out.println("Alarma");
                toolkit.beep();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(RelojAlarmaCOD2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}