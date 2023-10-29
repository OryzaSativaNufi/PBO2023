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
public class DaftarMenu {

    /**
     * @return the kertas
     */
    public String getKertas() {
        return kertas;
    }

    /**
     * @param kertas the kertas to set
     */
    private void setKertas(String kertas) {
        this.kertas = kertas;
    }

    public DaftarMenu() {
        this.JenisMakanan = "Seblak yang mantab itu topping komplit level 5";
        this.JenisMinuman = "biasanya disebut air putih, padahal bening";
    }

    /**
     * @return the JenisMakanan
     */
    private String getJenisMakanan() {
        return JenisMakanan;
    }

    /**
     * @param JenisMakanan the JenisMakanan to set
     */
    void setJenisMakanan(String JenisMakanan) {
        this.JenisMakanan = JenisMakanan;
    }

    /**
     * @return the JenisMinuman
     */
    private String getJenisMinuman() {
        return JenisMinuman;
    }

    /**
     * @param JenisMinuman the JenisMinuman to set
     */
    void setJenisMinuman(String JenisMinuman) {
        this.JenisMinuman = JenisMinuman;
    }

    private String JenisMakanan = "promo seblak";
    private String JenisMinuman = "biasanya disebut air putih, padahal bening";
    private String kertas = "di meja";
    public String mengatakan() {
        return "kata mak beti";
    }

    public String mengatakan(String kata) {
        return "sehat" + kata;
    }
}


