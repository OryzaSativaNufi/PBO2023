/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanTigaPBO;

/**
 *
 * @author ASUS
 */
public class Makanan extends DaftarMenu implements Serat, Karbohidrat, Protein {


    @Override
    public void sayur() {
        System.out.println("Pake sayur");
    }

    @Override
    public void mie() {
        System.out.println("Pake mie");
    }

    @Override
    public void telur() {
        System.out.println("Pake telur, cuanki, dumpling, sosis, ceker, dll");
    }

    public void setJenisMakanan() {
        super.setJenisMakanan("Seblak yang mantab itu topping komplit level 7");
    }

    public Makanan() {
        this.setJenisMakanan();
    }

    public String getJenisMakanan = "Promo seblak";
}
