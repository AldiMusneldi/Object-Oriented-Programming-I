/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Looping;

import java.io.DataInputStream;

/**
 *
 * @author USER
 */
//Shortkey Java
//ctrl + e = remove a line
//ctrl + shift + c = add/remove a commnet
//alt + shift + up/down = memindahkan baris ke atas/kebawah
//ctrl + shift + up/down = copy a line/duplicate
//alt + shift + f = formatting/ merapikan kode 
//crtl + shift + i = fix all imports / memasukkan imports yang belum ditambahkan
//sout + tab = system.out.println
//st + tab = String
//fl + tab = float
//trycatch + tab = Exceprion Handling
//for + tab = for Looping
//ifelse + tab = if else
public class Latihan {

    public static void ulang() {
        DataInputStream input = new DataInputStream(System.in);
        // Variabel
        String no = "";
        String nm = "";
        int n_tu = 0;
        int n_la = 0;
        int n_uts = 0;
        int n_uas = 0;
        int n_a = 0;
        String n_h = "";
        //Menu
        int menupilihan = 0;
        System.out.println("====================");
        System.out.println(" PROGRAM MENU PILIHAN ");
        System.out.println(" [1. INPUT NILAI MAHASISWA] ");
        System.out.println(" [2. EXIT ]");
        System.out.println("====================");
        //Process
        try {
            System.out.print("MASUKAN PILIHAN MENU = ");
            menupilihan = Integer.valueOf(input.readLine());
        } catch (Exception e) {
        }
        switch (menupilihan) {
            case 1:
                System.out.println("========================");
                System.out.println("INPUT NILAI MAHASISWA");
                System.out.println("========================");
                try {
                    System.out.print("NOBP = ");
                    no = String.valueOf(input.readLine());
                    System.out.print("NAMA = ");
                    nm = String.valueOf(input.readLine());
                    System.out.print("NILAI TUGAS = ");
                    n_tu = Integer.valueOf(input.readLine());
                    System.out.print("NILAI LATIHAN = ");
                    n_la = Integer.valueOf(input.readLine());
                    System.out.print("NILAI UTS = ");
                    n_uts = Integer.valueOf(input.readLine());
                    System.out.print("NILAI UAS = ");
                    n_uas = Integer.valueOf(input.readLine());
                    //aritmatika
                    n_a = ((15 * n_tu) / 100 + (15 * n_la) / 100 + (40 * n_uas) / 100 + (30 * n_uts) / 100);
                    if (n_a >= 75) {
                        n_h = "A";

                    } else if (n_a < 75) {
                        n_h = "B";
                    } else if (n_a < 65) {
                        n_h = "C";
                    } else if (n_a < 55) {
                        n_h = "D";
                    } else {
                        n_h = "E";
                    }
                } catch (Exception e) {
                }
                System.out.println("=======================");
                System.out.println("LAPORAN NILAI MAHASISWA");
                System.out.println("=======================");
                System.out.println("NOBP = " + no);
                System.out.println("NAMA = " + nm);
                System.out.println("NILAI TUGAS = " + n_tu);
                System.out.println("NILAI LATIHAN = " + n_la);
                System.out.println("NILAI UTS = " + n_uts);
                System.out.println("NILAI UAS = " + n_uas);
                System.out.println("NILAI ANGKA = " + n_a);
                System.out.println("NILAI HURUF = " + n_h);
                ulang();
                break;
            case 2:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        ulang();
    }
}
