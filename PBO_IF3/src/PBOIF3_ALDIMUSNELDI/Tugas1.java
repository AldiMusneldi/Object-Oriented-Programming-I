/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBOIF3_ALDIMUSNELDI;

/**
 *
 * @author USER
 */
public class Tugas1 {
    //FILE UTAMA
    public static void main(String[] args){
        //Variabel 
        String NoTrans, KdBar, NaBar, Merek, NaSup, TnPro, Stn;
        int HaBar, JmlStok, JmlBe, ToBay;
        //Mengisi Variabel
        NoTrans="TK001";
        KdBar="BRG001";
        NaBar="Minyak Goreng";
        Merek="Sari Murni";
        NaSup="PT. Incasi Raya";
        TnPro="2022";
        Stn="Dus";
        HaBar=12000;
        JmlStok=150;
        JmlBe=4;
        //Proses
        ToBay=HaBar*JmlBe;
        //Cetak Ke Layar
        System.out.println("==================================");
        System.out.println("==== PROGRAM PENJUALAN BARANG ====");
        System.out.println("==================================");
        System.out.println("No Transaksi     : "+NoTrans);
        System.out.println("Kode Barang      : "+KdBar);
        System.out.println("Nama Barang      : "+NaBar);
        System.out.println("Merek            : "+Merek);
        System.out.println("Nama Supplier    : "+NaSup);
        System.out.println("Tahun Produksi   : "+TnPro);
        System.out.println("Satuan           : "+Stn);
        System.out.println("Harga Barang Rp  : "+HaBar);
        System.out.println("Jumlah Stok      : "+JmlStok);
        System.out.println("Jumlah Beli      : "+JmlBe);
        System.out.println("Total Bayar      : "+ToBay);
        System.out.println("==================================");
    
    }
    
}
