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
public class INPUT_DATA_BARANG {
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
    //Input data
    System.out.println("=====================");
    System.out.println("PT. HASTA RAYA PADANG");
    System.out.println("=====================");
    System.out.println("|INPUT DATA BARANG|");
    System.out.println("=====================");
    try {
        System.out.print("MASUKAN KODE BARANG = ");
        String kdbarang=input.readLine().trim();
        System.out.print("MASUKAN NAMA BARANG = ");
        String nmbarang=input.readLine().trim();
        System.out.print("MASUKAN SATUAN      = ");
        String satuan=input.readLine().trim();
        System.out.print("MASUKAN HARGA BELI  = ");
        String hargabeli=input.readLine().trim();
        System.out.print("MASUKAN HARGA JUAL  = ");
        String hargajual=input.readLine().trim();
        System.out.print("MASUKAN STOK        = ");
        String stok=input.readLine().trim();
        //Query simpan
        String sql="insert into tblbarang(KodeBarang,NamaBarang,Satuan,HargaBeli,HargaJual,Stok)values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,kdbarang,nmbarang,satuan,hargabeli,hargajual,stok);
        stat.execute(sql);
        System.out.println("DATA BERHASIL MASUK KE DATABASE");
    } catch (Exception e) {
        System.out.println("GAGAL MENYIMPAN");
    }
    
    
}
}
