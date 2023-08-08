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
public class INPUT_PENJUALAN {
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
    int tb=0;
    try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {}
    //Input data
    System.out.println("=======================");
    System.out.println(" PT. HASTA RAYA PADANG ");
    System.out.println("=======================");
    System.out.println("|INPUT PENJUALAN TIKET|");
    System.out.println("=======================");
    try {
        System.out.print("MASUKAN KODE TIKET       = ");
        String kdtiket=input.readLine().trim();
        System.out.print("MASUKAN ASAL PENERBANGAN = ");
        String aslpenerbangan=input.readLine().trim();
        System.out.print("MASUKAN TUJUAN           = ");
        String tujuan=input.readLine().trim();
        System.out.print("MASUKAN HARGA TIKET      = ");
        Integer hargatiket=Integer.parseInt(input.readLine());
        System.out.print("MASUKAN JUMLAH BELI      = ");
        Integer jmlbeli=Integer.parseInt(input.readLine());
        tb=hargatiket*jmlbeli;
        System.out.println("TOTAL BAYAR            = "+tb);
        //Query simpan
        String sql="insert into tblpenjualan(KodeTiket,AsalPenerbangan,Tujuan,HargaTiket,JumlahBeli,TotalBayar)values('%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,kdtiket,aslpenerbangan,tujuan,hargatiket,jmlbeli,tb);
        stat.execute(sql);
        System.out.println("DATA BERHASIL MASUK KE DATABASE");
    } catch (Exception e) {
        System.out.println("GAGAL MENYIMPAN");
    }
    
    
}
}
