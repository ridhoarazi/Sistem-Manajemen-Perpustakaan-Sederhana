# 📚 Sistem Manajemen Perpustakaan Sederhana
Tugas UTS Praktikum Pemrograman Berorientasi Objek (PBO).  

---

## 🧾 Deskripsi Program
Program ini berfungsi untuk mengelola data perpustakaan secara sederhana.  
Terdapat dua class utama, yaitu Buku dan Anggota.  
Setiap anggota dapat meminjam dan mengembalikan buku.  
Program juga menampilkan daftar anggota dan status buku (apakah sedang dipinjam atau tersedia).

---

## 🧱 Struktur Class

| Nama Class |
|-------------|
| **Buku** | 
| **Anggota** | 
| **Transaksi** *(interface)* | 
| **PerpusMain** | 

---

## ▶️ Cara Menjalankan Program
1. Pastikan sudah menginstal **JDK (Java Development Kit)** dan **IDE** seperti NetBeans, IntelliJ, atau VS Code.  
2. Atur struktur folder sesuai dengan deklarasi package:
src/ └── Perpus/ └── PerpusMain.java/ ├── interfaces/ │ └── Transaksi.java ├── models/ │ ├── Buku.java │ └── Anggota.java
3. Jalankan file `PerpusMain.java`
