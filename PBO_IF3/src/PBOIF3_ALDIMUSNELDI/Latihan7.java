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
public class Latihan7 {
//FILE UTAMA
public static void main(String[] args) {
//MEMBUAT INPUT DATA STREAM
DataInputStream input=new DataInputStream(System.in);
//VARIABEL
String namamotor="";
int kodemotor=0;
int hargamotor=0;
    try {
        System.out.println("=======================");
        System.out.println("PROGRAM PENJUALAN MOTOR");
        System.out.println("=======================");
        System.out.print("MASUKKAN KODE MOTOR : ");
        kodemotor=Integer.valueOf(input.readLine());
        if(kodemotor==1){
            namamotor="Mio Soul";
            hargamotor=10000000;
        }
        else if(kodemotor==2){
            namamotor="Honda Beat";
            hargamotor=12000000;
        }
        else {
            namamotor="Tidak ada pilihan";
        }  
    } catch (Exception e) {}
    //LAPORAN
    System.out.println("===============================");
    System.out.println("====LAPORAN PENJUALAN MOTOR====");
    System.out.println("===============================");
    System.out.println("KODE MOTOR  ADALAH = "+kodemotor);
    System.out.println("NAMA MOTOR  ADALAH = "+namamotor);
    System.out.println("HARGA MOTOR ADALAH = "+hargamotor);
    System.out.println("===============================");
    }    
}
