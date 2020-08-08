/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.*;
import BLL.*;

/**
 *
 * @author LGNV
 */
public class main {

    public static frm_Login frm_Login;
    public static frm_WelCome welcome = new frm_WelCome();
    public static frmHome home;
    public static Dao_ConnectSQL conn;
    public static dialog_FormLoaiPhong dialogFormLoaiPhong;
    public static dialog_FormKhachHang dialogFormKhachHang;
    public static dialog_FormPhong dialogFormPhong;

    public static pnl_Tab_Home tabHome;
    public static pnl_Tab_Manager tabManager;

    public static pnl_tab_Manager_KhachHang tabKhachHang;
    public static pnl_tab_Manager_LoaiPhong tabLoaiPhong;
    public static pnl_tab_Manager_Phong tabPhong;

    public static void main(String[] args) throws InterruptedException {
        chooseLookAndFeel();

        welcome.setVisible(true);

        for (int i = 0; i < 100; i++) {
            Thread.sleep(10);

            welcome.lblValueLoad.setText(i + "%");
            welcome.prgValue.setValue(i);
            switch (i) {
                case 1: {
                    welcome.lblContenLoad.setText("Start...");
                    break;
                }
                case 2: {
                    welcome.lblContenLoad.setText("Đang kết nối database...");
                    conn = new Dao_ConnectSQL();
                    System.out.println(conn.resultConnect);
                    break;
                }

                case 40: {
                    welcome.lblContenLoad.setText("Đang khởi tạo tab Khách hàng...");
                    tabKhachHang = new pnl_tab_Manager_KhachHang();
                    tabKhachHang.compile();
                    break;
                }

                case 42: {
                    welcome.lblContenLoad.setText("Đang khởi tạo tab Loại Phòng...");
                    tabLoaiPhong = new pnl_tab_Manager_LoaiPhong();
                    tabLoaiPhong.compile();
                    break;
                }

                case 44: {
                    welcome.lblContenLoad.setText("Đang khởi tạo tab Phòng...");
                    tabPhong = new pnl_tab_Manager_Phong();
                    break;
                }

                case 60: {
                    welcome.lblContenLoad.setText("Đang khởi tạo tab home...");
                    tabHome = new pnl_Tab_Home();
                    break;
                }

                case 62: {
                    welcome.lblContenLoad.setText("Đang khởi tạo tab manager...");
                    tabManager = new pnl_Tab_Manager();
                    
                    break;
                }

                case 70: {
                    frm_Login = new frm_Login();
                    welcome.lblContenLoad.setText("Create Login...");
                    break;
                }
                case 72: {
                    welcome.lblContenLoad.setText("Create Home....");
                    home = new frmHome();
                    break;
                }

                case 74: {
                    welcome.lblContenLoad.setText("Create Form Loại Phòng....");
                    dialogFormLoaiPhong = new dialog_FormLoaiPhong(home, true);
                    break;
                }
                case 76: {
                    welcome.lblContenLoad.setText("Create Form Khách Hàng....");
                    dialogFormKhachHang = new dialog_FormKhachHang(home, true);
                    
                    break;
                }

                case 78: {
                    welcome.lblContenLoad.setText("Create Form Phòng....");
                    dialogFormPhong = new dialog_FormPhong(home, true);
                    break;
                }

                case 99: {
                    welcome.lblContenLoad.setText("Succes..");
                    welcome.dispose();
                    frm_Login.setVisible(true);
                    break;
                }
            }
        }
    }

    public static void chooseLookAndFeel() {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frm_WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frm_WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frm_WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frm_WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
    }
}
