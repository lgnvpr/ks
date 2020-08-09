/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.DTO_Phong;
import Helper.MyComBoBox;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LGNV
 */
public class dialog_FormPhong extends javax.swing.JDialog {

    /**
     * Creates new form dialog_FormLoaiPhong
     */
    public static boolean Action;
    

    public dialog_FormPhong(java.awt.Frame parent, boolean modal) {
       
        super(parent, modal);
        initComponents();
        this.getRootPane().setOpaque(false);

        this.getContentPane().setBackground(new Color(0, 0, 0, 0));
        this.setBackground(new Color(0, 0, 0, 0)); 
        BLL.BLL_Phong.LoadDataCBBTenLoaiPhong(cbbLoaiPhong);
        BLL.BLL_Phong.LoadDataCBBTenKhuVuc(cbbKhuVuc);
        //addNew(true);
    }

    public void addNew(boolean addNew) {

        if (!addNew) {
            Action = true;
            btnDelete.setVisible(true);
            btnXacNhan.setText("Cập Nhật");

           

        } else {
            Action = false;
            btnXacNhan.setText("Thêm mới");
            btnDelete.setVisible(false);

            txtMaPhong.setText("");
            txtMoTa.setText("");
            txtTinhTrang.setText("Trống");
        }

        repaint();
        repaint(100);

    }

    public void hienThi(DTO_Phong phg) {
        String MaPhong = phg.getMaPhong();
        String MoTa = phg.getMoTa();

        txtMoTa.setText(MaPhong);
        txtMoTa.setText(MoTa);
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
        jLabel1 = new javax.swing.JLabel();
        lgnvButton1 = new lgnvswing.lgnvButton();
        txtMoTa = new lgnvswing.lgnvTextField();
        btnDelete = new lgnvswing.lgnvButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnXacNhan = new lgnvswing.lgnvButton();
        cbbKhuVuc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMaPhong = new lgnvswing.lgnvTextField();
        jLabel6 = new javax.swing.JLabel();
        cbbLoaiPhong = new javax.swing.JComboBox<>();
        txtTinhTrang = new lgnvswing.lgnvTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lgnvPanel1.setBackground(new java.awt.Color(255, 255, 255));
        lgnvPanel1.setLGNV_ShaDownAllow(true);
        lgnvPanel1.setLGNV_ShadownColor(100);
        lgnvPanel1.setLGNV_ShadownOpactity(20);
        lgnvPanel1.setLGNV_ShadownPixel(50);
        lgnvPanel1.setLGNV_borderRadius(50);
        lgnvPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 89, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phòng");
        lgnvPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 425, 43));

        lgnvButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_close_window_26px_2.png"))); // NOI18N
        lgnvButton1.setLGNV_backgroundAllow(false);
        lgnvButton1.setLGNV_lineAllow(false);
        lgnvButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        lgnvButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgnvButton1ActionPerformed(evt);
            }
        });
        lgnvPanel1.add(lgnvButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 30, 30));

        txtMoTa.setLGNV_placeholderText("Nhập tên phòng...");
        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });
        lgnvPanel1.add(txtMoTa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 311, 40));

        btnDelete.setBackground(new java.awt.Color(245, 36, 7));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xoá phòng");
        btnDelete.setLGNV_borderRadius(30);
        btnDelete.setLGNV_lineAllow(false);
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        lgnvPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 140, 30));

        jLabel2.setText("Tình Trạng");
        lgnvPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 290, 30));

        jLabel3.setText("Mô tả");
        lgnvPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 290, 20));

        jLabel4.setText("Khu Vực");
        lgnvPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 290, 30));

        btnXacNhan.setBackground(new java.awt.Color(100, 89, 242));
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("Thêm mới");
        btnXacNhan.setLGNV_borderRadius(30);
        btnXacNhan.setLGNV_gradientBackgroundColor(new java.awt.Color(153, 153, 255));
        btnXacNhan.setLGNV_lineAllow(false);
        btnXacNhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXacNhan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXacNhanMouseClicked(evt);
            }
        });
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        lgnvPanel1.add(btnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 140, 50));

        cbbKhuVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khu Vực 1" }));
        lgnvPanel1.add(cbbKhuVuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 290, 40));

        jLabel5.setText("Loại Phòng");
        lgnvPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 290, 30));

        txtMaPhong.setLGNV_placeholderText("Nhập tên phòng...");
        txtMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongActionPerformed(evt);
            }
        });
        lgnvPanel1.add(txtMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 311, 40));

        jLabel6.setText("Mã Phòng");
        lgnvPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 290, 20));

        cbbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbbLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiPhongActionPerformed(evt);
            }
        });
        lgnvPanel1.add(cbbLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 290, 40));

        txtTinhTrang.setLGNV_placeholderText("Nhập tên phòng...");
        txtTinhTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTinhTrangActionPerformed(evt);
            }
        });
        lgnvPanel1.add(txtTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 311, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lgnvPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lgnvPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoTaActionPerformed

    private void lgnvButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgnvButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_lgnvButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void btnXacNhanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXacNhanMouseClicked
        
    }//GEN-LAST:event_btnXacNhanMouseClicked

    private void txtMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhongActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String MaPhong = txtMaPhong.getTextValue();
        BLL.BLL_Phong.Xoa(MaPhong); 
        BLL.BLL_Phong.LoadDataPhong(pnl_tab_Manager_Phong.tblPhong);
        Helper.support.ThongBaoDonGian("Thông báo", "Xoá thành công!");
       
        this.setVisible(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cbbLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLoaiPhongActionPerformed

    private void txtTinhTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTinhTrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTinhTrangActionPerformed

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        String MaPhong = txtMaPhong.getTextValue();

        MyComBoBox khuVuc = (MyComBoBox) cbbKhuVuc.getSelectedItem();
        String MaKhuVuc = khuVuc.MaString();

        String TinhTrang = "Trống";

        MyComBoBox loaiPhong = (MyComBoBox) cbbLoaiPhong.getSelectedItem();
        String MaLoaiPhong = loaiPhong.MaString();

        String MoTa = txtMoTa.getTextValue();

        DTO_Phong phg = new DTO_Phong(MaPhong, MaKhuVuc, MaLoaiPhong, TinhTrang, MoTa);

        if (Action) {
            BLL.BLL_Phong.SuaPhong(phg);
             BLL.BLL_Phong.LoadDataPhong(pnl_tab_Manager_Phong.tblPhong);
              Helper.support.ThongBaoDonGian("Thông Báo", "Sửa thành công!");
            
        } else {
            DTO_Phong phgNew = new DTO_Phong(MaPhong, MaKhuVuc, MaLoaiPhong, TinhTrang, MoTa);
            System.out.println(phgNew);
            BLL.BLL_Phong.ThemPhong(phgNew);
             BLL.BLL_Phong.LoadDataPhong(pnl_tab_Manager_Phong.tblPhong);
              Helper.support.ThongBaoDonGian("Thông Báo", "Thêm thành công!");
             
        }
       
    }//GEN-LAST:event_btnXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(dialog_FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialog_FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialog_FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialog_FormPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog_FormPhong dialog = new dialog_FormPhong(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lgnvswing.lgnvButton btnDelete;
    private lgnvswing.lgnvButton btnXacNhan;
    public static javax.swing.JComboBox<String> cbbKhuVuc;
    public static javax.swing.JComboBox<String> cbbLoaiPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private lgnvswing.lgnvButton lgnvButton1;
    private lgnvswing.lgnvPanel lgnvPanel1;
    public static lgnvswing.lgnvTextField txtMaPhong;
    public static lgnvswing.lgnvTextField txtMoTa;
    public static lgnvswing.lgnvTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
