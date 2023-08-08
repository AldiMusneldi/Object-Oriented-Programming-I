/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TEST;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        int umur =scan.nextInt();
        
        Output.tampilkanInput(nama,umur);
    }
}
