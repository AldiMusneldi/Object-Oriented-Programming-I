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
 * @author USER
 */
public class SHOW_PENJUALAN_TIKET {
    //PARAMETER UNTUK KONEKSI DATA BASE
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/db_penerbangan";
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
   public static void main(String[] args){
       try {
           
           Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stat=conn.createStatement();
       } catch (Exception e) {
       }
       
       // query show data
       try {
           String sql="select * from tbl_penjualan";
           rs=stat.executeQuery(sql);
           System.out.println("=========================");
           System.out.println("==== CITILINK PADANG ====");
           System.out.println("| INPUT PENJUALAN TIKET |");
           System.out.println("=========================");
           while(rs.next()){
           System.out.println("Nomor Faktur       =" + rs.getInt("No_Faktur"));
           System.out.println("Tanggal Penjualan  =" + rs.getString("Tgl_Penjualan"));
           System.out.println("Kode Tiket         =" + rs.getString("Kode_Tiket"));
           System.out.println("Tujuan             =" + rs.getString("Tujuan"));
           System.out.println("Harga Tiket        =" + rs.getInt("Harga_Tiket"));
           System.out.println("Jumlah Pesan       =" + rs.getString("Jumlah_Pesan"));
           System.out.println("Total Bayar        =" + rs.getInt("Total_Bayar"));
           System.out.println("==========================");
       }     
       } catch (Exception e) {
       }
}
}
