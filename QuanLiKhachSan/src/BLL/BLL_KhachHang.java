/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.DTO_KhachHang;
import GUI.dialog_FormKhachHang;
import GUI.main;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 5450i5
 */
public class BLL_KhachHang {
    
    public static void getALLData() {
        ArrayList<DTO_KhachHang> list = DAL.DAL_KhachHang.select();
        doDuLieuVaoBang(list);
    }
    
    public static void doDuLieuVaoBang(ArrayList<DTO_KhachHang> list) {
        DefaultTableModel table = (DefaultTableModel) main.tabKhachHang.tblKhachHang.getModel();
        table.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            DTO_KhachHang KhachHang = list.get(i);
            
            table.addRow(new Object[]{
                i + 1,
                KhachHang.getMaKhachHang(),
                KhachHang.getTenKhachHang(),
                KhachHang.getCMND(),
                KhachHang.getDiaChi(),
                KhachHang.getSDT(),
                KhachHang.getNgaySinh(),
                KhachHang.isGioiTinh(),
                KhachHang.getMoTa()
            });
        }
    }
    
    public static String getIDTable() {
        JTable tblKhachHang = main.tabKhachHang.tblKhachHang;
        int row = tblKhachHang.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) tblKhachHang.getModel();
        String ID = tblKhachHang.getValueAt(row, 1).toString();
        return ID;
        
    }
    
    public static DTO_KhachHang getDataForm() {
        DTO_KhachHang KhachHang = new DTO_KhachHang();
        dialog_FormKhachHang form = main.dialogFormKhachHang;
        
        KhachHang.setMaKhachHang(getIDTable());
        KhachHang.setTenKhachHang(form.txtTenKhachHang.getTextValue());
        KhachHang.setMaLoaiKhachHang("LKH01");
        KhachHang.setCMND(form.txtCmnd.getTextValue());
        KhachHang.setSDT(form.txtSoDienThoai.getTextValue());
        KhachHang.setDiaChi(form.txtDiaChi.getTextValue());
        KhachHang.setNgaySinh(Helper.MYFormat.layNgayDate(form.txtNgaySinh.getTextValue()));
        KhachHang.setGioiTinh(Helper.TrueFales.check(form.rdbNam));
        KhachHang.setMoTa(form.txtMoTa.getTextValue());
        
        return KhachHang;
    }
    
    public static void setDataToForm(String ID) {
        System.out.println(ID);
        DTO_KhachHang KhachHang = new DTO_KhachHang();
        KhachHang = DAL.DAL_KhachHang.findByID(ID);
        dialog_FormKhachHang form = main.dialogFormKhachHang;
        
        form.txtCmnd.setText(KhachHang.getCMND());
        form.txtTenKhachHang.setText(KhachHang.getTenKhachHang());
        form.txtSoDienThoai.setText(KhachHang.getSDT());
        form.txtNgaySinh.setText(Helper.MYFormat.layNgayString(KhachHang.getNgaySinh()));
        form.txtDiaChi.setText(KhachHang.getDiaChi());
        form.txtMoTa.setText(KhachHang.getMoTa());
        form.rdbNam.setSelected(KhachHang.isGioiTinh());
    }
    
    public static void insert(DTO_KhachHang KhachHang) {
        
        DAL.DAL_KhachHang.insert(KhachHang);
    }
    
    public static void deleteByID(String ID) {
        DAL.DAL_KhachHang.delete(ID);
    }
    
    public static void update(DTO_KhachHang KhachHang) {
        KhachHang.setMaKhachHang(getIDTable());
        DAL.DAL_KhachHang.update(KhachHang);
    }
}
