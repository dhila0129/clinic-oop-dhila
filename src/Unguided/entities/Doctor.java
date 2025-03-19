/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */

// Kelas ynag merepresentasikan informasi dokter
public class Doctor {
    // Atribut Kelas
    private String name; // Nama dokter
    private String specialty; // Spesialisasi dokter

    // Constructor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    // Getter untuk mendapatkan nama dokter
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan spesialisasi dokter
    public String getSpecialty() {
        return specialty;
    }
}

