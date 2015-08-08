/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sge.gui;

import javax.swing.Box;
import javax.swing.JOptionPane;

/**
 *
 * @author dante
 */
public class MenuEstudiante extends javax.swing.JFrame {

    /**
     * Creates new form EstudienateMenu
     */

    String username;
    public MenuEstudiante(String user) {
        
        this.username=user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Pane1Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenuInscribir = new javax.swing.JMenuItem();
        jMenuListar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuSeccionClose = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu.setText("Materias");

        jMenuInscribir.setText("Inscribir");
        jMenuInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInscribirActionPerformed(evt);
            }
        });
        jMenu.add(jMenuInscribir);

        jMenuListar.setText("Listar");
        jMenuListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarActionPerformed(evt);
            }
        });
        jMenu.add(jMenuListar);

        jMenuBar1.add(jMenu);

        jMenu3.setText(this.username);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuSeccionClose.setText("Cerrar Seccion");
        jMenuSeccionClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSeccionCloseActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuSeccionClose);

        jMenuBar1.add(Box.createHorizontalGlue());

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane1Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane1Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSeccionCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSeccionCloseActionPerformed
       
        new Login().show();
        this.dispose();
        
    }//GEN-LAST:event_jMenuSeccionCloseActionPerformed

    private void jMenuInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInscribirActionPerformed
        // TODO add your handling code here:
        
        InscripsionEstudienate inscribir=new InscripsionEstudienate();
        Pane1Desktop.add(inscribir);
        inscribir.show();
        
    }//GEN-LAST:event_jMenuInscribirActionPerformed

    private void jMenuListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarActionPerformed
        // TODO add your handling code here:
        
        ListaInscritas listins=new ListaInscritas();
        Pane1Desktop.add(listins);
        listins.show();
              
        
    }//GEN-LAST:event_jMenuListarActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuEstudiante().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Pane1Desktop;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuInscribir;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuListar;
    private javax.swing.JMenuItem jMenuSeccionClose;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
