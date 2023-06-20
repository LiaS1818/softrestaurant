/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CComanda;
import entities.CMesero;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author a1710
 */
public class VMComandas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMComandas
     */
    CListas listas;
    CMesero mesero;
    VMenuMesero menu;

    public VMComandas(CListas listas, CMesero mesero, VMenuMesero menu) {
        initComponents();
        this.listas = listas;
        this.mesero = mesero;
        this.menu = menu;

        addRows();
        addCheckBox();
        addCuenta();

    }

    private void addRows() {
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        int size = mesero.getComandas().size();
        System.out.println("Estoy aqui" + size);
        CComanda comanda;
        for (int i = 0; i < size; i++) {
            comanda = mesero.getComandas().get(i);
            Object nuevo[] = {comanda.getMesaID(), comanda.getDateInit(), comanda.getCuentaFinal()};
            temp.addRow(nuevo);
        }
    }

    private void addCheckBox() {
        TableColumn tc = jTable1.getColumnModel().getColumn(3);
        tc.setCellEditor(jTable1.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(jTable1.getDefaultRenderer(Boolean.class));
    }

    private void addCuenta() {
        for (CComanda comanda : mesero.getComandas()) {
            //comanda.get
        }
    }

    private boolean IsSelected(int row, int column, JTable table) {
        if (table.getValueAt(row, column) != null) {
            return table.getValueAt(row, column).toString() == "true";
        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnCloseComanda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesa", "Hora Inicio", "Cuenta", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnCloseComanda.setText("Cerrar Comanda");
        btnCloseComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseComandaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnCloseComanda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCloseComanda)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseComandaActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (IsSelected(i, 3, jTable1)) {
                int index = listas.getIndexComanda(mesero.getComandas(), (Integer) jTable1.getValueAt(i, 0));
                DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
                temp.removeRow(i);
                menu.closeComanda(index);
            }
        }
    }//GEN-LAST:event_btnCloseComandaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCloseComanda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
