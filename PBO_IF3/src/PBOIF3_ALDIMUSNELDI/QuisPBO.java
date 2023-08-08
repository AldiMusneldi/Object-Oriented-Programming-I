/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBOIF3_ALDIMUSNELDI;

import java.io.DataInputStream;

/**
 *
 * @author USER
 */
public class QuisPBO {
    public static void ulang(){
        DataInputStream input=new DataInputStream(System.in);
        //Buat variabel sependek dan se efisien mungkin untuk menghemat waktu
        //Variabel Pelanggan
        String kp="",np="",nohp="",krt="",sts="";
        //Variabel Penjualan
        String nf="",tgl="",pks="",ks="",ns="",bns="";
        int jb=0,hs=0,ds=0,tb=0,ub=0,kbl=0;
        //Variabel menu
        int menu=0;
        System.out.println("MENU PROGRAM"); 
        System.out.println("============");
        System.out.println("[1]. INPUT DATA PELANGGAN");
        System.out.println("[2]. INPUT TRANSAKSI PENJUALAN SONGKET");
        System.out.println("[3]. KELUAR PROGRAM");
        try {
            // Setiap perintah masukan langsung dilakukan dalam function try
            System.out.print("Masukan Menu Pilihan = "); 
            menu=Integer.valueOf(input.readLine());
        } catch (Exception e) {}
        switch (menu){
            case 1 :
                //Untuk output/keluaran dibuat dibawah/luar function catch
                System.out.println("INPUT DATA PENUMPANG");
                System.out.println("====================");
                try {
                    //Disini berisi perintah masukan/input
                    System.out.print("Kode Pelanggan : ");
                    kp=String.valueOf(input.readLine());
                    System.out.print("Nama Pelanggan : ");
                    np=String.valueOf(input.readLine());
                    System.out.print("Nohp           : ");
                    nohp=String.valueOf(input.readLine());
                    System.out.print("Kartu (Ada/Tidak Ada : ");
                    krt=String.valueOf(input.readLine());
                    //Proses if else. Karena Tipe Data dari variabel krt=String
                    //maka menggunakan namavariabel.equals agar proses if dapat berjalan
                    if (krt.equals("Ada")){
                        sts="Member";
                    }else {
                        sts="Non Member";
                    }
                } catch (Exception e) {}
                System.out.println("LAPORAN DATA PELANGGAN");
                System.out.println("======================");
                System.out.println("Kode Pelanggan Adalah "+kp);
                System.out.println("Nama Pelanggan Adalah "+np);
                System.out.println("Nohp           Adalah "+nohp);
                System.out.println("Kartu          Adalah "+krt);
                System.out.println("Status         Adalah "+sts);
                ulang();
                break;
            case 2:
                System.out.println("INPUT PENJUALAN SONGKET");
                System.out.println("=======================");
                try {
                    System.out.print("No. Faktur       : ");
                    nf=String.valueOf(input.readLine());
                    System.out.print("Tanggal Transaksi : ");
                    tgl=String.valueOf(input.readLine());
                    System.out.print("Jumlah Beli       : ");
                    jb=Integer.valueOf(input.readLine());
                    System.out.print("Pilih Kode Songket : ");
                    pks=String.valueOf(input.readLine());
                    //Ketentuan if
                    //Karena Tipe data dari Variabel Pilih Kode Songket berupa String
                    //maka gunakan namavariabel.equals agar proses dapat berjalan
                    
                    if(pks.equals("KS001")){
                        ns="Songket Bungo Pacik";
                        hs=1500000;
                        ds=15*hs/100;
                    }else if (pks.equals("KS002")){
                        ns="Songket Tretes";
                        hs=1200000;
                        ds=10*hs/100;
                    }else if (pks.equals("KS003")){
                        ns="Songket Limar";
                        hs=850000;
                        ds=5*hs/100;
                    }else if (pks.equals("KS004")){
                        ns="Songket Lepus";
                        hs=540000;
                        ds=5*hs/100;
                    }
                    tb=(hs*jb)-ds;
                    
                    //Ketentuan if dibawah
                    //karena Tipe data dari variabelnya adalah int
                    //maka tidak perlu menggunakan equals
                    if ((tb>=4000000)&&(tb<7000000)){
                        bns="Saldo Gopay";
                    }else if (tb>=7000000){
                        bns="Jam Dinding Logo Silungkang";
                    }else if (tb<4000000){
                        bns="Tidak Dapat Bonus";
                    }
                } catch (Exception e) {}
                System.out.println("FAKTUR PENJUALAN SONGKET");
                System.out.println("========================");
                System.out.println("No.Faktur     Adalah "+nf);
                System.out.println("Tgl Transaksi Adalah "+tgl);
                System.out.println("Jumlah Beli   Adalah "+jb);
                System.out.println("Kode Songket  Adalah "+pks);
                System.out.println("Nama Songket  Adalah "+ns);
                System.out.println("Harga Songket Adalah "+hs);
                System.out.println("Diskon        Adalah "+ds);
                System.out.println("Total Bayar   Adalah "+tb);
                System.out.println("Bonus         Adalah "+bns);
                try {
                    //Untuk memasukkan uang bayar dibuat dalam try
                    System.out.print("Uang Bayar  : ");
                    ub=Integer.valueOf(input.readLine());
                    //Rumus uang kembalian
                    kbl=ub-tb;
                } catch (Exception e) {}
                System.out.println("Uang Kembalian Adalah "+kbl);
                ulang();
                break;
            case 3:
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        ulang();
    }
}
