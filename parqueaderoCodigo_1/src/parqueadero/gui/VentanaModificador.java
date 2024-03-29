/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package parqueadero.gui;
import javax.swing.JOptionPane;
/**
 *
 * @author korez
 */
public class VentanaModificador extends javax.swing.JFrame {
    private VentanaPrincipal ventanaPrincipal;
    
    public void setVentanaPrincipal(VentanaPrincipal ventanaPrincipal){
        this.ventanaPrincipal = ventanaPrincipal;
    }
    public VentanaModificador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tFilas = new javax.swing.JTextField();
        tColumnas = new javax.swing.JTextField();
        tTarifa = new javax.swing.JTextField();
        bModificar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bTarifa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bSalir = new javax.swing.JButton();
        jFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(579, 368));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tFilas.setBackground(new java.awt.Color(23, 64, 84));
        tFilas.setForeground(new java.awt.Color(255, 255, 255));
        tFilas.setText("5");
        tFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFilasActionPerformed(evt);
            }
        });
        getContentPane().add(tFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, -1));

        tColumnas.setBackground(new java.awt.Color(23, 64, 84));
        tColumnas.setForeground(new java.awt.Color(255, 255, 255));
        tColumnas.setText("3");
        tColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tColumnasActionPerformed(evt);
            }
        });
        getContentPane().add(tColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 200, -1));

        tTarifa.setBackground(new java.awt.Color(23, 64, 84));
        tTarifa.setForeground(new java.awt.Color(255, 255, 255));
        tTarifa.setText("3000");
        tTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTarifaActionPerformed(evt);
            }
        });
        getContentPane().add(tTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, -1));

        bModificar.setBackground(new java.awt.Color(23, 64, 84));
        bModificar.setForeground(new java.awt.Color(255, 255, 255));
        bModificar.setText("Crear");
        bModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarActionPerformed(evt);
            }
        });
        getContentPane().add(bModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        bVolver.setBackground(new java.awt.Color(36, 107, 142));
        bVolver.setForeground(new java.awt.Color(255, 255, 255));
        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        getContentPane().add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tarifa");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        bTarifa.setBackground(new java.awt.Color(23, 64, 84));
        bTarifa.setForeground(new java.awt.Color(255, 255, 255));
        bTarifa.setText("Tarifa");
        bTarifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTarifaActionPerformed(evt);
            }
        });
        getContentPane().add(bTarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueadero/imagenes/logoparqueadero-removebg-preview (1).png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 210, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Park Central");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 160, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Modifique el parqueadero");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Columnas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Filas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueadero/imagenes/borde.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 90));

        bSalir.setBackground(new java.awt.Color(23, 64, 84));
        bSalir.setForeground(new java.awt.Color(255, 255, 255));
        bSalir.setText("Salir");
        bSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalirMouseClicked(evt);
            }
        });
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, -1));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parqueadero/imagenes/fondoredireccionado.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFilasActionPerformed

    private void tColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tColumnasActionPerformed

    private void tTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTarifaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTarifaActionPerformed

    private void bModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarActionPerformed
        
        String filas = tFilas.getText();
        String columnas = tColumnas.getText();
        String tarifa = tTarifa.getText();
        if(JOptionPane.showConfirmDialog(this, "El parqueadero no tendra registros\n      ¿estás seguro?", "ATENTO", JOptionPane.YES_NO_OPTION) == 0){
            if(ventanaPrincipal.getGestor().modificarParqueadero(filas, columnas, tarifa)){
                    ventanaPrincipal.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Parqueadero Actualizado", "¡Completado!", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Las entradas no son compatibles para el parqueadero", "¡Error!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bModificarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
            if (ventanaPrincipal.getGestor().getFilas() != 0 || ventanaPrincipal.getGestor().getColumnas() != 0){
                ventanaPrincipal.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(this, "¡No hay ningun parqueadero registrado! \n     Ingrese los datos del parqueadero", "¡Espera!", JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_bVolverActionPerformed

    private void bTarifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTarifaActionPerformed
        String tarifa = tTarifa.getText();
        if (ventanaPrincipal.getGestor().getFilas() != 0 || ventanaPrincipal.getGestor().getColumnas() != 0){
            if(JOptionPane.showConfirmDialog(this, "Solo la tarifa cambiará\n      ¿estás seguro?", "ATENTO", JOptionPane.YES_NO_OPTION) == 0){
                if(ventanaPrincipal.getGestor().setTarifa(tarifa)){
                    ventanaPrincipal.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Tarifa Actualizada", "¡Completado!", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "La entrada no es compatible", "¡Error!", JOptionPane.WARNING_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "¡No hay ningun parqueadero registrado! \n     Ingrese los datos del parqueadero", "¡Espera!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bTarifaActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSalirActionPerformed

    private void bSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bModificar;
    private javax.swing.JButton bSalir;
    private javax.swing.JButton bTarifa;
    private javax.swing.JButton bVolver;
    private javax.swing.JLabel jFondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tColumnas;
    private javax.swing.JTextField tFilas;
    private javax.swing.JTextField tTarifa;
    // End of variables declaration//GEN-END:variables
}
