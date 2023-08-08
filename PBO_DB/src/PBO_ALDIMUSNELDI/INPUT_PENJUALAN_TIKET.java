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
public class INPUT_PENJUALAN_TIKET {
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/db_penerbangan";
    static final String USER="root";
    static final String PASS="";
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    static InputStreamReader inputStreamReader=new InputStreamReader(System.in);
    static BufferedReader input=new BufferedReader(inputStreamReader);
    
    public static void main(String[] args) {
        String Tujuan="";
        int Harga=0,tb;
        try {
            Class.forName(JDBC_DRIVER);
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            stat=conn.createStatement();
        } catch (Exception e) {
        }
        //output/tidak diproses
        System.out.println("=========================");
        System.out.println("==== CITILINK PADANG ====");
        System.out.println("| INPUT PENJUALAN TIKET |");
        System.out.println("=========================");
        try {
            //input/diproses
            System.out.print("Nomor Faktur      : ");
            String No_Faktur=input.readLine().trim();
            System.out.print("Tanggal Transaksi : ");
            String Tgl_Penjualan=input.readLine().trim();
            System.out.print("Kode Tiket        : ");
            Integer Kode_Tiket=Integer.parseInt(input.readLine());
            
            if (Kode_Tiket==001) {
                Tujuan="Jakarta";
                Harga=1850000;
            } else if (Kode_Tiket==002){
                Tujuan="Medan";
                Harga=1200000;
            } else if(Kode_Tiket==003){
                Tujuan="Batam";
                Harga=950000;
            } else if(Kode_Tiket==004){
                Tujuan="Palembang";
                Harga=700000;
            }
            System.out.println("Tujuan            : "+Tujuan);
            System.out.println("Harga Tiket       : "+Harga);
            System.out.print("Jumlah Pesan      : ");
            Integer Jumlah_Pesan=Integer.parseInt(input.readLine());
            tb=Harga*Jumlah_Pesan;
            System.out.println("Total Bayar       : "+tb);
            
            //Query Simpan
            String sql="insert into tbl_penjualan(no_faktur,tgl_penjualan,kode_tiket,tujuan,harga_tiket,jumlah_pesan,total_bayar)values('%s','%s','%s','%s','%s','%s','%s')";
            sql=String.format(sql,No_Faktur,Tgl_Penjualan,Kode_Tiket,Tujuan,Harga,Jumlah_Pesan,tb);
            stat.execute(sql);
            System.out.println("Data Berhasil Disimpan");
        } catch (Exception e) {
            System.out.println("Data Gagal Disimpan");
        }
        
    }
}
