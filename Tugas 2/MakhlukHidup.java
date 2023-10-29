/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package makhlukhidup;

/**
 *
 * @author ASUS
 */
public class MakhlukHidup {

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

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

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @return the tinggi
     */
    public int getTinggi() {
        return tinggi;
    }

    public MakhlukHidup() {
        this.habitat = "Dimana saja";
    }

    public MakhlukHidup(String habitat) {
        this.habitat = habitat;
    }

    public MakhlukHidup(boolean bernapas) {
        this.bernapas = bernapas;
        this.bernapas = true;
    }

    public MakhlukHidup(int tinggi) {
        this.tinggi = tinggi;
        this.tinggi = 10;
    }
    
    private String nama;
    private String species;
    protected String habitat;
    protected boolean bernapas;
    protected int tinggi;
    
}
