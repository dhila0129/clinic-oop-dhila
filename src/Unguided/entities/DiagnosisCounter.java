/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */

// Kelas untuk menghitung jumlah total diagnosis yang tercatat
public class DiagnosisCounter {
    private static int diagnosisCount = 0; // Variabel untuk menyimpan jumlah diagnosis

    // Metode untuk menambah jumlah diagnosis
    public static void incrementDiagnosisCount() {
        diagnosisCount++;
    }

    // Getter untuk mendapatkan jumlah diagnosis saat ini
    public static int getDiagnosisCount() {
        return diagnosisCount;
    }
}
