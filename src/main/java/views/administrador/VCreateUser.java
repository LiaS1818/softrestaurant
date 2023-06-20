/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.administrador;

import com.mycompany.casadoloresproject.CListas;
import entities.CAdministrador;
import entities.CBartender;
import entities.CCocinero;
import entities.CMesero;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class VCreateUser extends javax.swing.JInternalFrame {

    /**
     * Creates new form VCreateUser
     */
    CListas listas = null;

    public VCreateUser(CListas listas) {
        initComponents();
        this.listas = listas;
        rbAdministrador.setSelected(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        rbAdministrador = new javax.swing.JRadioButton();
        rbMesero = new javax.swing.JRadioButton();
        rbBarMan = new javax.swing.JRadioButton();
        rbCocinero = new javax.swing.JRadioButton();
        btnCancelar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(215, 115, 17));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        jPanel1.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        rbAdministrador.setBackground(new java.awt.Color(215, 115, 17));
        buttonGroup1.add(rbAdministrador);
        rbAdministrador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbAdministrador.setText("Administrador");
        jPanel1.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        rbMesero.setBackground(new java.awt.Color(215, 115, 17));
        buttonGroup1.add(rbMesero);
        rbMesero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbMesero.setText("Mesero");
        jPanel1.add(rbMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        rbBarMan.setBackground(new java.awt.Color(215, 115, 17));
        buttonGroup1.add(rbBarMan);
        rbBarMan.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbBarMan.setText("BarMan");
        jPanel1.add(rbBarMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        rbCocinero.setBackground(new java.awt.Color(215, 115, 17));
        buttonGroup1.add(rbCocinero);
        rbCocinero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        rbCocinero.setText("Cocinero");
        jPanel1.add(rbCocinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, 102, -1));

        btnCrear.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 102, -1));

        jLabel1.setText("Nuevo Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String name, pass;
        int ID = 0;

        name = tfName.getText();
        //pass = tfPass.getText()

        if (rbAdministrador.isSelected()) {
            ID = (listas.administradorList.isEmpty()) ? 100 : listas.createIdAdministrador();
            listas.crearAdministrador(new CAdministrador(name, ID));
        } else if (rbBarMan.isSelected()) {
            ID = (listas.bartenderList.isEmpty()) ? 200 : listas.createIdBartender();
            listas.crearBartender(new CBartender(name, ID));
        } else if (rbMesero.isSelected()) {
            ID = (listas.meseroList.isEmpty()) ? 300 : listas.createIdMesero();
            System.out.println("" + ID);
            listas.crearMesero(new CMesero(name, ID));
        } else if (rbCocinero.isSelected()) {
            ID = (listas.cocineroList.isEmpty()) ? 400 : listas.createIdCocinero();
            listas.crearCocinero(new CCocinero(name, ID));
        }

        JOptionPane.showMessageDialog(this, "Tu ID es el: " + ID, "Usuario Creado", 1);

        clearForm();


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new vMenuAdministrador(listas).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void clearForm() {
        tfName.setText("");
        rbAdministrador.setSelected(true);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbBarMan;
    private javax.swing.JRadioButton rbCocinero;
    private javax.swing.JRadioButton rbMesero;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}