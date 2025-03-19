/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;
import java.time.LocalDate; // Untuk menangani tanggal janji temu secara spesifik menggunakan LocalDate

/**
 *
 * @author ACER
 */

// Kelas yang merepresentasikan janji temu antara dokter dan pasien
public class Appointment {
    // Atribut Kelas
    private Doctor doctor; // Objek dokter yang terlibat dalam janji temu
    private Patient patient; // Objek pasien yang membuat janji temu
    private LocalDate appointmentTime; // Waktu janji temu dalam format tanggal
    private String diagnosis; // Diagnosis pasien

    // Constructor
    public Appointment(Doctor doctor, Patient patient, LocalDate appointmentTime, String diagnosis) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentTime = appointmentTime;
        this.diagnosis = diagnosis;
    }

    // Getter untuk mendapatkan objek dokter
    public Doctor getDoctor() {
        return doctor;
    }

    // Getter untuk mendapatkan objek pasien
    public Patient getPatient() {
        return patient;
    }

    // Getter untuk mendapatkan tanggal janji temu
    public LocalDate getAppointmentTime() {
        return appointmentTime;
    }

    // Getter untuk mendapatkan diagnosis pasien
    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Appointment: " + patient.getName() + " with Dr. " + doctor.getName() +
                " at " + appointmentTime;
    }
}