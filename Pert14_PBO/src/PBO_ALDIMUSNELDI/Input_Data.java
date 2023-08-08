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
public class Input_Data {
    private String[] args;
//Parameter untuk koneksi ke database
static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
static final String DB_URL="jdbc:mysql://localhost/db_elektronik";
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
public void proses_input() {
    int tb=0,harga=0,ongkir=0;
    String nb="";
    try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {}
    //Input data
    System.out.println("===========================");
    System.out.println("=====ANNASYA ELEKTRONIK====");
    System.out.println(" INPUT TRANSAKSI PENJUALAN ");
    System.out.println("===========================");
    try {
        System.out.print("Nomor Transaksi       = ");
        String nt=input.readLine().trim();
        System.out.print("Tanggal Transaksi  = ");
        String ttg=input.readLine().trim();
        System.out.print("Kode Barang           = ");
        Integer kb=Integer.parseInt(input.readLine());
        if (kb==001) {
            nb="Kulkas LG";
            harga=1850000;
            ongkir=65000;
        } else if(kb==002){
            nb="TV Sharp 24 Inch";
            harga=3250000;
            ongkir=48000;
        } else if(kb==003){
            nb="Mesin Cuci Sharp";
            harga=1540000;
            ongkir=70000;
        } else if(kb==004){
            nb="Rak TV Besi";
            harga=460000;
            ongkir=20000;
        } else if(kb==005){
            nb="Setrika Philips";
            harga=285000;
            ongkir=15500;
        } 
        System.out.println("Nama Barang      = "+nb);
        System.out.println("Harga Barang     = "+harga);
        System.out.println("Ongkir           = "+ongkir);
        System.out.print("Jumlah Pesan       = ");
        Integer jp=Integer.parseInt(input.readLine());
        tb=(harga*jp)+ongkir;
        System.out.println("Total Bayar      = "+tb);
        //Query simpan
        String sql="insert into tbl_transaksi(No_Transaksi,Tgl_Transaksi,"
                + "Kode_Barang,Nama_Barang,Harga_Barang,ongkir,Jumlah_Pesan,Total_bayar)"
                + "values('%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,nt,ttg,kb,nb,harga,ongkir,jp,tb);
        stat.execute(sql);
        System.out.println("DATA BERHASIL MASUK KE DATABASE");
    } catch (Exception e) {
        System.out.println("GAGAL MENYIMPAN");
    }
    Menu_Program mn=new Menu_Program();
    mn.main(args);
}
}
