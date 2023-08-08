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
public class PT4_21101152630096_ALDI_MUSNELDI_TUGAS {
    public static void main(String[]args){
        //File Scanner
        Scanner processInput = new Scanner(System.in);
        //Variabel Persegi Panjang
        int panjang,lebar;
        double luas, keliling;
        //Tampilan Nama Program
        System.out.println("===============================================");
        System.out.println("== MENCARI LUAS DAN KELILING PERSEGI PANJANG ==");
        System.out.println("===============================================");
        //Input Value
        System.out.print("Masukkan Panjang                  = ");
        panjang = processInput.nextInt();
        System.out.print("Masukkan Lebar                    = ");
        lebar = processInput.nextInt();
        //Process Aritmatika
        luas = Double.valueOf(panjang*lebar);
        keliling = Double.valueOf(2*(panjang+lebar));
        //Output/Tampilkan Ke Layar
        System.out.println("Luas Persegi Panjang Adalah       = "+luas);
        System.out.println("Keliling Persegi Panjang Adalah   = "+keliling);
    }
}
