# Constructor
Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance), dan merupakan method yg dipanggil di awal, sesuatu yg membangun.

Cirinya : 
1. Mehtod
2. Membangun
3. Punya nama yang sama dengan class
4. Tidak punya balikan
   
Contoh: public manusia ()
Jadi tidak ada string, void, int, dan lain-lain.

# Tahapan
1. Langkah awal yang harus dilakukan adalah membuka Netbeans.
2. Langkah selanjutnya yaitu membuat package sesuai kebutuhan. Klik ikon New Project > Java > Java Application > Project Name > Finish.
3. Lalu menentukan akan memilih jenis makhluk hidup apa, dan saya memilih tanaman padi.
4. Setelah itu, membuat class MakhlukHidup. Klik ikon Source Package > TUGASPBO > Klik kanan bar > New > Java Class > Class Name > Finish.
5. Kemudian, membuat public String sesuai dengan karakteristik yang akan kita ulas.
6. Lalu melakukan Refactor > Encapsulate Fields pada source code di atas, sehingga setiap variable akan memiliki method set dan get. Set digunakan untuk mengatur nilai pada variabel, sedangkan get digunakan untuk mengambil nilai dari varibelnya.
7. Setelah itu, source code yang awalnya public String sekarang berubah menjad private String yang hanya dapat diakses di kelas yang sama. Oleh karena itu, set dan get digunakan untuk mengatur dan mengambil nilai seperti penjelasan sebelumnya pada variabel Nama, Species, Batang, Daun, Akar, Sistem Akar, Bunga, Polinasi, Biji, Buah, Fase Pertumbuhan, Habitat, Masa Panen. Sedangkan, untuk variabel Peran dalam Masyarakat dan Peran dalam Ekonomi saya menggunakan protected yang hanya bisa diakses oleh turunannya dalam kelas dan package yang sama.
8. Kemudian membuat new class pada package yang sama menggunakan extends terhadap class MakhlukHidup. Extend ini berfungsi sebagai penghubung antara kelas induk (parent class) dengan kelas anak (child class), sehingga sebuah child class dapat mewarisi seluruh properti (variabel dan method) parent class.
9. Setelah itu, membuat new class sebagai main class yang berisi klasifikasi karakteristik tanaman padi. Class ini akan memanggil semua method public, lalu memasukkan print yang akan ditampilkan untuk output beserta get dan protected nya.
10. Terakhir, melakukan run project untuk melihat output yang telah kita rancang sebelumnya.
