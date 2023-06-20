/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CComanda;
import entities.CComandaBebida;
import entities.CComandaPlatillo;
import entities.CMesero;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1710
 */
public class VMReviewComanda extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMReviewComanda
     */
    CListas listas;
    int index;
    CComanda comanda;

    public VMReviewComanda(CListas listas, CMesero mesero, CComanda comanda) {
        initComponents();
        this.listas = listas;
        this.index = listas.getComandaIndex(mesero, comanda.getMesaID());
        this.comanda = comanda;
        
        fillTable();
    }

    private void fillTable() {
        DefaultTableModel temp = (DefaultTableModel) tablePlatillo.getModel();
        int size = comanda.getComandaPlatillo().size();

        for (int i = 0; i < size; i++) {
            Object nuevo[] = {comanda.getComandaPlatillo().get(i).getPlatillo().getsNombre(), comanda.getComandaPlatillo().get(i).getQuantity()};
            temp.addRow(nuevo);
        }

        int size1 = comanda.getComandaBebida().size();
        DefaultTableModel temp1 = (DefaultTableModel) tableBebida.getModel();
        for (int i = 0; i < size1; i++) {
            Object nuevo[] = {comanda.getComandaBebida().get(i).getBebida().getsNombre(), comanda.getComandaBebida().get(i).getQuantity()};
            temp1.addRow(nuevo);
        }
    }

    public void putPlatillo(int indexPlatillo, int numPlatillos) {
        DefaultTableModel temp = (DefaultTableModel) tablePlatillo.getModel();
        comanda.setComandaPlatillo(new CComandaPlatillo(listas.platilloList.get(indexPlatillo), numPlatillos));
        int size = comanda.getComandaPlatillo().size() - 1;
        Object nuevo[] = {comanda.getComandaPlatillo().get(size).getPlatillo().getsNombre(), comanda.getComandaPlatillo().get(size).getQuantity()};
        temp.addRow(nuevo);
        
        int cuenta = listas.platilloList.get(indexPlatillo).getiPrecio() * comanda.getComandaPlatillo().get(size).getQuantity();
        comanda.setCuentaFinal(cuenta);
    }

    public void putBebida(int indexBebida, int numPlatillos) {
        DefaultTableModel temp = (DefaultTableModel) tableBebida.getModel();
        comanda.setComandaBebida(new CComandaBebida(listas.bebidaList.get(indexBebida), numPlatillos));
        int size = comanda.getComandaBebida().size() - 1;
        Object nuevo[] = {comanda.getComandaBebida().get(size).getBebida().getsNombre(), comanda.getComandaBebida().get(size).getQuantity()};
        temp.addRow(nuevo);
        
        int cuenta = listas.bebidaList.get(indexBebida).getiPrecio() * comanda.getComandaBebida().get(size).getQuantity();
        comanda.setCuentaFinal(cuenta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePlatillo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBebida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnComandar = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablePlatillo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePlatillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePlatilloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePlatillo);

        tableBebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBebidaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableBebida);

        jLabel1.setText("Platillos");

        jLabel2.setText("Bebidas");

        btnComandar.setText("Comandar");
        btnComandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComandarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(btnComandar)))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnComandar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComandarActionPerformed

    private void tablePlatilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePlatilloMouseClicked
        // TODO add your handling code here:
        int fila = tablePlatillo.rowAtPoint(evt.getPoint());
        int columna = tablePlatillo.columnAtPoint(evt.getPoint());
        if ((fila > -1) && (columna > -1)) {
            int input = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el platillo?");
            if(input==0){
                comanda.getComandaPlatillo().remove(fila);
                DefaultTableModel temp = (DefaultTableModel) tablePlatillo.getModel();
                temp.removeRow(fila);
            }
        }
    }//GEN-LAST:event_tablePlatilloMouseClicked

    private void tableBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBebidaMouseClicked
        // TODO add your handling code here:
        int fila = tableBebida.rowAtPoint(evt.getPoint());
        int columna = tableBebida.columnAtPoint(evt.getPoint());
        if ((fila > -1) && (columna > -1)) {
            int input = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la Bebida?");
            if(input==0){
                //int cuenta = listas.bebidaList.get(indexBebida).getiPrecio() * comanda.getComandaBebida().get(size).getQuantity();
                //comanda.setCuentaFinal(cuenta);
                comanda.getComandaBebida().remove(fila);
                DefaultTableModel temp = (DefaultTableModel) tableBebida.getModel();
                temp.removeRow(fila);
            }
        }
    }//GEN-LAST:event_tableBebidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComandar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tableBebida;
    private javax.swing.JTable tablePlatillo;
    // End of variables declaration//GEN-END:variables
}
