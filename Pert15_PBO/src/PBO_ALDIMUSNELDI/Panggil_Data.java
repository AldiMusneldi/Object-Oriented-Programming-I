/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_ALDIMUSNELDI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author LAB4
 */
public class Panggil_Data {
      private String[] args;
     //Paramater untuk koneksi ke database
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/dbrumahsakit";
    static final String USER="root";
    static final String PASS="";
    
    //Variabel untuk mengelola database
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    //Class
    static InputStreamReader inpustrStreamReader=new InputStreamReader(System.in);
    static BufferedReader input=new BufferedReader(inpustrStreamReader);
    
    //File Utama
    public void proses_panggil() {
        try {
            Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stat=conn.createStatement();
        } catch (Exception e) {}
        
        //Query menampilkan data dari database
        try {
            System.out.println("==================================");
            System.out.println("===== RUMAH SAKIT RIZKI BUNDA ====");
            System.out.println("    INPUT PEMBAYARAN RUMAH SAKIT ");
            System.out.println("==================================");
            System.out.print("No Faktur yang akan di panggil =");
            int np=Integer.parseInt(input.readLine());
            String sql=String.format("select * from tblpembayaran where No_pembayaran=%d", np);
            rs=stat.executeQuery(sql);
            while(rs.next()){
                System.out.println("Nomor Pembayaran    = "+ rs.getInt("No_pembayaran"));
                System.out.println("Tanggal Pembayaran  = "+ rs.getString("Tgl_pembayaran"));
                System.out.println("Kode Kamar          = "+ rs.getInt("Kode_kamar"));
                System.out.println("Tipe Kamar          = "+ rs.getString("tipe_kamar"));
                System.out.println("Harga Perhari       = "+ rs.getInt("Harga_perhari"));
                System.out.println("Lama Rawat          = "+ rs.getInt("lama_rawat"));
                System.out.println("Total Bayar         = "+ rs.getString("total_bayar"));
                System.out.println("Diskon              = "+ rs.getInt("diskon"));
                System.out.println("Total Bersih        = "+ rs.getInt("Total_Bersih"));
                System.out.println("==========================");
                System.out.println("Data Ditemukan");
            }
        } catch (Exception e) {
        }
        Menu_Program mn=new Menu_Program();
        mn.main(args);
}  
}
