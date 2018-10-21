/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan47.nilaimahasiswa;

/**
 *
 * @author acer
 */
public class Nilai {

    private double nAkhir;
    private char index;

    public double hitungNilaiAkhir(double Quiz, double UTS, double UAS) {
        nAkhir = (0.20 * Quiz) + (0.30 * UTS) + (0.50 * UAS);
        return nAkhir;
    }

    public char hitungNilaiIndex(double na) {
        if (80 <= na && na <= 100) {
            index = 'A';
            return index;
        } else if (68 <= na && na < 80) {
            index = 'B';
            return index;
        } else if (56 <= na && na < 68) {
            index = 'C';
            return index;
        } else if (45 <= na && na < 56) {
            index = 'D';
            return index;
        } else {
            index = 'E';
            return index;
        }
    }

    public String keterangan(char indeks) {
        String ket;
        switch (indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            default:
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    }

}
