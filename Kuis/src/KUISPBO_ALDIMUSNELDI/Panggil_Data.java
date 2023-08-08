/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUISPBO_ALDIMUSNELDI;

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
//Parameter untuk koneksi ke database
static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
static final String DB_URL="jdbc:mysql://localhost/dbandromeda";
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
public void proses_panggil() {
        try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {
    }
        try {
    System.out.println("===================================");
    System.out.println("======ANDROMEDA COMPUTER==========");
    System.out.println(" INPUT TRANSAKSI PENJUALAN BARANG ");
    System.out.println("==================================");
            System.out.print("No Faktur Yang Akan Dipanggil = ");
            int nf=Integer.parseInt(input.readLine());
            String sql=String.format("select * from tblpenjualan where no_faktur=%d", nf);
            rs=stat.executeQuery(sql);
            while(rs.next()){
        System.out.println("No Faktur = "+ rs.getInt("no_faktur"));
        System.out.println("Tgl Transaksi = "+ rs.getString("tgl_penjualan"));
        System.out.println("ID Barang = "+ rs.getString("id_barang"));
        System.out.println("Nama Barang = "+ rs.getString("nama_barang"));
        System.out.println("Harga Barang = "+ rs.getInt("harga"));
        System.out.println("Jumlah Beli = "+ rs.getString("jumlah_beli"));
        System.out.println("Total Harga = "+ rs.getInt("total_harga"));
        System.out.println("Diskon = "+ rs.getInt("diskon"));
        System.out.println("Total Bayar = "+ rs.getInt("total_bayar"));
        System.out.println("====================================");
        System.out.println("Data Ditemukan");
            }
    } catch (Exception e) {
    }
   Menu_Program mn=new Menu_Program();
   mn.main(args);
    }
}
