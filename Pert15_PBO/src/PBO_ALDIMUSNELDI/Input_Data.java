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
static final String DB_URL="jdbc:mysql://localhost/dbrumahsakit";
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
    int tb=0,harga=0,tbh=0,dsc=0;
    String tk="";
    try {
        Class.forName(JDBC_DRIVER);
        conn=DriverManager.getConnection(DB_URL,USER,PASS);
        stat=conn.createStatement();
    } catch (Exception e) {}
    //Input data
    System.out.println("==================================");
    System.out.println("===== RUMAH SAKIT RIZKI BUNDA ====");
    System.out.println("    INPUT PEMBAYARAN RUMAH SAKIT ");
    System.out.println("==================================");
    try {
        System.out.print("Nomor Pembayaran   = ");
        String np=input.readLine().trim();
        System.out.print("Tanggal Pembayaran = ");
        String tp=input.readLine().trim();
        System.out.print("Kode Kamar         = ");
        Integer kk=Integer.parseInt(input.readLine());
        if (kk==001) {
            tk="Ekonomi";
            harga=150000;
        } else if(kk==002){
            tk="Deluxe";
            harga=250000;
        } else if(kk==003){
            tk="Vip";
            harga=300000;
        } else if(kk==004){
            tk="President";
            harga=1000000;
        } else if(kk==005){
            tk="Sultan Class";
            harga=2000000;
        } 
        System.out.println("Tipe Kamar       = "+tk);
        System.out.println("Harga Perhari    = "+harga);
        System.out.print("Lama Rawat         = ");
        Integer lr=Integer.parseInt(input.readLine());
        tb=harga*lr;
        if (lr>=5 && lr< 10) {
            dsc=(int) (0.1*tb);
        } else if (lr>=10) {
            dsc=(int) (0.15*tb);
        } else {
            dsc=0*tb;
        }
        
        System.out.println("Total Bayar      = "+tb);
        System.out.println("Diskon           = "+dsc);
        tbh=(tb-dsc);
        System.out.println("Total Bersih     = "+tbh);
        
        //Query simpan
        String sql="insert into tblpembayaran(No_pembayaran,Tgl_pembayaran,"
                + "Kode_kamar,tipe_kamar,Harga_perhari,lama_rawat,Total_bayar,diskon,total_bersih)"
                + "values('%s','%s','%s','%s','%s','%s','%s','%s','%s')";
        sql=String.format(sql,np,tp,kk,tk,harga,lr,tb,dsc,tbh);
        stat.execute(sql);
        System.out.println("DATA BERHASIL MASUK KE DATABASE");
    } catch (Exception e) {
        System.out.println("GAGAL MENYIMPAN");
    }
    Menu_Program mn=new Menu_Program();
    mn.main(args);
}
}
