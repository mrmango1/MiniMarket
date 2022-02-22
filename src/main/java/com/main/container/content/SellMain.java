/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.main.container.content;

import com.functions.DB;
import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 *
 * @author mrmango
 */
public class SellMain extends javax.swing.JPanel {

    /**
     * Creates new form AdminSuppliersAddProducts
     */
    public SellMain() {
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

        pnlContent = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        lblTotalPrice = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        pnlSearch4 = new javax.swing.JPanel();
        searchID = new javax.swing.JLabel();
        search_icon = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        btnShop = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 239, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlContent.setBackground(new java.awt.Color(229, 233, 240));
        pnlContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblBill.setBackground(new java.awt.Color(229, 233, 240));
        tblBill.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripcion", "PvP", "Dsc%", "Cant", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBill.setFocusable(false);
        tblBill.setGridColor(new java.awt.Color(216, 222, 233));
        tblBill.setRowHeight(30);
        tblBill.setSelectionBackground(new java.awt.Color(235, 203, 139));
        tblBill.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblBill.setShowGrid(false);
        tblBill.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBill);
        tblBill.getTableHeader().setOpaque(false);
        tblBill.getTableHeader().setBackground(new java.awt.Color(229, 233, 240));
        tblBill.getTableHeader().setForeground(new java.awt.Color(46,52,64));
        tblBill.getTableHeader().setFont(new java.awt.Font("Roboto Medium", 1, 14));
        if (tblBill.getColumnModel().getColumnCount() > 0) {
            tblBill.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblBill.getColumnModel().getColumn(0).setMaxWidth(60);
            tblBill.getColumnModel().getColumn(1).setPreferredWidth(125);
            tblBill.getColumnModel().getColumn(1).setMaxWidth(160);
            tblBill.getColumnModel().getColumn(3).setPreferredWidth(60);
            tblBill.getColumnModel().getColumn(3).setMaxWidth(100);
            tblBill.getColumnModel().getColumn(4).setPreferredWidth(40);
            tblBill.getColumnModel().getColumn(4).setMaxWidth(60);
            tblBill.getColumnModel().getColumn(5).setPreferredWidth(40);
            tblBill.getColumnModel().getColumn(5).setMaxWidth(50);
            tblBill.getColumnModel().getColumn(6).setPreferredWidth(75);
            tblBill.getColumnModel().getColumn(6).setMaxWidth(150);
        }

        pnlContent.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 800, 340));
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getVerticalScrollBar().setPreferredSize( new Dimension(0,0) );

        lblTotalPrice.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(59, 66, 82));
        lblTotalPrice.setText("TOTAL:");
        pnlContent.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, 22));

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setBackground(new java.awt.Color(229, 233, 240));
        txtTotalPrice.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtTotalPrice.setBorder(null);
        pnlContent.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 110, 22));

        add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 840, 380));

        pnlSearch4.setBackground(new java.awt.Color(136, 192, 208));
        pnlSearch4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchID.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        searchID.setForeground(new java.awt.Color(59, 66, 82));
        searchID.setText("Nombre");
        pnlSearch4.add(searchID, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 8, -1, 20));

        search_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        pnlSearch4.add(search_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 8, 30, 20));

        txtSearch.setBackground(new java.awt.Color(136, 192, 208));
        txtSearch.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(46, 52, 64));
        txtSearch.setBorder(null);
        pnlSearch4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 8, 100, 20));

        add(pnlSearch4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 230, 35));

        lblAmount.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(59, 66, 82));
        lblAmount.setText("Cantidad");
        add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblID.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(59, 66, 82));
        lblID.setText("ID");
        add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txtID.setBackground(new java.awt.Color(136, 192, 208));
        txtID.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtID.setForeground(new java.awt.Color(67, 76, 94));
        txtID.setBorder(null);
        add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 75, 35));
        txtID.setBorder(BorderFactory.createCompoundBorder(txtID.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        txtAmount.setBackground(new java.awt.Color(136, 192, 208));
        txtAmount.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(67, 76, 94));
        txtAmount.setBorder(null);
        add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 10, 75, 35));
        txtAmount.setBorder(BorderFactory.createCompoundBorder(txtAmount.getBorder(),BorderFactory.createEmptyBorder(7, 10, 7, 10)));

        btnShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping_car.png"))); // NOI18N
        btnShop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShopMouseClicked(evt);
            }
        });
        add(btnShop, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShopMouseClicked
        addToCar();
    }//GEN-LAST:event_btnShopMouseClicked

    public void addToCar(){
        int idProduct = Integer.parseInt(txtID.getText());
        int amount = Integer.parseInt(txtAmount.getText());
        DB.getHashSellDetails(idProduct, amount);
        String sql = "select P.idProduct, P.productName, C.description, P.pvp, P.discount "
                + "from products P join categories C on P.idCategory=C.idCategory where idProduct="+idProduct;
        DB.showQuerySell(tblBill, sql, amount);
        txtTotalPrice.setText(String.valueOf(DB.getTotalPrice()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel btnShop;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblAmount;
    private static javax.swing.JLabel lblID;
    private static javax.swing.JLabel lblTotalPrice;
    private static javax.swing.JPanel pnlContent;
    private static javax.swing.JPanel pnlSearch4;
    private static javax.swing.JLabel searchID;
    private static javax.swing.JLabel search_icon;
    private static javax.swing.JTable tblBill;
    private static javax.swing.JTextField txtAmount;
    private static javax.swing.JTextField txtID;
    private static javax.swing.JTextField txtSearch;
    private static javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
