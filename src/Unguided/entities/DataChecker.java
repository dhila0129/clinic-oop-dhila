/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */

// Kelas untuk memeriksa validitas data pasien
public class DataChecker {
    
     // Metode buat ngecek apakah umur pasien valid
     // Umur harus lebih dari 0 dan kurang dari 100
     // @param age Usia pasien yang mau dicek
     // @return true kalau valid, false kalau tidak
    public static boolean isValidAge(int age) {
        return age > 0 && age < 120;
    }

     // Metode buat ngecek apakah nama pasien valid
     // Nama pasien harus mengandung hanya huruf dan tidak boleh kosong
     // @param name Nama pasien yang mau dicek
     // @return true kalau valid, false kalau tidak
    public static boolean isValidName(String name) {
        return name != null && name.matches("[a-zA-Z ]+");
    }
}