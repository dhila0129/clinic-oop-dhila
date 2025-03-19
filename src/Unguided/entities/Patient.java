/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author ACER
 */

// Kelas yang merepresentasikan informasi pasien
public class Patient {
    // Atribut Kelas
    private String name; // Nama pasien
    private int age; // Usia pasien
    private String diagnosis; // Diagnosis pasien

    // Constructor
    public Patient(String name, int age, String diagnosis) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    // Getter untuk mendapatkan nama pasien
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan usia pasien
    public int getAge() {
        return age;
    }

    // Getter untuk mendapatkan diagnosis pasien
    public String getDiagnosis() {
        return diagnosis;
    }
}