/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views.mesero;

import com.mycompany.casadoloresproject.CListas;
import entities.CPlatillo;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1710
 */
public class VMComandaPlatillo extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMComandaPlatillo
     */
    CListas listas;
    int index;
    String platilloType;
    VMenuCreateComanda comanda;
    
    public VMComandaPlatillo(CListas listas, int index, String platilloType, VMenuCreateComanda comanda) {
        initComponents();
        this.listas = listas;
        this.index = index;
        this.platilloType = platilloType;
        this.comanda = comanda;
        
        createRows();
        fillRows();
    }

    private void createRows(){
        DefaultTableModel temp = (DefaultTableModel) jTable1.getModel();
        Object nuevo[] = {""};
        int size = listas.getPlatilloSize(platilloType);
        for (int i = 0; i < size; i++) {
            temp.addRow(nuevo);
        }
    }
    
    private void fillRows(){
        int i = 0;
        for (CPlatillo platillo : listas.platilloList) {
            if (platillo.getsCategoria().equals(platilloType)) {
                jTable1.setValueAt(platillo.getsNombre(), i, 0);
                i++;
            }
        }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.rowAtPoint(evt.getPoint());
        //int columna = jTable1.columnAtPoint(evt.getPoint());
        if ((fila > -1)) {
            int comidaIndex = listas.buscarComida((String) jTable1.getValueAt(fila, 0));
            comanda.putPlatilloComanda(comidaIndex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
