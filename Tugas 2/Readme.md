# Constructor
Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance), dan merupakan method yg dipanggil di awal, sesuatu yg membangun.

Cirinya :
1. Mehtod
2. Membangun
3. Punya nama yang sama dengan class
4. Tidak punya balikan
   
Contoh: public manusia () Jadi tidak ada string, void, int, dan lain-lain.

# Tahapan
1.  Membuat diagram Makhluk Hidup beserta turunannya.
2.  Langkah awal yaitu membuat package “TugasPboKonstruktor” dengan class pertama “Makhluk Hidup”. Lalu membuat source code class Makhluk Hidup dan membuat method yang di Refactor > Encapsulae Field, sehingga akan muncul set, get, private, protected.
3.  Kemudian membuat turunan classnya, yaitu Hewan, Tumbuhan, Omnivora, dan Poaceae. Setelah itu melakukan extends pada setiap class nya. Hewan extends terhadap Makhluk Hidup, Omnivora extends terhadap Hewan. Begitu pun dengan Tumbuhan extends terhadap Makhluk Hidup, Poaceae extends terhadap Tumbuhan. Lalu membuat source code pada setiap class nya yang kurang lebih sama.
4.  Pertama saya akan membahas class Hewan. Kita akan membuat parameter nya dahulu yang dilanjutkan dengan membuat private dan protected.
5. Kemudian kita bahas class turunan dari Hewan, yaitu Omnivora. Kali ini kita hanya membuat parameternya saja.
6. Pembahasan class selanjutnya yang merupakan turunan dari Makhluk Hidup, yaitu Tumbuhan. Pertama kita harus membuat parameternya terlebih dahulu, setelah itu membuat method yang di Refactor > Encapsulae Field, sehingga akan muncul set, get, private, protected.
7. Kemudian kali ini kita masuk ke turunan dari Tumbuhan, yaitu Poaceae. Seperti biasa kita harus membuat parameternya dahulu, setelah itu membuat method yang di Refactor > Encapsulae Field, sehingga akan muncul set, get, private, protected.
8. Nah sekarang waktunya kita membuat package baru untuk main class nya. Saya membuat package “Utama”. Pertama kita harus menyantumkan import terhadap class Hewan, Omnivora, dan Poaceae agar dapat terbaca outputnya. Setelah itu kita merancang source code untuk output yang kita inginkan, tidak lupa disertakan set dan get nya agar bisa terbaca.
9. Langkah terakhir yaitu melakukan run project pada class “Utama” untuk melihat bagaimana output yang kita rancang sebelumnya.
    
