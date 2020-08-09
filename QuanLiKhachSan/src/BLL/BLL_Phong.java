/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_Phong;
import static DAL.DAL_Phong.GetAllPhong;
import DTO.DTO_Phong;

import GUI.main;
import Helper.MyComBoBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quyet
 */
public class BLL_Phong {

    public static String getMaPhong() {
        JTable tblPhong = main.tabPhong.tblPhong;
        int row = tblPhong.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) tblPhong.getModel();
        String MaPhong = tblPhong.getValueAt(row, 1).toString();
        return MaPhong;

    }

    public static DTO_Phong GetPhong(String MaPhong) {
        ResultSet rs = DAL_Phong.GetPhongTheoMa(MaPhong);
        try {
            if (rs.next()) {
                DTO_Phong phg = new DTO_Phong();
                phg.setMaPhong(rs.getString("MaPhong"));
                phg.setMaKhuVuc(rs.getString("MaKhuVuc"));
                phg.setMaLoaiPhong(rs.getString("MaLoaiPhong"));
                phg.setTinhTrangPhong(rs.getString("TinhTrangPhong"));
                phg.setMoTa(rs.getString("MoTa"));

                return phg;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_Phong.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public static void LoadDataCBBTenLoaiPhong(JComboBox cbbLoaiPhong) {
        ResultSet rs = DAL_Phong.LayLoaiPhong();

        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbbLoaiPhong.getModel();
        cbbModel.removeAllElements(); // Xoá dữ liệu cũ trong Combobox
        try {
            while (rs.next()) {
                String value = rs.getString("MaLoaiPhong");
                String text = rs.getString("TenLoaiPhong");
                MyComBoBox myCbb = new MyComBoBox(value, text);

                cbbModel.addElement(myCbb);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay cbb");
        }
    }

    public static void LoadDataCBBTenKhuVuc(JComboBox cbbKhuVuc) {
        ResultSet rs = DAL_Phong.LayKhuVuc();

        DefaultComboBoxModel cbbModel = (DefaultComboBoxModel) cbbKhuVuc.getModel();
        cbbModel.removeAllElements(); // Xoá dữ liệu cũ trong Combobox
        try {
            while (rs.next()) {
                String value = rs.getString("MaKhuVuc");
                String text = rs.getString("TenKhuVuc");
                MyComBoBox myCbb = new MyComBoBox(value, text);

                cbbModel.addElement(myCbb);
            }
        } catch (SQLException ex) {
            System.out.println("Loi lay cbb");
        }
    }

    public static String LayTenLoaiPhong(String MaLoaiPhong) {
        ResultSet rs = DAL_Phong.LayTenLoaiPhong(MaLoaiPhong);

        try {
            if (rs.next()) {
                return rs.getString("TenLoaiPhong");
            }
        } catch (SQLException ex) {
            Helper.support.ThongBaoDonGian("Thông Báo", "Lỗi lấy tên loại phòng!");
        }
        return "";
    }

    public static boolean KiemTraPhong(DTO_Phong phg) {
        if (phg.getMaPhong().isBlank()) {
            Helper.support.ThongBaoDonGian("Thông Báo", "Bạn chưa nhập mã phòng");
            return false;
        }

        ResultSet rs = GetAllPhong();
        if (rs != null) {

            try {

                while (rs.next()) {
                    //obj[0] = tblBang.getRowCount()+1; Đối với bảng có số thứ tự
                    //obj[0] = tblDanhSach.getRowCount()+1;
                    String MaPhong = rs.getString("MaPhong").trim();

                    if (MaPhong.equalsIgnoreCase(phg.getMaPhong())) {
                        Helper.support.ThongBaoDonGian("Thông Báo", "Trùng mã phòng!");
                        return false;
                    }
                    //obj[5] = ChuyenDoi.LayNgayString(rs.getDate("NgayNhapKho")) ;

                }
            } catch (SQLException ex) {
                System.out.println("Loi");
            }

        }

        return true;
    }

   

    //Them nhan vien
    public static void ThemPhong(DTO_Phong phg) {
        // Gọi hàm kiểm tra các thoong tin của nhân viên
        boolean kiemTra = KiemTraPhong(phg);
        // Nếu kiểm tra ok thì thực hiện gọi hàm thêm nhân viên từ DAL
        if (kiemTra) {
            DAL_Phong.ThemPhong(phg);
Helper.support.ThongBaoDonGian("Thông Báo", "Thêm thành công!");
        }
    }

    //Sua nhan vien
    public static void SuaPhong(DTO_Phong phg) {
        //boolean kiemTra = KiemTraPhong(phg);
        // Nếu kiểm tra ok thì thực hiện gọi hàm thêm nhân viên từ DAL
        if (true) {
            DAL_Phong.SuaPhong(phg);
             Helper.support.ThongBaoDonGian("Thông Báo", "Sửa Thành công!");
        }
    }

    //xoa
    public static void Xoa(String MaPhong) {
        //for (String MaNV : ListMaNV) {
            DAL_Phong.XoaPhong(MaPhong);
        //}
    }

    //Hàm đổ dữ liệu nahan viên vào Table
    public static void LoadDataPhong(JTable tblDSPhong) {
        ResultSet rs = GetAllPhong();
        if (rs != null) {

            try {
                DefaultTableModel tbModel = (DefaultTableModel) tblDSPhong.getModel();
                tbModel.setRowCount(0);
                Object obj[] = new Object[6];
                while (rs.next()) {
                    obj[0] = tbModel.getRowCount() + 1;// Đối với bảng có số thứ tự
                    //obj[0] = tblDanhSach.getRowCount()+1;
                    obj[1] = rs.getString("MaPhong");
                    obj[2] = rs.getString("MaKhuVuc");
                    obj[3] = LayTenLoaiPhong(rs.getString("MaLoaiPhong"));

                    obj[4] = rs.getString("TinhTrangPhong");
                    obj[5] = rs.getString("MoTa");

                    //obj[5] = ChuyenDoi.LayNgayString(rs.getDate("NgayNhapKho")) ;
                    tbModel.addRow(obj);

                }
            } catch (SQLException ex) {
                System.out.println("Loi");
            }

        }
    }

    //Lấy thông tin nhân viên
//    public static Phong GetPhong(String MaNV) {
//        ResultSet rs = DAL_Phong.GetPhongTheoMa(MaNV);
//        try {
//            if (rs.next()) {
//                Phong phg = new Phong();
//                phg.setMaPhong(rs.getInt("MaPhong"));
//                phg.setTenPhong(rs.getString("TenPhong"));
//                phg.setDiaChi(rs.getString("DiaChi"));
//                phg.setSDT(rs.getString("SoDienThoai"));
//                phg.setGioiTinh(rs.getBoolean("GioiTinh"));
//                phg.setChucVu(rs.getString("ChucVu"));
//                phg.setNgaySinh(rs.getDate("NgaySinh"));
//                phg.setNgayVaoLam(rs.getDate("NgayVaoLam"));
//                phg.setTenDangNhap(rs.getString("TenDangNhap"));
//                phg.setMatKhau(rs.getString("MatKhau"));
//
//                return phg;
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(BLLPhong.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//        return null;
//    }
}
