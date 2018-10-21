/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama : Rizal Arif Nugraha 
 * Nim : 10117048 
 * Kelas : PBO2 
 * Deskripsi Program : Program ini berisi mengetahui nilai mahasiswa.
 */
public class PBO210117048Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Nilai n = new Nilai();
        
        System.out.print("Masukkan nilai Quiz : ");
        double Quiz = scn.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double UTS = scn.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double UAS = scn.nextDouble();
        System.out.println();
        
        double na = n.hitungNilaiAkhir(Quiz, UTS, UAS);
        char indeks = n.hitungNilaiIndex(na);
        String ket = n.keterangan(indeks);
        
        System.out.println("Nilai Akhir = " + na);
        System.out.println();
        
        System.out.println("Index = " + indeks);
        System.out.println("Keterangan = " + ket);
    }
    
    
}
