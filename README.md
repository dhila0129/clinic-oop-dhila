# <h1 align="center">🏥 Clinic Dhila Management System 🚑</h1>
<p align="center">Habibah Ratna Fadhila Islami Hana</p>
<p align="center">Telkom University Purwokerto</p>

---

## 📣 Deskripsi Program
Clinic Dhila Management System adalah sebuah aplikasi berbasis **Java OOP** yang digunakan untuk mengatur data **dokter, pasien, serta jadwal janji temu** di klinik.  
Dengan menerapkan prinsip **Encapsulation, Class Relationships, dan Packages**, sistem ini lebih aman, mudah dikelola, dan bisa diperluas fungsinya di masa depan.

### 🎯 Tujuan Pengembangan Sistem:
<pre>
✔️ Menyimpan data dokter beserta bidang spesialisasinya.
✔️ Mengelola informasi pasien, seperti nama, usia, dan diagnosis penyakit.
✔️ Memfasilitasi pembuatan janji temu antara dokter dan pasien.
✔️ Memastikan keakuratan data pasien dengan validasi sebelum disimpan.
✔️ Menghitung total diagnosis yang telah dicatat dalam sistem.
</pre>

---

## 📁 Struktur Proyek
```
clinic-oop-dhila/
└── src/
    ├── Guided/
    ├── Unguided/
    │   ├── entities/
    │   │   ├── Doctor.java
    │   │   ├── Patient.java
    │   │   ├── Appointment.java
    │   │   ├── DataChecker.java
    │   │   ├── DataCounter.java
    ├── ClinicDhila.java  # Main class (program utama)
└── README.md  (Dokumentasi proyek)
```

---

## 📌 Penjelasan Kelas

### **1️⃣ Doctor.java**
Kelas ini digunakan untuk menyimpan informasi mengenai dokter yang bekerja di klinik.

#### **Atribut yang Dimiliki**:
- `name` (String): Menyimpan nama dokter.
- `specialty` (String): Menyimpan bidang spesialisasi dokter.

#### **Fungsi Utama**:
- `getName()`: Mengembalikan nama dokter.
- `getSpecialty()`: Mengembalikan spesialisasi dokter.

---

### **2️⃣ Patient.java**
Kelas ini digunakan untuk mengelola data pasien.

#### **Atribut yang Dimiliki**:
- `name` (String): Nama pasien.
- `age` (int): Usia pasien.
- `diagnosis` (String): Penyakit atau kondisi medis pasien.

#### **Fungsi Utama**:
- `getName()`: Mengembalikan nama pasien.
- `getAge()`: Mengembalikan usia pasien.
- `getDiagnosis()`: Mengembalikan diagnosis pasien.

---

### **3️⃣ Appointment.java**
Kelas ini berfungsi untuk mencatat janji temu antara dokter dan pasien.

#### **Atribut yang Dimiliki**:
- `doctor` (Doctor): Dokter yang menangani janji temu.
- `patient` (Patient): Pasien yang memiliki janji temu.
- `appointmentTime` (LocalDate): Tanggal janji temu.
- `diagnosis` (String): Diagnosis yang diberikan oleh dokter.

#### **Fungsi Utama**:
- `getDoctor()`: Mengembalikan objek dokter yang menangani janji temu.
- `getPatient()`: Mengembalikan objek pasien yang memiliki janji temu.
- `getAppointmentTime()`: Mengembalikan tanggal janji temu.
- `getDiagnosis()`: Mengembalikan diagnosis pasien.

---

### **4️⃣ DataChecker.java**
Sebelum data pasien dapat digunakan dalam sistem, perlu dilakukan validasi.

#### **Fungsi Validasi**:
- `isValidName(String name)`: Memeriksa apakah nama pasien berisi karakter huruf dan tidak kosong.
- `isValidAge(int age)`: Memastikan usia pasien berada dalam rentang 1 hingga 119 tahun.

---

### **5️⃣ DataCounter.java**
Kelas ini digunakan untuk melacak jumlah diagnosis yang telah diberikan oleh dokter.

#### **Fungsi Utama**:
- `incrementDiagnosisCount()`: Menambah jumlah diagnosis yang tercatat.
- `getDiagnosisCount()`: Mengembalikan total jumlah diagnosis yang ada dalam sistem.

---

### **6️⃣ ClinicDhila.java (Kelas Utama)**
Kelas ini merupakan titik awal dari program yang mengatur jalannya sistem.

Fitur yang tersedia:
<pre>
✔️ Menyusun daftar dokter dan pasien.
✔️ Memvalidasi data pasien sebelum diproses.
✔️ Membuat dan mencatat janji temu pasien.
✔️ Menampilkan daftar dokter, pasien, janji temu, dan jumlah total diagnosis.
</pre>

---

## 🛠️ Cara Kerja Program
1. **Sistem membuat daftar dokter dan pasien.**
2. **Sebelum data pasien diproses, sistem memeriksa validitas nama dan usia.**
3. **Jika data valid, janji temu dibuat dan jumlah diagnosis diperbarui.**
4. **Informasi mengenai dokter, pasien, dan jadwal janji temu akan ditampilkan ke layar.**

---

## 📤 Contoh Output Program
Jika sistem dijalankan, hasilnya akan seperti ini:

```
=================================
         CLINIC DHILA            
   Kesehatan Anda Prioritas Kami 
=================================

🔍 Memeriksa validitas data pasien...

📌 Daftar Dokter:
- Dr. Aiden Pradipta | Spesialis: Ophthalmologist
- Dr. Bella Kartika | Spesialis: Pediatrician
- Dr. Calvin Mahendra | Spesialis: Dermatologist

📌 Daftar Pasien:
- Nathaniel Rizky | Usia: 35 | Diagnosis: Katarak
- Serena Laksmi | Usia: 28 | Diagnosis: Demam Tinggi
- Davin Ramadhan | Usia: 22 | Diagnosis: Eksim

📌 Janji Temu:
- Dr. Aiden Pradipta dengan Nathaniel Rizky pada 2025-05-12 | Operasi Katarak
- Dr. Bella Kartika dengan Serena Laksmi pada 2025-06-03 | Infeksi Virus
- Dr. Calvin Mahendra dengan Davin Ramadhan pada 2025-07-18 | Dermatitis Kronis

📊 Total diagnosis yang diberikan: 3

✅ Terima kasih telah menggunakan layanan Clinic Dhila!
```

---

## 🔧 Langkah Menjalankan Program
1. **Pastikan Java sudah terinstall** di perangkat Anda.
2. **Buka terminal atau command prompt** pada folder proyek.
3. **Kompilasi seluruh file Java**:
   ```sh
   javac Unguided/entities/*.java ClinicDhila.java
   ```
4. **Jalankan program utama**:
   ```sh
   java ClinicDhila
   ```

---

🚀 **Dikembangkan oleh Habibah Ratna Fadhila Islami Hana | Telkom University Purwokerto**
