/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author Ihsanmi
 * Nama : Nur Ihsan M Iqbal S
 * Kelas : IF-2
 * NIM : 10117067
 * DESKRIPSI PROGRAM : Program Ini bisa memasukan nilai atau input oleh programer
 */
public class PBO210117067Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
