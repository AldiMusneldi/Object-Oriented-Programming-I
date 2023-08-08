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
public class SHOW_PENJUALAN {
    //PARAMETER UNTUK KONEKSI DATA BASE
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/dbperusahaan";
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
           String sql="select * from tblpenjualan";
           rs=stat.executeQuery(sql);
           System.out.println("=============================");
           System.out.println("|   PT. HASTA RAYA PADANG   |");
           System.out.println("|    SHOW PENJUALAN TIKET   |");
           System.out.println("=============================");
           while(rs.next()){
           System.out.println("KODE TIKET        =" + rs.getInt("KodeTiket"));
           System.out.println("ASAL PENERBANGAN  =" + rs.getString("AsalPenerbangan"));
           System.out.println("TUJUAN            =" + rs.getString("Tujuan"));
           System.out.println("HARGA TIKET       =" + rs.getInt("HargaTiket"));
           System.out.println("JUMLAH BELI       =" + rs.getInt("JumlahBeli"));
           System.out.println("TOTAL BAYAR       =" + rs.getInt("TotalBayar"));
           System.out.println("==========================");
       }     
       } catch (Exception e) {
       }
   
        
        
}    
}
