/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DTO_Phong;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quyet
 */
public class DAL_Phong {

    static Dao_ConnectSQL conn = new Dao_ConnectSQL();

    public static ResultSet GetAllPhong() {

        String sql = "Select * from Phong";
        return conn.resultSet(sql);
    }
    
   

    public static ResultSet LayTenLoaiPhong(String MaLoaiPhong) {

        String sql = "Select * from LoaiPhong where MaLoaiPhong = ?";
        return conn.resultSet(sql, MaLoaiPhong);
    }

    public static void ThemPhong(DTO_Phong phg) {
        String sql = "INSERT INTO [dbo].[Phong] "
                + "           ([MaPhong] "
                + "           ,[MaKhuVuc] "
                + "           ,[MaLoaiPhong] "
                + "           ,[TinhTrangPhong] "
                + "           ,[MoTa]) "
                + "     VALUES (?,?,?,?,?)";
        conn.executeUpdate(sql, phg.getMaPhong(), phg.getMaKhuVuc(), phg.getMaLoaiPhong(),
                phg.getTinhTrangPhong(), phg.getMoTa());

    }

    public static void SuaPhong(DTO_Phong phg) {
        String sql = "UPDATE [dbo].[Phong] "
                + "   SET [MaKhuVuc] = ? "
                + "      ,[MaLoaiPhong] = ? "
                + "      ,[TinhTrangPhong] = ? "
                + "      ,[MoTa] = ? "
                + " WHERE [MaPhong] = ?";
        conn.executeUpdate(sql, phg.getMaKhuVuc(), phg.getMaLoaiPhong(),
                phg.getTinhTrangPhong(), phg.getMoTa(), phg.getMaPhong());
    }

    public static void XoaPhong(String MaPhong) {
        String sql = "DELETE FROM [dbo].[Phong]  WHERE MaPhong = ?";
        conn.executeUpdate(sql, MaPhong);
    }
    


    public static ResultSet GetPhongTheoMa(String MaPhong) {
        String sql = "select * from Phong where MaPhong = ?";
        return conn.resultSet(sql, MaPhong);
    }
    
    public static ResultSet GetTenLoaiPhongTheoMa (String MaPhong){
        String sql = "Select TenLoaiPhong from LoaiPhong where MaLoaiPhong = ?";
        return conn.resultSet(sql, MaPhong);
    }

    public static ResultSet LayLoaiPhong() {
        String sql = "Select * from LoaiPhong";
        return conn.resultSet(sql);
    }
    
    public static ResultSet LayLoaiPhongTheoMa(String MaLoai) {
        String sql = "Select TenLoaiPhong from LoaiPhong where MaLoaiPhong = ?";
        return conn.resultSet(sql, MaLoai);
    }
    
     public static ResultSet LayKhuVuc() {
        String sql = "Select * from KhuVuc";
        return conn.resultSet(sql);
    }

}
