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
public class Hapus_Data {
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
public void proses_hapus () {
        try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {
    }
        try {
            System.out.print("Masukan No Faktur Yang Akan Dihapus = ");
            int nf=Integer.parseInt(input.readLine());
            String sql=String.format("delete from tblpenjualan where no_faktur=%d", nf);
            stat.execute(sql);
            System.out.println("Data Berhasil Dihapus");
    } catch (Exception e) {
        System.out.println("Data Gagal Dihapus");
    }
   Menu_Program mn=new Menu_Program();
   mn.main(args);
    }
}
