/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOIF3_ALDIMUSNELDI;

import java.io.DataInputStream;

/**
 *
 * @author LAB4
 */
public class PROGRAM_PENJUALAN {
    public static void ulang(){
        //Untuk nama input boleh sembarang
        DataInputStream input=new DataInputStream(System.in);
        //Variabel Input Pembeli
        String kp="";
        String np="";
        String nohp="";
        String ar="";
        
        //Variabel Input Transaksi Penjualan
        String nf="";
        String tgl="";
        String nb="";
        String bs="";
        int jml=0;
        int kb=0;
        int hb=0;
        int tb=0;
        int ub=0;
        int kl=0;
        int menu=0;
        
        //Output
        System.out.println("|=====================================|");
        System.out.println("|=PROGRAM PENJUALAN ANASYA ELEKTRONIK=|");
        System.out.println("|=====================================|");
        System.out.println("|=MENU PILIHAN=|");
        System.out.println("[1]. INPUT DATA PEMBELI");
        System.out.println("[2]. INPUT DATA TRANSAKSI PENJUALAN");
        System.out.println("[3]. EXIT PROGRAM");
        System.out.println("|=====================================|");
        
        //Membuat aksi untuk Menginputkan Pilih Menu
        try {
            System.out.print("PILIH MENU PROGRAM = ");
            menu=Integer.valueOf(input.readLine());
        } catch (Exception e) {
        } 
        //Membuat aksi ketika kita memilih menu yang dituju
        switch(menu){
            case 1:
        System.out.println("|==========INPUT DATA PEMBELI===========|");
        System.out.println("|=======================================|");
        
        //Membuat aksi untuk Input Data Pembeli
        try {
        System.out.print("MASUKAN KODE PEMBELI = ");
        kp=String.valueOf(input.readLine());
        System.out.print("MASUKAN NAMA PEMBELI = ");
        np=String.valueOf(input.readLine());
        System.out.print("MASUKAN NOHP PEMBELI = ");
        nohp=String.valueOf(input.readLine());
        System.out.print("MASUKAN ALAMAT RUMAH = ");
        ar=String.valueOf(input.readLine());
        } catch (Exception e) {
        }
        //Output Laporan Data Pembeli
        System.out.println("|=======================================|");
        System.out.println("|++++++++LAPORAN DATA PEMBELI+++++++++++|");
        System.out.println("|=======================================|");
        System.out.println("KODE PEMBELI ADALAH "+kp);
        System.out.println("NAMA PEMBELI ADALAH "+np);
        System.out.println("NOHP ADALAH "+nohp);
        System.out.println("ALAMAT RUMAH ADALAH "+ar);
        ulang();
        break;
            case 2:
        //Output Input Transaksi Penjualan       
        System.out.println("|=======================================|");
        System.out.println("|=======INPUT TRANSAKSI PENJUALAN=======|");
        System.out.println("|=======================================|");
        try {
        //Membuat aksi untuk Input Transaksi Penjualan
        System.out.print("MASUKAN NO FAKTUR         = ");
        nf=String.valueOf(input.readLine());
        System.out.print("MASUKAN TGL TRANSAKSI     = ");
        tgl=String.valueOf(input.readLine());
        System.out.print("MASUKAN JUMLAH BELI       = ");
        jml=Integer.valueOf(input.readLine());
        System.out.print("PILIH KODE BARANG         = ");
        kb=Integer.valueOf(input.readLine());
        if (kb==001) {
        nb="TV Sharp";
        hb=1550000;
        } else if(kb==002) {
        nb="Kulkas LG";
        hb=1240000;
        }else if (kb==003){
        nb="Kipas Angin";
        hb=252000;
        }else if (kb==004){
        nb="Mesin Cuci Sharp";
        hb=1800000;
        }
        tb=hb*jml;
        
        /*Untuk membuat diskon atau sebagainya dengan operator pembanding buat 
        range agar proses selanjutnya berjalan*/
        if (tb>=5000000 && tb<8000000) {
        bs="Voucher Belanja";
        } else if (tb>=8000000){
        bs="Kipas Angin Mini";
        } else {
        bs="Tidak Ada Bonus";
        }
        } catch (Exception e) {
        }
        //Output Laporan Transaksi Penjualan
        System.out.println("|=======================================|");
        System.out.println("|++++++++FAKTUR PENJUALAN BARANG++++++++|");
        System.out.println("|=======================================|");
        System.out.println("No. FAKTUR ADALAH     = "+nf);
        System.out.println("TGL TRANSAKSI ADALAH  = "+tgl);
        System.out.println("NAMA BARANG ADALAH    = "+nb);
        System.out.println("HARGA BARANG ADALAH   = "+hb);
        System.out.println("JUMLAH BELI ADALAH    = "+jml);
        System.out.println("BONUS ADALAH ADALAH   = "+bs);
        System.out.println("TOTAL BAYAR ADALAH    = "+tb);
         
        //Membuat proses uang bayar dan kembalian
        //Rumus uang bayar dan kembalian harus berurutan seperti dibawah
        try {
        System.out.print("MASUKAN UANG BAYAR    = ");
        ub=Integer.valueOf(input.readLine());
        kl=ub-tb;
        } catch (Exception e) {
        }
        //Output Uang Kembalian
        System.out.println("KEMBALIAN ADALAH      = "+kl);
        ulang();
        break;
            case 3:
        //Membuat pilihan menu EXIT
        System.exit(0);
        }
            
    }
    public static void main(String[] args) {
        //Panggil syntax ulang untuk ditampilkan ketika di run
        ulang();
    }
}
