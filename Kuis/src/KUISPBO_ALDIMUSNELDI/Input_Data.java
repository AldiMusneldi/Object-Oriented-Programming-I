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
public class Input_Data {
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
public void proses_input() {
  int th=0,harga=0,dsc=0,tb=0;
    String nb="";
    try {
       Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
   } catch (Exception e) {}
    //Input data
    System.out.println("===================================");
    System.out.println("======ANDROMEDA COMPUTER==========");
    System.out.println(" INPUT TRANSAKSI PENJUALAN BARANG ");
    System.out.println("==================================");
    try {
        System.out.print("No Faktur = ");
        String nf=input.readLine().trim();
        System.out.print("Tgl Transaksi = ");
        String tgl=input.readLine().trim();
        System.out.print("ID Barang = ");
        Integer ib=Integer.parseInt(input.readLine());
        if (ib==001) {
            nb="Laptop Acer";
            harga=5850000;
        } else if (ib==002){
            nb="Monitor Dell";
            harga=2050000;
        }else if (ib==003){
            nb="Speaker Aktif Advance";
            harga=850000;
        }else if (ib==004){
            nb="Mouse Wireless";
            harga=150000;
        }else if (ib==005){
            nb="Charger Laptop Asus";
            harga=650000;
        }
        System.out.println("Nama Barang = "+nb);
        System.out.println("Harga Barang = "+harga);
        System.out.print("Jumlah Beli = ");
        Integer jml=Integer.parseInt(input.readLine());
        th=harga*jml;
        if (jml>=5 && jml<10) {
            dsc=(int) (0.1*th);
        } else if (jml>=10){
            dsc=(int) (0.15*th);
        } else {
            dsc=0*th;
        }
        System.out.println("Total Harga = "+th);
        System.out.println("Diskon = "+dsc);
        tb=th-dsc;
        System.out.println("Total Bayar ="+tb);
        System.out.println("===================");
        
        String sql="insert into tblpenjualan(no_faktur,tgl_penjualan,id_barang,nama_barang,harga,jumlah_beli,total_harga,diskon,total_bayar) values ('%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,nf,tgl,ib,nb,harga,jml,th,dsc,tb);
        stat.execute(sql);
        System.out.println("Data Berhasil Masuk");
    } catch (Exception e) {
        System.out.println("Data Gagal Masuk");
    }
   Menu_Program mn=new Menu_Program();
   mn.main(args);

}
}
