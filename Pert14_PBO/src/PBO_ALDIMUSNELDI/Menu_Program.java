/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_ALDIMUSNELDI;

import java.io.DataInputStream;

/**
 *
 * @author LAB4
 */
public class Menu_Program {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("=====Menu Program=====");
        System.out.println("======================");
        System.out.println("1. Input Data");
        System.out.println("2. Show Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Exit");
        System.out.println("======================");
        
        int pilih=0;
        DataInputStream input = new DataInputStream(System.in);
        
        //Proses Input Pilihan 
        try {
            System.out.print("Masukan Pilihan = ");
            pilih=Integer.valueOf(input.readLine());
        } catch (Exception e) {
        }
        //Percabangan Switch Case
        switch (pilih){
            case 1:
                Input_Data id=new Input_Data();
                id.proses_input();
                break;
            case 2:
                Show_Data sd=new Show_Data();
                sd.proses_show();
                break;
            case 3:
                Hapus_Data hd = new Hapus_Data();
                hd.proses_hapus();
                break;
            case 4:
                System.exit(0);
        }
    }
}
