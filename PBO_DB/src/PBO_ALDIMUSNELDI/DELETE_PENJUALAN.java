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
public class DELETE_PENJUALAN {
//Parameter untuk koneksi ke database
static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
static final String DB_URL="jdbc:mysql://localhost/dbperusahaan";
static final String USER="root";
static final String PASS="";

//Variabel untuk mengelola database
static Connection conn;
static Statement stat;
static ResultSet rs;

//Class 
static InputStreamReader InputStreamReader=new InputStreamReader(System.in);
static BufferedReader input=new BufferedReader(InputStreamReader);

//File utama
public static void main(String[] args) {
    try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {}
    
    //Query Delete Data Barang
     try {
         System.out.print("KODE TIKET YANG AKAN DIHAPUS = ");
         int kodetiket=Integer.parseInt(input.readLine());
     //Query Hapus
     String sql=String.format("DELETE from TBLPENJUALAN where kodetiket=%d", kodetiket);
     //untuk penamaan dalam kurung ( penggunaan huruf besar/kecil tidak berpengaruh apa-apa, 
     //yang penting namanya sama dengan yang ada di database)
     stat.execute(sql);
     System.out.println("DATA BERHASIL DIHAPUS");
    } catch (Exception e) {
     System.out.println("DATA GAGAL DIHAPUS");
    }
}
}
