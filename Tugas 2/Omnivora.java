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
public class Omnivora extends Hewan {

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    public Omnivora() {
        this.habitat = "Hutan Hujan Tropis";
        this.bernapas = true;
        this.tinggi = 160;
        this.berat = 80.0;
    }

    public Omnivora(String habitat) {
        this.habitat = habitat;
        this.bernapas = true;
        this.tinggi = 160;
        this.berat = 80.0;
    }

    public Omnivora(boolean bernapas) {
        this.bernapas = true;
        this.habitat = "Hutan Hujan Tropis";
        this.tinggi = 160;
        this.berat = 80.0;
    }

    public Omnivora(int tinggi) {
        this.tinggi = tinggi;
        this.habitat = "Hutan Hujan Tropis";
        this.bernapas = true;
        this.berat = 80.0;
    }
    
    private String species;

}
