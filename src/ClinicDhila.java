/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

// Import semua kelas yang dibutuhkan dari package entities
import Unguided.entities.Doctor;
import Unguided.entities.Patient;
import Unguided.entities.Appointment;
import Unguided.entities.DataChecker;
import Unguided.entities.DiagnosisCounter;

// Import library untuk ngatur tanggal janji temu
import java.time.LocalDate;
/**
 *
 * @author ACER
 */

 // Kelas utama untuk menjalankan sistem manajemen klinik "Clinic Dhila"
 // Program mencatat daftar dokter, pasien, serta janji temu yang terjadi
 // Terdapat fitur validasi nama dan usia pasien agar data yang masuk valid
public class ClinicDhila {
    public static void main(String[] args) {
        // Menampilkan header klinik
        System.out.println("=================================");
        System.out.println("         CLINIC DHILA            ");
        System.out.println("=================================");

        // 1. Data Dokter (Membuat daftar dokter yang tersedia di klinik)
        Doctor doctor1 = new Doctor("Dr. Aiden Pradipta", "Ophthalmologist"); // Dokter spesialis mata
        Doctor doctor2 = new Doctor("Dr. Bella Kartika", "Pediatrician"); // Dokter anak
        Doctor doctor3 = new Doctor("Dr. Calvin Mahendra", "Dermatologist"); // Dokter kulit

        // 2. Data Pasien (Membuat daftar pasien yang akan berobat)
        Patient patient1 = new Patient("Nathaniel Rizky", 35, "Katarak");
        Patient patient2 = new Patient("Serena Laksmi", 28, "Demam Tinggi");
        Patient patient3 = new Patient("Davin Ramadhan", 22, "Eksim");

        // 3. Validasi Data Pasien (Memeriksa apakah nama dan usia pasien valid)
        boolean validData = true; // Variabel untuk mengecek apakah semua data pasien valid

        // Validasi untuk pasien pertama
        if (!DataChecker.isValidName(patient1.getName()) || !DataChecker.isValidAge(patient1.getAge())) {
            System.out.println("️Data pasien \"" + patient1.getName() + "\" tidak valid.");
            validData = false; // Jika tidak valid, ubah status validasi
        }

        // Validasi untuk pasien kedua
        if (!DataChecker.isValidName(patient2.getName()) || !DataChecker.isValidAge(patient2.getAge())) {
            System.out.println("️Data pasien \"" + patient2.getName() + "\" tidak valid.");
            validData = false;
        }

        // Validasi untuk pasien ketiga
        if (!DataChecker.isValidName(patient3.getName()) || !DataChecker.isValidAge(patient3.getAge())) {
            System.out.println(" Data pasien \"" + patient3.getName() + "\" tidak valid.");
            validData = false;
        }

        // Jika ada data yang tidak valid, hentikan program
        if (!validData) {
            System.out.println("Data pasien tidak valid! Program dihentikan.");
            return;
        }

        // 4. Data Janji Temu (Membuat daftar janji temu antara dokter dan pasien)
        Appointment appointment1 = new Appointment(doctor1, patient1, LocalDate.of(2025, 5, 12), "Operasi Katarak");
        DiagnosisCounter.incrementDiagnosisCount(); // Menambah jumlah total diagnosis

        Appointment appointment2 = new Appointment(doctor2, patient2, LocalDate.of(2025, 6, 3), "Infeksi Virus");
        DiagnosisCounter.incrementDiagnosisCount();

        Appointment appointment3 = new Appointment(doctor3, patient3, LocalDate.of(2025, 7, 18), "Dermatitis Kronis");
        DiagnosisCounter.incrementDiagnosisCount();

        // 5. Menampilkan Data Klinik ke Layar
        System.out.println("\nDaftar Dokter:");
        System.out.println("- " + doctor1.getName() + " | Spesialis: " + doctor1.getSpecialty());
        System.out.println("- " + doctor2.getName() + " | Spesialis: " + doctor2.getSpecialty());
        System.out.println("- " + doctor3.getName() + " | Spesialis: " + doctor3.getSpecialty());

        System.out.println("\nDaftar Pasien:");
        System.out.println("- " + patient1.getName() + " | Usia: " + patient1.getAge() + " | Diagnosis: " + patient1.getDiagnosis());
        System.out.println("- " + patient2.getName() + " | Usia: " + patient2.getAge() + " | Diagnosis: " + patient2.getDiagnosis());
        System.out.println("- " + patient3.getName() + " | Usia: " + patient3.getAge() + " | Diagnosis: " + patient3.getDiagnosis());

        System.out.println("\nJanji Temu:");
        System.out.println("- " + appointment1.getDoctor().getName() + " dengan " + appointment1.getPatient().getName() +
                " pada " + appointment1.getAppointmentTime() + " | " + appointment1.getDiagnosis());
        System.out.println("- " + appointment2.getDoctor().getName() + " dengan " + appointment2.getPatient().getName() +
                " pada " + appointment2.getAppointmentTime() + " | " + appointment2.getDiagnosis());
        System.out.println("- " + appointment3.getDoctor().getName() + " dengan " + appointment3.getPatient().getName() +
                " pada " + appointment3.getAppointmentTime() + " | " + appointment3.getDiagnosis());

        // 6. Statistik Diagnosa (Menampilkan total jumlah diagnosis yang sudah tercatat)
        System.out.println("\nTotal diagnosis yang diberikan: " + DiagnosisCounter.getDiagnosisCount());

        // Penutup
        System.out.println("\nTerima kasih telah menggunakan layanan Clinic Dhila!");
    }
}