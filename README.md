# <h1 align="center">🏥 Clinic Dhila Management System 🚑</h1>
<p align="center">Habibah Ratna Fadhila Islami Hana</p>
<p align="center">2311110038</p>

---

## 📣 Deskripsi Program
Clinic Dhila Management System adalah sebuah aplikasi berbasis **Java OOP** yang menerapkan prinsip **Encapsulation, Class Relationships, dan Packages**. Sistem ini digunakan untuk mengatur data **dokter, pasien, serta jadwal janji temu** di klinik.  

### 🎯 Tujuan Pengembangan Sistem:
<pre>
✔️ Menyimpan data dokter beserta bidang spesialisasinya.
✔️ Mengelola informasi pasien, seperti nama, usia, dan diagnosis penyakit.
✔️ Memfasilitasi pembuatan janji temu antara dokter dan pasien.
✔️ Memastikan keakuratan data pasien dengan validasi sebelum diproses.
✔️ Menghitung total diagnosis yang telah dicatat dalam sistem.
</pre>

---

## 📁 Struktur Proyek
```
clinic-oop-dhila/
└── src/
    ├── Guided/
    │   ├── Driver/
    │   │   ├── TestPackage.java
    │   ├── Harga/
    │   │   ├── KelasHarga.java
    │   ├── Modul_4/
    │   │   ├── Animal.java
    │   │   ├── Cat.java
    │   │   ├── DriverLB.java
    │   │   ├── LibraryBook.java
    │   ├── Token/
    │   │   ├── KelasToken.java
    ├── Unguided/
    │   ├── entities/
    │   │   ├── Doctor.java
    │   │   ├── Patient.java
    │   │   ├── Appointment.java
    │   │   ├── DataChecker.java
    │   │   ├── DiagnosisCounter.java
    ├── ClinicDhila.java  # Main class (program utama)
└── README.md  
```

---

## 📌 Deskripsi Kelas

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
- `isValidAge(int age)`: Memastikan usia pasien berada dalam rentang 1 hingga 199 tahun.

---

### **5️⃣ DataCounter.java**
Kelas ini digunakan untuk menghitung jumlah diagnosis yang telah diberikan oleh dokter.

#### **Fungsi Utama**:
- `incrementDiagnosisCount()`: Menambah jumlah diagnosis yang tercatat.
- `getDiagnosisCount()`: Mengembalikan total jumlah diagnosis yang ada dalam sistem.

---

### **6️⃣ ClinicDhila.java (Kelas Utama)**
Kelas ini merupakan `main class` dari program yang mengatur jalannya sistem klinik.

Fungsi yang tersedia:
<pre>
✔️ Menyusun daftar dokter dan pasien.
✔️ Memvalidasi data pasien sebelum diproses.
✔️ Membuat dan mencatat janji temu pasien.
✔️ Menampilkan daftar dokter, pasien, janji temu, dan jumlah total diagnosis.
</pre>

---

## 🛠️ Cara Kerja Sistem
1. **Sistem membuat daftar dokter dan pasien.**
2. **Sebelum data pasien diproses, sistem memeriksa validitas nama dan usia menggunakan class `DataChecker`.**
3. **Jika data valid, janji temu dibuat dan jumlah diagnosis diperbarui.**
4. **Informasi mengenai dokter, pasien, dan jadwal janji temu akan ditampilkan ke layar.**

---

## 📤 Contoh Output Program
Jika sistem dijalankan, hasilnya akan seperti berikut:

```
![Image](https://github.com/user-attachments/assets/07fd91dc-1b28-4bd8-81de-552e2a960dd6)
```
