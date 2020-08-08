/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLL_LoaiPhong;
import java.awt.Color;
import java.awt.Dimension;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import lgnvswing.lgnvButton;

/**
 *
 * @author LGNV
 */
public class pnl_tab_Manager_LoaiPhong extends javax.swing.JPanel {

    /**
     * Creates new form tab_Manager_LoaiPhong
     */
    public pnl_tab_Manager_LoaiPhong() {
        initComponents();

    }

    public void compile() {
        cssTable();
        BLL.BLL_LoaiPhong.getALLData();
    }

    public void cssTable() {
        tblLoaiPhong.getTableHeader().setBackground(new Color(100, 89, 242));
        tblLoaiPhong.getTableHeader().setForeground(Color.white);
        tblLoaiPhong.getTableHeader().setPreferredSize(new Dimension(100, 50));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lgnvPanel1 = new lgnvswing.lgnvPanel();
        lgnvPanel2 = new lgnvswing.lgnvPanel();
        lgnvButton1 = new lgnvswing.lgnvButton();
        lgnvTextField1 = new lgnvswing.lgnvTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLoaiPhong = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        lgnvPanel1.setBackground(new java.awt.Color(255, 255, 255));
        lgnvPanel1.setLGNV_lineAllow(false);
        lgnvPanel1.setLayout(new java.awt.BorderLayout());

        lgnvPanel2.setBackground(new java.awt.Color(255, 255, 255));
        lgnvPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(66, 139, 202)));
        lgnvPanel2.setLGNV_lineAllow(false);

        lgnvButton1.setBackground(new java.awt.Color(66, 139, 202));
        lgnvButton1.setForeground(new java.awt.Color(255, 255, 255));
        lgnvButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_add_25px.png"))); // NOI18N
        lgnvButton1.setText("Thêm Mới");
        lgnvButton1.setLGNV_ShadowAllow(true);
        lgnvButton1.setLGNV_ShadownColor(50);
        lgnvButton1.setLGNV_borderRadius(60);
        lgnvButton1.setLGNV_lineAllow(false);
        lgnvButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lgnvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvButton1ActionPerformed(evt);
            }
        });

        lgnvTextField1.setLGNV_ShaDownAllow(true);
        lgnvTextField1.setLGNV_iconLeft(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_search_25px_2.png"))); // NOI18N
        lgnvTextField1.setLGNV_iconLeftPadding(15);
        lgnvTextField1.setLGNV_placeholderText("Nhập từ khóa tìm kiếm.....");
        lgnvTextField1.setLGNV_radius(60);
        lgnvTextField1.setLGNV_textPaddingL(30);

        javax.swing.GroupLayout lgnvPanel2Layout = new javax.swing.GroupLayout(lgnvPanel2);
        lgnvPanel2.setLayout(lgnvPanel2Layout);
        lgnvPanel2Layout.setHorizontalGroup(
            lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lgnvButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                .addComponent(lgnvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        lgnvPanel2Layout.setVerticalGroup(
            lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lgnvPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lgnvPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lgnvPanel2Layout.createSequentialGroup()
                        .addComponent(lgnvTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(lgnvButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lgnvPanel1.add(lgnvPanel2, java.awt.BorderLayout.PAGE_START);

        tblLoaiPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Loại Phòng", "Tên Loại Phòng", "Giá", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLoaiPhong.setRowHeight(30);
        tblLoaiPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLoaiPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLoaiPhong);

        lgnvPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(lgnvPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void lgnvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvButton1ActionPerformed
        main.dialogFormLoaiPhong.addNew(true);
        main.dialogFormLoaiPhong.setVisible(true);

        repaint();
    }//GEN-LAST:event_lgnvButton1ActionPerformed

    private void tblLoaiPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLoaiPhongMouseClicked

        if (evt.getClickCount() >= 2) {

            BLL.BLL_LoaiPhong.setDataToForm(BLL_LoaiPhong.getIDTable());

            main.dialogFormLoaiPhong.addNew(false);
            main.dialogFormLoaiPhong.setVisible(true);

        }
    }//GEN-LAST:event_tblLoaiPhongMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private lgnvswing.lgnvButton lgnvButton1;
    private lgnvswing.lgnvPanel lgnvPanel1;
    private lgnvswing.lgnvPanel lgnvPanel2;
    private lgnvswing.lgnvTextField lgnvTextField1;
    public javax.swing.JTable tblLoaiPhong;
    // End of variables declaration//GEN-END:variables
}
