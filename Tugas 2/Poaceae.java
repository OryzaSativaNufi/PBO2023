/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhlukhidup;

/**
 *
 * @author ASUS
 */
public class Poaceae extends Tumbuhan {

    /**
     * @return the namaBiji
     */
    public String getNamaBiji() {
        return namaBiji;
    }

    /**
     * @param namaBiji the namaBiji to set
     */
    public void setNamaBiji(String namaBiji) {
        this.namaBiji = namaBiji;
    }

    public Poaceae() {
        this.habitat = "Hutan Hujan Tropis";
        this.bernapas = false;
        this.tinggi = 100;
        this.ukuranBiji = 0.02;
    }

    public Poaceae(String habitat) {
        super(habitat);
        this.habitat = habitat;
        this.bernapas = false;
        this.tinggi = 100;
        this.ukuranBiji = 0.02;
    }

    public Poaceae(boolean bernapas) {
        this.bernapas = bernapas;
        this.habitat = "Hutan Hujan Tropis";
        this.tinggi = 100;
        this.ukuranBiji = 0.02;
    }

    public Poaceae(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Hutan Hujan Tropis";
        this.bernapas = false;
        this.ukuranBiji = 0.02;
    }

    public Poaceae(double ukuranBiji) {
        this.ukuranBiji = ukuranBiji;
        this.tinggi = 100;
        this.habitat = "Hutan Hujan Tropis";
        this.bernapas = false;
    }
    
    private String namaBiji;
}
