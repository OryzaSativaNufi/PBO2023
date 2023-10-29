/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utama;

import makhlukhidup.Hewan;
import makhlukhidup.Omnivora;
import makhlukhidup.Poaceae;

/**
 *
 * @author ASUS
 */
public class Utama {

    public static void main(String[] args) {
        Omnivora ular = new Omnivora(100);
        ular.setNama("Ular Hijau");
        ular.setSpecies("Serpentes");
        Omnivora petok = new Omnivora("Hutan");
        petok.setNama("Ayam");
        petok.setSpecies("Gallus gallus");
        Hewan kucing = new Hewan(50.0);
        kucing.setNama("Kucing");
        kucing.setAlatGerak("Kaki");
        Poaceae padi = new Poaceae("Sawah");
        padi.setNama("Padi");
        padi.setSpecies("Oryza Sativa");
        padi.setNamaBiji("Beras");

        System.out.println("Nama saya" + ular.getNama() + ", species saya " + ular.getSpecies() + ", habitat saya " + ular.getHabitat());
        System.out.println("Nama saya" + petok.getNama() + ", species saya " + petok.getSpecies() + ", habitat saya " + petok.getHabitat());
        System.out.println("Nama saya" + kucing.getNama() + ", species saya " + kucing.getSpecies() + ", habitat saya " + kucing.getHabitat());
        System.out.println("Nama saya" + padi.getNama() + ", species saya " + padi.getSpecies() + ", habitat saya " + padi.getHabitat());

        System.out.println("Nama saya " + ular.getNama() + ", species saya " + ular.getSpecies() + ", habitat saya " + ular.getHabitat() + ", tinggi saya " + ular.getTinggi() + " cm" + ", Berat saya " + ular.getBerat() + " kg");
        System.out.println("Nama saya " + petok.getNama() + ", species saya " + petok.getSpecies() + ", habitat saya " + petok.getHabitat() + ", tinggi saya " + petok.getTinggi() + " cm" + ", Berat saya " + petok.getBerat() + " kg");
        System.out.println("Nama saya " + kucing.getNama() + ", species saya " + kucing.getSpecies() + ", habitat saya " + kucing.getHabitat() + ", tinggi saya " + kucing.getTinggi() + " cm" + ", Berat saya " + kucing.getBerat() + " kg" + ", Jumlah kaki saya " + kucing.getAlatGerak());
        System.out.println("Nama saya " + padi.getNama() + ", species saya " + padi.getSpecies() + ", saya hidup/tidak " + padi.getHabitat() + ", habitat saya " + padi.getHabitat() + ", tinggi saya " + padi.getTinggi() + " cm" + ", Ukuran sel saya " + padi.getUkuranBiji() + ", bau bunga " + padi.getBentukBiji());
    }
}
