# Tugas 4
# Tahapan
1. Membuka pgAdmin dengan memasukkan password
2. Klik tanda panah kanan pada Server > PostgreSQL 15 > Database
3. Lalu, kita membuat database baru dengan klik tanda panah bawah Database, Create > Database. Kemudian, kita membuat nama database dan klik save. Di sini saya membuat database Guru.
4. Setelah itu, kita membuka netbeans untuk connection pada database yang sudah kita buat tadi, yaitu Database > New Connection. Lalu mengatur letak driver pada PostgreSQL, mengubah database menjadi Guru, menuliskan password, dan memilih skema database yaitu public. Terakhir memberikan nama pada database yaitu Guru Database on PostgreSQL local Guru.
5. Nah, sekarang saatnya kita membuat tabel pada netbeans. Pertama memberi nama tabel, lalu menambahkan kolom-kolomnya.
6. Setelah itu, kita akan melakukan insert, select, update, dan delete pada tabel. Pertama klik kanan pada Tables > Execute Command, lalu masukkan syntax insert beserta isi kolom yang kita inginkan.
7. Kemudian, melakukan select untuk membuktikan apakah tabel yang di insert berhasil.
8. Setelah select berhasil, kita lanjut pada tahap update. Masukkan syntax untuk isi tabel yang ingin kita update. Disini saya melakukan update pada penempatan kerja baris terakhir., dari Ponorogo menjadi Surabaya. Seperti biasa, untuk membuktikan apakah update berhasil, maka kita harus melakukan select juga.
9. Terakhir, kita melakukan delete. Saya melakukan delete pada baris/row terakhir tabel dengan menuliskan syntax seperti di bawah ini. Tidak lupa memastikan apakah row tersebut sudah terhapus yaitu dengan melakukan select.
10. Langkah terakhir yaitu melihat pada PostgreSQL apakah database nya sudah tersambung. Di bawah ini terlihat bahwa ada keterangan yang menunjukkan bahwadatabase Guru connected.

# Tugas 5
# GUI (Graphic User Interface)
GUI adalah antarmuka sistem operasi berbasis grafis seperti ikon, tombol, menu, dan representasi visual lainnya untuk mendukung interaksi pengguna dengan sistem.

# Tahapan
A. PostgreSQL
1. Membuat database terlebih dahulu pada postgreSQL yang akan di connect ke java netbeans. Disini saya membuat database dengan nama Guru. Lalu membuat tabel dengan perintah query create table identitas.

B. Java Netbeans
1. Membuat source code dari class yang akan diturunkan, yaitu class Guru.
2. Kemudian, membuat program “masukkan data”, “perbarui data” dan “hapus data” agar button Simpan, Update dan Hapus dapat digunakan.
3. Setelah itu, membuat program “tampil” untuk menampilkan datanya dengan perintah select.
4. Lalu, membuat connection untuk menghubungkan netbeans dengan PostgreSQL.
5. Terakhir, membuat source code setiap jButton beserta melakukan run file untuk melihat outputnya.

# Tugas 6
# ireport
iReport adalah utilitas (perkakas) pelaporan, yang dikembangkan di lingkungan Java guna membantu user dan developer untuk mendesain laporan secara visual. Melalui antar muka yang simple namun kaya akan fitur, iReport menyediakan fungsi untuk membuat laporan yang kompleks dengan mudah, sehingga akan menghemat banyak waktu. iReport ini dapat menampilkan laporan dalam bentuk print preview, melakukan export ke beberapa format dokumen lain (antara lain PDF, HTML, text, Excel), menampilkan gambar, grafik maupun tabel.

# Tahapan
Melanjutkan project pertemuan 5, saat ini adalah waktunya membuat tampilan report yang melewati beberapa tahapan di bawah ini:
A. PostgreSQL
1. membuat database terlebih dahulu pada postgreSQL yang akan di connect ke java netbeans. Disini saya membuat database dengan nama Guru. Lalu membuat tabel dengan perintah query create table identitas.

B. Java Netbeans
1. Kita menambahkan button Cetak beserta source code nya. Serta menambahkan berbagai libraries. Setelah itu, mulai merancang untuk tampilan reportnya.
2. Setelah berhasil,, maka kita akan generate program nya hingga menghasilkan output seperti yang tertera pada laporan saya.
3. Namun, output tersebut masih belum rapi dan tanpa design apapun, sehingga saya merapikan dan menambahkan sedikit design untuk memberi nilai estetika. Hasilnya seperti gambar yang sudah terlampir.
