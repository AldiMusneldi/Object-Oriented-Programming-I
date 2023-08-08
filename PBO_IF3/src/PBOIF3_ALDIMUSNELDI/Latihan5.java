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
public class Latihan5 {
//FILE UTAMA
public static void main(String[] args) {
//Membuat File Scanner
Scanner input=new Scanner(System.in);
//Variabel
String NoBp,Nama,Kelas;
float nilai_tugas, nilai_uts, nilai_uas, n_rata_rata;
//Input
System.out.println("=====================================");
System.out.println("       INPUT NILAI MAHASISWA");
System.out.println("=====================================");
System.out.print("MASUKKAN NOBP        = ");
NoBp=input.nextLine();
System.out.print("MASUKKAN NAMA        = ");
Nama=input.nextLine();
System.out.print("MASUKKAN KELAS       = ");
Kelas=input.nextLine();
System.out.print("MASUKKAN NILAI TUGAS = ");
nilai_tugas=input.nextFloat();
System.out.print("MASUKKAN NILAI UTS   = ");
nilai_uts=input.nextFloat();
System.out.print("MASUKKAN NILAI UAS   = ");
nilai_uas=input.nextFloat();
//Proses
n_rata_rata=((20*nilai_tugas/100)+(30*nilai_uts/100)+(50*nilai_uas/100));
//output
System.out.println("=======================================");
System.out.println("        LAPORAN NILAI MAHASISWA ");
System.out.println("=======================================");
System.out.println("NOBP ADALAH            = "+NoBp);
System.out.println("NAMA ADALAH            = "+Nama);
System.out.println("KELAS ADALAH           = "+Kelas);
System.out.println("NILAI TUGAS ADALAH     = "+nilai_tugas);
System.out.println("NILAI UTS ADALAH       = "+nilai_uts);
System.out.println("NILAI UAS ADALAH       = "+nilai_uas);
System.out.println("NILAI RATA-RATA ADALAH = "+n_rata_rata);
System.out.println("=======================================");    
    }
}
