/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOIF3_ALDIMUSNELDI;

/**
 *
 * @author LAB4
 */
public class Latihan4 {
    //File Utama
    public static void main(String[] args) {
        //Variabel
        String NoTransaksi,KodeBuku,JudulBuku, Pengarang, Penerbit, TahunTerbit, PanjangBuku, BeratBuku;
        double HargaBuku;
        int JumlahStok;
        //Mengisi Variabel
        NoTransaksi="TR001";
        KodeBuku="BK001";
        JudulBuku="Pengantar Bisnis";
        Pengarang="Andri Wijaya, SE, MM";
        Penerbit="Erlangga";
        TahunTerbit="2017";
        HargaBuku=150000;
        JumlahStok=150;
        PanjangBuku="30";
        BeratBuku="100";
        //Cetak Ke Layar
        System.out.println("=======================================");
        System.out.println("=========PROGRAM PENJUALAN BUKU========");
        System.out.println("=======================================");
        System.out.println("No Transaksi  : "+NoTransaksi);
        System.out.println("Kode Buku     : "+KodeBuku);
        System.out.println("Judul Buku    : "+JudulBuku);
        System.out.println("Pengarang     : "+Pengarang);
        System.out.println("Penerbit      : "+Penerbit);
        System.out.println("Tahun Terbit  : "+TahunTerbit);
        System.out.println("Harga Buku Rp : "+HargaBuku);
        System.out.println("Jumlah Stok   : "+JumlahStok);
        System.out.println("Panjang Buku  : "+PanjangBuku + " CM");
        System.out.println("Berat Buku    : "+BeratBuku + " Gram");
        System.out.println("=======================================");
    }
    
}
