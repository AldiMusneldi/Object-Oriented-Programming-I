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
public class Latihan2 {
    public static void start(){
        DataInputStream i=new DataInputStream(System.in);
        String no="";
        String nm="";
        String nh="";
        int ntu=0;
        int nla=0;
        int nuts=0;
        int nuas=0;
        int na=0;
        int menu=0;
        System.out.println("========================");
        System.out.println("PROGRAM PILIHAN MENU");
        System.out.println("========================");
        System.out.println("[1.] INPUT NILAI MAHASISWA");
        System.out.println("[2.] EXIT");
        System.out.println("==========================");
        
        try {
            System.out.print("MASUKAN PILIHAN MENU = ");
            menu=Integer.valueOf(i.readLine());
        } catch (Exception e) {
        }switch (menu){
            case 1:
                System.out.println("====================");
                System.out.println("INPUT NILAI MAHASISWA");
                System.out.println("====================");
                try {
                    System.out.print("NOBP = ");
                    no=String.valueOf(i.readLine());
                    System.out.print("NAMA = ");
                    nm=String.valueOf(i.readLine());
                    System.out.print("NILAI TUGAS = ");
                    ntu=Integer.valueOf(i.readLine());
                    System.out.print("NILAI LATIHAN = ");
                    nla=Integer.valueOf(i.readLine());
                    System.out.print("NILAI UTS = ");
                    nuts=Integer.valueOf(i.readLine());
                    System.out.print("NILAI UAS = ");
                    nuas=Integer.valueOf(i.readLine());
                    na=((15*ntu)/100+(15*nla)/100+(40*nuas)/100+(30*nuts)/100);
                    if (na >= 75) {
                        nh="A";
                    } else if (na<75){
                        nh="B";
                    }else if (na<65){
                        nh="C";
                    }else if (na<55){
                        nh="D";
                    } else {
                        nh="E";
                    }
                } catch (Exception e) {
                }
                System.out.println("=====================");
                System.out.println("LAPORAN NILAI MAHASISWA");
                System.out.println("=====================");
                System.out.println("NOBP = "+no);
                System.out.println("NAMA = "+nm);
                System.out.println("NILAI TUGAS = "+ntu);
                System.out.println("NILAI LATIHAN = "+nla);
                System.out.println("NILAI UTS = "+nuts);
                System.out.println("NILAI UAS = "+nuas);
                System.out.println("NILAI ANGKA = "+na);
                System.out.println("NILAI HURUF = "+nh);
                start();
                break;
            case 2: 
                System.exit(0);
        }
    }
    public static void main(String[] args) {
        start();
    }
}
