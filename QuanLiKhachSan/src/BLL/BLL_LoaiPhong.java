/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.DAL_LoaiPhong;
import DTO.DTO_LoaiPhong;
import GUI.dialog_FormLoaiPhong;
import GUI.main;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LGNV
 */
public class BLL_LoaiPhong {

    public static void getALLData() {
        ArrayList<DTO_LoaiPhong> list = DAL_LoaiPhong.select();
        doDuLieuVaoBang(list);
    }

    public static void doDuLieuVaoBang(ArrayList<DTO_LoaiPhong> list) {
        DefaultTableModel table = (DefaultTableModel) main.tabLoaiPhong.tblLoaiPhong.getModel();
        table.setRowCount(0);
        for (int i = 0; i < list.size(); i++) {
            DTO_LoaiPhong loaiPhong = list.get(i);
            table.addRow(new Object[]{
                i + 1,
                loaiPhong.getMaLoaiPhong(),
                loaiPhong.getTenLoaiPhong(),
                loaiPhong.getGiaPhong(),
                loaiPhong.getMoTa()
            });
        }
    }

    public static String getIDTable() {
        JTable tblLoaiPhong = main.tabLoaiPhong.tblLoaiPhong;
        int row = tblLoaiPhong.getSelectedRow();
        DefaultTableModel table = (DefaultTableModel) tblLoaiPhong.getModel();
        String ID = tblLoaiPhong.getValueAt(row, 1).toString();
        return ID;

    }

    public static DTO_LoaiPhong getDataForm() {
        DTO_LoaiPhong loaiPhong = new DTO_LoaiPhong();
        dialog_FormLoaiPhong form = main.dialogFormLoaiPhong;
        loaiPhong.setMaLoaiPhong(form.ID);
        loaiPhong.setTenLoaiPhong(form.txtTenLoaiPhong.getTextValue());
        loaiPhong.setGiaPhong(BigDecimal.valueOf(Double.valueOf(form.txtGiaPhong.getTextValue())));
        loaiPhong.setMoTa(form.txtMoTa.getTextValue());

        System.out.println(loaiPhong.getGiaPhong());
        return loaiPhong;
    }

    public static void setDataToForm(String ID) {
        System.out.println(ID);
        DTO_LoaiPhong loaiPhong = new DTO_LoaiPhong();
        loaiPhong = DAL_LoaiPhong.findByID(ID);
        dialog_FormLoaiPhong form = main.dialogFormLoaiPhong;
        form.txtTenLoaiPhong.setText(loaiPhong.getTenLoaiPhong());
        form.txtGiaPhong.setText(loaiPhong.getGiaPhong().toString());
        form.txtMoTa.setText(loaiPhong.getMoTa());
        form.ID = loaiPhong.getMaLoaiPhong();
    }

    public static String createID() {
        ArrayList<DTO_LoaiPhong> list = DAL.DAL_LoaiPhong.select();

        int returnMaLoaiPhong = 1;
        int getMaLoaiPhong = 1;
        for (DTO_LoaiPhong loaiPhong : list) {
            getMaLoaiPhong = Integer.parseInt(loaiPhong.getMaLoaiPhong().substring(2).trim());
            if (getMaLoaiPhong != returnMaLoaiPhong) {
                break;
            }
            returnMaLoaiPhong++;
        }

        if (returnMaLoaiPhong < 10) {
            return "L0" + returnMaLoaiPhong;
        }
        if (returnMaLoaiPhong < 100) {
            return "L" + returnMaLoaiPhong;
        }

        return null;
    }

    public static void insert(DTO_LoaiPhong loaiPhong) {
        loaiPhong.setMaLoaiPhong(createID());
        DAL_LoaiPhong.insert(loaiPhong);
    }

    public static void deleteByID(String ID) {
        DAL_LoaiPhong.delete(ID);
    }

    public static void update(DTO_LoaiPhong loaiPhong) {
        DAL_LoaiPhong.update(loaiPhong);
    }

}
