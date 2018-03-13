
package relojalarmacod2;

import java.awt.Font;
import javax.swing.JTextField;
import static relojalarmacod2.Reloj.IncrementarunaHora;

/**
 *Intento de interfaz para reloj-alarma
 */
public class Interfaz extends javax.swing.JFrame{
    static boolean alarma_reloj=true; //False=alarma  True=reloj
    /**
     * Constructor donde se lanza la interfaz y sus fuentes.
     */
    public Interfaz(){
        initComponents();
        setVisible(true);
        setLocation(300, 200);
        Font fuente=new Font("Dialog", Font.BOLD, 60);
        Font fuente_indicador=new Font("Dialog",Font.BOLD,20);
        visualizador.setFont(fuente);
        visualizador.setHorizontalAlignment(JTextField.CENTER);
        indicador.setFont(fuente_indicador);
        indicador.setHorizontalAlignment(JTextField.CENTER);
        reloj_o_alarma.setText("Reloj");
    } @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PosponerButton = new javax.swing.JButton();
        alarma_off = new javax.swing.JButton();
        alarma_on = new javax.swing.JButton();
        mas_horas = new javax.swing.JButton();
        mas_minutos = new javax.swing.JButton();
        ver_alarma = new javax.swing.JButton();
        ver_reloj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        indicador = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        reloj_o_alarma = new javax.swing.JTextField();
        visualizador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        PosponerButton.setText("Posponer Alarma");
        PosponerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosponerButtonActionPerformed(evt);
            }
        });

        alarma_off.setText("Apagar Alarma");
        alarma_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarma_offActionPerformed(evt);
            }
        });

        alarma_on.setText("Programar Alarma");
        alarma_on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarma_onActionPerformed(evt);
            }
        });

        mas_horas.setText("+Horas");
        mas_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas_horasActionPerformed(evt);
            }
        });

        mas_minutos.setText("+Minutos");
        mas_minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas_minutosActionPerformed(evt);
            }
        });

        ver_alarma.setText("A");
        ver_alarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_alarmaActionPerformed(evt);
            }
        });

        ver_reloj.setText("R");
        ver_reloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_relojActionPerformed(evt);
            }
        });

        jLabel2.setText("Ver Alarma");

        jLabel3.setText("Ver Reloj");

        indicador.setBackground(new java.awt.Color(0, 0, 0));
        indicador.setForeground(new java.awt.Color(255, 255, 255));
        indicador.setText("Indicador");
        indicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        reloj_o_alarma.setBackground(new java.awt.Color(0, 0, 0));
        reloj_o_alarma.setForeground(new java.awt.Color(255, 255, 255));
        reloj_o_alarma.setText("jTextField1");

        visualizador.setBackground(new java.awt.Color(0, 0, 0));
        visualizador.setForeground(new java.awt.Color(255, 255, 255));
        visualizador.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PosponerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(alarma_off)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(ver_reloj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ver_alarma))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mas_horas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mas_minutos))
                            .addComponent(alarma_on))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reloj_o_alarma, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PosponerButton)
                            .addComponent(alarma_off)
                            .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reloj_o_alarma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alarma_on)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ver_alarma)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(ver_reloj))
                                .addGap(159, 159, 159))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mas_horas)
                                .addComponent(mas_minutos)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Boton que activa la alarma.
 * @param evt 
 */
    private void alarma_onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarma_onActionPerformed
        Alarma.activa=true;
        indicador.setText(Alarma.marca);
    }//GEN-LAST:event_alarma_onActionPerformed
/**
 * Boton para posponer la alarma 5 minutos.
 * @param evt 
 */
    private void PosponerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosponerButtonActionPerformed
        if(Alarma.activa==true){
        for(int i=0;i<5;i++)
            Alarma.incrementarMinutos();
        }
    }//GEN-LAST:event_PosponerButtonActionPerformed
/**
 * Incrementa la hora del reloj o la alarma.
 * @param evt 
 */
    private void mas_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas_horasActionPerformed
        IncrementarunaHora();
            
    }//GEN-LAST:event_mas_horasActionPerformed
/**
 * Incrementa el minuto del reloj o la alarma, dependiendo cuál estea visible.
 * @param evt 
 */
    private void mas_minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas_minutosActionPerformed
        incrementarMinutos();
    }//GEN-LAST:event_mas_minutosActionPerformed
/**
 * Apaga la alarma o la desactiva si esta está sonando.
 * @param evt 
 */
    private void alarma_ofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarma_ofActionPerformed
        Alarma.activa=false;
        indicador.setText(" ");
    }//GEN-LAST:event_alarma_ofActionPerformed
/**
 * Clase del visualizador de hora.
 * @param evt 
 */
    private void visualizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizadorActionPerformed
        if(Alarma.activa==true){
        for(int i=0;i<5;i++)
            Alarma.incrementarMinutos();
        }
    }//GEN-LAST:event_visualizadorActionPerformed

/**
 * Botón para ver el Reloj.
 * @param evt 
 */
    private void ver_relojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_relojActionPerformed
        alarma_reloj=true;
        reloj_o_alarma.setText("Reloj");
        
    }//GEN-LAST:event_ver_relojActionPerformed
/**
 * Botón para ver la hora de la alarma.
 * @param evt 
 */
    private void ver_alarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_alarmaActionPerformed
        Alarma alarma;
        reloj_o_alarma.setText("Alarma");
        alarma_reloj=false;
        if(Alarma.activa==false)
            alarma=new Alarma();
    }//GEN-LAST:event_ver_alarmaActionPerformed

    private void alarma_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarma_offActionPerformed
        Alarma.activa=false;
    }//GEN-LAST:event_alarma_offActionPerformed

    private void indicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indicadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
        
            }
        });
        

    }
    /**
     * Muestra la hora del reloj en el visualizador.
     */
    public static void mostrarHora(){
            visualizador.setText(Reloj.horacompleta);
    }
    /**
     * Muestra la hora de la alarma en el visualizador.
     */
    public static void mostrarAlarma(){
            visualizador.setText(Alarma.getHoracompleta());
    }
    /**
     * Incrementa el número de la hora del reloj.
     */
    public static void incrementarHoras(){
        if(alarma_reloj==true)
            Reloj.IncrementarunaHora();
        else
            Alarma.IncrementarHoras();
    }
    /**
     * Incrementa el número de los minutos del reloj.
     */
    public static void incrementarMinutos(){
        if(alarma_reloj==true)
            Reloj.IncrementarunMinuto();
        else
            Alarma.incrementarMinutos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton PosponerButton;
    private static javax.swing.JButton alarma_off;
    private static javax.swing.JButton alarma_on;
    private static javax.swing.JTextField indicador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JButton mas_horas;
    private static javax.swing.JButton mas_minutos;
    private javax.swing.JTextField reloj_o_alarma;
    private static javax.swing.JButton ver_alarma;
    private static javax.swing.JButton ver_reloj;
    private static javax.swing.JTextField visualizador;
    // End of variables declaration//GEN-END:variables

}