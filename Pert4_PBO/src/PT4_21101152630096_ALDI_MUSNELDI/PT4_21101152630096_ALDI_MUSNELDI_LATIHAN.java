/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PT4_21101152630096_ALDI_MUSNELDI;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PT4_21101152630096_ALDI_MUSNELDI_LATIHAN {
    public static void main(String[]args){
        //Membuat File Scanner
        Scanner input = new Scanner(System.in);
        //Variabel Segitiga
        double luas;
        int alas, tinggi;
        //Input Keyboard
        System.out.println("===================================");
        System.out.println("== PROGRAM MENCARI LUAS SEGITIGA ==");
        System.out.println("===================================");
        System.out.print("Masukkan Alas           = ");
        alas = input.nextInt();
        System.out.print("Masukkan Tinggi         = ");
        tinggi = input.nextInt();
        //Proses Aritmatika
        luas = Double.valueOf((alas*tinggi)/2);
        //Output atau Cetak Ke Layar
        System.out.println("Luas Segitiga Adalah    = "+luas);
    }
}
