/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AhorcadosJuego;

import java.util.Random;


/**
 *
 * @author dell
 */
public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        AdminPalabrasSecretas pals = new AdminPalabrasSecretas(); 
         JuegoAhorcadoAzar azar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.palabrasSecretas);
    }
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        AhorcadoFijo = new javax.swing.JButton();
        JugarAhorcadoAlAzar = new javax.swing.JButton();
        InicializarPalabras = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        AhorcadoFijo.setText("Jugar Ahorcado Fijo");
        AhorcadoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AhorcadoFijoActionPerformed(evt);
            }
        });

        JugarAhorcadoAlAzar.setText("Jugar Ahorcado al Azar");
        JugarAhorcadoAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarAhorcadoAlAzarActionPerformed(evt);
            }
        });

        InicializarPalabras.setText("Inicializar Palabras (Modo Fijo)");
        InicializarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicializarPalabrasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel2.setText("AHORCADOS");

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jButton1.setText("Inicializar Palabras (Modo Azar)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(InicializarPalabras)))
                .addGap(169, 205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AhorcadoFijo)
                .addGap(237, 237, 237))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JugarAhorcadoAlAzar)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(salir)
                        .addGap(267, 267, 267))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(AhorcadoFijo)
                .addGap(18, 18, 18)
                .addComponent(InicializarPalabras)
                .addGap(18, 18, 18)
                .addComponent(JugarAhorcadoAlAzar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(salir)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AhorcadoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AhorcadoFijoActionPerformed
      
       Random randy = new Random();
        int aleatorio = randy.nextInt(AdminPalabrasSecretas.palabrasSecretas.size());
        JuegoAhorcadoFijo AhorcadoFijoJuego= new JuegoAhorcadoFijo(AdminPalabrasSecretas.palabrasSecretas.get(aleatorio));
       AhorcadoFijoJuego.jugar();
        System.out.println(AdminPalabrasSecretas.palabrasSecretas.size());
        System.out.println(aleatorio);
    }//GEN-LAST:event_AhorcadoFijoActionPerformed

    private void InicializarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicializarPalabrasActionPerformed
        InicializarPalabrasFijo inicializar = new InicializarPalabrasFijo();
        inicializar.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_InicializarPalabrasActionPerformed

    private void JugarAhorcadoAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarAhorcadoAlAzarActionPerformed
       
       
        JuegoAhorcadoAzar juegoAhorcadoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.getpalabrasSecretas());
        juegoAhorcadoAzar.jugar();
        System.out.println(AdminPalabrasSecretas.getpalabrasSecretas());
    }//GEN-LAST:event_JugarAhorcadoAlAzarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.out.println("BYE BYEEEEE");
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AgregarPalabras agregarPalabras = new AgregarPalabras();
    agregarPalabras.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AhorcadoFijo;
    private javax.swing.JButton InicializarPalabras;
    private javax.swing.JButton JugarAhorcadoAlAzar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
