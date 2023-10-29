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
public class Hewan extends MakhlukHidup {

    public Hewan(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the alatGerak
     */
    public String getAlatGerak() {
        return alatGerak;
    }

    /**
     * @param alatGerak the alatGerak to set
     */
    public void setAlatGerak(String alatGerak) {
        this.alatGerak = alatGerak;
    }

    /**
     * @return the berat
     */
    public double getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public Hewan() {
        super();
        this.habitat = "Hutan";
        this.bernapas = true;
        this.tinggi = 170;
        this.berat = 250.0;
    }

    public Hewan(String habitat) {
        super("Hutan");
        this.habitat = habitat;
        this.bernapas = true;
        this.tinggi = 170;
        this.berat = 250.0;
    }

    public Hewan(boolean bernapas) {
        super(true);
        this.habitat = "Hutan";
        this.bernapas = true;
        this.tinggi = 170;
        this.berat = 250.0;
    }

    public Hewan(int tinggi) {
        super(50);
        this.habitat = "Hutan";
        this.bernapas = true;
        this.tinggi = 170;
        this.berat = 250.0;
    }

    private String alatGerak;
    protected double berat;
    
}
