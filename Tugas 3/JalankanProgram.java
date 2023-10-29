/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JalankanProgram;

import PertemuanTigaPBO.DaftarMenu;
import PertemuanTigaPBO.Makanan;
import PertemuanTigaPBO.Minuman;

/**
 *
 * @author ASUS
 */
public class JalankanProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Makanan seblak = new Makanan();
        System.out.println("Sini-sini " + seblak.getJenisMakanan);
        System.out.println("Seblak yang mantab itu topping komplit level 5 " + seblak.mengatakan());
        seblak.mie();
        seblak.sayur();
        seblak.telur();
        System.out.println("\n");
        Minuman airmineral = new Minuman();
        System.out.println("Air putih harusnya disebut " + airmineral.getJenisMinuman);
        System.out.println("Air mineral itu minuman " + airmineral.mengatakan(" kata mak beti"));
        System.out.println("\n");
        DaftarMenu lihat = new DaftarMenu();
        System.out.println("Daftar Menu " + lihat.getKertas());
    }
}

