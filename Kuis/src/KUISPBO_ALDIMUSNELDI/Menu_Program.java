/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUISPBO_ALDIMUSNELDI;

import java.io.DataInputStream;

/**
 *
 * @author LAB4
 */
public class Menu_Program {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("Menu Program Andromeda Computer");
        System.out.println("============================================================");
        System.out.println("[1]. Input Transaksi Penjualan Barang");
        System.out.println("[2]. Laporan/Show Transaksi Penjualan Barang");
        System.out.println("[3]. Hapus Transaksi Penjualan Barang");
        System.out.println("[4]. Panggil Transaksi Penjualan Barang Berdasarkan No Faktur");
        System.out.println("[5]. Exit");
        System.out.println("=============================================================");
        int pilih=0;
        DataInputStream input=new DataInputStream(System.in);
        try {
            System.out.print("Masukan Pilihan Menu : ");
            pilih = Integer.valueOf(input.readLine());
        } catch (Exception e) {
        }
        switch(pilih){
            case 1:
                Input_Data id=new Input_Data();
                id.proses_input();
                break;
            case 2:
                Show_Data sd=new Show_Data();
                sd.proses_show();
                break;
            case 3:
                Hapus_Data hd=new Hapus_Data();
                hd.proses_hapus();
                break;
            case 4:
                Panggil_Data pd=new Panggil_Data();
                pd.proses_panggil();
                break;
            case 5:
                System.exit(0);
        }
    }
}
