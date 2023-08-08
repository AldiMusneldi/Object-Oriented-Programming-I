/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PT10_PBO_21101152630096;

import java.io.DataInputStream;

/**
 *
 * @author LAB4
 */
public class PT10_PBO_21101152630096 {
    static public void ulang(){
        DataInputStream input=new DataInputStream(System.in);
        String kp="",np="",pk="",sp="";
        int pp=0,ja=0;
        String nb="",tgl="",jp="",tr="";
        int jps=0,pkr=0,hr=0,th=0,sbd=0,tp=0,menu=0;
        System.out.println("MENU PROGRAM");
        System.out.println("============");
        System.out.println("[1]. INPUT DATA PELANGGAN");
        System.out.println("[2]. INPUT DATA TRANSAKSI PEMESANAN");
        System.out.println("[3]. KELUAR PROGRAM");
        System.out.println("============");
        try {
            System.out.print("Masukan Menu Pilihan = ");
            menu=Integer.valueOf(input.readLine());
        } catch (Exception e) {
        }
        switch(menu){
            case 1: 
                System.out.println("INPUT DATA PELANGGAN");
                System.out.println("====================");
                try {
                    System.out.print("Kode Pelanggan       : ");
                    kp=String.valueOf(input.readLine());
                    System.out.print("Nama Pelanggan       : ");
                    np=String.valueOf(input.readLine());
                    System.out.print("Pekerjaan            : ");
                    pk=String.valueOf(input.readLine());
                    System.out.print("Penghasilan Perbulan : ");
                    pp=Integer.valueOf(input.readLine());
                    System.out.print("Jumlah Anak          : ");
                    ja=Integer.valueOf(input.readLine());
                    if ((pp>=3000000)&&(pp<6000000)&&(ja<=2)) {
                       sp="Direkomendasikan"; 
                    } else {
                        sp="Tidak Direkomendasikan";
                    }
                } catch (Exception e) {
                }
                System.out.println("LAPORAN DATA PELANGGAN");
                System.out.println("======================");
                System.out.println("Kode Pelanggan Adalah       "+kp);
                System.out.println("Nama Pelanggan Adalah       "+np);
                System.out.println("Pekerjaan Adalah            "+pk);
                System.out.println("Penghasilan Perbulan Adalah "+pp);
                System.out.println("Jumlah Anak Adalah          "+ja);
                System.out.println("Status Pengajuan Kredit     "+sp);
                ulang();
                break;
            case 2:
                System.out.println("INPUT DATA PEMESANAN");
                System.out.println("==================");
                try {
                    System.out.print("No. Booking      : ");
                    nb=String.valueOf(input.readLine());
                    System.out.print("Tgl Booking      : ");
                    tgl=String.valueOf(input.readLine());
                    System.out.print("Jenis Pembayaran [Cash/Kredit] : ");
                    jp=String.valueOf(input.readLine());
                    System.out.print("Jumlah Pesan     : ");
                    jps=Integer.valueOf(input.readLine());
                    System.out.print("Pilih Kode Rumah : ");
                    pkr=Integer.valueOf(input.readLine());
                    if (pkr==001) {
                        tr="Type 36";
                        hr=150000000;
                    } else if (pkr==002) {
                        tr="Type 45";
                        hr=320000000;
                    } else if (pkr==003){
                        tr="Type 50";
                        hr=400000000;
                    } else if (pkr==004){
                        tr="Type 60";
                        hr=650000000;
                    }
                    th=hr*jps;
                    if (jp.equals("Cash")) {
                        sbd=(int) (0.2*th);
                    } else {
                        sbd=0*th/100;
                    }
                    tp=th-sbd;
                } catch (Exception e) {
                }
                System.out.println("LAPORAN DATA PEMESANAN");
                System.out.println("======================");
                System.out.println("No. Booking Adalah      "+nb);
                System.out.println("Tgl Booking Adalah      "+tgl);
                System.out.println("Jenis Pembayaran Adalah "+jp);
                System.out.println("Jumlah Pesan Adalah     "+jps);
                System.out.println("Kode Rumah Adalah       "+pkr);
                System.out.println("Type Rumah Adalah       "+tr);
                System.out.println("Harga Rumah Adalah      "+hr);
                System.out.println("Total Harga Adalah      "+th);
                System.out.println("Subsidi Adalah          "+sbd);
                System.out.println("Total Pembayaran Adalah "+tp);
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
