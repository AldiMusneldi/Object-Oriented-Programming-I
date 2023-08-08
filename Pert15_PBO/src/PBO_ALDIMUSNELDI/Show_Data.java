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
public class Show_Data {
    private String[] args;
    //PARAMETER UNTUK KONEKSI DATA BASE
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/dbrumahsakit";
    static final String USER="root";
    static final String PASS="";
    //variabel untuk mengelola database
   static Connection conn;
   static Statement stat;
   static ResultSet rs;
   //class
   static InputStreamReader inputStreamReader =new InputStreamReader(System.in);
   static BufferedReader input=new BufferedReader(inputStreamReader);
   //FILE UTAMA
   public void proses_show(){
       try {
           
           Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stat=conn.createStatement();
       } catch (Exception e) {
       }
       
       // query show data
       try {
           String sql="select * from tblpembayaran";
           rs=stat.executeQuery(sql);
    System.out.println("==================================");
    System.out.println("===== RUMAH SAKIT RIZKI BUNDA ====");
    System.out.println("    INPUT PEMBAYARAN RUMAH SAKIT ");
    System.out.println("==================================");
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
       }     
       } catch (Exception e) {
       }
    Menu_Program mn=new Menu_Program();
    mn.main(args);
}
}
