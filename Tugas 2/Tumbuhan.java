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
public class Tumbuhan extends MakhlukHidup {

    /**
     * @return the ukuranBiji
     */
    public double getUkuranBiji() {
        return ukuranBiji;
    }

    /**
     * @param ukuranBiji the ukuranBiji to set
     */
    public void setUkuranBiji(double ukuranBiji) {
        this.ukuranBiji = ukuranBiji;
    }

    /**
     * @return the bentukBiji
     */
    public String getBentukBiji() {
        return bentukBiji;
    }

    /**
     * @param bentukBiji the bentukBiji to set
     */
    public void setBentukBiji(String bentukBiji) {
        this.bentukBiji = bentukBiji;
    }

    public Tumbuhan() {
        this.habitat = "Hutan";
        this.bernapas = false;
        this.tinggi = 100;
        this.ukuranBiji = 0.7;
    }

    public Tumbuhan(double ukuranBiji) {
        super();
        this.habitat = "Dimana saja";
        this.bernapas = false;
        this.tinggi = 150;
        this.ukuranBiji = 0.7;
    }

    public Tumbuhan(String habitat) {
        super("Dimana saja");
        this.habitat = habitat;
        this.bernapas = false;
        this.tinggi = 150;
        this.ukuranBiji = 0.7;
    }

    public Tumbuhan(boolean bernapas) {
        super(false);
        this.habitat = "Dimana saja";
        this.bernapas = false;
        this.tinggi = 150;
        this.ukuranBiji = 80.0;
    }
    protected double ukuranBiji;
    private String bentukBiji;
}
