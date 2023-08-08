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
public class Hapus_Data {
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
public void proses_hapus() {
    try {
        Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stat=conn.createStatement();
    } catch (Exception e) {}
    try {
        System.out.print("MASUKAN NO FAKTUR YANG AKAN DIHAPUS = ");
         int np=Integer.parseInt(input.readLine());
        String sql=String.format("delete from tblpembayaran where no_pembayaran=%d", np);
     stat.execute(sql);
    System.out.println("Data Berhasil Dihapus");    
        
    } catch (Exception e) {    
    System.out.println("Data Gagal Dihapus");
    }  
   Menu_Program mn=new Menu_Program();
   mn.main(args);
}
}
