# Tugas Akhir DKP 2018

## Deskripsi

Tugas Akhir ini merupakan proyek akhir dari program studi Teknik Komputer di Universitas Diponegoro. Proyek ini bertujuan untuk mengembangkan aplikasi memesan lapangan futsal bahasa pemograman java dengan GUI.

## Fitur

- Pengelolaan pemesanan lapangan
- Menampilkan daftar pemesan dalam tabel

## Struktur Proyek

Proyek ini terdiri dari beberapa kelas utama, termasuk:

- **ProgramTugasAkhir**: Kelas utama yang menjalankan aplikasi.
- **Tabel**: Kelas untuk mengelola model tabel yang digunakan dalam aplikasi.

### Kelas Tabel

Kelas `Tabel` digunakan untuk mengelola data yang ditampilkan dalam tabel. Berikut adalah detail mengenai kelas ini:

- **Kolom Tabel**:
  - No
  - Nama Pemesan
  - Lapangan
  - Tanggal
  - Jam
  - No Telepon
  - Sisa
  - Keterangan

#### Metode Kelas Tabel

- `public Tabel()`: Konstruktor yang menginisialisasi kolom-kolom pada tabel.
- `public DefaultTableModel getTabel()`: Mengembalikan model tabel yang ada.
- `public void setTabel(DefaultTableModel Tabel)`: Mengatur model tabel yang baru.

## Instalasi

1. Clone repositori ini:
   ```bash
   git clone https://github.com/irgantaraa/Tugas-Akhir-DKP-2018.git
2. Masuk ke direktori proyek:
  ```bash
cd Tugas-Akhir-DKP-2018

