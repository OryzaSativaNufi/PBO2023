# Interface
Interface adalah Class yang tidak memilki tubuh pada method-methodnya karena method tersebut harus diimplementasikan dalam kelas turunan nya. Jadi, interface berfungsi sebagai penghubung antara sesuatu yang ‘abstrak’ dengan sesuatu yang nyata.

# Tahapan
A. Diagram
   1. Daftar Menu merupakan superclass yang akan mewariskan. Makanan dan Minuman adalah class turunan dari Daftar Menu. Saya hanya mengimplementasikan Class Makanan ke class interface Serat, Karbohidrat, Protein. Sedangkan class Minuman tidak saya impelementasikan pada interface apapun.

B. Program
    1. Buat class DaftarMenu terlebih dahulu. Terdapat beberapa atribut yaitu jenisMakanan, jenisMinuman, dan kertas. Lalu, terdapat juga method yaitu mengatakan.
    2. Buat kelas turunan dari DaftarMenu. Saya memberi nama class turunan pertama dengan nama Makanan. Dalam class Makanan terdapat class interface yang implements terhadap Serat, Karbohidrat, Protein. Terdapat konstruktor tanpa parameter untuk menginisialisasi atribut dari class DaftarMenu, atribut-atribut tersebut akan diatur sesuai dengan nilai-nilai yang ditentukan.
    3. Class diatas merupakan class interface yang akan di implements ke class Makanan. Terdapat 3 class interface yaitu Serat, Karbohidrat, dan Protein.
    4. Saya memberi nama class turunan kedua dengan nama Minuman. Dalam class ini tidak terdapat class interface apapun, sehingga langsung kita rancang untuk output nantinya.
    5. Class diatas merupakan class yang digunakan untuk menjalankan program dan hasil output dari program yang telah dibuat.
