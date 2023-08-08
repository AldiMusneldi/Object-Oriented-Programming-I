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
public class PROGRAM_RSIA {
    public static void ulang() {
DataInputStream input=new DataInputStream(System.in);
//Variabel Pasien
String idpasien="";
String nmpasien="";
String jekel="";
String umur="";
String alamat="";
String keluhan="";
String nohppasien="";

//Varibel Dokter
String kddokter="";
String nmdokter="";
String spesialis="";
String nohpdokter="";
String jadwal="";

//Variabel Pembayaran
String notrans="";
int hargakamar=250000;
int lamarawat=0;
int totalpembayaran=0;
int menupilihan=0;
System.out.println("==========================");
System.out.println("=PROGRAM RSIA RIZKI BUNDA=");
System.out.println("==========================");
System.out.println("[1]. INPUT DATA PASIEN");
System.out.println("[2]. INPUT DATA DOKTER");
System.out.println("[3]. INPUT TRANSAKSI PEMBAYARAN");
System.out.println("[4]. EXIT");
System.out.println("==========================");
        try {
            System.out.print("MASUKAN PILIHAN MENU = ");
            menupilihan=Integer.valueOf(input.readLine());

        } catch (Exception e) {}
        switch(menupilihan){
            case 1:
            System.out.println("=======================");
            System.out.println("## INPUT DATA PASIEN ##");
            System.out.println("=======================");
        try {
            System.out.print("MASUKAN ID PASIEN = ");
            idpasien=String.valueOf(input.readLine());
            System.out.print("MASUKAN NAMA PASIEN = ");
            nmpasien=String.valueOf(input.readLine());
            System.out.print("MASUKAN JENIS KELAMIN PASIEN = ");
            jekel=String.valueOf(input.readLine());
            System.out.print("MASUKAN UMUR PASIEN = ");
            umur=String.valueOf(input.readLine());
            System.out.print("MASUKAN ALAMAT PASIEN = ");
            alamat=String.valueOf(input.readLine());
            System.out.print("MASUKAN NO HP PASIEN = ");
            nohppasien=String.valueOf(input.readLine());
            System.out.print("MASUKAN KELUHAN PASIEN = ");
            keluhan=String.valueOf(input.readLine());
        } catch (Exception e) {}
            System.out.println("=====================");
            System.out.println("=LAPORAN DATA PASIEN=");
            System.out.println("=====================");
            System.out.println("ID PASIEN ADALAH = "+idpasien);
            System.out.println("NAMA PASIEN ADALAH = "+nmpasien);
            System.out.println("JENIS KELAMIN PASIEN ADALAH = "+jekel);
            System.out.println("UMUR PASIEN ADALAH = "+umur);
            System.out.println("ALAMAT PASIEN ADALAH = "+alamat);
            System.out.println("NO HP PASIEN ADALAH = "+nohppasien);
            System.out.println("KELUHAN PASIEN ADALAH = "+keluhan);
            System.out.println("=====================");
            ulang();
            break;
            case 2:
            System.out.println("=======================");
            System.out.println("## INPUT DATA DOKTER ##");
            System.out.println("=======================");
        try {
            System.out.print("MASUKAN KODE DOKTER = ");
            kddokter=String.valueOf(input.readLine());
            System.out.print("MASUKAN NAMA DOKTER = ");
            nmdokter=String.valueOf(input.readLine());
            System.out.print("MASUKAN SPESIALIS DOKTER = ");
            spesialis=String.valueOf(input.readLine());
            System.out.print("MASUKAN NO HP DOKTER = ");
            nohpdokter=String.valueOf(input.readLine());
            System.out.print("MASUKAN JADWAL DOKTER = ");
            jadwal=String.valueOf(input.readLine());        
        } catch (Exception e) {}
            System.out.println("=====================");
            System.out.println("=LAPORAN DATA DOKTER=");
            System.out.println("=====================");
            System.out.println("KODE DOKTER ADALAH = "+kddokter);
            System.out.println("NAMA DOKTER ADALAH = "+nmdokter);
            System.out.println("SPESIALIS DOKTER ADALAH = "+spesialis);
            System.out.println("NO HP DOKTER ADALAH = "+nohpdokter);
            System.out.println("JADWAL DOKTER ADALAH = "+jadwal);
            System.out.println("=====================");
            ulang();
            break;
            case 3:
            System.out.println("=======================");
            System.out.println("## INPUT TRANSAKSI PEMBAYARAN ##");
            System.out.println("======================="); 
        try {
            System.out.print("MASUKAN NOMOR TRANSAKSI = ");
            notrans=String.valueOf(input.readLine());
            System.out.print("MASUKAN ID PASIEN = ");
            idpasien=String.valueOf(input.readLine());   
            System.out.print("MASUKAN LAMA RAWAT = ");
            lamarawat=Integer.valueOf(input.readLine()); 
            totalpembayaran=hargakamar*lamarawat;
        } catch (Exception e) {}
            System.out.println("=====================");
            System.out.println("=LAPORAN TRANSAKSI PEMBAYARAN=");
            System.out.println("=====================");
            System.out.println("NO TRANSAKSI PEMBAYARAN = "+notrans);
            System.out.println("ID PASIEN ADALAH = "+idpasien);
            System.out.println("LAMA RAWAT ADALAH = "+lamarawat);
            System.out.println("HARGA KAMAR ADALAH = "+hargakamar);
            System.out.println("TOTAL PEMBAYARAN ADALAH = "+totalpembayaran);
            System.out.println("=====================");
            ulang();
            break;
            case 4:
            System.exit(0);
            
        }
    }







public static void main (String[]args){
ulang();
}

}
