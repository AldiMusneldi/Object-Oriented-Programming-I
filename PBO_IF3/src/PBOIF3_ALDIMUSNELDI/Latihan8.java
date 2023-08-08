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
public class Latihan8 {
    public static void main(String[] args) {
        DataInputStream input= new DataInputStream(System.in);
        String nam_p="";
        int Kd_mo=0;
        int jml_b=0;
        int la_angs=0;
        String nam_mo="";
        int harga=0;
        int cb=0;
        int bunga=0;
        int sisahutang=0;
        int Angsuran=0;
        try {
            System.out.println("=============================");
            System.out.println("===PROGRAM PENJUALAN MOBIL===");
            System.out.println("=============================");
            System.out.print("MASUKAN NAMA PEMBELI : ");
            nam_p=String.valueOf(input.readLine());
            System.out.print("MASUKAN KODE MOBIL   : ");
            Kd_mo=Integer.valueOf(input.readLine());
            System.out.print("MASUKAN JUMLAH BELI  : ");
            jml_b=Integer.valueOf(input.readLine());
            System.out.print("MASUKAN LAMA ANGSURAN : ");
            la_angs=Integer.valueOf(input.readLine());
            if(Kd_mo==001){
                nam_mo="Toyota Avanza";
                harga=250000000;
                cb=1500000;
            }
            else if(Kd_mo==002){
                nam_mo="Honda Civic";
                harga=300000000;
                cb=1800000;
            }
            else if(Kd_mo==003){
                nam_mo="Toyota Agya";
                harga=180000000;
                cb=6000000;
            }
            else{
                nam_mo="Tidak Ada Pilihan";
            }
        } catch (Exception e) {
        }
        //Prosess
        bunga=((harga*10))/100;
        sisahutang=harga-cb;
        Angsuran=(sisahutang+bunga)/la_angs;
        
        //OUTPUT
        System.out.println("=======================");
System.out.println("===LAPORAN PENJUALAN===");
System.out.println("=======================");
System.out.println("NAMA PEMBELI ADALAH   :"+nam_p);
System.out.println("NAMA MOBIL ADALAH    :"+nam_mo);
System.out.println("HARGA MOBIL ADALAH    :"+harga);
System.out.println("JUMLAH BELI ADALAH    :"+jml_b);
System.out.println("LAMA ANGSURAN ADALAH  :"+la_angs);
System.out.println("BUNGA ADALAH          :"+bunga);
System.out.println("SISA HUTANG ADALAH    :"+sisahutang);
System.out.println("ANGSURAN ADALAH       :"+Angsuran);
System.out.println("=======================");
        
    }
}
