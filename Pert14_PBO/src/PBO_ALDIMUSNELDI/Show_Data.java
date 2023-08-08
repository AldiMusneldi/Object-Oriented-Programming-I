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
    static final String DB_URL="jdbc:mysql://localhost/db_elektronik";
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
           String sql="select * from tbl_transaksi";
           rs=stat.executeQuery(sql);
           System.out.println("===========================");
        System.out.println("=====ANNASYA ELEKTRONIK====");
        System.out.println(" INPUT TRANSAKSI PENJUALAN ");
        System.out.println("===========================");
       
           while(rs.next()){
        System.out.println("Nomor Transaksi    = "+ rs.getInt("No_Transaksi"));
        System.out.println("Tanggal Transaksi  = "+ rs.getString("Tgl_Transaksi"));
        System.out.println("Kode Barang        = "+ rs.getInt("Kode_Barang"));
        System.out.println("Nama Barang        = "+ rs.getString("Nama_Barang"));
        System.out.println("Harga Barang       = "+ rs.getInt("Harga_Barang"));
        System.out.println("Ongkir             = "+ rs.getInt("Ongkir"));
        System.out.println("Jumlah Pesan       = "+ rs.getString("Jumlah_Pesan"));
        System.out.println("Total Bayar        = "+ rs.getInt("Total_Bayar"));
        System.out.println("==========================");
       }     
       } catch (Exception e) {
       }
    Menu_Program mn=new Menu_Program();
    mn.main(args);
}
}
