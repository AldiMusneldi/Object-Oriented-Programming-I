/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOIF3_ALDIMUSNELDI;

import java.util.Scanner;

/**
 *
 * @author LAB4
 */
public class Latihan6 {
    //FILE UTAMA
    public static void main(String[] args) {
        //FILE SCANNER
        Scanner input=new Scanner(System.in);
        //Variabel
        String NoRek,Nama;
        double saldo_awal, jml_bunga, total;
        //INPUT
        System.out.println("==================================");
        System.out.println("======PROGRAM SIMPAN PINJAM=======");
        System.out.println("==================================");
        System.out.print("INPUT NO.REKENING             = ");
        NoRek=input.nextLine();
        System.out.print("INPUT NAMA NASABAH            = ");
        Nama=input.nextLine();
        System.out.print("INPUT SALDO AWAL TABUNGAN RP. = ");
        saldo_awal=input.nextDouble();
        //PROSES
        jml_bunga=(saldo_awal*5/100);
        total=jml_bunga+saldo_awal;      
        //OUTPUT
        System.out.println("===================================");
        System.out.println("=======LAPORAN SALDO NASABAH=======");
        System.out.println("===================================");    
        System.out.println("NO.REKENING NASABAH ADALAH   = "+NoRek);
        System.out.println("NAMA NASABAH ADALAH          = "+Nama);
        System.out.println("SALDO AWAL TABUNGAN ADALAH   = "+saldo_awal);
        System.out.println("JUMLAH BUNGA ADALAH          = "+jml_bunga);
        System.out.println("TOTAL ADALAH                 = "+total);
        System.out.println("====================================");
          
    }
    
}
