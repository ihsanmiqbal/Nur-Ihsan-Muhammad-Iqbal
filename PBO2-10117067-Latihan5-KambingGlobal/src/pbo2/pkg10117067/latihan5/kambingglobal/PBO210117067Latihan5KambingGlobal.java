/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117067.latihan5.kambingglobal;

/**
 *
 * @author Ihsanmi 
 * Nama : Nur Ihsan M Iqbal S
 * Kelas : IF-2
 * NIM : 10117067
 * DESKRIPSI PROGRAM : Program ini berisi jumlah kambing setelah ditambahkan
 */
public class PBO210117067Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // variabel jumlahkambing menjadi variabel instance   
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO210117067Latihan5KambingGlobal kambingSusu = new PBO210117067Latihan5KambingGlobal();
    
    //menampilkan jummlah kambing yang ada saat program x pertama berjalan
    kambingSusu.getJumlahKambing();
    
    //menambah satu kambing
    kambingSusu.tambahKambing();
    
    //menampilkan jumlah kambing yang ada
    kambingSusu.getJumlahKambing();
    }
    
}
